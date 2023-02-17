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
public class wor7428_woocommerce_shipping_zones {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  
	@Column( columnDefinition = "bigint(20)")
	private Long zone_id;
	  
	@Column( columnDefinition = "bigint(20)")
	private Long zone_order;
	 
	@Column(columnDefinition = "VARCHAR(200) COLLATE utf8mb4_unicode_520_ci")
	 String zone_name ;
}
