package Com.Merca.Mercarue.models;
import lombok.Data;
import javax.persistence.*;

@Data

@Entity
@Table
public class wor7428_term_taxonomy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column( columnDefinition = "bigint(20)")
	private Long term_taxonomy_id;
	
	 @Column( columnDefinition = "bigint(20)")
		private Long term_id;
	 
		
	 @Column( columnDefinition = "bigint(20)")
		private Long parent;
	 
		
	 @Column( columnDefinition = "bigint(20)")
		private Long count;
	 

	 @Column(columnDefinition = "VARCHAR(32) COLLATE utf8mb4_unicode_520_ci")
	 String taxonomy ;
	
	 @Column(columnDefinition = "LONGTEXT COLLATE utf8mb4_unicode_520_ci") 	
	 String description ;
	 
}
