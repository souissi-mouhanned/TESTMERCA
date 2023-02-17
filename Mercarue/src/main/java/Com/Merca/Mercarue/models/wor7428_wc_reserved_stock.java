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
		
public class wor7428_wc_reserved_stock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column( columnDefinition = "bigint(20)")
	private Long order_id;
	
	 @Column( columnDefinition = "bigint(20)")
		private Long product_id;
	 
	 double stock_quantity ;
	 
	 LocalDateTime 	 timestamp ;
	 LocalDateTime expires ;
	 
}
