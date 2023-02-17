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
public class wor7428_woocommerce_attribute_taxonomies {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  
	@Column( columnDefinition = "bigint(20)")
	private Long attribute_id;
	  
	@Column( columnDefinition = "int(1)")
	private Long attribute_public;
	
	
	 @Column(columnDefinition = "VARCHAR(200) COLLATE utf8mb4_unicode_520_ci")
	 String attribute_name ;
	 
	 @Column(columnDefinition = "VARCHAR(200) COLLATE utf8mb4_unicode_520_ci")
	 String attribute_label ;
		
	 @Column(columnDefinition = "VARCHAR(20) COLLATE utf8mb4_unicode_520_ci")
	 String attribute_type ;
	 
	 @Column(columnDefinition = "VARCHAR(20) COLLATE utf8mb4_unicode_520_ci")
	 String attribute_orderby ;
}
