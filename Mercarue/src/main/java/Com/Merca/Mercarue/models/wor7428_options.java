package Com.Merca.Mercarue.models;
import lombok.Data;
import javax.persistence.*;

@Data

@Entity
@Table 
public class wor7428_options {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long option_id;
	
	 @Column(columnDefinition = "VARCHAR(191) COLLATE utf8mb4_unicode_520_ci")
	 String option_name ;
	
	 @Column(columnDefinition = "LONGTEXT COLLATE utf8mb4_unicode_520_ci") 	
	 String option_value ;
	 
	 @Column(columnDefinition = "VARCHAR(20) COLLATE utf8mb4_unicode_520_ci")
	 String autoload ;
	

}
