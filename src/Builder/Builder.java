package Builder;

import java.util.Collection;
import java.util.Map;

public interface Builder {
    public void buildHeader(ExportHeaderMode1 ehm);
    public void buildBody(Map<String, Collection<ExportDataMode1>> mapData);
    public void buildFooter(ExportFooterMode1 efm);
}
