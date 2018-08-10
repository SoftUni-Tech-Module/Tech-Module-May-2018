<?php

namespace AppBundle\Controller;

use AppBundle\Entity\Film;
use AppBundle\Form\FilmType;
use Sensio\Bundle\FrameworkExtraBundle\Configuration\Route;
use Symfony\Bundle\FrameworkBundle\Controller\Controller;
use Symfony\Component\HttpFoundation\Request;

class FilmController extends Controller
{
    /**
     * @param Request $request
     * @Route("/", name="index")
     * @return \Symfony\Component\HttpFoundation\Response
     */
    public function index(Request $request)
    {
        $films = $this->getDoctrine()->getRepository(Film::class)->findAll();
        return $this->render('film/index.html.twig', ['films'=>$films]);
    }

    /**
     * @param Request $request
     * @Route("/create", name="create")
     * @return \Symfony\Component\HttpFoundation\Response
     */
    public function create(Request $request)
    {
        $film = new Film();
        $form = $this->createForm(FilmType::class,$film);
        $form->handleRequest($request);

        if ($form->isSubmitted()){
            $entityManager = $this->getDoctrine()->getManager();

            $entityManager->persist($film);
            $entityManager->flush();

            return $this->redirect('/');
        }

        return $this->render('film/create.html.twig',['form'=>$form->createView()]);
	}

    /**
     * @Route("/edit/{id}", name="edit")
     *
     * @param $id
     * @param Request $request
     * @return \Symfony\Component\HttpFoundation\Response
     */
    public function edit($id, Request $request)
    {
        $film = $this->getDoctrine()->getRepository(Film::class)->Find($id);
        $form = $this->createForm(FilmType::class, $film);
        $form->handleRequest($request);

        if ($form->isSubmitted()){
            $entityManager = $this->getDoctrine()->getManager();

            $entityManager->persist($film);
            $entityManager->flush();

            return $this->redirect('/');
        }

        return $this->render('film/edit.html.twig',['form'=>$form->createView(),'film'=>$film]);
    }

    /**
     * @Route("/delete/{id}", name="delete")
     *
     * @param $id
     * @param Request $request
     * @return \Symfony\Component\HttpFoundation\Response
     */
    public function delete($id, Request $request)
    {

        $film = $this->getDoctrine()->getRepository(Film::class)->Find($id);
        $form = $this->createForm(FilmType::class, $film);
        $form->handleRequest($request);

        if ($form->isSubmitted()){
            $entityManager = $this->getDoctrine()->getManager();

            $entityManager->remove($film);
            $entityManager->flush();

            return $this->redirect('/');
        }

        return $this->render('film/delete.html.twig',['form'=>$form->createView(),'film'=>$film]);
    }
}
