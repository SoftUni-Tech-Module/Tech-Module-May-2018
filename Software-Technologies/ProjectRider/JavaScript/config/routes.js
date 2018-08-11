const projectController = require('../controllers/project');

module.exports = (app) => {
    app.get('/', projectController.index);

    app.get('/create/', projectController.createGet);
    app.post('/create/', projectController.createPost);

    app.get('/edit/:id', projectController.editGet);
    app.post('/edit/:id', projectController.editPost);

    app.get('/delete/:id', projectController.deleteGet);
    app.post('/delete/:id', projectController.deletePost);
};