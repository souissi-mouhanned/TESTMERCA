package Com.Merca.Mercarue.models;
import java.time.LocalDateTime;
import lombok.Data;
import javax.persistence.*;

@Data

@Entity
@Table 
public class wor7428_posts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long ID;
	
	
	 @Column(columnDefinition = "VARCHAR(20) COLLATE utf8mb4_unicode_520_ci")
	 String post_author ;
	 LocalDateTime post_date;
	LocalDateTime 	 post_date_gmt ;
	
	
	 

	 @Column(columnDefinition = "LONGTEXT COLLATE utf8mb4_unicode_520_ci") 	
	 String post_content ;

	 @Column(columnDefinition = "TEXT COLLATE utf8mb4_unicode_520_ci") 	
	 String post_title ;
	 
	 @Column(columnDefinition = "TEXT COLLATE utf8mb4_unicode_520_ci") 	
	 String post_excerpt ;
	 
	 @Column(columnDefinition = "VARCHAR(20) COLLATE utf8mb4_unicode_520_ci")
	 String post_status ;

	 @Column(columnDefinition = "VARCHAR(20) COLLATE utf8mb4_unicode_520_ci")
	 String comment_status ;
	 
	 @Column(columnDefinition = "VARCHAR(20) COLLATE utf8mb4_unicode_520_ci")
	 String ping_status ;
	 
	 @Column(columnDefinition = "VARCHAR(225) COLLATE utf8mb4_unicode_520_ci")
	 String post_password ;
	 
	 @Column(columnDefinition = "VARCHAR(200) COLLATE utf8mb4_unicode_520_ci")
	 String post_name ;

	 @Column(columnDefinition = "TEXT COLLATE utf8mb4_unicode_520_ci") 	
	 String to_ping ;

	 @Column(columnDefinition = "TEXT COLLATE utf8mb4_unicode_520_ci") 	
	 String pinged ;
	 
	 LocalDateTime 	 post_modified ;
	 LocalDateTime post_modified_gmt ;
	
	 @Column(columnDefinition = "LONGTEXT COLLATE utf8mb4_unicode_520_ci") 	
	 String post_content_filtered ;
	 
	 Long post_parent;
	 
	 @Column(columnDefinition = "VARCHAR(255) COLLATE utf8mb4_unicode_520_ci")
	 String guid ;
	 
	 int menu_order;
	 
	 @Column(columnDefinition = "VARCHAR(20) COLLATE utf8mb4_unicode_520_ci")
	 String post_type ;
	 
	 @Column(columnDefinition = "VARCHAR(100) COLLATE utf8mb4_unicode_520_ci")
	 String post_mime_type ;
	 
	 Long comment_count;
	 
	 
	 
	 
	 
	
}
