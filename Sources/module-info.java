module SimpleWOApp {
	requires org.wocommunity.webobjects.foundation;
	requires org.wocommunity.webobjects.eocontrol;
	requires org.wocommunity.webobjects.eoaccess;
	requires org.wocommunity.webobjects.jdbcadaptor;
	requires org.wocommunity.webobjects.webobjects;

	exports your.app;
	exports your.app.components;
}