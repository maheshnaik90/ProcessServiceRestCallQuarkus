package org.acme;
public class DomainClassesMetadata49F42D626E9988546A3691D6941DC956 {

    public static final org.drools.model.DomainClassMetadata org_acme_Product_Metadata_INSTANCE = new org_acme_Product_Metadata();
    private static class org_acme_Product_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.acme.Product.class;
        }

        @Override
        public int getPropertiesSize() {
            return 4;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "discount": return 0;
                case "productName": return 1;
                case "productPrice": return 2;
                case "type": return 3;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class org.acme.Product");
        }
    }

}