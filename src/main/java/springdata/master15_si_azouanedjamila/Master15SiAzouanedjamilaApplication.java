package springdata.master15_si_azouanedjamila;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Master15SiAzouanedjamilaApplication implements CommandLineRunner{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(Master15SiAzouanedjamilaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String qr = "select id,actif,compte_creation,compte_maj,date_creation,date_maj,nom_arabe,nom_latin, nom_tamazight from public.wilaya order by id";
		jdbcTemplate.query(qr, (rs,rowNum) ->	new Wilaya(rs.getLong(1), rs.getBoolean(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9))
				).forEach(wil-> System.out.println(wil.toString()));				
		
	}

}
