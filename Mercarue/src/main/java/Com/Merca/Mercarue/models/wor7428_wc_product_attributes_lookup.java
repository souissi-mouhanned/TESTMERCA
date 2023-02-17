package Com.Merca.Mercarue.models;

import java.time.LocalDateTime;

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
		
public class wor7428_wc_product_attributes_lookup {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column( columnDefinition = "bigint(20)")
	private Long product_id;
	
	 @Column( columnDefinition = "bigint(20)")
		private Long product_or_parent_id;
	 
	  @Column( columnDefinition = "bigint(20)")
		private Long term_id;
		
		 @Column( columnDefinition = "tinyint(1) ")
			private Long is_variation_attribute;
		 
		  @Column( columnDefinition = "tinyint(1) ")
			private Long in_stock;
		 
		  @Column(columnDefinition = "VARCHAR(32) COLLATE utf8mb4_unicode_520_ci")
			 String taxonomy ;
			
		
}
