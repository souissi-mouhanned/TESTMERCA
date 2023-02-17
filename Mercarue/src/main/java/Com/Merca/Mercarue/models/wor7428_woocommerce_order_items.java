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
public class wor7428_woocommerce_order_items {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  
	@Column( columnDefinition = "bigint(20)")
	private Long order_item_id;
	  
	@Column( columnDefinition = "bigint(20)")
	private Long order_id;
	
	 @Column(columnDefinition = "VARCHAR(200) COLLATE utf8mb4_unicode_520_ci")
	 String order_item_type ;
		
	 @Column(columnDefinition = "TEXT COLLATE utf8mb4_unicode_520_ci")
	 String order_item_name ;
}
