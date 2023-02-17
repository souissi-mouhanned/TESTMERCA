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
public class wor7428_wc_product_download_directories {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column( columnDefinition = "bigint(20)")
	private Long url_id;
	
	  @Column( columnDefinition = "tinyint(1) ")
		private Long enabled;
	 
	  @Column(columnDefinition = "VARCHAR(256) COLLATE utf8mb4_unicode_520_ci")
		 String url ;
}
