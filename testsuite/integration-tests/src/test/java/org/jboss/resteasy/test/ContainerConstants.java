package org.jboss.resteasy.test;

import java.io.File;

/**
 * Various contants for containers defined in arquillian.xml. Keep this file in sync with the values there.
 */
public class ContainerConstants {

   public static final String DEFAULT_CONTAINER_QUALIFIER = "jbossas-managed";

   public static final String GZIP_CONTAINER_QUALIFIER = "jbossas-manual-gzip";

   public static final int GZIP_CONTAINER_PORT_OFFSET = 1000;

}