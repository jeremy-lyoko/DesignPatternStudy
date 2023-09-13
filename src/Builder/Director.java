package Builder;

import java.util.Collection;
import java.util.Map;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(ExportHeaderMode1 ehm, Map<String, Collection<ExportDataMode1>> mapData, ExportFooterMode1 efm) {
        builder.buildHeader(ehm);
        builder.buildBody(mapData);
        builder.buildFooter(efm);
    }
}
