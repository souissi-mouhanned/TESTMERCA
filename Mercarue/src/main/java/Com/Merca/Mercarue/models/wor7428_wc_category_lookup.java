package Com.Merca.Mercarue.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data

@Entity
@Table 
		
public class wor7428_wc_category_lookup {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column( columnDefinition = "bigint(20)")
	private Long category_tree_id;
	
	 @Column( columnDefinition = "bigint(20)")
		private Long category_id;
}
