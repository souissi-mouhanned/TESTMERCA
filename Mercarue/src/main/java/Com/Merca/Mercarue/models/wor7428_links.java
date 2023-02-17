package Com.Merca.Mercarue.models;
import java.time.LocalDateTime;
import lombok.Data;
import javax.persistence.*;

@Data

@Entity
@Table 
public class wor7428_links {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long link_id;

	 String link_url ;
	 String link_name ;
	 String link_image ;
	 String link_target ;
	 String link_description ;
	 
	 @Column(columnDefinition = "VARCHAR(20) COLLATE utf8mb4_unicode_520_ci")
	 String link_visible ;
	 
	 
	 Long link_owner ;
	 int link_rating ;
	 
	 
	 LocalDateTime link_updated ;
	 
	 String link_rel ;
	 
	 @Column(columnDefinition = "MEDIUMTEXT COLLATE utf8mb4_unicode_520_ci") 	
	 String link_notes ;
	 
	 
	 String link_rss ;



	 
}
