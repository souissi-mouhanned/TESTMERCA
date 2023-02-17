package Com.Merca.Mercarue.models;
import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.Data;

@Data

@Entity
@Table 
		
public class wor7428_actionscheduler_logs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long log_id;

	Long action_id ;
	@Column(columnDefinition = "TEXT COLLATE utf8mb4_unicode_520_ci") 	
	String message ;
	LocalDateTime log_date_gmt;
     LocalDateTime log_date_local;
     


}
