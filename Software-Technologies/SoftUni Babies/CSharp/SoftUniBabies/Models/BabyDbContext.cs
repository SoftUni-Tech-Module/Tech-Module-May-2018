namespace SoftUniBabies.Models
{
    using Microsoft.EntityFrameworkCore;

    public class BabyDbContext : DbContext
    {
        public DbSet<Baby> Babies { get; set; }

        public BabyDbContext()
        {
            this.Database.EnsureCreated();
        }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseMySQL("server=localhost;database=softunibabies_csharp;user=root;");
        }
    }
}
