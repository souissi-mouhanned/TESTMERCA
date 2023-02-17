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
public class wor7428_woocommerce_payment_tokenmeta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  
	@Column( columnDefinition = "bigint(20)")
	private Long meta_id;
	  
	@Column( columnDefinition = "bigint(20)")
	private Long payment_token_id;
	
	 
	 @Column(columnDefinition = "VARCHAR(255) COLLATE utf8mb4_unicode_520_ci")
	 String meta_key ;
		
	 @Column(columnDefinition = "LONGTEXT COLLATE utf8mb4_unicode_520_ci")
	 String meta_value ;
}
