package org.osjava.reportrunner;

import java.io.*;
import java.util.*;
import com.generationjava.io.xml.*;
import com.generationjava.lang.*;

public interface Report extends Nameable {

    String getName();
    void setName(String name);
    String getDescription();
    void setDescription(String description);
    String getLabel();
    void setLabel(String label);
    Renderer[] getRenderers();
    void addRenderer(Renderer renderer);
    Result execute() throws ReportException;
    Param[] getParams();
    void addParam(Param param);
    Choice[] getParamChoices(Param param);
    Column[] getColumns();
    void addColumn(Column column);
    Variant[] getVariants();
    void addVariant(Variant variant);
    void setReportGroup(ReportGroup group);
    ReportGroup getReportGroup();
    String[] getResourceNames();
    void setResource(String name, String resourceName);
    String getAuthor();
    void setAuthor(String author);

}
