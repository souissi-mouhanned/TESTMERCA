package Com.Merca.Mercarue.models;

import java.time.LocalDateTime;
import lombok.Data;
import javax.persistence.*;

@Data

@Entity
@Table 
public class wor7428_comments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long comment_ID;
	
	Long comment_post_ID;
	
	 @Column(columnDefinition = "TINYTEXT COLLATE utf8mb4_unicode_520_ci") 
	String comment_author;
	 @Column(columnDefinition = "VARCHAR(100) COLLATE utf8mb4_unicode_520_ci")
	 String comment_author_email;
	 @Column(columnDefinition = "VARCHAR(200) COLLATE utf8mb4_unicode_520_ci")
	 String comment_author_url;
	 @Column(columnDefinition = "VARCHAR(100) COLLATE utf8mb4_unicode_520_ci")
	 String comment_author_IP;
	 
	 LocalDateTime comment_date;
	 LocalDateTime comment_date_gmt;
	 
	 @Column(columnDefinition = "TEXT COLLATE utf8mb4_unicode_520_ci") 
	 String  comment_content ;
	 
	 int comment_karma;
	
	 @Column(columnDefinition = "VARCHAR(20) COLLATE utf8mb4_unicode_520_ci")
	 String comment_approved ;
	 
	 @Column(columnDefinition = "VARCHAR(255) COLLATE utf8mb4_unicode_520_ci")
	 String comment_agent ;
	 
	 @Column(columnDefinition = "VARCHAR(20) COLLATE utf8mb4_unicode_520_ci")
	 String comment_type ;
	 Long comment_parent ;
	 Long user_id; 
	 
	 

	
	

}
