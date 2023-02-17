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
public class wor7428_woocommerce_tax_rates {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  
	@Column( columnDefinition = "bigint(20)")
	private Long tax_rate_id;
	  
	@Column( columnDefinition = "bigint(20)")
	private Long tax_rate_priority;
	  
	@Column( columnDefinition = "bigint(20)")
	private Long tax_rate_order;
	  
	@Column( columnDefinition = "int(1)")
	private Long tax_rate_compound;
	  
	@Column( columnDefinition = "int(1)")
	private Long tax_rate_shipping;
	  
	 
	@Column(columnDefinition = "VARCHAR(2) COLLATE utf8mb4_unicode_520_ci")
	 String tax_rate_country ;
	 
	@Column(columnDefinition = "VARCHAR(200) COLLATE utf8mb4_unicode_520_ci")
	 String tax_rate_state ;
	 
	@Column(columnDefinition = "VARCHAR(8) COLLATE utf8mb4_unicode_520_ci")
	 String tax_rate ;
	 
	@Column(columnDefinition = "VARCHAR(200) COLLATE utf8mb4_unicode_520_ci")
	 String tax_rate_name ;
	 
	@Column(columnDefinition = "VARCHAR(200) COLLATE utf8mb4_unicode_520_ci")
	 String tax_rate_class ;
	
}
