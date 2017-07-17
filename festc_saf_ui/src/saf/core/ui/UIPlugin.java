package saf.core.ui;

import java.io.File;
/**
public class UIPlugin extends Plugin {
	private static final String ACTIONS_ID = "ui.Actions";
	private Map<String, Location> locationMap = new HashMap<String, Location>();
	private boolean viewRootFound = false;
	private DockingFactory dockingFactory;
	protected void doStart() throws Exception {
	protected void doStop() throws Exception {
	public void initialize() throws PluginDefinitionException {
		ExtensionPoint extPoint = getManager().getRegistry().getExtensionPoint(getDescriptor().getId(), ACTIONS_ID);
		//  process menu spec
		MenuTreeDescriptor mtDescriptor = new MenuTreeDescriptor();
		// process status field specs
		extPoint = getManager().getRegistry().getExtensionPoint(getDescriptor().getId(), STATUS_BAR_ID);
		// process perspectives
		List<Perspective> perspectives = new ArrayList<Perspective>();
			throw new PluginDefinitionException("At least one perspective must be defined");
		// process help sets
		extPoint = getManager().getRegistry().getExtensionPoint(getDescriptor().getId(), HELP_ID);
	private void fillLocationMap() {
	private boolean subParamExists(String name, Extension.Parameter param) {
	private String getSubParamValueAsString(String name, Extension.Parameter param) {
	Help processHelpSet(Extension.Parameter param, Help help) throws PluginDefinitionException {
	void processStatusFieldSpec(Extension.Parameter param, StatusBarDescriptor statusDescriptor)
	void processPerspective(Extension.Parameter param, List<Perspective> perspectives) throws PluginDefinitionException {
	private void processViewGroup(Extension.Parameter param, Perspective perspective) throws PluginDefinitionException {
			float fill = getSubParamValueAsFloat(VIEW_GROUP_FILL, param);
	void processMenuSpec(Extension.Parameter param, MenuTreeDescriptor mtDescriptor) {
			if (param.getSubParameter(MENU_PARENT_ID) != null) {
	void processActionSpec(Extension.Parameter param) throws PluginDefinitionException {