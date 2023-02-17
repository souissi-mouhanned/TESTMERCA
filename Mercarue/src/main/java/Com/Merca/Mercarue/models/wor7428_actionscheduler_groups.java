package Com.Merca.Mercarue.models;
import javax.persistence.*;

import lombok.Data;

@Data

@Entity
@Table 
		
public class wor7428_actionscheduler_groups {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long group_id;
	@Column(nullable = false)
	 String slug ;
}
