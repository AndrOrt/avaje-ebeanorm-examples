package org.example.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import com.avaje.ebean.Model.Finder

/**
 * Create using a name and sku.
 * <p>
 * Provided as alternate constructor.
 */
fun Product(name:String , sku:String) : Product {
  val product = Product()
  product.name = name
  product.sku = sku
  return product;
}

/**
 * Product entity bean.
 */
Entity
Table(name = "o_product")
public class Product : BaseModel() {

  class object {
    /**
     * Convenience Finder for 'active record' style.
     */
    public val find : Finder<Long,Product> = Finder(javaClass<Long>(), javaClass<Product>());

    public fun ref(id:Long) : Product {
      return find.ref(id);
    }
  }

  Size(max = 20)
  public var sku:String? = null;

  public var name:String? = null;

}
