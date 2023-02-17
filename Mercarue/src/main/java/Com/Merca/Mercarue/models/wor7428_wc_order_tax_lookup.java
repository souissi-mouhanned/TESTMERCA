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
		
public class wor7428_wc_order_tax_lookup {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column( columnDefinition = "bigint(20)")
	private Long order_id;
	
	 @Column( columnDefinition = "bigint(20)")
		private Long tax_rate_id;
	 
	 LocalDateTime date_created ;
	 
	 double shipping_tax ;
	 double order_tax ;
	 double total_tax ;

}
