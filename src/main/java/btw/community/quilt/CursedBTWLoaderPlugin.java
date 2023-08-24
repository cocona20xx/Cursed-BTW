package btw.community.quilt;

import org.quiltmc.loader.api.LoaderValue;
import org.quiltmc.loader.api.plugin.ModLocation;
import org.quiltmc.loader.api.plugin.QuiltLoaderPlugin;
import org.quiltmc.loader.api.plugin.QuiltPluginContext;
import org.quiltmc.loader.api.plugin.gui.PluginGuiTreeNode;
import org.quiltmc.loader.api.plugin.solver.ModLoadOption;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;

public class CursedBTWLoaderPlugin implements QuiltLoaderPlugin {

    private QuiltPluginContext context;
    private Map<String, LoaderValue> previousData;
    @Override
    public void load(QuiltPluginContext context, Map<String, LoaderValue> previousData) {
        this.context = context;
        this.previousData = previousData;
    }
    @Override
    public void unload(Map<String, LoaderValue> data) {

    }

    @Override
    public ModLoadOption[] scanFolder(Path folder, ModLocation location, PluginGuiTreeNode guiNode) throws IOException {
        System.out.println(folder.toString());
        return QuiltLoaderPlugin.super.scanFolder(folder, location, guiNode);
    }
}
