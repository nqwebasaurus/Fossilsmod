package fossils.fossils.client.blockentity.model.pliosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class PliosaurusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Pliosaurus;
	private final ModelPart Chest;
	private final ModelPart Shoulder;
	private final ModelPart Neck3;
	private final ModelPart Neck2;
	private final ModelPart Neck1;
	private final ModelPart Head;
	private final ModelPart Jaw;
	private final ModelPart FrontFlipperL;
	private final ModelPart FrontFlipperMiddleL;
	private final ModelPart FrontFlipperEndL;
	private final ModelPart FrontFlipperL2;
	private final ModelPart FrontFlipperMiddleL2;
	private final ModelPart FrontFlipperEndL2;
	private final ModelPart BackFlipperL;
	private final ModelPart BackFlipperMiddleL;
	private final ModelPart BackFlipperEndL;
	private final ModelPart BackFlipperL2;
	private final ModelPart BackFlipperMiddleL2;
	private final ModelPart BackFlipperEndL2;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;

	public PliosaurusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Pliosaurus = this.fossil.getChild("Pliosaurus");
		this.Chest = this.Pliosaurus.getChild("Chest");
		this.Shoulder = this.Chest.getChild("Shoulder");
		this.Neck3 = this.Shoulder.getChild("Neck3");
		this.Neck2 = this.Neck3.getChild("Neck2");
		this.Neck1 = this.Neck2.getChild("Neck1");
		this.Head = this.Neck1.getChild("Head");
		this.Jaw = this.Head.getChild("Jaw");
		this.FrontFlipperL = this.Shoulder.getChild("FrontFlipperL");
		this.FrontFlipperMiddleL = this.FrontFlipperL.getChild("FrontFlipperMiddleL");
		this.FrontFlipperEndL = this.FrontFlipperMiddleL.getChild("FrontFlipperEndL");
		this.FrontFlipperL2 = this.Shoulder.getChild("FrontFlipperL2");
		this.FrontFlipperMiddleL2 = this.FrontFlipperL2.getChild("FrontFlipperMiddleL2");
		this.FrontFlipperEndL2 = this.FrontFlipperMiddleL2.getChild("FrontFlipperEndL2");
		this.BackFlipperL = this.Pliosaurus.getChild("BackFlipperL");
		this.BackFlipperMiddleL = this.BackFlipperL.getChild("BackFlipperMiddleL");
		this.BackFlipperEndL = this.BackFlipperMiddleL.getChild("BackFlipperEndL");
		this.BackFlipperL2 = this.Pliosaurus.getChild("BackFlipperL2");
		this.BackFlipperMiddleL2 = this.BackFlipperL2.getChild("BackFlipperMiddleL2");
		this.BackFlipperEndL2 = this.BackFlipperMiddleL2.getChild("BackFlipperEndL2");
		this.Tail1 = this.Pliosaurus.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Pliosaurus = fossil.addOrReplaceChild("Pliosaurus", CubeListBuilder.create(), PartPose.offset(0.5F, -28.25F, 25.0F));

		PartDefinition basin_r1 = Pliosaurus.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(71, 0).addBox(0.0F, -3.4918F, 7.8432F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(49, 145).addBox(0.0F, -3.4918F, 4.8432F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(129, 145).addBox(0.0F, -3.4918F, 1.8432F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(134, 145).addBox(0.0F, -3.4918F, -1.1568F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.8024F, -3.1052F, -0.1571F, 0.0F, 0.0F));

		PartDefinition basin_r2 = Pliosaurus.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(54, 146).addBox(-0.5F, -3.8133F, -0.1527F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -7.1F, -0.1396F, 0.0F, 0.0F));

		PartDefinition basin_r3 = Pliosaurus.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(23, 114).mirror().addBox(0.4F, -1.5555F, 0.2717F, 2.0F, 3.0F, 8.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-11.6F, 6.5471F, 0.0621F, 1.2298F, 0.1807F, 0.2796F));

		PartDefinition basin_r4 = Pliosaurus.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(86, 32).mirror().addBox(-0.1F, 3.0886F, -0.4614F, 10.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-11.5F, 5.4032F, -12.9741F, 0.2168F, 0.3844F, 0.0824F));

		PartDefinition basin_r5 = Pliosaurus.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(135, 30).mirror().addBox(-3.1F, -0.9121F, -0.0377F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 5.6032F, 10.5259F, 0.426F, -0.6954F, -0.283F));

		PartDefinition basin_r6 = Pliosaurus.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(32, 55).mirror().addBox(-9.1F, -0.5F, -8.1F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 38).mirror().addBox(-4.1F, -0.5F, -8.1F, 4.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 55).addBox(4.1F, -0.5F, -8.1F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(37, 38).addBox(0.1F, -0.5F, -8.1F, 4.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.4032F, 4.4259F, 0.2007F, 0.0F, 0.0F));

		PartDefinition basin_r7 = Pliosaurus.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(118, 85).mirror().addBox(-0.2F, 0.3972F, -4.6903F, 7.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-9.4F, 5.4032F, -0.0741F, 0.2802F, -0.7655F, -0.1968F));

		PartDefinition basin_r8 = Pliosaurus.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(0, 53).mirror().addBox(-11.1F, -0.5F, -18.1F, 11.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 53).addBox(0.1F, -0.5F, -18.1F, 11.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.4032F, 5.0259F, 0.2007F, 0.0F, 0.0F));

		PartDefinition basin_r9 = Pliosaurus.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(118, 85).addBox(-6.8F, 0.3972F, -4.6903F, 7.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(8.4F, 5.4032F, -0.0741F, 0.2802F, 0.7655F, 0.1968F));

		PartDefinition basin_r10 = Pliosaurus.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(86, 32).addBox(-9.9F, 3.0886F, -0.4614F, 10.0F, 2.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(10.5F, 5.4032F, -12.9741F, 0.2168F, -0.3844F, -0.0824F));

		PartDefinition basin_r11 = Pliosaurus.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(135, 30).addBox(0.1F, -0.9121F, -0.0377F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 5.6032F, 10.5259F, 0.426F, 0.6954F, 0.283F));

		PartDefinition basin_r12 = Pliosaurus.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(23, 114).addBox(-2.4F, -1.5555F, 0.2717F, 2.0F, 3.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(10.6F, 6.5471F, 0.0621F, 1.2298F, -0.1807F, -0.2796F));

		PartDefinition basin_r13 = Pliosaurus.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(0, 34).addBox(-2.0F, -0.1133F, -0.1527F, 3.0F, 3.0F, 15.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.1F, -7.1F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Pliosaurus.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(140, 101).mirror().addBox(-6.9559F, -0.9886F, -0.2092F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.0877F, -6.6049F, -0.1536F, 0.0669F, -0.492F));

		PartDefinition cube_r2 = Pliosaurus.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(140, 97).mirror().addBox(-6.9559F, -0.9886F, -0.2092F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.7876F, -3.6049F, -0.1536F, 0.0669F, -0.492F));

		PartDefinition cube_r3 = Pliosaurus.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 73).mirror().addBox(-5.9559F, -0.9886F, -0.2092F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.4876F, -0.6049F, -0.1536F, 0.0669F, -0.492F));

		PartDefinition cube_r4 = Pliosaurus.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 59).mirror().addBox(-4.9559F, -0.9886F, -0.2092F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.5877F, 2.3951F, -0.1536F, 0.0669F, -0.492F));

		PartDefinition cube_r5 = Pliosaurus.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(102, 78).mirror().addBox(-3.9559F, -0.9886F, -0.2092F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.4876F, 5.3951F, -0.1536F, 0.0669F, -0.492F));

		PartDefinition cube_r6 = Pliosaurus.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(144, 23).mirror().addBox(-3.1158F, 0.082F, -0.2092F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.4876F, 5.3951F, -0.1217F, 0.1153F, -0.1448F));

		PartDefinition cube_r7 = Pliosaurus.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(143, 104).mirror().addBox(-3.1158F, 0.082F, -0.2092F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.5877F, 2.3951F, -0.1217F, 0.1153F, -0.1448F));

		PartDefinition cube_r8 = Pliosaurus.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(120, 143).mirror().addBox(-3.1158F, 0.082F, -0.2092F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.4876F, -0.6049F, -0.1217F, 0.1153F, -0.1448F));

		PartDefinition cube_r9 = Pliosaurus.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(143, 122).mirror().addBox(-3.1158F, 0.082F, -0.2092F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.7876F, -3.6049F, -0.1217F, 0.1153F, -0.1448F));

		PartDefinition cube_r10 = Pliosaurus.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(143, 130).mirror().addBox(-3.1158F, 0.082F, -0.2092F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.0877F, -6.6049F, -0.1217F, 0.1153F, -0.1448F));

		PartDefinition cube_r11 = Pliosaurus.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(102, 78).addBox(2.9559F, -0.9886F, -0.2092F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4876F, 5.3951F, -0.1536F, -0.0669F, 0.492F));

		PartDefinition cube_r12 = Pliosaurus.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(144, 23).addBox(0.1158F, 0.082F, -0.2092F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4876F, 5.3951F, -0.1217F, -0.1153F, 0.1448F));

		PartDefinition cube_r13 = Pliosaurus.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 59).addBox(2.9559F, -0.9886F, -0.2092F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5877F, 2.3951F, -0.1536F, -0.0669F, 0.492F));

		PartDefinition cube_r14 = Pliosaurus.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(143, 104).addBox(0.1158F, 0.082F, -0.2092F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5877F, 2.3951F, -0.1217F, -0.1153F, 0.1448F));

		PartDefinition cube_r15 = Pliosaurus.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 73).addBox(2.9559F, -0.9886F, -0.2092F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4876F, -0.6049F, -0.1536F, -0.0669F, 0.492F));

		PartDefinition cube_r16 = Pliosaurus.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(120, 143).addBox(0.1158F, 0.082F, -0.2092F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4876F, -0.6049F, -0.1217F, -0.1153F, 0.1448F));

		PartDefinition cube_r17 = Pliosaurus.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(140, 97).addBox(2.9559F, -0.9886F, -0.2092F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.7876F, -3.6049F, -0.1536F, -0.0669F, 0.492F));

		PartDefinition cube_r18 = Pliosaurus.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(143, 122).addBox(0.1158F, 0.082F, -0.2092F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.7876F, -3.6049F, -0.1217F, -0.1153F, 0.1448F));

		PartDefinition cube_r19 = Pliosaurus.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(140, 101).addBox(2.9559F, -0.9886F, -0.2092F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0877F, -6.6049F, -0.1536F, -0.0669F, 0.492F));

		PartDefinition cube_r20 = Pliosaurus.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(143, 130).addBox(0.1158F, 0.082F, -0.2092F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.0877F, -6.6049F, -0.1217F, -0.1153F, 0.1448F));

		PartDefinition Chest = Pliosaurus.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.7F, -7.4F, -0.0616F, -0.1307F, 0.008F));

		PartDefinition cube_r21 = Chest.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(46, 79).addBox(-2.0F, -0.0942F, -0.0546F, 3.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3831F, -10.8622F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r22 = Chest.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(74, 111).addBox(0.0F, -4.3829F, 8.261F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(74, 98).addBox(0.0F, -4.3829F, 5.261F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 103).addBox(0.0F, -4.4829F, 2.261F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(50, 104).addBox(0.0F, -4.4829F, -0.7389F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3531F, -11.1767F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r23 = Chest.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(9, 145).addBox(0.0F, -4.4829F, -0.7389F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.0607F, -14.1641F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r24 = Chest.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 114).addBox(-0.5F, 0.9851F, 7.7437F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(96, 143).addBox(-0.5F, 1.0851F, 4.7437F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(61, 144).addBox(-0.5F, 1.1851F, 1.7437F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 14).addBox(-2.0F, 5.4851F, -1.2563F, 3.0F, 3.0F, 16.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -3.9831F, -26.2622F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r25 = Chest.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(14, 145).addBox(0.0F, -4.1855F, -0.7781F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.503F, -26.0222F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r26 = Chest.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(117, 36).mirror().addBox(-16.7465F, -3.8118F, -1.0F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.0377F, -25.199F, 0.0205F, 0.2383F, -0.9006F));

		PartDefinition cube_r27 = Chest.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(139, 114).mirror().addBox(-6.8191F, -1.0261F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.0377F, -25.199F, 0.1206F, 0.207F, -0.4542F));

		PartDefinition cube_r28 = Chest.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(23, 14).mirror().addBox(-16.7707F, -3.8261F, -0.802F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.6239F, -22.4297F, 0.0094F, 0.2246F, -0.9032F));

		PartDefinition cube_r29 = Chest.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(86, 40).mirror().addBox(-6.847F, -1.0288F, -0.802F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.6239F, -22.4297F, 0.1046F, 0.1993F, -0.4574F));

		PartDefinition cube_r30 = Chest.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(101, 20).mirror().addBox(-16.8605F, -3.7731F, -0.7064F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.1952F, -19.5616F, -0.0127F, 0.1971F, -0.9078F));

		PartDefinition cube_r31 = Chest.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(138, 71).mirror().addBox(-6.906F, -0.9429F, -0.7064F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.1952F, -19.5616F, 0.0728F, 0.1838F, -0.4635F));

		PartDefinition cube_r32 = Chest.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(60, 48).mirror().addBox(-15.8605F, -3.7731F, -0.7064F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.7518F, -16.5945F, -0.0236F, 0.1834F, -0.9099F));

		PartDefinition cube_r33 = Chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(43, 138).mirror().addBox(-6.906F, -0.9429F, -0.7064F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.7518F, -16.5945F, 0.0569F, 0.176F, -0.4664F));

		PartDefinition cube_r34 = Chest.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(41, 141).mirror().addBox(-6.8596F, -1.0315F, -0.7081F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.6051F, -13.5831F, 0.0411F, 0.1681F, -0.4691F));

		PartDefinition cube_r35 = Chest.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(127, 27).mirror().addBox(-14.781F, -3.8338F, -0.7081F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.6051F, -13.5831F, -0.0345F, 0.1696F, -0.9118F));

		PartDefinition cube_r36 = Chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(127, 78).mirror().addBox(-13.8017F, -3.8837F, -0.3118F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.4186F, -10.9821F, -0.0561F, 0.1419F, -0.9151F));

		PartDefinition cube_r37 = Chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(54, 140).mirror().addBox(-6.8994F, -1.0679F, -0.3118F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.4186F, -10.9821F, 0.0096F, 0.1522F, -0.4741F));

		PartDefinition cube_r38 = Chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(82, 64).mirror().addBox(-11.71F, -3.8708F, -0.8132F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.2127F, -7.5751F, -0.0453F, 0.1558F, -0.9135F));

		PartDefinition cube_r39 = Chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(65, 141).mirror().addBox(-6.8109F, -1.095F, -0.8132F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.2127F, -7.5751F, 0.0254F, 0.1602F, -0.4716F));

		PartDefinition cube_r40 = Chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(87, 142).mirror().addBox(-8.8844F, -3.8044F, -0.4068F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8284F, -5.0037F, -0.0668F, 0.1281F, -0.9166F));

		PartDefinition cube_r41 = Chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(120, 140).mirror().addBox(-6.9409F, -0.9611F, -0.4068F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8284F, -5.0037F, -0.0061F, 0.1443F, -0.4764F));

		PartDefinition cube_r42 = Chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(44, 26).mirror().addBox(-7.9559F, -0.9886F, -0.2092F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6123F, -2.2049F, -0.0373F, 0.1282F, -0.4806F));

		PartDefinition cube_r43 = Chest.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(143, 135).mirror().addBox(-3.1158F, 0.082F, -0.2092F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6123F, -2.2049F, 0.009F, 0.1332F, -0.1286F));

		PartDefinition cube_r44 = Chest.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(143, 46).mirror().addBox(-3.0923F, 0.1027F, -0.4068F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8284F, -5.0037F, 0.044F, 0.1376F, -0.1239F));

		PartDefinition cube_r45 = Chest.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(52, 143).mirror().addBox(-3.0159F, -0.0676F, -0.8132F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.2127F, -7.5751F, 0.0789F, 0.1418F, -0.119F));

		PartDefinition cube_r46 = Chest.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(131, 142).mirror().addBox(-3.0898F, -0.0119F, -0.3118F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.4186F, -10.9821F, 0.0614F, 0.1397F, -0.1214F));

		PartDefinition cube_r47 = Chest.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(143, 38).mirror().addBox(-3.0399F, 0.0088F, -0.7081F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.6051F, -13.5831F, 0.0965F, 0.1438F, -0.1165F));

		PartDefinition cube_r48 = Chest.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(31, 142).mirror().addBox(-3.0532F, 0.1079F, -0.7064F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.7518F, -16.5945F, 0.114F, 0.1459F, -0.114F));

		PartDefinition cube_r49 = Chest.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(142, 35).mirror().addBox(-3.0532F, 0.1079F, -0.7064F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.1952F, -19.5616F, 0.1315F, 0.1478F, -0.1114F));

		PartDefinition cube_r50 = Chest.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(26, 72).mirror().addBox(-3.0272F, 0.007F, -0.802F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.6239F, -22.4297F, 0.1666F, 0.1516F, -0.1062F));

		PartDefinition cube_r51 = Chest.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(111, 142).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 3.0377F, -25.199F, 0.1842F, 0.1534F, -0.1035F));

		PartDefinition cube_r52 = Chest.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(44, 26).addBox(2.9559F, -0.9886F, -0.2092F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6123F, -2.2049F, -0.0373F, -0.1282F, 0.4806F));

		PartDefinition cube_r53 = Chest.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(143, 135).addBox(0.1158F, 0.082F, -0.2092F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6123F, -2.2049F, 0.009F, -0.1332F, 0.1286F));

		PartDefinition cube_r54 = Chest.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(143, 46).addBox(0.0923F, 0.1027F, -0.4068F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8284F, -5.0037F, 0.044F, -0.1376F, 0.1239F));

		PartDefinition cube_r55 = Chest.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(120, 140).addBox(2.9409F, -0.9611F, -0.4068F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8284F, -5.0037F, -0.0061F, -0.1443F, 0.4764F));

		PartDefinition cube_r56 = Chest.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(87, 142).addBox(5.8844F, -3.8044F, -0.4068F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8284F, -5.0037F, -0.0668F, -0.1281F, 0.9166F));

		PartDefinition cube_r57 = Chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(82, 64).addBox(5.71F, -3.8708F, -0.8132F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2127F, -7.5751F, -0.0453F, -0.1558F, 0.9135F));

		PartDefinition cube_r58 = Chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(65, 141).addBox(2.8109F, -1.095F, -0.8132F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2127F, -7.5751F, 0.0254F, -0.1602F, 0.4716F));

		PartDefinition cube_r59 = Chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(52, 143).addBox(0.0159F, -0.0676F, -0.8132F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2127F, -7.5751F, 0.0789F, -0.1418F, 0.119F));

		PartDefinition cube_r60 = Chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(127, 78).addBox(5.8017F, -3.8837F, -0.3118F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4186F, -10.9821F, -0.0561F, -0.1419F, 0.9151F));

		PartDefinition cube_r61 = Chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(54, 140).addBox(2.8994F, -1.0679F, -0.3118F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4186F, -10.9821F, 0.0096F, -0.1522F, 0.4741F));

		PartDefinition cube_r62 = Chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(131, 142).addBox(0.0898F, -0.0119F, -0.3118F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.4186F, -10.9821F, 0.0614F, -0.1397F, 0.1214F));

		PartDefinition cube_r63 = Chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(143, 38).addBox(0.0399F, 0.0088F, -0.7081F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6051F, -13.5831F, 0.0965F, -0.1438F, 0.1165F));

		PartDefinition cube_r64 = Chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(41, 141).addBox(2.8596F, -1.0315F, -0.7081F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6051F, -13.5831F, 0.0411F, -0.1681F, 0.4691F));

		PartDefinition cube_r65 = Chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(127, 27).addBox(5.781F, -3.8338F, -0.7081F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.6051F, -13.5831F, -0.0345F, -0.1696F, 0.9118F));

		PartDefinition cube_r66 = Chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(60, 48).addBox(5.8605F, -3.7731F, -0.7064F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.7518F, -16.5945F, -0.0236F, -0.1834F, 0.9099F));

		PartDefinition cube_r67 = Chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(31, 142).addBox(0.0532F, 0.1079F, -0.7064F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.7518F, -16.5945F, 0.114F, -0.1459F, 0.114F));

		PartDefinition cube_r68 = Chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(43, 138).addBox(2.906F, -0.9429F, -0.7064F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.7518F, -16.5945F, 0.0569F, -0.176F, 0.4664F));

		PartDefinition cube_r69 = Chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(101, 20).addBox(5.8605F, -3.7731F, -0.7064F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.1952F, -19.5616F, -0.0127F, -0.1971F, 0.9078F));

		PartDefinition cube_r70 = Chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(142, 35).addBox(0.0532F, 0.1079F, -0.7064F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.1952F, -19.5616F, 0.1315F, -0.1478F, 0.1114F));

		PartDefinition cube_r71 = Chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(138, 71).addBox(2.906F, -0.9429F, -0.7064F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.1952F, -19.5616F, 0.0728F, -0.1838F, 0.4635F));

		PartDefinition cube_r72 = Chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(86, 40).addBox(2.847F, -1.0288F, -0.802F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.6239F, -22.4297F, 0.1046F, -0.1993F, 0.4574F));

		PartDefinition cube_r73 = Chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(26, 72).addBox(0.0272F, 0.007F, -0.802F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.6239F, -22.4297F, 0.1666F, -0.1516F, 0.1062F));

		PartDefinition cube_r74 = Chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(23, 14).addBox(5.7707F, -3.8261F, -0.802F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.6239F, -22.4297F, 0.0094F, -0.2246F, 0.9032F));

		PartDefinition cube_r75 = Chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(117, 36).addBox(5.7466F, -3.8118F, -1.0F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0377F, -25.199F, 0.0205F, -0.2383F, 0.9006F));

		PartDefinition cube_r76 = Chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(139, 114).addBox(2.8191F, -1.0261F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0377F, -25.199F, 0.1206F, -0.207F, 0.4542F));

		PartDefinition cube_r77 = Chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(111, 142).addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 3.0377F, -25.199F, 0.1842F, -0.1534F, 0.1035F));

		PartDefinition cube_r78 = Chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 0).addBox(-11.5F, -1.2007F, -5.5209F, 23.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 13.243F, -11.9384F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Shoulder = Chest.addOrReplaceChild("Shoulder", CubeListBuilder.create().texOffs(24, 67).addBox(-2.0F, -1.1004F, -12.6405F, 3.0F, 3.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(124, 146).addBox(-0.5F, -5.1004F, -11.6405F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(57, 0).addBox(-0.5F, -5.1004F, -8.6405F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(119, 146).addBox(-0.5F, -5.1004F, -5.6405F, 0.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(66, 144).addBox(-0.5F, -5.2004F, -2.6405F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.7169F, -26.4622F, 0.2452F, -0.0847F, -0.0212F));

		PartDefinition cube_r79 = Shoulder.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(64, 25).mirror().addBox(-12.7465F, -3.8118F, -1.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8996F, -10.6405F, 0.0038F, 0.2177F, -0.9044F));

		PartDefinition cube_r80 = Shoulder.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(119, 137).mirror().addBox(-6.8191F, -1.0261F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8996F, -10.6405F, 0.0967F, 0.1954F, -0.459F));

		PartDefinition cube_r81 = Shoulder.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(126, 0).mirror().addBox(-14.7465F, -3.8118F, -1.0F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6996F, -7.6405F, 0.0038F, 0.2177F, -0.9044F));

		PartDefinition cube_r82 = Shoulder.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(37, 48).mirror().addBox(-6.8191F, -1.0261F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6996F, -7.6405F, 0.0967F, 0.1954F, -0.459F));

		PartDefinition cube_r83 = Shoulder.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(123, 15).mirror().addBox(-15.7465F, -3.8118F, -1.0F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.5997F, -4.6405F, -0.0236F, 0.1834F, -0.9099F));

		PartDefinition cube_r84 = Shoulder.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(135, 8).mirror().addBox(-6.8191F, -1.0261F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.5997F, -4.6405F, 0.0569F, 0.176F, -0.4664F));

		PartDefinition cube_r85 = Shoulder.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(123, 12).mirror().addBox(-15.7465F, -3.8118F, -1.0F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.5997F, -1.6405F, -0.0775F, 0.1142F, -0.9179F));

		PartDefinition cube_r86 = Shoulder.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(43, 126).mirror().addBox(-6.8191F, -1.0261F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.5997F, -1.6405F, -0.0217F, 0.1362F, -0.4786F));

		PartDefinition cube_r87 = Shoulder.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(141, 140).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.5997F, -1.6405F, 0.0265F, 0.1354F, -0.1262F));

		PartDefinition cube_r88 = Shoulder.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(9, 142).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.5997F, -4.6405F, 0.114F, 0.1459F, -0.114F));

		PartDefinition cube_r89 = Shoulder.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(67, 10).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6996F, -7.6405F, 0.1578F, 0.1507F, -0.1075F));

		PartDefinition cube_r90 = Shoulder.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(20, 142).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8996F, -10.6405F, 0.1578F, 0.1507F, -0.1075F));

		PartDefinition cube_r91 = Shoulder.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(141, 140).addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5997F, -1.6405F, 0.0265F, -0.1354F, 0.1262F));

		PartDefinition cube_r92 = Shoulder.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(43, 126).addBox(2.8191F, -1.0261F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5997F, -1.6405F, -0.0217F, -0.1362F, 0.4786F));

		PartDefinition cube_r93 = Shoulder.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(123, 12).addBox(5.7466F, -3.8118F, -1.0F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5997F, -1.6405F, -0.0775F, -0.1142F, 0.9179F));

		PartDefinition cube_r94 = Shoulder.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(9, 142).addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5997F, -4.6405F, 0.114F, -0.1459F, 0.114F));

		PartDefinition cube_r95 = Shoulder.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(135, 8).addBox(2.8191F, -1.0261F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5997F, -4.6405F, 0.0569F, -0.176F, 0.4664F));

		PartDefinition cube_r96 = Shoulder.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(123, 15).addBox(5.7466F, -3.8118F, -1.0F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.5997F, -4.6405F, -0.0236F, -0.1834F, 0.9099F));

		PartDefinition cube_r97 = Shoulder.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(126, 0).addBox(5.7466F, -3.8118F, -1.0F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6996F, -7.6405F, 0.0038F, -0.2177F, 0.9044F));

		PartDefinition cube_r98 = Shoulder.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(67, 10).addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6996F, -7.6405F, 0.1578F, -0.1507F, 0.1075F));

		PartDefinition cube_r99 = Shoulder.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(37, 48).addBox(2.8191F, -1.0261F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6996F, -7.6405F, 0.0967F, -0.1954F, 0.459F));

		PartDefinition cube_r100 = Shoulder.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(64, 25).addBox(5.7466F, -3.8118F, -1.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8996F, -10.6405F, 0.0038F, -0.2177F, 0.9044F));

		PartDefinition cube_r101 = Shoulder.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(119, 137).addBox(2.8191F, -1.0261F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8996F, -10.6405F, 0.0967F, -0.1954F, 0.459F));

		PartDefinition cube_r102 = Shoulder.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(20, 142).addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8996F, -10.6405F, 0.1578F, -0.1507F, 0.1075F));

		PartDefinition cube_r103 = Shoulder.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(131, 92).mirror().addBox(-1.9307F, -1.0768F, -1.3326F, 7.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-7.5986F, 8.8339F, -12.8977F, -0.5991F, 0.4536F, -0.1956F));

		PartDefinition cube_r104 = Shoulder.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(126, 3).mirror().addBox(-0.8307F, -1.0768F, -2.8326F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.5986F, 8.8339F, -12.8977F, -0.5431F, 0.196F, -0.0219F));

		PartDefinition cube_r105 = Shoulder.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(-1.976F, -2.3185F, -0.3717F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.5986F, 8.8339F, -12.8977F, 0.7139F, -0.5256F, -0.41F));

		PartDefinition cube_r106 = Shoulder.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(128, 132).mirror().addBox(-4.2446F, -1.0768F, -1.9443F, 6.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-7.5986F, 8.8339F, -12.8977F, -0.7215F, 0.696F, -0.4184F));

		PartDefinition cube_r107 = Shoulder.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(44, 67).mirror().addBox(-4.69F, -1.0F, 0.653F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(44, 67).addBox(4.51F, -1.0F, 0.653F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.91F, 11.8996F, -5.6935F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r108 = Shoulder.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(128, 39).mirror().addBox(-6.0211F, -1.0F, 6.5157F, 5.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-4.91F, 11.8996F, -5.6935F, -0.2009F, 0.5148F, -0.0999F));

		PartDefinition cube_r109 = Shoulder.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(118, 56).mirror().addBox(-5.1525F, -1.2246F, -3.688F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.91F, 12.2306F, -5.11F, -0.3522F, -0.1312F, 0.048F));

		PartDefinition cube_r110 = Shoulder.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(-5.0645F, -1.0F, 0.9379F, 7.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.91F, 11.8996F, -5.6935F, -0.1762F, -0.1375F, 0.0244F));

		PartDefinition cube_r111 = Shoulder.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(68, 123).mirror().addBox(1.31F, -1.2246F, -7.9791F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(0, 95).mirror().addBox(-4.69F, -1.2246F, -4.9791F, 9.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false)
				.texOffs(68, 123).addBox(4.51F, -1.2246F, -7.9791F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 95).addBox(4.51F, -1.2246F, -4.9791F, 9.0F, 2.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-4.91F, 12.2306F, -5.11F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r112 = Shoulder.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 23).mirror().addBox(-2.64F, -1.2246F, -7.7721F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.91F, 12.2306F, -5.11F, -0.391F, -0.4569F, 0.1799F));

		PartDefinition cube_r113 = Shoulder.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 34).addBox(-0.024F, -2.3185F, -0.3717F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5986F, 8.8339F, -12.8977F, 0.7139F, 0.5256F, 0.41F));

		PartDefinition cube_r114 = Shoulder.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 23).addBox(-0.36F, -1.2246F, -7.7721F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.91F, 12.2306F, -5.11F, -0.391F, 0.4569F, -0.1799F));

		PartDefinition cube_r115 = Shoulder.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(128, 132).addBox(-1.7554F, -1.0768F, -1.9443F, 6.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(6.5986F, 8.8339F, -12.8977F, -0.7215F, -0.696F, 0.4184F));

		PartDefinition cube_r116 = Shoulder.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(131, 92).addBox(-5.0693F, -1.0768F, -1.3326F, 7.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(6.5986F, 8.8339F, -12.8977F, -0.5991F, -0.4536F, 0.1956F));

		PartDefinition cube_r117 = Shoulder.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(126, 3).addBox(-7.1693F, -1.0768F, -2.8326F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5986F, 8.8339F, -12.8977F, -0.5431F, -0.196F, 0.0219F));

		PartDefinition cube_r118 = Shoulder.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(128, 39).addBox(1.0211F, -1.0F, 6.5157F, 5.0F, 2.0F, 4.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(3.91F, 11.8996F, -5.6935F, -0.2009F, -0.5148F, 0.0999F));

		PartDefinition cube_r119 = Shoulder.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(118, 56).addBox(-1.8475F, -1.2246F, -3.688F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.91F, 12.2306F, -5.11F, -0.3522F, 0.1312F, -0.048F));

		PartDefinition cube_r120 = Shoulder.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(0, 65).addBox(-1.9354F, -1.0F, 0.9379F, 7.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.91F, 11.8996F, -5.6935F, -0.1762F, 0.1375F, -0.0244F));

		PartDefinition Neck3 = Shoulder.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0923F, -12.6223F, 0.0437F, -0.0436F, -0.0019F));

		PartDefinition cube_r121 = Neck3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(71, 144).addBox(-0.5F, -4.6082F, 2.9019F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(76, 144).addBox(-0.5F, -4.6082F, -0.0981F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -4.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r122 = Neck3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(81, 144).addBox(-0.5F, -4.5314F, -0.8994F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -7.1F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r123 = Neck3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(75, 89).mirror().addBox(-8.7465F, -3.8118F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 0.9073F, -7.0182F, 0.0038F, 0.2177F, -0.9917F));

		PartDefinition cube_r124 = Neck3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(88, 98).mirror().addBox(-6.8191F, -1.0261F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 0.9073F, -7.0182F, 0.0967F, 0.1954F, -0.5463F));

		PartDefinition cube_r125 = Neck3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(105, 47).mirror().addBox(-6.8191F, -1.0261F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8073F, -4.0182F, 0.0967F, 0.1954F, -0.4765F));

		PartDefinition cube_r126 = Neck3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(88, 104).mirror().addBox(-9.7465F, -3.8118F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8073F, -4.0182F, 0.0038F, 0.2177F, -0.9219F));

		PartDefinition cube_r127 = Neck3.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(23, 26).mirror().addBox(-10.7465F, -3.8118F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8073F, -1.0182F, 0.0038F, 0.2177F, -0.9044F));

		PartDefinition cube_r128 = Neck3.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(17, 108).mirror().addBox(-6.8191F, -1.0261F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8073F, -1.0182F, 0.0967F, 0.1954F, -0.459F));

		PartDefinition cube_r129 = Neck3.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(141, 127).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8073F, -1.0182F, 0.1578F, 0.1507F, -0.1075F));

		PartDefinition cube_r130 = Neck3.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(78, 141).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.8073F, -4.0182F, 0.1578F, 0.1507F, -0.1249F));

		PartDefinition cube_r131 = Neck3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(102, 60).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 0.9073F, -7.0182F, 0.1578F, 0.1507F, -0.1948F));

		PartDefinition cube_r132 = Neck3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(102, 60).addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.9073F, -7.0182F, 0.1578F, -0.1507F, 0.1948F));

		PartDefinition cube_r133 = Neck3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(88, 98).addBox(2.8191F, -1.0261F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.9073F, -7.0182F, 0.0967F, -0.1954F, 0.5463F));

		PartDefinition cube_r134 = Neck3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(75, 89).addBox(5.7466F, -3.8118F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, 0.9073F, -7.0182F, 0.0038F, -0.2177F, 0.9917F));

		PartDefinition cube_r135 = Neck3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(78, 141).addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8073F, -4.0182F, 0.1578F, -0.1507F, 0.1249F));

		PartDefinition cube_r136 = Neck3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(105, 47).addBox(2.8191F, -1.0261F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8073F, -4.0182F, 0.0967F, -0.1954F, 0.4765F));

		PartDefinition cube_r137 = Neck3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(88, 104).addBox(5.7466F, -3.8118F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8073F, -4.0182F, 0.0038F, -0.2177F, 0.9219F));

		PartDefinition cube_r138 = Neck3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(23, 26).addBox(5.7466F, -3.8118F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8073F, -1.0182F, 0.0038F, -0.2177F, 0.9044F));

		PartDefinition cube_r139 = Neck3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(17, 108).addBox(2.8191F, -1.0261F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8073F, -1.0182F, 0.0967F, -0.1954F, 0.459F));

		PartDefinition cube_r140 = Neck3.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(141, 127).addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.8073F, -1.0182F, 0.1578F, -0.1507F, 0.1075F));

		PartDefinition cube_r141 = Neck3.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(97, 111).addBox(-2.0F, -0.2F, 0.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, -8.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck3.addOrReplaceChild("Neck2", CubeListBuilder.create().texOffs(29, 84).addBox(-2.0F, -1.2431F, -9.1228F, 3.0F, 3.0F, 10.0F, new CubeDeformation(-0.001F))
				.texOffs(91, 82).addBox(-0.5F, -5.2431F, -9.1228F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 79).addBox(-0.5F, -5.3431F, -7.1228F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 79).addBox(-0.5F, -5.3431F, -5.1228F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 145).addBox(-0.5F, -5.4431F, -3.1228F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3F, -8.0F, -0.0436F, -0.2618F, 0.0F));

		PartDefinition cube_r142 = Neck2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(80, 53).mirror().addBox(-3.8191F, -1.0261F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6078F, -8.04F, 0.0967F, 0.1954F, -0.7208F));

		PartDefinition cube_r143 = Neck2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(112, 25).mirror().addBox(-4.8191F, -1.0261F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6078F, -6.04F, 0.0967F, 0.1954F, -0.6772F));

		PartDefinition cube_r144 = Neck2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(112, 4).mirror().addBox(-5.8191F, -1.0261F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6078F, -4.04F, 0.0967F, 0.1954F, -0.5899F));

		PartDefinition cube_r145 = Neck2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(141, 88).mirror().addBox(-6.8191F, -1.0261F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6078F, -2.04F, 0.0967F, 0.1954F, -0.6423F));

		PartDefinition cube_r146 = Neck2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(40, 144).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6078F, -2.04F, 0.1578F, 0.1507F, -0.2908F));

		PartDefinition cube_r147 = Neck2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(112, 7).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6078F, -4.04F, 0.1578F, 0.1507F, -0.2384F));

		PartDefinition cube_r148 = Neck2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(110, 23).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6078F, -6.04F, 0.1578F, 0.1507F, -0.3257F));

		PartDefinition cube_r149 = Neck2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(104, 67).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6078F, -8.04F, 0.1578F, 0.1507F, -0.3693F));

		PartDefinition cube_r150 = Neck2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(104, 67).addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6078F, -8.04F, 0.1578F, -0.1507F, 0.3693F));

		PartDefinition cube_r151 = Neck2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(80, 53).addBox(2.8191F, -1.0261F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6078F, -8.04F, 0.0967F, -0.1954F, 0.7208F));

		PartDefinition cube_r152 = Neck2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(110, 23).addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6078F, -6.04F, 0.1578F, -0.1507F, 0.3257F));

		PartDefinition cube_r153 = Neck2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(112, 25).addBox(2.8191F, -1.0261F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6078F, -6.04F, 0.0967F, -0.1954F, 0.6772F));

		PartDefinition cube_r154 = Neck2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(112, 7).addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6078F, -4.04F, 0.1578F, -0.1507F, 0.2384F));

		PartDefinition cube_r155 = Neck2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(112, 4).addBox(2.8191F, -1.0261F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6078F, -4.04F, 0.0967F, -0.1954F, 0.5899F));

		PartDefinition cube_r156 = Neck2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(141, 88).addBox(2.8191F, -1.0261F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6078F, -2.04F, 0.0967F, -0.1954F, 0.6423F));

		PartDefinition cube_r157 = Neck2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(40, 144).addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6078F, -2.04F, 0.1578F, -0.1507F, 0.2908F));

		PartDefinition Neck1 = Neck2.addOrReplaceChild("Neck1", CubeListBuilder.create().texOffs(112, 73).addBox(-2.0F, -1.2773F, -8.0583F, 3.0F, 3.0F, 8.0F, new CubeDeformation(-0.01F))
				.texOffs(105, 40).addBox(-0.5F, -4.8773F, -8.0583F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 103).addBox(-0.5F, -5.0773F, -6.0583F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 98).addBox(-0.5F, -5.0773F, -4.0583F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 82).addBox(-0.5F, -5.1773F, -2.0583F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0431F, -9.0228F, -0.105F, -0.1745F, 0.0031F));

		PartDefinition cube_r158 = Neck1.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(80, 51).mirror().addBox(-3.8191F, -1.0261F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6683F, -1.0066F, 0.0967F, 0.1954F, -0.8081F));

		PartDefinition cube_r159 = Neck1.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(101, 23).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6683F, -1.0066F, 0.1578F, 0.1507F, -0.4566F));

		PartDefinition cube_r160 = Neck1.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(90, 71).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6683F, -3.0066F, 0.1441F, 0.1638F, -0.4566F));

		PartDefinition cube_r161 = Neck1.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(90, 48).mirror().addBox(-3.0F, 0.0F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6683F, -5.0066F, 0.1215F, 0.1812F, -0.5883F));

		PartDefinition cube_r162 = Neck1.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(17, 82).mirror().addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.6683F, -7.0066F, 0.1293F, 0.1757F, -0.5444F));

		PartDefinition cube_r163 = Neck1.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(17, 82).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6683F, -7.0066F, 0.1293F, -0.1757F, 0.5444F));

		PartDefinition cube_r164 = Neck1.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(90, 48).addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6683F, -5.0066F, 0.1215F, -0.1812F, 0.5883F));

		PartDefinition cube_r165 = Neck1.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(90, 71).addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6683F, -3.0066F, 0.1441F, -0.1638F, 0.4566F));

		PartDefinition cube_r166 = Neck1.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(101, 23).addBox(0.0F, 0.0F, -1.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6683F, -1.0066F, 0.1578F, -0.1507F, 0.4566F));

		PartDefinition cube_r167 = Neck1.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(80, 51).addBox(2.8191F, -1.0261F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6683F, -1.0066F, 0.0967F, -0.1954F, 0.8081F));

		PartDefinition Head = Neck1.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(137, 81).addBox(-1.5F, -5.3559F, -8.9486F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(23, 17).addBox(-2.0F, -3.9559F, -12.4486F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 42).addBox(-2.0F, -3.9559F, -8.4486F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(17, 135).addBox(-2.0F, -1.9559F, -7.4486F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4311F, -8.1639F, -0.043F, -0.1264F, 0.1296F));

		PartDefinition cube_r168 = Head.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(0, 114).addBox(-1.5F, -0.4261F, 0.0017F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0441F, -36.7486F, 0.1257F, 0.0F, 0.0F));

		PartDefinition cube_r169 = Head.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(10, 34).mirror().addBox(-0.3271F, -1.5428F, 5.7291F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 86).mirror().addBox(-0.3271F, -1.5428F, 7.7291F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 86).mirror().addBox(-0.3271F, -1.5428F, 7.7291F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(10, 34).mirror().addBox(-0.3271F, -1.5428F, 5.7291F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.8F, 2.9441F, -23.2486F, 0.1481F, -0.0008F, 0.3568F));

		PartDefinition cube_r170 = Head.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(22, 38).mirror().addBox(0.0393F, -2.2157F, -2.3943F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(44, 17).mirror().addBox(0.0393F, -2.0157F, -4.3943F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 53).mirror().addBox(0.0393F, -1.5157F, -6.3943F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 3.0441F, -17.0486F, 0.1052F, -0.1152F, 0.3768F));

		PartDefinition cube_r171 = Head.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(0.0393F, -0.4081F, -8.1689F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 3.0441F, -17.0486F, -0.0257F, -0.1152F, 0.3768F));

		PartDefinition cube_r172 = Head.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(97, 43).mirror().addBox(0.0393F, 1.6395F, -9.9838F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 3.0441F, -17.0486F, -0.2438F, -0.1152F, 0.3768F));

		PartDefinition cube_r173 = Head.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(86, 32).mirror().addBox(0.0393F, 2.9432F, -11.4814F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 3.0441F, -17.0486F, -0.3747F, -0.1152F, 0.3768F));

		PartDefinition cube_r174 = Head.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(96, 128).mirror().addBox(0.5674F, 0.0149F, -1.7998F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 2.0441F, -28.9486F, -0.3747F, -0.1152F, 0.3593F));

		PartDefinition cube_r175 = Head.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(34, 17).mirror().addBox(0.5674F, 0.5102F, -3.5526F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 2.0441F, -28.9486F, -0.2002F, -0.1152F, 0.3593F));

		PartDefinition cube_r176 = Head.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(54, 129).mirror().addBox(0.5226F, 0.9468F, -5.2445F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 2.0441F, -28.9486F, -0.1342F, -0.1128F, 0.3954F));

		PartDefinition cube_r177 = Head.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(130, 69).mirror().addBox(0.5226F, 2.2121F, -6.5646F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 2.0441F, -28.9486F, -0.3524F, -0.1128F, 0.3954F));

		PartDefinition cube_r178 = Head.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(1, 103).mirror().addBox(0.1F, -1.0F, -8.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.6F, 2.0441F, -28.9486F, 0.0F, -0.1222F, 0.0F));

		PartDefinition cube_r179 = Head.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(97, 82).mirror().addBox(-0.3F, -2.9869F, -6.007F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 3.0441F, -17.0486F, 0.1309F, -0.1222F, 0.0175F));

		PartDefinition cube_r180 = Head.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(29, 98).mirror().addBox(-0.3F, -1.4467F, -11.7982F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 3.0441F, -17.0486F, -0.1309F, -0.1222F, 0.0175F));

		PartDefinition cube_r181 = Head.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(65, 33).mirror().addBox(-0.3F, -3.0F, -11.9F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.7F, 3.0441F, -17.0486F, 0.0F, -0.1222F, 0.0175F));

		PartDefinition cube_r182 = Head.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(50, 55).mirror().addBox(-0.2235F, -2.0F, -8.9826F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.6F, 1.7441F, -8.9486F, 0.1424F, -0.2081F, -0.0198F));

		PartDefinition cube_r183 = Head.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(43, 129).mirror().addBox(0.3F, -0.8165F, -8.8857F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.3F, 0.5606F, -1.0629F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r184 = Head.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(30, 135).mirror().addBox(0.3F, -2.3805F, -2.8099F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-8.3F, 0.5606F, -1.0629F, 0.4887F, -0.2618F, 0.0F));

		PartDefinition cube_r185 = Head.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(0, 65).mirror().addBox(0.3F, -2.0891F, -2.6343F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-8.3F, 0.5606F, -1.0629F, 0.9599F, -0.2618F, 0.0F));

		PartDefinition cube_r186 = Head.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(102, 133).mirror().addBox(-2.0F, -1.0365F, -0.8969F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.0F, -1.019F, -0.5491F, 0.1765F, -0.193F, 0.0898F));

		PartDefinition cube_r187 = Head.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(102, 133).mirror().addBox(0.0245F, -0.0286F, -0.8003F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-6.3064F, -4.744F, -1.4434F, 0.1597F, -0.1106F, 0.5017F));

		PartDefinition cube_r188 = Head.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(102, 133).mirror().addBox(0.0258F, -2.0374F, -0.8003F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.3064F, -4.744F, -1.4434F, 0.1124F, -0.1585F, 0.8507F));

		PartDefinition cube_r189 = Head.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(9, 86).addBox(0.3271F, -1.5428F, 7.7291F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 34).addBox(0.3271F, -1.5428F, 5.7291F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8F, 2.9441F, -23.2486F, 0.1481F, 0.0008F, -0.3568F));

		PartDefinition cube_r190 = Head.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(22, 38).addBox(-0.0393F, -2.2157F, -2.3943F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 17).addBox(-0.0393F, -2.0157F, -4.3943F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 53).addBox(-0.0393F, -1.5157F, -6.3943F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, 3.0441F, -17.0486F, 0.1052F, 0.1152F, -0.3768F));

		PartDefinition cube_r191 = Head.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(34, 17).addBox(-0.5674F, 0.5102F, -3.5526F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 2.0441F, -28.9486F, -0.2002F, 0.1152F, -0.3593F));

		PartDefinition cube_r192 = Head.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(96, 128).addBox(-0.5674F, 0.0149F, -1.7998F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 2.0441F, -28.9486F, -0.3747F, 0.1152F, -0.3593F));

		PartDefinition cube_r193 = Head.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(86, 32).addBox(-0.0393F, 2.9432F, -11.4814F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, 3.0441F, -17.0486F, -0.3747F, 0.1152F, -0.3768F));

		PartDefinition cube_r194 = Head.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(97, 43).addBox(-0.0393F, 1.6395F, -9.9838F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, 3.0441F, -17.0486F, -0.2438F, 0.1152F, -0.3768F));

		PartDefinition cube_r195 = Head.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(0, 95).addBox(-0.0393F, -0.4081F, -8.1689F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, 3.0441F, -17.0486F, -0.0257F, 0.1152F, -0.3768F));

		PartDefinition cube_r196 = Head.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(54, 129).addBox(-0.5226F, 0.9468F, -5.2445F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 2.0441F, -28.9486F, -0.1342F, 0.1128F, -0.3954F));

		PartDefinition cube_r197 = Head.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(130, 69).addBox(-0.5226F, 2.2121F, -6.5646F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 2.0441F, -28.9486F, -0.3524F, 0.1128F, -0.3954F));

		PartDefinition cube_r198 = Head.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(1, 103).addBox(-2.1F, -1.0F, -8.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, 2.0441F, -28.9486F, 0.0F, 0.1222F, 0.0F));

		PartDefinition cube_r199 = Head.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(69, 67).addBox(-2.5F, 0.0595F, -11.1802F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9559F, -17.9486F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r200 = Head.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(97, 82).addBox(-0.7F, -2.9869F, -6.007F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(2.7F, 3.0441F, -17.0486F, 0.1309F, 0.1222F, -0.0175F));

		PartDefinition cube_r201 = Head.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(29, 98).addBox(-0.7F, -1.4467F, -11.7982F, 1.0F, 3.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.7F, 3.0441F, -17.0486F, -0.1309F, 0.1222F, -0.0175F));

		PartDefinition cube_r202 = Head.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(65, 33).addBox(-1.7F, -3.0F, -11.9F, 2.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, 3.0441F, -17.0486F, 0.0F, 0.1222F, -0.0175F));

		PartDefinition cube_r203 = Head.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(92, 92).mirror().addBox(-2.0F, -1.0F, 0.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.7441F, -8.9486F, -0.0781F, -0.3054F, -0.0028F));

		PartDefinition cube_r204 = Head.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(44, 98).mirror().addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.952F, 0.3103F, -19.6542F, 0.1476F, -0.0184F, 0.0129F));

		PartDefinition cube_r205 = Head.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(44, 17).mirror().addBox(0.0F, -1.919F, -6.0111F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.02F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -1.1559F, -10.6486F, 0.3927F, -0.1047F, 0.0F));

		PartDefinition cube_r206 = Head.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(9, 14).mirror().addBox(-0.01F, -0.9208F, -4.2897F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.02F)).mirror(false)
				.texOffs(72, 67).mirror().addBox(-0.41F, -0.9208F, -4.2897F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-5.0F, -1.1559F, -10.6486F, 0.1484F, -0.1047F, 0.0F));

		PartDefinition cube_r207 = Head.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(83, 7).mirror().addBox(0.0F, -6.0151F, 1.5494F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.03F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -1.1559F, -10.6486F, 1.9024F, -0.192F, 0.0F));

		PartDefinition cube_r208 = Head.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(0, 34).mirror().addBox(0.0F, -1.3879F, -1.0283F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.04F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -1.1559F, -10.6486F, 0.6458F, -0.192F, 0.0F));

		PartDefinition cube_r209 = Head.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(11, 23).mirror().addBox(0.0F, -3.1089F, -0.1546F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-5.5F, -1.1559F, -10.6486F, 1.2566F, -0.192F, 0.0F));

		PartDefinition cube_r210 = Head.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(83, 7).addBox(-1.0F, -6.0151F, 1.5494F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.03F)), PartPose.offsetAndRotation(4.5F, -1.1559F, -10.6486F, 1.9024F, 0.192F, 0.0F));

		PartDefinition cube_r211 = Head.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(11, 23).addBox(-1.0F, -3.1089F, -0.1546F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(4.5F, -1.1559F, -10.6486F, 1.2566F, 0.192F, 0.0F));

		PartDefinition cube_r212 = Head.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(0, 34).addBox(-1.0F, -1.3879F, -1.0283F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.04F)), PartPose.offsetAndRotation(4.5F, -1.1559F, -10.6486F, 0.6458F, 0.192F, 0.0F));

		PartDefinition cube_r213 = Head.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(44, 98).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.952F, 0.3103F, -19.6542F, 0.1476F, 0.0184F, -0.0129F));

		PartDefinition cube_r214 = Head.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(72, 67).addBox(-1.59F, -0.9208F, -4.2897F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
				.texOffs(9, 14).addBox(-0.99F, -0.9208F, -4.2897F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(4.0F, -1.1559F, -10.6486F, 0.1484F, 0.1047F, 0.0F));

		PartDefinition cube_r215 = Head.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(44, 17).addBox(-1.0F, -1.919F, -6.0111F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.02F)), PartPose.offsetAndRotation(4.0F, -1.1559F, -10.6486F, 0.3927F, 0.1047F, 0.0F));

		PartDefinition cube_r216 = Head.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(116, 47).addBox(-4.0F, -0.0513F, -2.8713F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5559F, -16.0486F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r217 = Head.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(22, 38).addBox(-4.5F, -0.1343F, -5.0184F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.6559F, -11.3486F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r218 = Head.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(44, 67).addBox(-1.0F, 0.0285F, -2.5659F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -5.2559F, -8.9486F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r219 = Head.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(112, 111).addBox(-10.1F, -1.918F, -3.6679F, 10.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, 1.7441F, -8.9486F, -0.384F, 0.0698F, 0.0F));

		PartDefinition cube_r220 = Head.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(92, 92).addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7441F, -8.9486F, -0.0781F, 0.3054F, 0.0028F));

		PartDefinition cube_r221 = Head.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(57, 0).addBox(-2.0F, -1.3F, 2.0F, 3.0F, 2.0F, 7.0F, new CubeDeformation(-0.004F))
				.texOffs(73, 51).addBox(-1.0F, -1.3F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7441F, -8.9486F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r222 = Head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(50, 55).addBox(-1.7765F, -2.0F, -8.9826F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6F, 1.7441F, -8.9486F, 0.1424F, 0.2081F, 0.0198F));

		PartDefinition cube_r223 = Head.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(0, 65).addBox(-2.3F, -2.0891F, -2.6343F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(7.3F, 0.5606F, -1.0629F, 0.9599F, 0.2618F, 0.0F));

		PartDefinition cube_r224 = Head.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(30, 135).addBox(-2.3F, -2.3805F, -2.8099F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(7.3F, 0.5606F, -1.0629F, 0.4887F, 0.2618F, 0.0F));

		PartDefinition cube_r225 = Head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(52, 14).addBox(-2.0F, -1.0365F, 0.1031F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 133).addBox(0.0F, -1.0365F, -0.8969F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -1.019F, -0.5491F, 0.1765F, 0.193F, -0.0898F));

		PartDefinition cube_r226 = Head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(102, 133).addBox(-2.0258F, -2.0374F, -0.8003F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3064F, -4.744F, -1.4434F, 0.1124F, 0.1585F, -0.8507F));

		PartDefinition cube_r227 = Head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(102, 133).addBox(-2.0245F, -0.0286F, -0.8003F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(5.3064F, -4.744F, -1.4434F, 0.1597F, 0.1106F, -0.5017F));

		PartDefinition cube_r228 = Head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(117, 98).addBox(-4.5F, -0.1F, 2.4F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(60, 134).addBox(-2.5F, 2.9F, -0.6F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(64, 82).addBox(-3.0F, 0.9F, -0.6F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(137, 53).addBox(-1.5F, -0.1F, -0.6F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -5.2559F, -4.9486F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r229 = Head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(43, 129).addBox(-2.3F, -0.8165F, -8.8857F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.3F, 0.5606F, -1.0629F, 0.0F, 0.2618F, 0.0F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create().texOffs(133, 137).mirror().addBox(-1.5F, -1.9077F, -35.7086F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 5.3441F, -0.0486F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r230 = Jaw.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(137, 109).mirror().addBox(-0.5F, -3.0448F, -7.8268F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(137, 109).addBox(-0.5F, -3.0448F, -7.8268F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.0F, 2.0923F, -27.7086F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r231 = Jaw.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(113, 117).mirror().addBox(-0.1565F, -0.1203F, -2.8973F, 1.0F, 3.0F, 7.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-1.9435F, -1.32F, -31.0228F, -0.1309F, -0.1745F, -0.0524F));

		PartDefinition cube_r232 = Jaw.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(48, 47).mirror().addBox(3.1505F, -5.1553F, -14.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(6, 53).mirror().addBox(3.1505F, -5.1553F, -16.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.2F, 3.0923F, 0.5914F, 0.0558F, -0.22F, -0.2505F));

		PartDefinition cube_r233 = Jaw.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(0, 131).mirror().addBox(1.8759F, -2.3813F, -1.3684F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(116, 73).mirror().addBox(1.8759F, -2.6813F, -3.3684F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(79, 116).mirror().addBox(1.8033F, -2.2902F, -5.3684F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(118, 85).mirror().addBox(1.8033F, -2.1902F, -7.3684F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(110, 123).mirror().addBox(1.8033F, -1.9902F, -9.3684F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(127, 69).mirror().addBox(1.8033F, -2.0902F, -11.3684F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9F, 0.0923F, -16.4086F, 0.0297F, -0.1185F, -0.2461F));

		PartDefinition cube_r234 = Jaw.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(100, 111).mirror().addBox(0.0151F, -2.4144F, 2.1138F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9435F, -1.32F, -31.0228F, -0.0708F, -0.1693F, -0.3003F));

		PartDefinition cube_r235 = Jaw.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(5, 114).mirror().addBox(0.0151F, -2.6597F, 0.5176F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9435F, -1.32F, -31.0228F, -0.001F, -0.1693F, -0.3003F));

		PartDefinition cube_r236 = Jaw.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(97, 14).mirror().addBox(0.0151F, -2.9805F, -0.8859F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(128, 18).mirror().addBox(0.0151F, -2.4805F, -2.7859F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9435F, -1.32F, -31.0228F, 0.0426F, -0.1693F, -0.3003F));

		PartDefinition cube_r237 = Jaw.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(128, 39).mirror().addBox(1.0F, -2.0F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, -1.2077F, -35.4086F, 0.0F, 0.0F, -0.2443F));

		PartDefinition cube_r238 = Jaw.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(74, 123).mirror().addBox(-0.1565F, -0.5877F, -3.4859F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9435F, -1.32F, -31.0228F, 0.0F, -0.1745F, -0.0524F));

		PartDefinition cube_r239 = Jaw.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(75, 82).mirror().addBox(-0.1656F, -1.9F, -11.3684F, 2.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.9F, 0.0923F, -16.4086F, 0.0F, -0.1222F, 0.0F));

		PartDefinition cube_r240 = Jaw.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(74, 111).mirror().addBox(0.2F, -7.3973F, -16.9416F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-8.2F, 3.0923F, 0.5914F, 0.1309F, -0.2269F, 0.0F));

		PartDefinition cube_r241 = Jaw.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(57, 123).mirror().addBox(0.2F, -2.9466F, -14.8031F, 2.0F, 4.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-8.2F, 3.0923F, 0.5914F, -0.1309F, -0.2269F, 0.0F));

		PartDefinition cube_r242 = Jaw.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(90, 64).mirror().addBox(0.2F, -4.9F, -17.9F, 2.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.2F, 3.0923F, 0.5914F, 0.0F, -0.2269F, 0.0F));

		PartDefinition cube_r243 = Jaw.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(124, 122).mirror().addBox(0.2F, -2.5791F, -9.1735F, 2.0F, 3.0F, 6.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-8.2F, 3.0923F, 0.5914F, -0.4014F, -0.2269F, 0.0F));

		PartDefinition cube_r244 = Jaw.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(85, 128).mirror().addBox(0.2F, -3.0992F, -2.801F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-8.2F, 3.0923F, 0.5914F, -0.2269F, -0.2269F, 0.0F));

		PartDefinition cube_r245 = Jaw.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(107, 98).mirror().addBox(0.2F, -1.1346F, 0.0988F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-8.2F, 3.0923F, 0.5914F, 0.2269F, -0.2269F, 0.0F));

		PartDefinition cube_r246 = Jaw.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(0.2F, -5.0798F, -10.0945F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-8.2F, 3.0923F, 0.5914F, -0.1222F, -0.2269F, 0.0F));

		PartDefinition cube_r247 = Jaw.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(74, 98).mirror().addBox(0.2F, -3.1553F, -8.8986F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-8.2F, 3.0923F, 0.5914F, 0.0175F, -0.2269F, 0.0F));

		PartDefinition cube_r248 = Jaw.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(113, 117).addBox(-0.8435F, -0.1203F, -2.8973F, 1.0F, 3.0F, 7.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.9435F, -1.32F, -31.0228F, -0.1309F, 0.1745F, 0.0524F));

		PartDefinition cube_r249 = Jaw.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(48, 47).addBox(-3.1505F, -5.1553F, -14.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 53).addBox(-3.1505F, -5.1553F, -16.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.2F, 3.0923F, 0.5914F, 0.0558F, 0.22F, 0.2505F));

		PartDefinition cube_r250 = Jaw.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(0, 131).addBox(-1.8759F, -2.3813F, -1.3684F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 73).addBox(-1.8759F, -2.6813F, -3.3684F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 116).addBox(-1.8033F, -2.2902F, -5.3684F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(118, 85).addBox(-1.8033F, -2.1902F, -7.3684F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 123).addBox(-1.8033F, -1.9902F, -9.3684F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(127, 69).addBox(-1.8033F, -2.0902F, -11.3684F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 0.0923F, -16.4086F, 0.0297F, 0.1185F, 0.2461F));

		PartDefinition cube_r251 = Jaw.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(100, 111).addBox(-0.0151F, -2.4144F, 2.1138F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9435F, -1.32F, -31.0228F, -0.0708F, 0.1693F, 0.3003F));

		PartDefinition cube_r252 = Jaw.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(5, 114).addBox(-0.0151F, -2.6597F, 0.5176F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9435F, -1.32F, -31.0228F, -0.001F, 0.1693F, 0.3003F));

		PartDefinition cube_r253 = Jaw.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(97, 14).addBox(-0.0151F, -2.9805F, -0.8859F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(128, 18).addBox(-0.0151F, -2.4805F, -2.7859F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9435F, -1.32F, -31.0228F, 0.0426F, 0.1693F, 0.3003F));

		PartDefinition cube_r254 = Jaw.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(128, 39).addBox(-1.0F, -2.0F, -0.3F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, -1.2077F, -35.4086F, 0.0F, 0.0F, 0.2443F));

		PartDefinition cube_r255 = Jaw.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(74, 123).addBox(-0.8435F, -0.5877F, -3.4859F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9435F, -1.32F, -31.0228F, 0.0F, 0.1745F, 0.0524F));

		PartDefinition cube_r256 = Jaw.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(75, 82).addBox(-1.8344F, -1.9F, -11.3684F, 2.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 0.0923F, -16.4086F, 0.0F, 0.1222F, 0.0F));

		PartDefinition cube_r257 = Jaw.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(74, 111).addBox(-2.2F, -7.3973F, -16.9416F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(7.2F, 3.0923F, 0.5914F, 0.1309F, 0.2269F, 0.0F));

		PartDefinition cube_r258 = Jaw.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(57, 123).addBox(-2.2F, -2.9466F, -14.8031F, 2.0F, 4.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(7.2F, 3.0923F, 0.5914F, -0.1309F, 0.2269F, 0.0F));

		PartDefinition cube_r259 = Jaw.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(90, 64).addBox(-2.2F, -4.9F, -17.9F, 2.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.2F, 3.0923F, 0.5914F, 0.0F, 0.2269F, 0.0F));

		PartDefinition cube_r260 = Jaw.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(124, 122).addBox(-2.2F, -2.5791F, -9.1735F, 2.0F, 3.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(7.2F, 3.0923F, 0.5914F, -0.4014F, 0.2269F, 0.0F));

		PartDefinition cube_r261 = Jaw.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(85, 128).addBox(-2.2F, -3.0992F, -2.801F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(7.2F, 3.0923F, 0.5914F, -0.2269F, 0.2269F, 0.0F));

		PartDefinition cube_r262 = Jaw.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(107, 98).addBox(-2.2F, -1.1346F, 0.0988F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(7.2F, 3.0923F, 0.5914F, 0.2269F, 0.2269F, 0.0F));

		PartDefinition cube_r263 = Jaw.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(0, 0).addBox(-2.2F, -5.0798F, -10.0945F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(7.2F, 3.0923F, 0.5914F, -0.1222F, 0.2269F, 0.0F));

		PartDefinition cube_r264 = Jaw.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(74, 98).addBox(-2.2F, -3.1553F, -8.8986F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.2F, 3.0923F, 0.5914F, 0.0175F, 0.2269F, 0.0F));

		PartDefinition FrontFlipperL = Shoulder.addOrReplaceChild("FrontFlipperL", CubeListBuilder.create(), PartPose.offsetAndRotation(10.5F, 9.7864F, -8.5035F, 0.2182F, 0.3491F, 0.3491F));

		PartDefinition cube_r265 = FrontFlipperL.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(123, 117).addBox(-9.1004F, -1.2799F, 0.3732F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.2423F, -0.0906F, -2.9192F, -0.1764F, 0.155F, -0.0371F));

		PartDefinition cube_r266 = FrontFlipperL.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(0, 125).addBox(-6.7469F, -0.5028F, -2.8678F, 7.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(10.0842F, 0.0488F, 2.3455F, -0.1764F, -0.1544F, 0.0178F));

		PartDefinition cube_r267 = FrontFlipperL.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(36, 114).addBox(15.0986F, -3.4459F, -8.6129F, 4.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F))
				.texOffs(0, 131).addBox(18.0986F, -3.4459F, -9.6129F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.003F))
				.texOffs(120, 103).addBox(7.0986F, -3.4459F, -8.7129F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-7.9158F, 3.9488F, 6.5455F, -0.1743F, 0.0003F, -0.0096F));

		PartDefinition FrontFlipperMiddleL = FrontFlipperL.addOrReplaceChild("FrontFlipperMiddleL", CubeListBuilder.create(), PartPose.offsetAndRotation(13.8742F, -1.7954F, 0.052F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r268 = FrontFlipperMiddleL.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(83, 7).addBox(23.658F, -2.0459F, -8.4881F, 11.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.4946F, 4.4442F, 4.72F, -0.174F, 0.0023F, 0.0131F));

		PartDefinition cube_r269 = FrontFlipperMiddleL.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(104, 63).addBox(1.4F, -0.5F, -3.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(29, 90).addBox(1.4F, -0.5F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(144, 49).addBox(1.4F, -0.5F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(135, 122).addBox(-1.0F, -0.5F, 0.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(138, 60).addBox(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3876F, 1.9244F, 0.0988F, -0.1747F, 0.0882F, -0.002F));

		PartDefinition FrontFlipperEndL = FrontFlipperMiddleL.addOrReplaceChild("FrontFlipperEndL", CubeListBuilder.create(), PartPose.offsetAndRotation(15.8443F, 0.5F, 0.3531F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r270 = FrontFlipperEndL.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(25, 108).addBox(34.0681F, -2.8459F, -8.3913F, 9.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-35.3389F, 3.9442F, 4.367F, -0.1707F, 0.0042F, 0.0356F));

		PartDefinition FrontFlipperL2 = Shoulder.addOrReplaceChild("FrontFlipperL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-11.5F, 9.7864F, -8.5035F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r271 = FrontFlipperL2.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(84, 123).addBox(0.1004F, -1.2799F, 0.3732F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.2423F, -0.0906F, -2.9192F, -0.1764F, -0.155F, 0.0371F));

		PartDefinition cube_r272 = FrontFlipperL2.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(17, 84).addBox(-0.2531F, -0.5028F, -2.8678F, 7.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-10.0842F, 0.0488F, 2.3455F, -0.1764F, 0.1544F, -0.0178F));

		PartDefinition cube_r273 = FrontFlipperL2.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(15, 114).addBox(-19.0986F, -3.4459F, -8.6129F, 4.0F, 2.0F, 3.0F, new CubeDeformation(-0.008F))
				.texOffs(88, 111).addBox(-21.0986F, -3.4459F, -9.6129F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.003F))
				.texOffs(118, 63).addBox(-15.0986F, -3.4459F, -8.7129F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(7.9158F, 3.9488F, 6.5455F, -0.1743F, -0.0003F, 0.0096F));

		PartDefinition FrontFlipperMiddleL2 = FrontFlipperL2.addOrReplaceChild("FrontFlipperMiddleL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-13.8742F, -1.7954F, 0.052F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r274 = FrontFlipperMiddleL2.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(83, 0).addBox(-34.658F, -2.0459F, -8.4881F, 11.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(19.4946F, 4.4442F, 4.72F, -0.174F, -0.0023F, -0.0131F));

		PartDefinition cube_r275 = FrontFlipperMiddleL2.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(90, 67).addBox(-3.4F, -0.5F, -3.1F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(72, 72).addBox(-3.4F, -0.5F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(112, 0).addBox(-3.4F, -0.5F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(135, 46).addBox(-1.0F, -0.5F, 0.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(138, 18).addBox(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3876F, 1.9244F, 0.0988F, -0.1747F, -0.0882F, 0.002F));

		PartDefinition FrontFlipperEndL2 = FrontFlipperMiddleL2.addOrReplaceChild("FrontFlipperEndL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-15.8443F, 0.5F, 0.3531F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r276 = FrontFlipperEndL2.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(107, 92).addBox(-43.0681F, -2.8459F, -8.3913F, 9.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(35.3389F, 3.9442F, 4.367F, -0.1707F, -0.0042F, -0.0356F));

		PartDefinition BackFlipperL = Pliosaurus.addOrReplaceChild("BackFlipperL", CubeListBuilder.create().texOffs(79, 25).addBox(-0.4329F, -1.0F, -1.9178F, 14.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(127, 69).addBox(13.567F, -1.0F, -2.1178F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0F, 6.4806F, -1.82F, 0.1309F, -0.3491F, -0.2618F));

		PartDefinition cube_r277 = BackFlipperL.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(127, 18).addBox(0.0F, -2.5F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(13.567F, 1.5F, 3.8822F, 0.0F, 1.2217F, 0.0F));

		PartDefinition BackFlipperMiddleL = BackFlipperL.addOrReplaceChild("BackFlipperMiddleL", CubeListBuilder.create().texOffs(86, 145).addBox(7.2489F, -1.0F, 1.4266F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.2671F, 0.5F, -2.3178F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r278 = BackFlipperMiddleL.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(28, 145).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.2489F, 0.5F, 4.9266F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r279 = BackFlipperMiddleL.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(0, 139).addBox(-1.0F, -1.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0489F, 0.5F, 4.1266F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r280 = BackFlipperMiddleL.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(111, 137).addBox(-1.0F, -1.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.756F, 0.5F, 0.7915F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r281 = BackFlipperMiddleL.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(110, 145).addBox(-1.0F, -1.5F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.9489F, 0.5F, -0.0734F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r282 = BackFlipperMiddleL.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(105, 40).addBox(0.2676F, -0.6F, -0.3809F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.7489F, 0.0F, -0.1734F, 0.0F, -0.1047F, 0.0F));

		PartDefinition BackFlipperEndL = BackFlipperMiddleL.addOrReplaceChild("BackFlipperEndL", CubeListBuilder.create(), PartPose.offsetAndRotation(16.2489F, 0.5F, 3.4266F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r283 = BackFlipperEndL.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(97, 14).addBox(0.2163F, -2.0F, -0.0338F, 10.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 1.0F, -3.3F, 0.0F, -0.2094F, 0.0F));

		PartDefinition BackFlipperL2 = Pliosaurus.addOrReplaceChild("BackFlipperL2", CubeListBuilder.create().texOffs(64, 18).addBox(-13.567F, -1.0F, -1.9178F, 14.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(32, 126).addBox(-15.567F, -1.0F, -2.1178F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.0F, 6.4806F, -1.82F, 0.0681F, 0.298F, 0.2284F));

		PartDefinition cube_r284 = BackFlipperL2.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(15, 126).addBox(-2.0F, -2.5F, -6.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-13.567F, 1.5F, 3.8822F, 0.0F, -1.2217F, 0.0F));

		PartDefinition BackFlipperMiddleL2 = BackFlipperL2.addOrReplaceChild("BackFlipperMiddleL2", CubeListBuilder.create().texOffs(19, 145).addBox(-9.2489F, -1.0F, 1.4266F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.2671F, 0.5F, -2.3178F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r285 = BackFlipperMiddleL2.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(144, 74).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.2489F, 0.5F, 4.9266F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r286 = BackFlipperMiddleL2.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(138, 66).addBox(-1.0F, -1.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0489F, 0.5F, 4.1266F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r287 = BackFlipperMiddleL2.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(88, 137).addBox(-1.0F, -1.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.756F, 0.5F, 0.7915F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r288 = BackFlipperMiddleL2.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(101, 145).addBox(-1.0F, -1.5F, -0.8F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.9489F, 0.5F, -0.0734F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r289 = BackFlipperMiddleL2.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(97, 104).addBox(-8.2676F, -0.6F, -0.3809F, 8.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.7489F, 0.0F, -0.1734F, 0.0F, 0.1047F, 0.0F));

		PartDefinition BackFlipperEndL2 = BackFlipperMiddleL2.addOrReplaceChild("BackFlipperEndL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.2489F, 0.5F, 3.4266F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r290 = BackFlipperEndL2.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(90, 54).addBox(-10.2163F, -2.0F, -0.0338F, 10.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, 1.0F, -3.3F, 0.0F, 0.2094F, 0.0F));

		PartDefinition Tail1 = Pliosaurus.addOrReplaceChild("Tail1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4F, 7.0F, -0.1314F, -0.0865F, 0.0114F));

		PartDefinition cube_r291 = Tail1.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(88, 111).addBox(-0.5F, -3.0F, 5.9F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 14).addBox(-0.5F, -3.0F, 2.9F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(83, 0).addBox(-0.5F, -3.0F, -0.1F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3491F, 0.5314F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r292 = Tail1.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(23, 17).addBox(0.0F, 1.236F, 5.7115F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 23).addBox(0.0F, 0.5993F, 3.7739F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(24, 95).addBox(0.0F, -0.9503F, 1.7869F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 54).addBox(0.0F, -1.5F, -0.2F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.9599F, 9.1543F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r293 = Tail1.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(112, 24).addBox(-2.0F, 0.0F, -1.1F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3491F, 0.5314F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r294 = Tail1.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(107, 92).addBox(-0.5F, -2.4206F, 3.8282F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(108, 40).addBox(-0.5F, -2.4206F, 1.8282F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(79, 111).addBox(-0.5F, -2.4206F, -0.1718F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0491F, 8.3314F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r295 = Tail1.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(17, 79).mirror().addBox(-3.9559F, -0.9886F, -0.2092F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.0877F, 1.0951F, -0.0373F, 0.1282F, -0.4806F));

		PartDefinition cube_r296 = Tail1.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(44, 38).mirror().addBox(-3.956F, -0.9886F, -0.2092F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.3877F, 3.9951F, -0.0373F, 0.1282F, -0.4806F));

		PartDefinition cube_r297 = Tail1.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(33, 65).mirror().addBox(-1.1328F, 0.2114F, -0.0787F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.1877F, 12.5951F, 0.009F, 0.1332F, -0.1286F));

		PartDefinition cube_r298 = Tail1.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(44, 73).mirror().addBox(-1.8328F, 0.2114F, -0.0787F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.8877F, 10.5951F, 0.009F, 0.1332F, -0.1286F));

		PartDefinition cube_r299 = Tail1.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(41, 61).mirror().addBox(-2.3328F, 0.2114F, -0.0787F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.7877F, 8.5951F, 0.009F, 0.1332F, -0.1286F));

		PartDefinition cube_r300 = Tail1.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(73, 58).mirror().addBox(-2.9158F, 0.082F, -0.2092F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.5877F, 6.8951F, 0.009F, 0.1332F, -0.1286F));

		PartDefinition cube_r301 = Tail1.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(140, 143).mirror().addBox(-3.1158F, 0.082F, -0.2092F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8F, -0.3877F, 3.9951F, 0.009F, 0.1332F, -0.1286F));

		PartDefinition cube_r302 = Tail1.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(0, 144).mirror().addBox(-3.1158F, 0.082F, -0.2092F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -0.0877F, 1.0951F, 0.009F, 0.1332F, -0.1286F));

		PartDefinition cube_r303 = Tail1.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(33, 65).addBox(-0.8672F, 0.2114F, -0.0787F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.1877F, 12.5951F, 0.009F, -0.1332F, 0.1286F));

		PartDefinition cube_r304 = Tail1.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(44, 73).addBox(-1.1672F, 0.2114F, -0.0787F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.8877F, 10.5951F, 0.009F, -0.1332F, 0.1286F));

		PartDefinition cube_r305 = Tail1.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(41, 61).addBox(-0.6672F, 0.2114F, -0.0787F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.7877F, 8.5951F, 0.009F, -0.1332F, 0.1286F));

		PartDefinition cube_r306 = Tail1.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(73, 58).addBox(-1.0842F, 0.082F, -0.2092F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.5877F, 6.8951F, 0.009F, -0.1332F, 0.1286F));

		PartDefinition cube_r307 = Tail1.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(44, 38).addBox(2.956F, -0.9886F, -0.2092F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.3877F, 3.9951F, -0.0373F, -0.1282F, 0.4806F));

		PartDefinition cube_r308 = Tail1.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(140, 143).addBox(0.1158F, 0.082F, -0.2092F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -0.3877F, 3.9951F, 0.009F, -0.1332F, 0.1286F));

		PartDefinition cube_r309 = Tail1.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(17, 79).addBox(2.9559F, -0.9886F, -0.2092F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0877F, 1.0951F, -0.0373F, -0.1282F, 0.4806F));

		PartDefinition cube_r310 = Tail1.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(0, 144).addBox(0.1158F, 0.082F, -0.2092F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.0877F, 1.0951F, 0.009F, -0.1332F, 0.1286F));

		PartDefinition cube_r311 = Tail1.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(44, 116).addBox(-1.5F, -2.8F, 0.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.0509F, 7.5314F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.6491F, 13.8314F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r312 = Tail2.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(17, 103).addBox(0.0F, -2.1902F, 1.6251F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(20, 103).addBox(0.0F, -2.2901F, -0.3749F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8908F, 0.2601F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r313 = Tail2.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(112, 27).mirror().addBox(-0.4328F, 0.2114F, -0.0787F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.0614F, 2.4637F, 0.009F, 0.1332F, -0.1286F));

		PartDefinition cube_r314 = Tail2.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(44, 41).mirror().addBox(-0.7328F, 0.2114F, -0.0787F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.2614F, 0.4637F, 0.009F, 0.1332F, -0.1286F));

		PartDefinition cube_r315 = Tail2.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(112, 27).addBox(-1.5672F, 0.2114F, -0.0787F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0614F, 2.4637F, 0.009F, -0.1332F, 0.1286F));

		PartDefinition cube_r316 = Tail2.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(44, 41).addBox(-1.2672F, 0.2114F, -0.0787F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.2614F, 0.4637F, 0.009F, -0.1332F, 0.1286F));

		PartDefinition cube_r317 = Tail2.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(26, 126).addBox(-1.5F, 0.0284F, -0.3169F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 0.2F, 0.1571F, 0.0F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, 2.9F, 0.0886F, -0.1739F, -0.0154F));

		PartDefinition cube_r318 = Tail3.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(46, 84).addBox(-0.5F, -1.6628F, 3.8017F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 84).addBox(-0.5F, -1.8628F, 1.8017F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 106).addBox(-0.5F, -2.0628F, -0.1983F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7227F, 1.1713F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r319 = Tail3.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(11, 42).addBox(0.0F, 2.8576F, 9.3899F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(64, 18).addBox(0.0F, 3.6576F, 11.3899F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 65).addBox(0.0F, 2.0468F, 7.5507F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.109F, -7.5771F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r320 = Tail3.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(111, 128).addBox(-1.5F, 0.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.7227F, -0.0287F, 0.0524F, 0.0F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(109, 74).addBox(-1.0F, -0.6983F, -0.0512F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3227F, 5.9713F, 0.0704F, -0.1306F, -0.0092F));

		PartDefinition cube_r321 = Tail4.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(26, 65).addBox(-1.0F, -0.2F, -0.3F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.6983F, 4.0488F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r322 = Tail4.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(0, 42).addBox(0.0F, 4.4576F, 13.0899F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.5962F, -13.3809F, 0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r323 = Tail4.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(74, 51).addBox(0.0F, -1.0F, 1.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 82).addBox(0.0F, -1.1F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5983F, 1.4488F, -0.1222F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 160, 160);
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