/**
 * 
 */
/**
 * @author legioner
 *
 */
module modules {
	exports test.modules;
	exports test.modules.components;
	
    requires java.instrument;
    requires java.sql;
    requires spring.beans;
    requires spring.context;
    requires spring.core;
    requires spring.tx;
    
    opens test.modules to spring.core;
    
}