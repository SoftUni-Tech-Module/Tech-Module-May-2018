const Sequelize = require('sequelize');

module.exports = function (sequelize) {
    let Baby = sequelize.define('Baby', {
        name: {
            type: Sequelize.TEXT,
            allowNull: false
        },
        gender: {
            type: Sequelize.TEXT,
            allowNull: false
        },
        birthday: {
            type: Sequelize.STRING,
            allowNull: false
        }
    });

    return Baby;
};