package fossils.fossils.client.blockentity.model.hypuronector;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HypuronectorFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hypuronector;
	private final ModelPart lowerbody;
	private final ModelPart backleftleg;
	private final ModelPart backleftleg2;
	private final ModelPart backleftleg3;
	private final ModelPart finger;
	private final ModelPart backrightleg;
	private final ModelPart backrightleg2;
	private final ModelPart backrightleg3;
	private final ModelPart finger2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart body;
	private final ModelPart upperbody;
	private final ModelPart frontleftarm;
	private final ModelPart frontleftarm2;
	private final ModelPart frontleftarm3;
	private final ModelPart frontleftarm4;
	private final ModelPart frontrightarm;
	private final ModelPart frontrightarm2;
	private final ModelPart frontrightarm3;
	private final ModelPart frontrightarm4;
	private final ModelPart neck;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart lowerjaw;

	public HypuronectorFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hypuronector = this.fossil.getChild("Hypuronector");
		this.lowerbody = this.Hypuronector.getChild("lowerbody");
		this.backleftleg = this.lowerbody.getChild("backleftleg");
		this.backleftleg2 = this.backleftleg.getChild("backleftleg2");
		this.backleftleg3 = this.backleftleg2.getChild("backleftleg3");
		this.finger = this.backleftleg3.getChild("finger");
		this.backrightleg = this.lowerbody.getChild("backrightleg");
		this.backrightleg2 = this.backrightleg.getChild("backrightleg2");
		this.backrightleg3 = this.backrightleg2.getChild("backrightleg3");
		this.finger2 = this.backrightleg3.getChild("finger2");
		this.tail = this.lowerbody.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.body = this.lowerbody.getChild("body");
		this.upperbody = this.body.getChild("upperbody");
		this.frontleftarm = this.upperbody.getChild("frontleftarm");
		this.frontleftarm2 = this.frontleftarm.getChild("frontleftarm2");
		this.frontleftarm3 = this.frontleftarm2.getChild("frontleftarm3");
		this.frontleftarm4 = this.frontleftarm2.getChild("frontleftarm4");
		this.frontrightarm = this.upperbody.getChild("frontrightarm");
		this.frontrightarm2 = this.frontrightarm.getChild("frontrightarm2");
		this.frontrightarm3 = this.frontrightarm2.getChild("frontrightarm3");
		this.frontrightarm4 = this.frontrightarm2.getChild("frontrightarm4");
		this.neck = this.upperbody.getChild("neck");
		this.neck3 = this.neck.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.lowerjaw = this.head.getChild("lowerjaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Hypuronector = fossil.addOrReplaceChild("Hypuronector", CubeListBuilder.create(), PartPose.offset(0.0F, -4.25F, 0.0F));

		PartDefinition lowerbody = Hypuronector.addOrReplaceChild("lowerbody", CubeListBuilder.create(), PartPose.offset(0.0F, -10.7F, 10.0F));

		PartDefinition cube_r1 = lowerbody.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(56, 12).addBox(0.0F, -2.241F, -1.0453F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.05F, 6.6F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r2 = lowerbody.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(58, 26).addBox(0.0F, -1.8F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 58).addBox(0.0F, -1.7F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 36).addBox(0.0F, -1.8F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 18).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.85F, -0.4F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r3 = lowerbody.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(51, 5).mirror().addBox(-0.5F, -0.0572F, -1.414F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(51, 5).addBox(3.7F, -0.0572F, -1.414F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.1F, -2.444F, 3.6835F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r4 = lowerbody.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(44, 2).mirror().addBox(0.0F, 2.1273F, -1.3651F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.856F, 4.1835F, 0.2356F, 0.0F, -0.4363F));

		PartDefinition cube_r5 = lowerbody.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(36, 18).mirror().addBox(0.0F, 0.5505F, -0.4548F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.856F, 4.1835F, -0.1745F, 0.0F, -0.4363F));

		PartDefinition cube_r6 = lowerbody.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(31, 47).mirror().addBox(0.0F, -0.0126F, -0.7779F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.856F, 4.1835F, 0.0436F, 0.0F, -0.4363F));

		PartDefinition cube_r7 = lowerbody.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(49, 10).mirror().addBox(0.0F, 0.4473F, -0.9011F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 0.856F, 4.1835F, 0.48F, 0.0F, -0.4363F));

		PartDefinition cube_r8 = lowerbody.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(51, 15).mirror().addBox(-0.5F, -0.3572F, 0.486F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(51, 15).addBox(3.7F, -0.3572F, 0.486F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.1F, -2.444F, 3.6835F, -0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r9 = lowerbody.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-0.5F, -0.0029F, -1.1309F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false)
				.texOffs(0, 29).addBox(3.7F, -0.0029F, -1.1309F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-2.1F, -2.544F, 3.8835F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r10 = lowerbody.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(26, 27).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(26, 27).addBox(3.7F, -1.5F, -0.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 0.456F, 3.8835F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r11 = lowerbody.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(49, 23).mirror().addBox(-4.5088F, -1.266F, -0.506F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8012F, 4.1314F, -0.1304F, -0.3575F, -1.5407F));

		PartDefinition cube_r12 = lowerbody.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(58, 16).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8012F, 4.1314F, -0.3583F, -0.1376F, -0.6657F));

		PartDefinition cube_r13 = lowerbody.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(58, 11).mirror().addBox(-1.9397F, -0.342F, -0.506F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8012F, 4.1314F, -0.2933F, -0.2445F, -1.0044F));

		PartDefinition cube_r14 = lowerbody.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(44, 21).mirror().addBox(-5.5088F, -1.266F, -0.506F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1012F, 2.1314F, -0.0957F, -0.2581F, -1.3418F));

		PartDefinition cube_r15 = lowerbody.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(58, 32).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1012F, 2.1314F, -0.2601F, -0.0992F, -0.4679F));

		PartDefinition cube_r16 = lowerbody.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(58, 23).mirror().addBox(-1.9397F, -0.342F, -0.506F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1012F, 2.1314F, -0.2125F, -0.1758F, -0.8118F));

		PartDefinition cube_r17 = lowerbody.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(37, 10).mirror().addBox(-6.5088F, -1.266F, -0.506F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5012F, 0.1314F, -0.0682F, -0.1751F, -1.2604F));

		PartDefinition cube_r18 = lowerbody.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(10, 59).mirror().addBox(-1.9397F, -0.342F, -0.506F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5012F, 0.1314F, -0.1467F, -0.1176F, -0.7341F));

		PartDefinition cube_r19 = lowerbody.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(58, 48).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.5012F, 0.1314F, -0.1789F, -0.0665F, -0.3873F));

		PartDefinition cube_r20 = lowerbody.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(49, 10).addBox(-1.0F, 0.4473F, -0.9011F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.6F, 0.856F, 4.1835F, 0.48F, 0.0F, 0.4363F));

		PartDefinition cube_r21 = lowerbody.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(31, 47).addBox(-1.0F, -0.0126F, -0.7779F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, 0.856F, 4.1835F, 0.0436F, 0.0F, 0.4363F));

		PartDefinition cube_r22 = lowerbody.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(36, 18).addBox(-1.0F, 0.5505F, -0.4548F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.6F, 0.856F, 4.1835F, -0.1745F, 0.0F, 0.4363F));

		PartDefinition cube_r23 = lowerbody.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(44, 2).addBox(-1.0F, 2.1273F, -1.3651F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(2.6F, 0.856F, 4.1835F, 0.2356F, 0.0F, 0.4363F));

		PartDefinition cube_r24 = lowerbody.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(58, 11).addBox(0.9397F, -0.342F, -0.506F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8012F, 4.1314F, -0.2933F, 0.2445F, 1.0044F));

		PartDefinition cube_r25 = lowerbody.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(58, 16).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8012F, 4.1314F, -0.3583F, 0.1376F, 0.6657F));

		PartDefinition cube_r26 = lowerbody.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(49, 23).addBox(1.5088F, -1.266F, -0.506F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8012F, 4.1314F, -0.1304F, 0.3575F, 1.5407F));

		PartDefinition cube_r27 = lowerbody.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(58, 23).addBox(0.9397F, -0.342F, -0.506F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1012F, 2.1314F, -0.2125F, 0.1758F, 0.8118F));

		PartDefinition cube_r28 = lowerbody.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(58, 32).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1012F, 2.1314F, -0.2601F, 0.0992F, 0.4679F));

		PartDefinition cube_r29 = lowerbody.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(44, 21).addBox(1.5088F, -1.266F, -0.506F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1012F, 2.1314F, -0.0957F, 0.2581F, 1.3418F));

		PartDefinition cube_r30 = lowerbody.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(58, 48).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5012F, 0.1314F, -0.1789F, 0.0665F, 0.3873F));

		PartDefinition cube_r31 = lowerbody.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(10, 59).addBox(0.9397F, -0.342F, -0.506F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5012F, 0.1314F, -0.1467F, 0.1176F, 0.7341F));

		PartDefinition cube_r32 = lowerbody.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(37, 10).addBox(1.5088F, -1.266F, -0.506F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5012F, 0.1314F, -0.0682F, 0.1751F, 1.2604F));

		PartDefinition backleftleg = lowerbody.addOrReplaceChild("backleftleg", CubeListBuilder.create().texOffs(0, 15).addBox(0.006F, -0.7124F, -0.4503F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.25F, 1.45F, 4.95F, -0.3051F, -0.0072F, -0.0952F));

		PartDefinition backleftleg2 = backleftleg.addOrReplaceChild("backleftleg2", CubeListBuilder.create().texOffs(40, 48).addBox(-1.0F, 0.0F, -0.45F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 37).addBox(0.1F, 0.0F, -0.55F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.506F, 7.3876F, 0.4497F, 0.6961F, -0.0653F, 0.0626F));

		PartDefinition backleftleg3 = backleftleg2.addOrReplaceChild("backleftleg3", CubeListBuilder.create().texOffs(0, 29).addBox(-1.1452F, 0.0042F, -4.2958F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.0268F, 5.5994F, 0.0082F, -0.3763F, 0.0331F, 0.0955F));

		PartDefinition finger = backleftleg3.addOrReplaceChild("finger", CubeListBuilder.create().texOffs(36, 18).addBox(-0.8442F, -0.4F, -4.7345F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.9952F, 0.4042F, 0.3042F, 0.0F, 0.2618F, 0.0F));

		PartDefinition backrightleg = lowerbody.addOrReplaceChild("backrightleg", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(-1.006F, -0.7124F, -0.4503F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.25F, 1.45F, 4.95F, -0.6082F, 0.0572F, 0.1668F));

		PartDefinition backrightleg2 = backrightleg.addOrReplaceChild("backrightleg2", CubeListBuilder.create().texOffs(40, 48).mirror().addBox(0.0F, 0.0F, -0.45F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(47, 37).mirror().addBox(-1.1F, 0.0F, -0.55F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.506F, 7.3876F, 0.4497F, 0.5216F, 0.0653F, -0.0626F));

		PartDefinition backrightleg3 = backrightleg2.addOrReplaceChild("backrightleg3", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-1.8548F, 0.0042F, -4.2958F, 3.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0268F, 5.5994F, 0.0082F, 0.3219F, -0.0331F, -0.0955F));

		PartDefinition finger2 = backrightleg3.addOrReplaceChild("finger2", CubeListBuilder.create().texOffs(36, 18).mirror().addBox(-0.1558F, -0.4F, -4.7345F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.9952F, 0.4042F, 0.3042F, 0.0F, -0.2618F, 0.0F));

		PartDefinition tail = lowerbody.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.723F, 6.1814F, -0.0922F, 0.3032F, -0.016F));

		PartDefinition cube_r33 = tail.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(27, 0).addBox(0.0F, -2.9F, -2.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0473F, 3.8872F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r34 = tail.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(30, 0).addBox(0.0F, -2.2F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0473F, 3.8872F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r35 = tail.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(3, 36).addBox(0.5F, -2.6578F, -0.0355F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.627F, 2.8186F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r36 = tail.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(37, 52).addBox(0.5F, -2.3819F, 0.0726F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.427F, 0.7186F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r37 = tail.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.027F, -2.1814F, 0.1309F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.377F, 4.8186F, 0.2669F, 0.2129F, 0.0479F));

		PartDefinition cube_r38 = tail2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(54, 53).addBox(0.0F, -2.8274F, -0.0621F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9594F, 5.8564F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r39 = tail2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(8, 55).addBox(0.0F, -2.8527F, -0.061F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8594F, 3.8564F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r40 = tail2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(55, 35).addBox(0.0F, -3.65F, -2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 55).addBox(0.0F, -3.55F, -4.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 0).addBox(-0.5F, -0.75F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.1594F, 3.8564F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r41 = tail2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(28, 47).addBox(0.0F, -0.2551F, -0.1757F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0243F, 6.0686F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r42 = tail2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(3, 49).addBox(0.0F, -0.1369F, -0.0023F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0243F, 3.9686F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r43 = tail2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(18, 15).addBox(0.0F, -0.4002F, 0.0518F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0243F, 1.8686F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r44 = tail2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(52, 36).addBox(0.0F, -0.4715F, -0.8722F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0243F, 0.7686F, 0.2793F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4592F, 7.7524F, -0.0894F, 0.2173F, -0.0193F));

		PartDefinition cube_r45 = tail3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(58, 6).addBox(0.0F, -1.8246F, 0.0499F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0002F, 5.804F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r46 = tail3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(16, 54).addBox(0.0F, -2.1417F, -0.0519F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0002F, 3.904F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r47 = tail3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(25, 54).addBox(0.0F, -2.4757F, 1.7576F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 42).addBox(0.0F, -2.5757F, -0.2424F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 25).addBox(-0.5F, -0.0757F, -0.2424F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7002F, 0.104F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r48 = tail3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(41, 35).addBox(0.0F, -0.0445F, -0.0083F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2835F, 4.6162F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r49 = tail3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(9, 44).addBox(0.0F, 0.4156F, 0.2658F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2835F, 2.1162F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r50 = tail3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(46, 46).addBox(0.0F, 0.2186F, -0.0122F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2835F, 0.2162F, 0.5061F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.005F, -0.6693F, 6.7881F, -0.2716F, 0.083F, -0.027F));

		PartDefinition cube_r51 = tail4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(34, 42).addBox(0.0F, -0.3F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 44).addBox(0.0F, -0.5F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 57).addBox(0.0F, -0.8F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 57).addBox(0.0F, -0.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -0.9973F, 5.3247F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r52 = tail4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(57, 55).addBox(0.0F, -1.5212F, 1.0266F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 58).addBox(0.0F, -1.7212F, -0.9734F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -0.3782F, 1.8457F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r53 = tail4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(38, 36).addBox(0.0F, 1.7631F, 1.3443F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 37).addBox(0.0F, 10.1678F, 7.2426F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 42).addBox(0.0F, 7.8166F, 5.768F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(15, 42).addBox(0.0F, 5.4654F, 4.2935F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(18, 42).addBox(0.0F, 4.1143F, 2.8189F, 0.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 41).addBox(0.0F, 0.6119F, -0.1302F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 0.5883F, -0.2054F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r54 = tail4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.1743F, 12.7576F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -0.0309F, -12.8841F, 0.0436F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 15).addBox(-0.5F, -0.2F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(28, 42).addBox(-0.005F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(38, 0).addBox(-0.005F, -0.5F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 18).addBox(-0.005F, -0.4F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8F, 12.9F, -0.131F, 0.0433F, -0.0057F));

		PartDefinition cube_r55 = tail5.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 36).addBox(0.0F, 0.0722F, -1.056F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, -0.0817F, 9.8646F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r56 = tail5.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(6, 49).addBox(0.0F, 5.168F, 1.8964F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 49).addBox(0.0F, 1.9787F, 0.4577F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 44).addBox(0.0F, 0.0893F, -0.981F, 0.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.005F, 0.5216F, 1.8592F, 1.0821F, 0.0F, 0.0F));

		PartDefinition body = lowerbody.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.55F, -0.3F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(19, 56).addBox(0.0F, -3.0F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 56).addBox(0.0F, -3.0F, 2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(30, 56).addBox(0.0F, -3.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(11, 34).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.85F, -12.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(33, 56).addBox(0.0F, -1.7106F, 4.04F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 56).addBox(0.0F, -2.0106F, 2.04F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 56).addBox(0.0F, -2.0106F, 0.04F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 36).addBox(-0.5F, -0.0106F, 0.04F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.45F, -6.1F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(57, 18).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1488F, -11.5686F, 0.0793F, 0.04F, -0.3908F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(11, 57).mirror().addBox(-1.9397F, -0.342F, -0.506F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1488F, -11.5686F, 0.0599F, 0.0707F, -0.739F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(16, 10).mirror().addBox(-6.5088F, -1.266F, -0.506F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1488F, -11.5686F, 0.0165F, 0.0911F, -1.264F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(57, 34).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1488F, -9.5686F, 0.0309F, 0.02F, -0.3922F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(57, 30).mirror().addBox(-1.9397F, -0.342F, -0.506F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1488F, -9.5686F, 0.0212F, 0.0354F, -0.7411F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(36, 27).mirror().addBox(-7.5088F, -1.266F, -0.506F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1488F, -9.5686F, 0.0006F, 0.0412F, -1.265F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(57, 44).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0488F, -7.5686F, -0.0336F, -0.0067F, -0.3926F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(57, 42).mirror().addBox(-1.9397F, -0.342F, -0.506F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0488F, -7.5686F, -0.0303F, -0.0118F, -0.7417F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(36, 29).mirror().addBox(-7.5088F, -1.266F, -0.506F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0488F, -7.5686F, -0.0204F, -0.0254F, -1.2652F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 27).mirror().addBox(-7.5088F, -1.266F, -0.506F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0488F, -1.5686F, -0.0628F, -0.1585F, -1.2613F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(56, 46).mirror().addBox(-1.9397F, -0.342F, -0.506F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0488F, -1.5686F, -0.1337F, -0.1059F, -0.7356F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(56, 4).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0488F, -1.5686F, -0.1628F, -0.0599F, -0.3883F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(35, 8).mirror().addBox(-7.5088F, -1.266F, -0.506F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0488F, -3.5686F, -0.0574F, -0.1418F, -1.2621F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(57, 2).mirror().addBox(-1.9397F, -0.342F, -0.506F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0488F, -3.5686F, -0.1207F, -0.0942F, -0.7369F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(56, 51).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0488F, -3.5686F, -0.1466F, -0.0533F, -0.3893F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(36, 31).mirror().addBox(-7.5088F, -1.266F, -0.506F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0488F, -5.5686F, -0.0414F, -0.0919F, -1.264F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(50, 57).mirror().addBox(-1.9397F, -0.342F, -0.506F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0488F, -5.5686F, -0.0819F, -0.0589F, -0.7399F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(57, 53).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0488F, -5.5686F, -0.0981F, -0.0334F, -0.3914F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(56, 4).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0488F, -1.5686F, -0.1628F, 0.0599F, 0.3883F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(56, 46).addBox(0.9397F, -0.342F, -0.506F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0488F, -1.5686F, -0.1337F, 0.1059F, 0.7356F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 27).addBox(1.5088F, -1.266F, -0.506F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0488F, -1.5686F, -0.0628F, 0.1585F, 1.2613F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(56, 51).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0488F, -3.5686F, -0.1466F, 0.0533F, 0.3893F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(57, 2).addBox(0.9397F, -0.342F, -0.506F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0488F, -3.5686F, -0.1207F, 0.0942F, 0.7369F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(35, 8).addBox(1.5088F, -1.266F, -0.506F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0488F, -3.5686F, -0.0574F, 0.1418F, 1.2621F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(16, 10).addBox(1.5088F, -1.266F, -0.506F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1488F, -11.5686F, 0.0165F, -0.0911F, 1.264F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(11, 57).addBox(0.9397F, -0.342F, -0.506F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1488F, -11.5686F, 0.0599F, -0.0707F, 0.739F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(57, 18).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1488F, -11.5686F, 0.0793F, -0.04F, 0.3908F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(36, 27).addBox(1.5088F, -1.266F, -0.506F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1488F, -9.5686F, 0.0006F, -0.0412F, 1.265F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(57, 30).addBox(0.9397F, -0.342F, -0.506F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1488F, -9.5686F, 0.0212F, -0.0354F, 0.7411F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(57, 34).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1488F, -9.5686F, 0.0309F, -0.02F, 0.3922F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(36, 29).addBox(1.5088F, -1.266F, -0.506F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0488F, -7.5686F, -0.0204F, 0.0254F, 1.2652F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(57, 42).addBox(0.9397F, -0.342F, -0.506F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0488F, -7.5686F, -0.0303F, 0.0118F, 0.7417F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(57, 44).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0488F, -7.5686F, -0.0336F, 0.0067F, 0.3926F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(36, 31).addBox(1.5088F, -1.266F, -0.506F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0488F, -5.5686F, -0.0414F, 0.0919F, 1.264F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(50, 57).addBox(0.9397F, -0.342F, -0.506F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0488F, -5.5686F, -0.0819F, 0.0589F, 0.7399F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(57, 53).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0488F, -5.5686F, -0.0981F, 0.0334F, 0.3914F));

		PartDefinition upperbody = body.addOrReplaceChild("upperbody", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -12.0F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r95 = upperbody.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(20, 34).addBox(0.0F, -3.0F, 1.9F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 36).addBox(0.0F, -3.0F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 36).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.15F, -3.7F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r96 = upperbody.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(0, 44).mirror().addBox(-0.5F, -0.2814F, -0.1886F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 2.2592F, -5.0181F, 1.8894F, -0.1451F, 0.413F));

		PartDefinition cube_r97 = upperbody.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(16, 0).mirror().addBox(0.0F, -1.1585F, -2.1207F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 5.2815F, -2.7958F, 1.5477F, -0.274F, -0.7459F));

		PartDefinition cube_r98 = upperbody.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(20, 34).mirror().addBox(-0.5F, -0.9F, -2.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(20, 34).addBox(6.5F, -0.9F, -2.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-3.5F, 2.8592F, -4.0181F, 2.042F, 0.0F, 0.0F));

		PartDefinition cube_r99 = upperbody.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(43, 25).mirror().addBox(-5.5088F, -1.266F, -0.506F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5488F, -3.3686F, 0.0486F, 0.1909F, -1.2595F));

		PartDefinition cube_r100 = upperbody.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(55, 0).mirror().addBox(-1.9397F, -0.342F, -0.506F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5488F, -3.3686F, 0.138F, 0.1409F, -0.7308F));

		PartDefinition cube_r101 = upperbody.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(54, 49).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.5488F, -3.3686F, 0.1765F, 0.0796F, -0.3849F));

		PartDefinition cube_r102 = upperbody.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(44, 0).mirror().addBox(-5.5088F, -1.266F, -0.506F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2488F, -1.3686F, 0.0271F, 0.1244F, -1.2629F));

		PartDefinition cube_r103 = upperbody.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(55, 40).mirror().addBox(-1.9397F, -0.342F, -0.506F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2488F, -1.3686F, 0.0858F, 0.0942F, -0.7369F));

		PartDefinition cube_r104 = upperbody.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(55, 21).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2488F, -1.3686F, 0.1117F, 0.0533F, -0.3893F));

		PartDefinition cube_r105 = upperbody.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(54, 49).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5488F, -3.3686F, 0.1765F, -0.0796F, 0.3849F));

		PartDefinition cube_r106 = upperbody.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(55, 0).addBox(0.9397F, -0.342F, -0.506F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5488F, -3.3686F, 0.138F, -0.1409F, 0.7308F));

		PartDefinition cube_r107 = upperbody.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(43, 25).addBox(1.5088F, -1.266F, -0.506F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.5488F, -3.3686F, 0.0486F, -0.1909F, 1.2595F));

		PartDefinition cube_r108 = upperbody.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(55, 21).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2488F, -1.3686F, 0.1117F, -0.0533F, 0.3893F));

		PartDefinition cube_r109 = upperbody.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(55, 40).addBox(0.9397F, -0.342F, -0.506F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2488F, -1.3686F, 0.0858F, -0.0942F, 0.7369F));

		PartDefinition cube_r110 = upperbody.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(44, 0).addBox(1.5088F, -1.266F, -0.506F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2488F, -1.3686F, 0.0271F, -0.1244F, 1.2629F));

		PartDefinition cube_r111 = upperbody.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, -0.2814F, -0.1886F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(3.5F, 2.2592F, -5.0181F, 1.8894F, 0.1451F, -0.413F));

		PartDefinition cube_r112 = upperbody.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(16, 0).addBox(-1.0F, -1.1585F, -2.1207F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 5.2815F, -2.7958F, 1.5477F, 0.274F, 0.7459F));

		PartDefinition frontleftarm = upperbody.addOrReplaceChild("frontleftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, 6.15F, -1.95F, -0.5417F, -0.0134F, -0.2521F));

		PartDefinition cube_r113 = frontleftarm.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(13, 15).addBox(0.0F, -0.8F, 0.25F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4762F, -0.1613F, -0.8453F, -0.0873F, 0.0F, 0.0F));

		PartDefinition frontleftarm2 = frontleftarm.addOrReplaceChild("frontleftarm2", CubeListBuilder.create().texOffs(13, 15).addBox(-1.0911F, -0.1026F, 0.0129F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 15).addBox(0.2089F, -0.1026F, 0.0129F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1238F, 0.1887F, 7.3547F, 0.1252F, -0.0438F, 0.256F));

		PartDefinition frontleftarm3 = frontleftarm2.addOrReplaceChild("frontleftarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4089F, 5.5813F, 0.3197F, -1.0893F, 0.2209F, 0.069F));

		PartDefinition cube_r114 = frontleftarm3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(24, 10).addBox(-2.0F, -1.1372F, -4.7481F, 3.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5625F, 0.5128F, 0.741F, 1.444F, -0.0649F, 0.0083F));

		PartDefinition frontleftarm4 = frontleftarm2.addOrReplaceChild("frontleftarm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4089F, 5.5813F, 0.3197F, -1.0389F, -0.3684F, -0.2082F));

		PartDefinition cube_r115 = frontleftarm4.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(27, 0).addBox(0.0F, -1.1372F, -4.7481F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5625F, 0.5128F, 0.741F, 1.444F, -0.0649F, 0.0083F));

		PartDefinition frontrightarm = upperbody.addOrReplaceChild("frontrightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 6.15F, -1.95F, -2.287F, 0.0134F, 0.2521F));

		PartDefinition cube_r116 = frontrightarm.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(13, 15).mirror().addBox(-1.0F, -0.8F, 0.25F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4762F, -0.1613F, -0.8453F, -0.0873F, 0.0F, 0.0F));

		PartDefinition frontrightarm2 = frontrightarm.addOrReplaceChild("frontrightarm2", CubeListBuilder.create().texOffs(13, 15).mirror().addBox(0.0911F, -0.1026F, 0.0129F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(5, 15).mirror().addBox(-1.2089F, -0.1026F, 0.0129F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1238F, 0.1887F, 7.3547F, 0.89F, 0.0878F, 0.0911F));

		PartDefinition frontrightarm3 = frontrightarm2.addOrReplaceChild("frontrightarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4089F, 5.5813F, 0.3197F, 0.2197F, -0.2209F, -0.069F));

		PartDefinition cube_r117 = frontrightarm3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(24, 10).mirror().addBox(-1.0F, -1.1372F, -4.7481F, 3.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.5625F, 0.5128F, 0.741F, 1.444F, 0.0649F, -0.0083F));

		PartDefinition frontrightarm4 = frontrightarm2.addOrReplaceChild("frontrightarm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4089F, 5.5813F, 0.3197F, 0.3137F, 0.3684F, 0.2082F));

		PartDefinition cube_r118 = frontrightarm4.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(27, 0).mirror().addBox(-2.0F, -1.1372F, -4.7481F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.5625F, 0.5128F, 0.741F, 1.444F, 0.0649F, -0.0083F));

		PartDefinition neck = upperbody.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7516F, -3.5943F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r119 = neck.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(0, 7).addBox(0.0F, -2.7625F, 4.0296F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 18).addBox(0.0F, -1.7625F, 2.0296F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 27).addBox(0.0F, -1.2625F, 0.0296F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 28).addBox(-0.5F, -0.8625F, 0.0296F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 2.1984F, -5.7057F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r120 = neck.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(16, 6).mirror().addBox(-3.5088F, -1.266F, -0.506F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8972F, -3.3742F, 0.1428F, 0.4556F, -1.4562F));

		PartDefinition cube_r121 = neck.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(37, 14).mirror().addBox(-1.9397F, -0.342F, -0.506F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8972F, -3.3742F, 0.3562F, 0.3227F, -0.9071F));

		PartDefinition cube_r122 = neck.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(5, 23).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.8972F, -3.3742F, 0.4392F, 0.1806F, -0.5775F));

		PartDefinition cube_r123 = neck.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(53, 19).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2972F, -1.4742F, 0.2905F, 0.1249F, -0.4955F));

		PartDefinition cube_r124 = neck.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(54, 25).mirror().addBox(-1.9397F, -0.342F, -0.506F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2972F, -1.4742F, 0.2312F, 0.2218F, -0.8361F));

		PartDefinition cube_r125 = neck.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(37, 12).mirror().addBox(-4.5088F, -1.266F, -0.506F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2972F, -1.4742F, 0.0878F, 0.307F, -1.372F));

		PartDefinition cube_r126 = neck.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(5, 23).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8972F, -3.3742F, 0.4392F, -0.1806F, 0.5775F));

		PartDefinition cube_r127 = neck.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(37, 14).addBox(0.9397F, -0.342F, -0.506F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8972F, -3.3742F, 0.3562F, -0.3227F, 0.9071F));

		PartDefinition cube_r128 = neck.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(16, 6).addBox(1.5088F, -1.266F, -0.506F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.8972F, -3.3742F, 0.1428F, -0.4556F, 1.4562F));

		PartDefinition cube_r129 = neck.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(53, 19).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2972F, -1.4742F, 0.2905F, -0.1249F, 0.4955F));

		PartDefinition cube_r130 = neck.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(54, 25).addBox(0.9397F, -0.342F, -0.506F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2972F, -1.4742F, 0.2312F, -0.2218F, 0.8361F));

		PartDefinition cube_r131 = neck.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(37, 12).addBox(1.5088F, -1.266F, -0.506F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2972F, -1.4742F, 0.0878F, -0.307F, 1.372F));

		PartDefinition neck3 = neck.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.389F, -4.0227F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6594F, -5.6024F, -0.1374F, -0.4293F, -0.1922F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0728F, -3.7982F, -0.3242F, -0.3861F, 0.0736F));

		PartDefinition cube_r132 = neck4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(43, 12).addBox(-0.5F, -0.0574F, 0.0298F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.24F, -2.7678F, -0.2967F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create().texOffs(44, 33).addBox(-1.0F, -0.5584F, -2.5206F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, -0.8536F, -2.5588F, 0.1632F, -0.1281F, -0.0268F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(11, 54).mirror().addBox(-0.6F, -1.0209F, -0.8158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(11, 54).addBox(0.6F, -1.0209F, -0.8158F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(50, 2).addBox(-0.5F, -1.0209F, -1.0158F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.5F, -1.0465F, 0.3107F, 0.8901F, 0.0F, 0.0F));

		PartDefinition cube_r134 = head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-0.42F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 0).addBox(1.22F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9F, -0.3314F, -0.8411F, 2.81F, 0.0F, 0.0F));

		PartDefinition cube_r135 = head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(54, 9).mirror().addBox(-0.2F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)).mirror(false)
				.texOffs(54, 9).addBox(0.6F, -0.4F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-0.7F, -0.5624F, -1.6761F, 1.693F, 0.0F, 0.0F));

		PartDefinition cube_r136 = head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(49, 53).mirror().addBox(-0.62F, 1.2826F, -0.3044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(49, 53).addBox(1.02F, 1.2826F, -0.3044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7F, 0.7654F, -4.401F, 1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r137 = head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(7, 7).mirror().addBox(-0.5F, -0.9751F, -0.5633F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3303F, -3.844F, 1.853F, -0.1662F, -0.1298F));

		PartDefinition cube_r138 = head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(8, 0).mirror().addBox(-0.5F, -1.0124F, -0.4331F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 0.3303F, -3.844F, 2.045F, -0.1662F, -0.1298F));

		PartDefinition cube_r139 = head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(49, 45).mirror().addBox(-0.0525F, -0.4622F, -0.102F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.2535F, -3.8893F, 0.124F, -0.2438F, -0.0088F));

		PartDefinition cube_r140 = head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(49, 49).mirror().addBox(-0.5F, -0.7716F, -0.2474F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1754F, -4.9525F, 0.3795F, -0.1461F, -0.058F));

		PartDefinition cube_r141 = head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(49, 45).addBox(-0.9475F, -0.4622F, -0.102F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.6F, 0.2535F, -3.8893F, 0.124F, 0.2438F, 0.0088F));

		PartDefinition cube_r142 = head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(49, 49).addBox(-0.5F, -0.7716F, -0.2474F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 1.1754F, -4.9525F, 0.3795F, 0.1461F, 0.058F));

		PartDefinition cube_r143 = head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(28, 42).addBox(-0.5F, -0.6F, -1.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.1754F, -3.7525F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r144 = head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(12, 27).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2921F, -1.0423F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r145 = head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(7, 7).addBox(-0.5F, -0.9751F, -0.5633F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(0.4F, 0.3303F, -3.844F, 1.853F, 0.1662F, 0.1298F));

		PartDefinition cube_r146 = head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(8, 0).addBox(-0.5F, -1.0124F, -0.4331F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.4F, 0.3303F, -3.844F, 2.045F, 0.1662F, 0.1298F));

		PartDefinition cube_r147 = head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(51, 27).addBox(-1.5F, -2.0217F, -0.9611F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.6465F, -1.4893F, 2.1118F, 0.0F, 0.0F));

		PartDefinition cube_r148 = head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(44, 17).addBox(-1.5F, -1.0216F, -1.9786F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, -1.6465F, -0.4893F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r149 = head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(51, 31).addBox(-1.0F, -1.2F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.0465F, -0.3893F, -0.3491F, 0.0F, 0.0F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1535F, -0.4893F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r150 = lowerjaw.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(24, 18).mirror().addBox(-0.2F, -0.2847F, -2.7324F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.4F, -1.0F, 0.2443F, -0.192F, 0.0F));

		PartDefinition cube_r151 = lowerjaw.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(38, 0).mirror().addBox(-0.2F, -0.1086F, -2.2788F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.9F, -0.4F, -1.0F, 0.2094F, -0.192F, 0.0F));

		PartDefinition cube_r152 = lowerjaw.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(20, 53).mirror().addBox(-1.5F, -0.8011F, -1.2239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(31, 53).mirror().addBox(-1.5F, -0.8011F, -0.8239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false)
				.texOffs(20, 53).addBox(-0.1F, -0.8011F, -1.2239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(31, 53).addBox(-0.1F, -0.8011F, -0.8239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.3F, 0.3F, -0.05F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r153 = lowerjaw.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(24, 18).addBox(-0.8F, -0.2847F, -2.7324F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9F, -0.4F, -1.0F, 0.2443F, 0.192F, 0.0F));

		PartDefinition cube_r154 = lowerjaw.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(38, 0).addBox(-0.8F, -0.1086F, -2.2788F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.9F, -0.4F, -1.0F, 0.2094F, 0.192F, 0.0F));

		PartDefinition cube_r155 = lowerjaw.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(9, 36).addBox(-0.5F, 0.2F, -2.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.0F, 0.1047F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}