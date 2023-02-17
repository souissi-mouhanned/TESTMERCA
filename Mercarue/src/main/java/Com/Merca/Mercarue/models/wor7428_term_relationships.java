package Com.Merca.Mercarue.models;
import lombok.Data;
import javax.persistence.*;

@Data

@Entity
@Table
public class wor7428_term_relationships {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column( columnDefinition = "bigint(20)")
	private Long object_id;
	 @Column( columnDefinition = "bigint(20)")
		private Long term_taxonomy_id;
	 
	 @Column( columnDefinition = "int(11)")
		private Long term_order;
	
	
	
}
