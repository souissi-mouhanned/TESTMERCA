package Com.Merca.Mercarue.models;
import lombok.Data;
import javax.persistence.*;

@Data

@Entity
@Table
public class wor7428_revslider_sliders_bkp {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer  id;
	 
	 @Column(columnDefinition = "TINYTEXT COLLATE utf8mb4_unicode_520_ci")
	 String title ;
	 
	 @Column(columnDefinition = "TINYTEXT COLLATE utf8mb4_unicode_520_ci")
	 String alias ;
	 
	 @Column(columnDefinition = "LONGTEXT COLLATE utf8mb4_unicode_520_ci")
	 String params ;
	 
	 @Column(columnDefinition = "TEXT COLLATE utf8mb4_unicode_520_ci")
	 String settings ;
	 
	 @Column(columnDefinition = "varchar(191) COLLATE utf8mb4_unicode_520_ci")
	 String type ;
}
