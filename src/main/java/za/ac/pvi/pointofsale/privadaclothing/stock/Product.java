package za.ac.pvi.pointofsale.privadaclothing.stock;

public class Product{

		private String name;
		private String size;
		private String color;
		private String type;
		private String barcode;
		private String productNumber;
		private String deliveryDate;
		private String receiptNumber;
		private String supplier;
		private String manufacturer;
		private int quantityReceived;


	public Product(){}

		public void setName(String name){
                        this.name = name;
                                }

                public String getName(){
                        return this.name;
                                }

                public void setSize(String size){
                        this.size = size;
                                }

                public String getSize(){
                        return this.size;
                                }

                public void setColor(String color){
                        this.color = color;
                                }

                public String getColor(){
                        return this.color;
                                }
		public void setType(String type){
                        this.type = type;
                                }

                public String getType(){
                        return this.type;
                                }

                public void setBarcode(String barcode){
                        this.barcode = barcode;
                                }

                public String getBarcode(){
                        return this.barcode;
				}

		 public void setProductNumber(String productNumber){
                        this.productNumber = productNumber;
                                }

                public String getProductNumber(){
                        return this.productNumber;
                                }

                public void setDeliveryDate(String deliveryDate){
                        this.deliveryDate = deliveryDate;
                                }

                public String getDeliveryDate(){
                        return this.deliveryDate;
                                }

                public void setReceiptNumber(String receiptNumber){
                        this.receiptNumber = receiptNumber;
                                }

                public String getReceiptNumber(){
                        return this.receiptNumber;
                                }

		public void setSupplier(String supplier){
			 this.supplier = supplier;
				}

		public String getSupplier(){
			return this.supplier;
				}

		public void setManufacturer(String manufacturer){
			 this.manufacturer = manufacturer;
				}

		public String getManufacturer(){
			return this.manufacturer;
				}

                public void setQuantityReceived(int quantityReceived){
                        this.quantityReceived = quantityReceived;
                                }

                public int getQuantityReceived(){
                        return this.quantityReceived;
                                }


}
