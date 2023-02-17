package Com.Merca.Mercarue.models;

import java.time.LocalDateTime;
import lombok.Data;
import javax.persistence.*;


@Data

@Entity
@Table 
		
public class wor7428_actionscheduler_actions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long action_id;

	 @Column(columnDefinition = "VARCHAR(191) COLLATE utf8mb4_unicode_520_ci")
	 String hook ;
	 
	 @Column(columnDefinition = "VARCHAR(20) COLLATE utf8mb4_unicode_520_ci")
	 String status ;
	
	LocalDateTime 	 scheduled_date_gmt ;
	 LocalDateTime scheduled_date_local ;
	
	 @Column(columnDefinition = "VARCHAR(191) COLLATE utf8mb4_unicode_520_ci")
	 String args  = null;
	
	 @Column(columnDefinition = "LONGTEXT COLLATE utf8mb4_unicode_520_ci") 	
	 String schedule = null;
	
	 Long group_id  ;
	 int attempts ;
	 
	 LocalDateTime last_attempt_gmt  ;
	 LocalDateTime last_attempt_local ;
	
	 Long claim_id  ;	
	 @Column(columnDefinition = "VARCHAR(8000) COLLATE utf8mb4_unicode_520_ci")
	 String extended_args = null;





}
