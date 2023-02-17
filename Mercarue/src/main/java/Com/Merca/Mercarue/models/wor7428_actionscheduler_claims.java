package Com.Merca.Mercarue.models;
import java.time.LocalDateTime;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data

@Entity
@Table 
		
public class wor7428_actionscheduler_claims {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long claim_id;
	
	LocalDateTime date_created_gmt ;
}
