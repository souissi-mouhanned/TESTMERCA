package Com.Merca.Mercarue.models;

import java.time.LocalDateTime;
import lombok.Data;
import javax.persistence.*;

@Data

@Entity
@Table 
		
public class wor7428_e_events {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	 @Column(columnDefinition = "TEXT COLLATE utf8mb4_unicode_520_ci") 	
	 String event_data ;
	 
	LocalDateTime created_at ;
}
