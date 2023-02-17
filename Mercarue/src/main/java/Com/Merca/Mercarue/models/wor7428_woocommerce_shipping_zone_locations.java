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
public class wor7428_woocommerce_shipping_zone_locations {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  
	@Column( columnDefinition = "bigint(20)")
	private Long location_id;
	  
	@Column( columnDefinition = "bigint(20)")
	private Long zone_id;
	 
	@Column(columnDefinition = "VARCHAR(200) COLLATE utf8mb4_unicode_520_ci")
	 String location_code ;
	 
	@Column(columnDefinition = "VARCHAR(40) COLLATE utf8mb4_unicode_520_ci")
	 String location_type ;
}
