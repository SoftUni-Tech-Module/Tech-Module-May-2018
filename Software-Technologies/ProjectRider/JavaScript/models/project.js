const Sequelize = require('sequelize');

module.exports = function (sequelize) {

    const Project = sequelize.define("Project", {
        title: {type: Sequelize.TEXT,
            required: true,
            allowNull: false
        },
        description: {
            type: Sequelize.TEXT,
            required: true,
            allowNull: false
        },
        budget: {
            type: Sequelize.INTEGER,
            required: true,
            allowNull: false
        }
    }, {
        timestamps: false
    });

    return Project;
};