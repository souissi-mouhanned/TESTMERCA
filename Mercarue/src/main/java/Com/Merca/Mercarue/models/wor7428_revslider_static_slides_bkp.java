package Com.Merca.Mercarue.models;
import lombok.Data;
import javax.persistence.*;

@Data

@Entity
@Table
public class wor7428_revslider_static_slides_bkp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer  id;

	Integer slider_id;
	int slide_order ;
	 @Column(columnDefinition = "TINYTEXT COLLATE utf8mb4_unicode_520_ci")
	 String layers ;
	 
	 @Column(columnDefinition = "LONGTEXT COLLATE utf8mb4_unicode_520_ci")
	 String params ;
	 
	 @Column(columnDefinition = "LONGTEXT COLLATE utf8mb4_unicode_520_ci")
	 String settings ;
}
