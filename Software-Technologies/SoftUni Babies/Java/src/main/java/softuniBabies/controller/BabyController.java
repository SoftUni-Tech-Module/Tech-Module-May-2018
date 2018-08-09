package softuniBabies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import softuniBabies.bindingModel.BabyBindingModel;
import softuniBabies.entity.Baby;
import softuniBabies.repository.BabyRepository;

import java.util.List;

@Controller
public class BabyController {
    private final BabyRepository babyRepository;

    @Autowired
    public BabyController(BabyRepository reportRepository) {
        this.babyRepository = reportRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<Baby> babies = this.babyRepository.findAll();

        model.addAttribute("view", "baby/index");
        model.addAttribute("babies", babies);

        return "base-layout";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("view", "baby/create");

        return "base-layout";
    }

    @PostMapping("/create")
    public String createProcess(BabyBindingModel babyBindingModel) {
        Baby baby = new Baby();

        baby.setName(babyBindingModel.getName());
        baby.setGender(babyBindingModel.getGender());
        baby.setBirthday(babyBindingModel.getBirthday());

        this.babyRepository.saveAndFlush(baby);

        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable int id) {
        Baby baby = this.babyRepository.findOne(id);

        model.addAttribute("view", "baby/edit");
        model.addAttribute("baby", baby);

        return "base-layout";
    }

    @PostMapping("/edit/{id}")
    public String editProcess(BabyBindingModel babyBindingModel,
                              @PathVariable int id) {
        Baby baby = this.babyRepository.findOne(id);

        baby.setName(babyBindingModel.getName());
        baby.setGender(babyBindingModel.getGender());
        baby.setBirthday(babyBindingModel.getBirthday());

        this.babyRepository.saveAndFlush(baby);

        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(Model model, @PathVariable int id) {
        Baby baby = this.babyRepository.findOne(id);

        model.addAttribute("view", "baby/delete");
        model.addAttribute("baby", baby);

        return "base-layout";
    }

    @PostMapping("/delete/{id}")
    public String deleteProcess(@PathVariable int id) {
        this.babyRepository.delete(id);
        this.babyRepository.flush();
        return "redirect:/";
    }
}
