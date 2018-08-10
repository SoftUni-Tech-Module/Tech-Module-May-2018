const fs = require('fs');
const path = require('path');
const Sequelize = require('sequelize');
const basename = path.basename(module.filename);
const env = process.env.NODE_ENV || 'development';
const config = require(`${__dirname}/../config/config.js`)[env];
const db = {};

let sequelize;
if (config.use_env_variable) {
    sequelize = new Sequelize(process.env[config.use_env_variable]);
} else {
    sequelize = new Sequelize(
        config.database, config.username, config.password, config
    );
}

fs
    .readdirSync(__dirname)
    .filter(file =>
        (file.indexOf('.') !== 0) &&
        (file !== basename) &&
        (file.slice(-3) === '.js'))
    .forEach(file => {
        const model = sequelize.import(path.join(__dirname, file));
        db[model.name] = model;
    });

Object.keys(db).forEach(modelName => {
    if (db[modelName].associate) {
        db[modelName].associate(db);
    }
});

const models = Object.keys(db);

async function create(models) {
    console.log('initializing...');
    for (let i = 0; i < models.length; i++) {
        const modelName = models[i];
        try {
            await db[modelName].sync();
            models.splice(i, 1);
            i--;
        } catch (err) {
            console.log('failed to initialize '+ modelName);
        }
    }
    if (models.length > 0) create(models.slice());
}

create(models.slice());

console.log('Successfully connected')

db.sequelize = sequelize;
db.Sequelize = Sequelize;

module.exports = db;
