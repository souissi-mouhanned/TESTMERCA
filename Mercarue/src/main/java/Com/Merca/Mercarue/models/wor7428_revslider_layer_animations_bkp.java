package Com.Merca.Mercarue.models;
import lombok.Data;
import javax.persistence.*;

@Data

@Entity
@Table
public class wor7428_revslider_layer_animations_bkp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer id;
	
	@Column(columnDefinition = "TEXT COLLATE utf8mb4_unicode_520_ci") 	
	 String handle ;
	
	@Column(columnDefinition = "TEXT COLLATE utf8mb4_unicode_520_ci") 	
	 String params ;
	
	@Column(columnDefinition = "TEXT COLLATE utf8mb4_unicode_520_ci") 	
	 String settings ;
}
