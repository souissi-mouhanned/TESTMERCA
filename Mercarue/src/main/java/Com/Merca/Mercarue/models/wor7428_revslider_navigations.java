package Com.Merca.Mercarue.models;
import lombok.Data;
import javax.persistence.*;

@Data

@Entity
@Table
public class wor7428_revslider_navigations {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer id;

	 @Column(columnDefinition = "VARCHAR(191) COLLATE utf8mb4_unicode_520_ci")
	 String name ;
	 
	 @Column(columnDefinition = "VARCHAR(191) COLLATE utf8mb4_unicode_520_ci")
	 String handle ;

	 @Column(columnDefinition = "VARCHAR(191) COLLATE utf8mb4_unicode_520_ci")
	 String type ;
	 
	 @Column(columnDefinition = "LONGTEXT COLLATE utf8mb4_unicode_520_ci")
	 String css ;
	 
	 @Column(columnDefinition = "LONGTEXT COLLATE utf8mb4_unicode_520_ci")
	 String markup ;
	 
	 @Column(columnDefinition = "LONGTEXT COLLATE utf8mb4_unicode_520_ci")
	 String settings ;
	
}
