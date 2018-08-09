const babyController = require('../controllers/baby');

module.exports = (app) => {
    app.get('/', babyController.index);

	app.get('/create/', babyController.createGet);
	app.post('/create/', babyController.createPost);

	app.get('/edit/:id', babyController.editGet);
	app.post('/edit/:id', babyController.editPost);

    app.get('/delete/:id', babyController.deleteGet);
    app.post('/delete/:id', babyController.deletePost);
};