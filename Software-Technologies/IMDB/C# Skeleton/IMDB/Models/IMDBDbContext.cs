namespace IMDB.Models
{
    using Microsoft.EntityFrameworkCore;

    public class IMDBDbContext : DbContext
    {
        public DbSet<Film> Films { get; set; }

        public IMDBDbContext()
        {
            this.Database.EnsureCreated();
        }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseMySQL("server=localhost;database=imdb_asp;user=root;");
        }
    }
}
