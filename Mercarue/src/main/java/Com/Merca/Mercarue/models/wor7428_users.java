package Com.Merca.Mercarue.models;
import java.time.LocalDateTime;
import lombok.Data;
import javax.persistence.*;

@Data

@Entity
@Table 
public class wor7428_users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column( columnDefinition = "bigint(20)")
	private Long ID;
	
	 
	 @Column(columnDefinition = "VARCHAR(60) COLLATE utf8mb4_unicode_520_ci")
	 String user_login ;
	 
	 @Column(columnDefinition = "VARCHAR(255) COLLATE utf8mb4_unicode_520_ci")
	 String user_pass ;
	 
	 @Column(columnDefinition = "VARCHAR(50) COLLATE utf8mb4_unicode_520_ci")
	 String user_nicename ;
	 
	 @Column(columnDefinition = "VARCHAR(100) COLLATE utf8mb4_unicode_520_ci")
	 String user_email ;
	 
	 @Column(columnDefinition = "VARCHAR(100) COLLATE utf8mb4_unicode_520_ci")
	 String user_url ;
	 
	 @Column(columnDefinition = "VARCHAR(255) COLLATE utf8mb4_unicode_520_ci")
	 String user_activation_key ;
	 
	 @Column(columnDefinition = "VARCHAR(250) COLLATE utf8mb4_unicode_520_ci")
	 String display_name ;
	 
	 LocalDateTime user_registered  ;
	  int user_status;

	 
}
