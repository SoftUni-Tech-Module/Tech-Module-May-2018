const Sequelize = require('sequelize');

module.exports = function(sequelize){
    return sequelize.define('Film',{
        name: {
            type: Sequelize.TEXT
        },
        genre: {
            type: Sequelize.TEXT
        },
        director: {
            type: Sequelize.TEXT
        },
        year: {
            type: Sequelize.INTEGER
        }
    },{
        timestamps: false,
    })
};