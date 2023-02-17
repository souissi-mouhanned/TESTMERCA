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
public class wor7428_woocommerce_tax_rate_locations {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  
	@Column( columnDefinition = "bigint(20)")
	private Long location_id;
	  
	@Column( columnDefinition = "bigint(20)")
	private Long tax_rate_id;
	 
	@Column(columnDefinition = "VARCHAR(200) COLLATE utf8mb4_unicode_520_ci")
	 String location_code ;
	 
	@Column(columnDefinition = "VARCHAR(40) COLLATE utf8mb4_unicode_520_ci")
	 String location_type ;
}
