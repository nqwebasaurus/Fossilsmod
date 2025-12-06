package fossils.fossils.client.blockentity.model.miragaia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class MiragaiaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart leftPlate33;
	private final ModelPart rightPlate33;
	private final ModelPart leftPlate7;
	private final ModelPart rightPlate7;
	private final ModelPart leftPlate6;
	private final ModelPart rightPlate6;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart backleftleg;
	private final ModelPart backleftleg2;
	private final ModelPart backleftleg3;
	private final ModelPart backleftleg4;
	private final ModelPart backrightleg;
	private final ModelPart backrightleg2;
	private final ModelPart backrightleg3;
	private final ModelPart backrightleg4;
	private final ModelPart tail;
	private final ModelPart leftPlate11;
	private final ModelPart rightPlate11;
	private final ModelPart leftPlate8;
	private final ModelPart rightPlate8;
	private final ModelPart tail2;
	private final ModelPart leftPlate9;
	private final ModelPart rightPlate9;
	private final ModelPart leftPlate10;
	private final ModelPart rightPlate10;
	private final ModelPart tail3;
	private final ModelPart leftPlate12;
	private final ModelPart rightPlate12;
	private final ModelPart leftPlate14;
	private final ModelPart rightPlate14;
	private final ModelPart leftPlate4;
	private final ModelPart rightPlate4;
	private final ModelPart tail4;
	private final ModelPart leftPlate5;
	private final ModelPart rightPlate5;
	private final ModelPart leftPlate16;
	private final ModelPart rightPlate16;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart leftPlate13;
	private final ModelPart rightPlate13;
	private final ModelPart leftPlate18;
	private final ModelPart rightPlate18;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart leftPlate19;
	private final ModelPart rightPlate19;
	private final ModelPart leftPlate31;
	private final ModelPart rightPlate31;
	private final ModelPart body4;
	private final ModelPart leftPlate30;
	private final ModelPart rightPlate30;
	private final ModelPart leftPlate20;
	private final ModelPart rightPlate20;
	private final ModelPart upperbody;
	private final ModelPart leftPlate21;
	private final ModelPart rightPlate21;
	private final ModelPart leftPlate29;
	private final ModelPart rightPlate29;
	private final ModelPart chest;
	private final ModelPart frontleftleg2;
	private final ModelPart frontleftleg3;
	private final ModelPart frontleftleg4;
	private final ModelPart frontrightleg2;
	private final ModelPart frontrightleg3;
	private final ModelPart frontrightleg4;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart leftPlate23;
	private final ModelPart rightPlate23;
	private final ModelPart leftPlate28;
	private final ModelPart rightPlate28;
	private final ModelPart leftPlate22;
	private final ModelPart rightPlate22;
	private final ModelPart neck;
	private final ModelPart leftPlate26;
	private final ModelPart rightPlate26;
	private final ModelPart neck2;
	private final ModelPart neck4;
	private final ModelPart leftPlate2;
	private final ModelPart rightPlate2;
	private final ModelPart leftPlate34;
	private final ModelPart rightPlate34;
	private final ModelPart neck3;
	private final ModelPart leftPlate3;
	private final ModelPart rightPlate3;
	private final ModelPart neck5;
	private final ModelPart leftPlate35;
	private final ModelPart rightPlate35;
	private final ModelPart leftPlate17;
	private final ModelPart rightPlate17;
	private final ModelPart neck6;
	private final ModelPart leftPlate36;
	private final ModelPart rightPlate36;
	private final ModelPart neck7;
	private final ModelPart leftPlate37;
	private final ModelPart rightPlate37;
	private final ModelPart leftPlate38;
	private final ModelPart rightPlate38;
	private final ModelPart neck8;
	private final ModelPart leftPlate39;
	private final ModelPart rightPlate39;
	private final ModelPart leftPlate40;
	private final ModelPart rightPlate40;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart eye;
	private final ModelPart eye2;
	private final ModelPart jaw;
	private final ModelPart leftPlate25;
	private final ModelPart rightPlate25;
	private final ModelPart leftPlate15;
	private final ModelPart rightPlate15;

	public MiragaiaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.leftPlate33 = this.body.getChild("leftPlate33");
		this.rightPlate33 = this.body.getChild("rightPlate33");
		this.leftPlate7 = this.body.getChild("leftPlate7");
		this.rightPlate7 = this.body.getChild("rightPlate7");
		this.leftPlate6 = this.body.getChild("leftPlate6");
		this.rightPlate6 = this.body.getChild("rightPlate6");
		this.bone = this.body.getChild("bone");
		this.bone3 = this.body.getChild("bone3");
		this.backleftleg = this.body.getChild("backleftleg");
		this.backleftleg2 = this.backleftleg.getChild("backleftleg2");
		this.backleftleg3 = this.backleftleg2.getChild("backleftleg3");
		this.backleftleg4 = this.backleftleg3.getChild("backleftleg4");
		this.backrightleg = this.body.getChild("backrightleg");
		this.backrightleg2 = this.backrightleg.getChild("backrightleg2");
		this.backrightleg3 = this.backrightleg2.getChild("backrightleg3");
		this.backrightleg4 = this.backrightleg3.getChild("backrightleg4");
		this.tail = this.body.getChild("tail");
		this.leftPlate11 = this.tail.getChild("leftPlate11");
		this.rightPlate11 = this.tail.getChild("rightPlate11");
		this.leftPlate8 = this.tail.getChild("leftPlate8");
		this.rightPlate8 = this.tail.getChild("rightPlate8");
		this.tail2 = this.tail.getChild("tail2");
		this.leftPlate9 = this.tail2.getChild("leftPlate9");
		this.rightPlate9 = this.tail2.getChild("rightPlate9");
		this.leftPlate10 = this.tail2.getChild("leftPlate10");
		this.rightPlate10 = this.tail2.getChild("rightPlate10");
		this.tail3 = this.tail2.getChild("tail3");
		this.leftPlate12 = this.tail3.getChild("leftPlate12");
		this.rightPlate12 = this.tail3.getChild("rightPlate12");
		this.leftPlate14 = this.tail3.getChild("leftPlate14");
		this.rightPlate14 = this.tail3.getChild("rightPlate14");
		this.leftPlate4 = this.tail3.getChild("leftPlate4");
		this.rightPlate4 = this.tail3.getChild("rightPlate4");
		this.tail4 = this.tail3.getChild("tail4");
		this.leftPlate5 = this.tail4.getChild("leftPlate5");
		this.rightPlate5 = this.tail4.getChild("rightPlate5");
		this.leftPlate16 = this.tail4.getChild("leftPlate16");
		this.rightPlate16 = this.tail4.getChild("rightPlate16");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.leftPlate13 = this.tail5.getChild("leftPlate13");
		this.rightPlate13 = this.tail5.getChild("rightPlate13");
		this.leftPlate18 = this.tail5.getChild("leftPlate18");
		this.rightPlate18 = this.tail5.getChild("rightPlate18");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.leftPlate19 = this.body3.getChild("leftPlate19");
		this.rightPlate19 = this.body3.getChild("rightPlate19");
		this.leftPlate31 = this.body3.getChild("leftPlate31");
		this.rightPlate31 = this.body3.getChild("rightPlate31");
		this.body4 = this.body3.getChild("body4");
		this.leftPlate30 = this.body4.getChild("leftPlate30");
		this.rightPlate30 = this.body4.getChild("rightPlate30");
		this.leftPlate20 = this.body4.getChild("leftPlate20");
		this.rightPlate20 = this.body4.getChild("rightPlate20");
		this.upperbody = this.body4.getChild("upperbody");
		this.leftPlate21 = this.upperbody.getChild("leftPlate21");
		this.rightPlate21 = this.upperbody.getChild("rightPlate21");
		this.leftPlate29 = this.upperbody.getChild("leftPlate29");
		this.rightPlate29 = this.upperbody.getChild("rightPlate29");
		this.chest = this.upperbody.getChild("chest");
		this.frontleftleg2 = this.chest.getChild("frontleftleg2");
		this.frontleftleg3 = this.frontleftleg2.getChild("frontleftleg3");
		this.frontleftleg4 = this.frontleftleg3.getChild("frontleftleg4");
		this.frontrightleg2 = this.chest.getChild("frontrightleg2");
		this.frontrightleg3 = this.frontrightleg2.getChild("frontrightleg3");
		this.frontrightleg4 = this.frontrightleg3.getChild("frontrightleg4");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.leftPlate23 = this.chest.getChild("leftPlate23");
		this.rightPlate23 = this.chest.getChild("rightPlate23");
		this.leftPlate28 = this.chest.getChild("leftPlate28");
		this.rightPlate28 = this.chest.getChild("rightPlate28");
		this.leftPlate22 = this.chest.getChild("leftPlate22");
		this.rightPlate22 = this.chest.getChild("rightPlate22");
		this.neck = this.chest.getChild("neck");
		this.leftPlate26 = this.neck.getChild("leftPlate26");
		this.rightPlate26 = this.neck.getChild("rightPlate26");
		this.neck2 = this.neck.getChild("neck2");
		this.neck4 = this.neck2.getChild("neck4");
		this.leftPlate2 = this.neck4.getChild("leftPlate2");
		this.rightPlate2 = this.neck4.getChild("rightPlate2");
		this.leftPlate34 = this.neck4.getChild("leftPlate34");
		this.rightPlate34 = this.neck4.getChild("rightPlate34");
		this.neck3 = this.neck4.getChild("neck3");
		this.leftPlate3 = this.neck3.getChild("leftPlate3");
		this.rightPlate3 = this.neck3.getChild("rightPlate3");
		this.neck5 = this.neck3.getChild("neck5");
		this.leftPlate35 = this.neck5.getChild("leftPlate35");
		this.rightPlate35 = this.neck5.getChild("rightPlate35");
		this.leftPlate17 = this.neck5.getChild("leftPlate17");
		this.rightPlate17 = this.neck5.getChild("rightPlate17");
		this.neck6 = this.neck5.getChild("neck6");
		this.leftPlate36 = this.neck6.getChild("leftPlate36");
		this.rightPlate36 = this.neck6.getChild("rightPlate36");
		this.neck7 = this.neck6.getChild("neck7");
		this.leftPlate37 = this.neck7.getChild("leftPlate37");
		this.rightPlate37 = this.neck7.getChild("rightPlate37");
		this.leftPlate38 = this.neck7.getChild("leftPlate38");
		this.rightPlate38 = this.neck7.getChild("rightPlate38");
		this.neck8 = this.neck7.getChild("neck8");
		this.leftPlate39 = this.neck8.getChild("leftPlate39");
		this.rightPlate39 = this.neck8.getChild("rightPlate39");
		this.leftPlate40 = this.neck8.getChild("leftPlate40");
		this.rightPlate40 = this.neck8.getChild("rightPlate40");
		this.head = this.neck8.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.eye = this.head.getChild("eye");
		this.eye2 = this.head.getChild("eye2");
		this.jaw = this.head.getChild("jaw");
		this.leftPlate25 = this.neck2.getChild("leftPlate25");
		this.rightPlate25 = this.neck2.getChild("rightPlate25");
		this.leftPlate15 = this.body2.getChild("leftPlate15");
		this.rightPlate15 = this.body2.getChild("rightPlate15");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 23.0F, 2.0F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -34.0651F, 4.9699F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 31).addBox(-0.003F, -0.1F, -11.05F, 0.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.5531F, 6.477F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-2.5F, 2.0F, -2.75F, 2.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 17).addBox(0.5F, 2.0F, -2.75F, 2.0F, 0.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-0.5F, 1.0F, -2.75F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.25F, -4.25F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(85, 143).addBox(0.0F, -4.4F, 0.05F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2732F, -7.0953F, -0.0611F, 0.0F, 0.0F));

		PartDefinition leftPlate33 = body.addOrReplaceChild("leftPlate33", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4186F, -4.5932F, 0.1757F, -0.3896F, 0.2325F, 0.1827F));

		PartDefinition cube_r4 = leftPlate33.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(101, 111).addBox(-0.5F, -5.5F, -0.8F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.6934F, -7.7664F, -0.346F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r5 = leftPlate33.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(37, 113).addBox(-0.5F, -5.5F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.6934F, -7.7664F, -0.346F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r6 = leftPlate33.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(5, 98).addBox(-0.5F, -0.2371F, -0.5538F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.6934F, -17.0286F, -0.4731F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r7 = leftPlate33.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 98).addBox(-0.5F, -0.3298F, -0.0228F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.6934F, -16.9871F, -1.0105F, -0.0785F, 0.0F, 0.0F));

		PartDefinition rightPlate33 = body.addOrReplaceChild("rightPlate33", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4186F, -4.5932F, 0.1757F, -0.3896F, -0.2325F, -0.1827F));

		PartDefinition cube_r8 = rightPlate33.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(101, 111).mirror().addBox(-0.5F, -5.5F, -0.8F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.6934F, -7.7664F, -0.346F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r9 = rightPlate33.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(37, 113).mirror().addBox(-0.5F, -5.5F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(0.6934F, -7.7664F, -0.346F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r10 = rightPlate33.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(5, 98).mirror().addBox(-0.5F, -0.2371F, -0.5538F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.6934F, -17.0286F, -0.4731F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r11 = rightPlate33.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 98).mirror().addBox(-0.5F, -0.3298F, -0.0228F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.6934F, -16.9871F, -1.0105F, -0.0785F, 0.0F, 0.0F));

		PartDefinition leftPlate7 = body.addOrReplaceChild("leftPlate7", CubeListBuilder.create(), PartPose.offsetAndRotation(2.8205F, -4.6445F, 5.2774F, -0.4769F, 0.2325F, 0.1827F));

		PartDefinition cube_r12 = leftPlate7.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(42, 135).addBox(-0.5F, 3.8F, -3.275F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.6934F, -7.742F, 0.3536F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r13 = leftPlate7.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(78, 98).addBox(-0.5F, -0.2371F, -0.5538F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.6934F, -17.0286F, -0.4731F, 0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r14 = leftPlate7.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(22, 87).addBox(-0.5F, -0.3298F, -0.0228F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.6934F, -16.9871F, -1.0105F, -0.0567F, 0.0F, 0.0F));

		PartDefinition rightPlate7 = body.addOrReplaceChild("rightPlate7", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.8205F, -4.6445F, 5.2774F, -0.4769F, -0.2325F, -0.1827F));

		PartDefinition cube_r15 = rightPlate7.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(42, 135).mirror().addBox(-0.5F, 3.8F, -3.275F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.6934F, -7.742F, 0.3536F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r16 = rightPlate7.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(78, 98).mirror().addBox(-0.5F, -0.2371F, -0.5538F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.6934F, -17.0286F, -0.4731F, 0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r17 = rightPlate7.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(22, 87).mirror().addBox(-0.5F, -0.3298F, -0.0228F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.6934F, -16.9871F, -1.0105F, -0.0567F, 0.0F, 0.0F));

		PartDefinition leftPlate6 = body.addOrReplaceChild("leftPlate6", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1395F, -5.1213F, -4.6871F, -0.2965F, 0.2424F, 0.2076F));

		PartDefinition cube_r18 = leftPlate6.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(11, 87).addBox(-0.5F, -0.3333F, -0.4228F, 1.0F, 8.0F, 4.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-0.6934F, -8.0285F, -1.4731F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r19 = leftPlate6.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(35, 135).addBox(-0.5F, -0.3118F, -1.4957F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.6934F, -10.4349F, 1.3758F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r20 = leftPlate6.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(131, 47).addBox(-0.5F, -6.5971F, -0.5435F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-0.6934F, -10.3349F, 1.3758F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r21 = leftPlate6.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(122, 69).addBox(-0.5F, -0.3054F, -0.2413F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.6934F, -11.5349F, -1.2242F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r22 = leftPlate6.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(147, 130).addBox(-0.5F, -3.9328F, -0.7668F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(28, 135).addBox(-0.5F, -2.6328F, -1.1668F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.6934F, -11.4142F, 0.3536F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r23 = leftPlate6.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(110, 134).addBox(-0.5F, -5.7965F, -0.409F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.193F)), PartPose.offsetAndRotation(-0.6934F, -11.5349F, -1.0242F, -0.2793F, 0.0F, 0.0F));

		PartDefinition rightPlate6 = body.addOrReplaceChild("rightPlate6", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1395F, -5.1213F, -4.6871F, -0.2965F, -0.2424F, -0.2076F));

		PartDefinition cube_r24 = rightPlate6.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(11, 87).mirror().addBox(-0.5F, -0.3333F, -0.4228F, 1.0F, 8.0F, 4.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(0.6934F, -8.0285F, -1.4731F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r25 = rightPlate6.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(35, 135).mirror().addBox(-0.5F, -0.3118F, -1.4957F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.6934F, -10.4349F, 1.3758F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r26 = rightPlate6.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(131, 47).mirror().addBox(-0.5F, -6.5971F, -0.5435F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(0.6934F, -10.3349F, 1.3758F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r27 = rightPlate6.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(122, 69).mirror().addBox(-0.5F, -0.3054F, -0.2413F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.6934F, -11.5349F, -1.2242F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r28 = rightPlate6.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(147, 130).mirror().addBox(-0.5F, -3.9328F, -0.7668F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(28, 135).mirror().addBox(-0.5F, -2.6328F, -1.1668F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(0.6934F, -11.4142F, 0.3536F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r29 = rightPlate6.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(110, 134).mirror().addBox(-0.5F, -5.7965F, -0.409F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.193F)).mirror(false), PartPose.offsetAndRotation(0.6934F, -11.5349F, -1.0242F, -0.2793F, 0.0F, 0.0F));

		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7F, -1.5073F, 2.7299F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(128, 102).addBox(-1.4508F, -1.9176F, -0.051F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.9508F, -0.3859F, -8.1486F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(79, 74).addBox(-1.4508F, 0.6824F, -6.951F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.006F))
				.texOffs(64, 65).addBox(-1.4508F, -0.0176F, -6.951F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9508F, -3.2375F, -5.3866F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(116, 14).addBox(-0.5F, -1.3F, -2.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 0.0694F, 2.2117F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(86, 59).addBox(-0.253F, -0.8268F, -0.2192F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.75F, -1.3929F, 1.0333F, -0.3424F, -0.2472F, 0.087F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(116, 7).addBox(-1.25F, -0.8268F, 0.0552F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.75F, -1.3929F, 1.0333F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(59, 134).addBox(-0.563F, -11.9752F, -1.3539F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.104F)), PartPose.offsetAndRotation(0.0971F, 4.586F, -7.1814F, -2.33F, -0.2967F, 0.0F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(14, 136).addBox(-0.563F, -6.0033F, -0.8606F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0971F, 4.586F, -7.1814F, -2.2427F, -0.2967F, 0.0F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(110, 27).addBox(-1.1F, -4.8537F, -0.5507F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.525F, 4.8642F, -2.8355F, -2.4364F, -0.1491F, 0.2801F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(143, 12).addBox(-0.5F, -0.975F, -0.525F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-2.4756F, 10.4933F, 1.9596F, -2.3579F, -0.1491F, 0.2801F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(102, 67).addBox(-1.1F, -5.6658F, -2.4443F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.104F)), PartPose.offsetAndRotation(0.525F, 4.8642F, -2.8355F, -2.8291F, -0.1491F, 0.2801F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(136, 11).addBox(-1.1F, -2.7188F, -0.8484F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.096F)), PartPose.offsetAndRotation(0.525F, 4.8642F, -2.8355F, -2.131F, -0.1491F, 0.2801F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(65, 117).addBox(-1.0F, -0.3799F, -0.5053F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 3.3158F, -6.8082F, -1.693F, -0.1745F, 0.0F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(134, 38).addBox(-1.0F, -0.0267F, -1.4916F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, 3.3158F, -6.8082F, -1.3439F, -0.1745F, 0.0F));

		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(46, 37).addBox(-1.25F, -0.0021F, -7.0665F, 1.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, -1.1558F, 1.4454F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(63, 37).addBox(-1.25F, -0.0021F, -0.0665F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.75F, -3.2385F, -5.3119F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(131, 132).addBox(-0.6F, -0.5F, -1.625F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.6322F, -0.8197F, -14.3243F, 0.7466F, -0.1304F, 0.0229F));

		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(7, 142).addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.5031F, -2.1333F, -12.0476F, 0.3814F, 0.2522F, 0.1253F));

		PartDefinition cube_r47 = bone.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(116, 111).addBox(-0.0734F, -2.1001F, -2.4086F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.027F, 0.4559F, -12.9445F, 0.2531F, -0.276F, -0.0841F));

		PartDefinition cube_r48 = bone.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(31, 27).addBox(-0.0734F, -0.0501F, -2.1086F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4492F, -2.6375F, -12.1866F, 0.384F, -0.276F, -0.0841F));

		PartDefinition cube_r49 = bone.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(130, 88).addBox(-0.1282F, -0.0921F, -3.035F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1508F, -1.9375F, -13.9866F, 0.764F, -0.3589F, -0.1142F));

		PartDefinition bone3 = body.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7F, -1.5073F, 2.7299F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r50 = bone3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(128, 102).mirror().addBox(0.4508F, -1.9176F, -0.051F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9508F, -0.3859F, -8.1486F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r51 = bone3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(79, 74).mirror().addBox(0.4508F, 0.6824F, -6.951F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(64, 65).mirror().addBox(-1.5492F, -0.0176F, -6.951F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9508F, -3.2375F, -5.3866F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r52 = bone3.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(116, 14).mirror().addBox(-0.5F, -1.3F, -2.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0694F, 2.2117F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r53 = bone3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(86, 59).mirror().addBox(-1.747F, -0.8268F, -0.2192F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.75F, -1.3929F, 1.0333F, -0.3424F, 0.2472F, -0.087F));

		PartDefinition cube_r54 = bone3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(116, 7).mirror().addBox(0.25F, -0.8268F, 0.0552F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.75F, -1.3929F, 1.0333F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r55 = bone3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(59, 134).mirror().addBox(-0.437F, -11.9752F, -1.3539F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.104F)).mirror(false), PartPose.offsetAndRotation(-0.0971F, 4.586F, -7.1814F, -2.33F, 0.2967F, 0.0F));

		PartDefinition cube_r56 = bone3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(14, 136).mirror().addBox(-0.437F, -6.0033F, -0.8606F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-0.0971F, 4.586F, -7.1814F, -2.2427F, 0.2967F, 0.0F));

		PartDefinition cube_r57 = bone3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(110, 27).mirror().addBox(0.1F, -4.8537F, -0.5507F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-0.525F, 4.8642F, -2.8355F, -2.4364F, 0.1491F, -0.2801F));

		PartDefinition cube_r58 = bone3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(143, 12).mirror().addBox(-0.5F, -0.975F, -0.525F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(2.4756F, 10.4933F, 1.9596F, -2.3579F, 0.1491F, -0.2801F));

		PartDefinition cube_r59 = bone3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(102, 67).mirror().addBox(0.1F, -5.6658F, -2.4443F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.104F)).mirror(false), PartPose.offsetAndRotation(-0.525F, 4.8642F, -2.8355F, -2.8291F, 0.1491F, -0.2801F));

		PartDefinition cube_r60 = bone3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(136, 11).mirror().addBox(0.1F, -2.7188F, -0.8484F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.096F)).mirror(false), PartPose.offsetAndRotation(-0.525F, 4.8642F, -2.8355F, -2.131F, 0.1491F, -0.2801F));

		PartDefinition cube_r61 = bone3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(65, 117).mirror().addBox(0.0F, -0.3799F, -0.5053F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.3158F, -6.8082F, -1.693F, 0.1745F, 0.0F));

		PartDefinition cube_r62 = bone3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(134, 38).mirror().addBox(0.0F, -0.0267F, -1.4916F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 3.3158F, -6.8082F, -1.3439F, 0.1745F, 0.0F));

		PartDefinition cube_r63 = bone3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(46, 37).mirror().addBox(0.25F, -0.0021F, -7.0665F, 1.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.75F, -1.1558F, 1.4454F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r64 = bone3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(63, 37).mirror().addBox(-1.75F, -0.0021F, -0.0665F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.75F, -3.2385F, -5.3119F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r65 = bone3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(131, 132).mirror().addBox(-0.4F, -0.5F, -1.625F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.6322F, -0.8197F, -14.3243F, 0.7466F, 0.1304F, -0.0229F));

		PartDefinition cube_r66 = bone3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(7, 142).mirror().addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.5031F, -2.1333F, -12.0476F, 0.3814F, -0.2522F, -0.1253F));

		PartDefinition cube_r67 = bone3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(116, 111).mirror().addBox(-0.9266F, -2.1001F, -2.4086F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.027F, 0.4559F, -12.9445F, 0.2531F, 0.276F, 0.0841F));

		PartDefinition cube_r68 = bone3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(31, 27).mirror().addBox(-1.9266F, -0.0501F, -2.1086F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4492F, -2.6375F, -12.1866F, 0.384F, 0.276F, 0.0841F));

		PartDefinition cube_r69 = bone3.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(130, 88).mirror().addBox(-0.8718F, -0.0921F, -3.035F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1508F, -1.9375F, -13.9866F, 0.764F, 0.3589F, 0.1142F));

		PartDefinition backleftleg = body.addOrReplaceChild("backleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4F, 0.8454F, -0.8971F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r70 = backleftleg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(107, 58).addBox(-1.0F, 8.3136F, -4.5956F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 8.2125F, 0.7263F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r71 = backleftleg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(107, 0).addBox(-1.0F, -0.8F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0374F, -0.1334F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r72 = backleftleg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(65, 127).addBox(-0.5F, 0.0F, -0.9F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.0F, 10.9215F, 1.9896F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r73 = backleftleg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(136, 49).addBox(-1.0F, -3.075F, -1.05F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 10.9875F, 2.1376F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r74 = backleftleg.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(42, 65).addBox(-1.0F, -0.1638F, -0.5712F, 3.0F, 16.0F, 2.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(1.0F, 1.8125F, -0.0737F, -0.0044F, 0.0F, 0.0F));

		PartDefinition backleftleg2 = backleftleg.addOrReplaceChild("backleftleg2", CubeListBuilder.create().texOffs(103, 99).addBox(-0.5F, 0.8936F, -0.4389F, 3.0F, 10.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.2F, 20.7896F, 1.857F, 0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r75 = backleftleg2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(112, 97).addBox(0.5F, -6.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(2.3283F, 5.3994F, -0.1306F, -0.0175F, -0.003F, 0.0435F));

		PartDefinition cube_r76 = backleftleg2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(99, 125).addBox(-1.0F, -0.125F, -0.9F, 3.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 1.4942F, 1.5608F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r77 = backleftleg2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(125, 39).addBox(-1.0F, -1.0F, -0.6F, 3.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 2.1676F, -0.5406F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r78 = backleftleg2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(110, 21).addBox(-1.0F, -1.1F, -1.25F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6473F, 0.0696F, -0.1745F, 0.0F, 0.0F));

		PartDefinition backleftleg3 = backleftleg2.addOrReplaceChild("backleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0105F, 10.9975F, -0.0325F, -0.3916F, 0.0F, 0.0F));

		PartDefinition cube_r79 = backleftleg3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(112, 46).addBox(-2.0F, -3.3F, -0.5F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0119F, 2.3211F, -2.3246F, -0.7854F, 0.0F, 0.0F));

		PartDefinition backleftleg4 = backleftleg3.addOrReplaceChild("backleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5119F, 2.2296F, -1.7566F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r80 = backleftleg4.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(77, 18).addBox(-2.0F, -0.1F, -2.7F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2358F, -1.3451F, 0.4363F, 0.0041F, -0.0005F));

		PartDefinition backrightleg = body.addOrReplaceChild("backrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4F, 0.8454F, -0.8971F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r81 = backrightleg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(109, 72).addBox(-2.0F, 8.3136F, -4.5956F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 8.2125F, 0.7263F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r82 = backrightleg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(107, 51).addBox(-2.0F, -0.8F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0374F, -0.1334F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r83 = backrightleg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(0, 130).addBox(-1.5F, 0.0F, -0.9F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-1.0F, 10.9215F, 1.9896F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r84 = backrightleg.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(139, 84).addBox(-1.0F, -3.075F, -1.05F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, 10.9875F, 2.1376F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r85 = backrightleg.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(53, 65).addBox(-2.0F, -0.1638F, -0.5712F, 3.0F, 16.0F, 2.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-1.0F, 1.8125F, -0.0737F, -0.0044F, 0.0F, 0.0F));

		PartDefinition backrightleg2 = backrightleg.addOrReplaceChild("backrightleg2", CubeListBuilder.create().texOffs(51, 104).addBox(-2.5F, 0.8936F, -0.4389F, 3.0F, 10.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.2F, 20.7896F, 1.857F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r86 = backrightleg2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 116).addBox(-1.5F, -6.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.103F)), PartPose.offsetAndRotation(-2.3283F, 5.3994F, -0.1306F, -0.0175F, 0.003F, -0.0435F));

		PartDefinition cube_r87 = backrightleg2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(56, 126).addBox(-2.0F, -0.125F, -0.9F, 3.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 1.4942F, 1.5608F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r88 = backrightleg2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(125, 124).addBox(-2.0F, -1.0F, -0.6F, 3.0F, 6.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 2.1676F, -0.5406F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r89 = backrightleg2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(88, 114).addBox(-2.0F, -1.1F, -1.25F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.6473F, 0.0696F, -0.1745F, 0.0F, 0.0F));

		PartDefinition backrightleg3 = backrightleg2.addOrReplaceChild("backrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0105F, 10.9975F, -0.0325F, 0.2192F, 0.0F, 0.0F));

		PartDefinition cube_r90 = backrightleg3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(116, 34).addBox(-3.0F, -3.3F, -0.5F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0119F, 2.3211F, -2.3246F, -0.7854F, 0.0F, 0.0F));

		PartDefinition backrightleg4 = backrightleg3.addOrReplaceChild("backrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5119F, 2.2296F, -1.7566F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r91 = backrightleg4.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(84, 35).addBox(-3.0F, -0.1F, -2.7F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2358F, -1.3451F, 0.4363F, -0.0041F, 0.0005F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.259F, 6.9347F, 0.2627F, -0.287F, 0.0546F));

		PartDefinition cube_r92 = tail.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(104, 148).addBox(0.0F, -3.9422F, 2.0173F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(146, 44).addBox(0.0F, -3.4422F, 0.0173F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1065F, 5.9043F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r93 = tail.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(9, 146).addBox(0.0F, -3.6422F, 0.0173F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4495F, 3.9314F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r94 = tail.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(44, 149).addBox(0.0F, 0.2F, -0.5F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0979F, 3.7783F, 0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r95 = tail.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(148, 108).addBox(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 146).addBox(0.0F, 0.4F, 2.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.25F, 5.5821F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r96 = tail.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(15, 71).addBox(0.0F, 0.3F, -0.2F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8866F, 0.9845F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r97 = tail.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(146, 5).addBox(0.0F, -3.8422F, 0.0173F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5939F, 1.9341F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r98 = tail.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(109, 142).addBox(0.0F, -4.1422F, -0.0827F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9036F, 0.0555F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r99 = tail.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(54, 14).mirror().addBox(-1.75F, -0.0422F, -1.0827F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1671F, 0.9264F, -0.1225F, 0.0693F, -0.0085F));

		PartDefinition cube_r100 = tail.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(54, 14).addBox(-0.25F, -0.0422F, -1.0827F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1671F, 0.9264F, -0.1225F, -0.0693F, 0.0085F));

		PartDefinition cube_r101 = tail.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(23, 31).addBox(-0.5F, -1.0422F, 0.9173F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0767F, -1.0587F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftPlate11 = tail.addOrReplaceChild("leftPlate11", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2046F, -2.6694F, 3.4247F, -0.7266F, 0.1439F, 0.2875F));

		PartDefinition cube_r102 = leftPlate11.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(64, 87).addBox(-0.5F, -9.3298F, -0.0228F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0936F, -9.1031F, -1.3027F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r103 = leftPlate11.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(27, 87).addBox(-0.5F, 0.1055F, -1.0608F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.0936F, -18.4031F, 0.1973F, 0.0131F, 0.0F, 0.0F));

		PartDefinition rightPlate11 = tail.addOrReplaceChild("rightPlate11", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.2046F, -2.6694F, 3.4247F, -0.7266F, -0.1439F, -0.2875F));

		PartDefinition cube_r104 = rightPlate11.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(64, 87).mirror().addBox(-0.5F, -9.3298F, -0.0228F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0936F, -9.1031F, -1.3027F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r105 = rightPlate11.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(27, 87).mirror().addBox(-0.5F, 0.1055F, -1.0608F, 1.0F, 17.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(1.0936F, -18.4031F, 0.1973F, 0.0131F, 0.0F, 0.0F));

		PartDefinition leftPlate8 = tail.addOrReplaceChild("leftPlate8", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4786F, -2.6943F, 9.9572F, -0.8216F, 0.2796F, 0.2348F));

		PartDefinition cube_r106 = leftPlate8.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(32, 99).addBox(-0.5F, -9.3298F, -0.0228F, 1.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0936F, -6.3031F, -1.3027F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r107 = leftPlate8.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(83, 98).addBox(-0.5F, 0.1055F, -1.0608F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.0936F, -15.6031F, 0.1973F, 0.0131F, 0.0F, 0.0F));

		PartDefinition rightPlate8 = tail.addOrReplaceChild("rightPlate8", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4786F, -2.6943F, 9.9572F, -0.8216F, -0.2796F, -0.2348F));

		PartDefinition cube_r108 = rightPlate8.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(32, 99).mirror().addBox(-0.5F, -9.3298F, -0.0228F, 1.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0936F, -6.3031F, -1.3027F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r109 = rightPlate8.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(83, 98).mirror().addBox(-0.5F, 0.1055F, -1.0608F, 1.0F, 16.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(1.0936F, -15.6031F, 0.1973F, 0.0131F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0004F, 9.6553F, -0.2565F, -0.0955F, -0.0199F));

		PartDefinition cube_r110 = tail2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(5, 152).addBox(0.0F, -2.2894F, -0.0203F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5321F, 8.0334F, -0.5934F, 0.0F, 0.0F));

		PartDefinition cube_r111 = tail2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(107, 7).addBox(0.0F, -2.6894F, -0.0203F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6019F, 6.0346F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r112 = tail2.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(146, 85).addBox(0.0F, -3.0894F, -0.0203F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6717F, 4.0358F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r113 = tail2.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(146, 79).addBox(0.0F, -3.1894F, -0.0203F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7415F, 2.037F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r114 = tail2.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(146, 73).addBox(0.0F, -3.1894F, -0.0203F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8113F, 0.0382F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r115 = tail2.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(40, 152).addBox(0.0F, -0.9F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.8728F, 7.8343F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r116 = tail2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(80, 151).addBox(0.0F, -1.1F, 0.1F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3783F, 4.8737F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r117 = tail2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(51, 99).addBox(0.0F, 0.1F, 3.3F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9923F, -0.5947F, 0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r118 = tail2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(73, 150).addBox(0.0F, -1.025F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7589F, 1.2883F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r119 = tail2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(46, 27).mirror().addBox(-1.2F, 0.0F, -1.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-0.45F, 0.198F, 0.9826F, -0.035F, 0.0523F, -0.0018F));

		PartDefinition cube_r120 = tail2.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(46, 27).addBox(-0.8F, 0.0F, -1.0F, 2.0F, 0.0F, 9.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.45F, 0.198F, 0.9826F, -0.035F, -0.0523F, 0.0018F));

		PartDefinition cube_r121 = tail2.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(31, 14).addBox(-0.5F, -0.8894F, -0.5203F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0707F, 0.5071F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftPlate9 = tail2.addOrReplaceChild("leftPlate9", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9648F, -1.8632F, 3.1244F, -0.6263F, 0.3195F, 0.3072F));

		PartDefinition cube_r122 = leftPlate9.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(69, 101).addBox(-0.5F, -9.3298F, -0.0228F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0936F, -6.3031F, -1.3027F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r123 = leftPlate9.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(15, 100).addBox(-0.5F, 0.1055F, -1.0608F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.0936F, -15.6031F, 0.1973F, 0.0131F, 0.0F, 0.0F));

		PartDefinition rightPlate9 = tail2.addOrReplaceChild("rightPlate9", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9648F, -1.8632F, 3.1244F, -0.6263F, -0.3195F, -0.3072F));

		PartDefinition cube_r124 = rightPlate9.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(69, 101).mirror().addBox(-0.5F, -9.3298F, -0.0228F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0936F, -6.3031F, -1.3027F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r125 = rightPlate9.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(15, 100).mirror().addBox(-0.5F, 0.1055F, -1.0608F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(1.0936F, -15.6031F, 0.1973F, 0.0131F, 0.0F, 0.0F));

		PartDefinition leftPlate10 = tail2.addOrReplaceChild("leftPlate10", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7798F, -2.1919F, 8.1514F, -0.7482F, 0.3625F, 0.3295F));

		PartDefinition cube_r126 = leftPlate10.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(103, 83).addBox(-0.5F, -9.3298F, -0.0228F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0936F, -4.3031F, -1.3027F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r127 = leftPlate10.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(102, 51).addBox(-0.5F, 0.1055F, -1.0608F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.0936F, -13.6031F, 0.1973F, 0.0131F, 0.0F, 0.0F));

		PartDefinition rightPlate10 = tail2.addOrReplaceChild("rightPlate10", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7798F, -2.1919F, 8.1514F, -0.7482F, -0.3625F, -0.3295F));

		PartDefinition cube_r128 = rightPlate10.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(103, 83).mirror().addBox(-0.5F, -9.3298F, -0.0228F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0936F, -4.3031F, -1.3027F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r129 = rightPlate10.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(102, 51).mirror().addBox(-0.5F, 0.1055F, -1.0608F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(1.0936F, -13.6031F, 0.1973F, 0.0131F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5165F, 9.9012F, -0.3002F, -0.2087F, 0.0641F));

		PartDefinition cube_r130 = tail3.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(154, 73).addBox(0.0F, -0.5886F, 0.9853F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(137, 153).addBox(0.0F, -0.5886F, -1.0147F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3712F, 8.9586F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r131 = tail3.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(153, 134).addBox(0.0F, -0.6886F, -1.0147F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3664F, 6.9561F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r132 = tail3.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(134, 153).addBox(0.0F, 0.0817F, 0.5033F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(153, 23).addBox(0.0F, -0.4183F, -1.4967F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6638F, 7.0431F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r133 = tail3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(52, 131).addBox(0.0F, 0.8682F, -0.4857F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.02F, 3.7513F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r134 = tail3.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(118, 79).addBox(0.0F, -0.4318F, -0.4858F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5545F, 1.8241F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r135 = tail3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(11, 153).addBox(0.0F, -0.4318F, -0.2858F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1424F, -0.2959F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r136 = tail3.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(42, 113).addBox(0.0F, -0.8636F, -0.0147F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2966F, 3.9594F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r137 = tail3.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(152, 130).addBox(0.0F, -1.1503F, 0.0061F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2355F, 1.9646F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r138 = tail3.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(76, 152).addBox(0.0F, -1.7661F, -0.0969F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.822F, -0.0229F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r139 = tail3.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(31, 0).addBox(-0.5F, -0.9455F, -0.8252F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0433F, 0.8169F, 0.0524F, 0.0F, 0.0F));

		PartDefinition leftPlate12 = tail3.addOrReplaceChild("leftPlate12", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4777F, -1.0368F, 1.3305F, -0.5147F, 0.2428F, 0.5578F));

		PartDefinition cube_r140 = leftPlate12.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(111, 111).addBox(-0.5F, -9.3298F, -0.0228F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0936F, -4.3031F, -1.3027F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r141 = leftPlate12.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(106, 111).addBox(-0.5F, 0.1055F, -1.0608F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.0936F, -13.6031F, 0.1973F, 0.0131F, 0.0F, 0.0F));

		PartDefinition rightPlate12 = tail3.addOrReplaceChild("rightPlate12", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4777F, -1.0368F, 1.3305F, -0.5147F, -0.2428F, -0.5578F));

		PartDefinition cube_r142 = rightPlate12.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(111, 111).mirror().addBox(-0.5F, -9.3298F, -0.0228F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0936F, -4.3031F, -1.3027F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r143 = rightPlate12.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(106, 111).mirror().addBox(-0.5F, 0.1055F, -1.0608F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(1.0936F, -13.6031F, 0.1973F, 0.0131F, 0.0F, 0.0F));

		PartDefinition leftPlate14 = tail3.addOrReplaceChild("leftPlate14", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4777F, -0.3915F, 5.8331F, -0.5048F, 0.2641F, 0.5971F));

		PartDefinition cube_r144 = leftPlate14.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(32, 117).addBox(-0.5F, -9.3298F, -0.0228F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0936F, -2.3031F, -1.3027F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r145 = leftPlate14.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(10, 117).addBox(-0.5F, 0.1055F, -1.0608F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.0936F, -11.6031F, 0.1973F, -0.0218F, 0.0F, 0.0F));

		PartDefinition rightPlate14 = tail3.addOrReplaceChild("rightPlate14", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4777F, -0.3915F, 5.8331F, -0.5048F, -0.2641F, -0.5971F));

		PartDefinition cube_r146 = rightPlate14.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(32, 117).mirror().addBox(-0.5F, -9.3298F, -0.0228F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0936F, -2.3031F, -1.3027F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r147 = rightPlate14.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(10, 117).mirror().addBox(-0.5F, 0.1055F, -1.0608F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(1.0936F, -11.6031F, 0.1973F, -0.0218F, 0.0F, 0.0F));

		PartDefinition leftPlate4 = tail3.addOrReplaceChild("leftPlate4", CubeListBuilder.create(), PartPose.offsetAndRotation(2.626F, -1.0249F, 10.9199F, -0.4973F, 0.3095F, 0.6853F));

		PartDefinition cube_r148 = leftPlate4.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(47, 123).addBox(-0.5F, -9.3298F, -0.0228F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0936F, 0.0969F, -1.1027F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r149 = leftPlate4.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(42, 123).addBox(-0.5F, 0.1055F, -1.0608F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.0936F, -9.2031F, 0.3973F, -0.0218F, 0.0F, 0.0F));

		PartDefinition rightPlate4 = tail3.addOrReplaceChild("rightPlate4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.626F, -1.0249F, 10.9199F, -0.4973F, -0.3095F, -0.6853F));

		PartDefinition cube_r150 = rightPlate4.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(47, 123).mirror().addBox(-0.5F, -9.3298F, -0.0228F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0936F, 0.0969F, -1.1027F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r151 = rightPlate4.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(42, 123).mirror().addBox(-0.5F, 0.1055F, -1.0608F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(1.0936F, -9.2031F, 0.3973F, -0.0218F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0749F, 10.8635F, -0.0786F, 0.087F, -0.0068F));

		PartDefinition cube_r152 = tail4.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(17, 154).addBox(0.0F, -0.3556F, -0.036F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3583F, 7.0753F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r153 = tail4.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(154, 6).addBox(0.0F, -0.5556F, -0.061F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3505F, 5.1002F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r154 = tail4.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(154, 3).addBox(0.0F, 2.7F, 9.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 154).addBox(0.0F, 2.1F, 7.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(154, 76).addBox(0.0F, 0.8F, 3.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(153, 153).addBox(0.0F, 1.4F, 5.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7387F, -2.8205F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r155 = tail4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(150, 153).addBox(0.0F, 0.7594F, 2.4128F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7387F, -3.8205F, 0.3578F, 0.0F, 0.0F));

		PartDefinition cube_r156 = tail4.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(147, 153).addBox(0.0F, -0.5055F, 0.039F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3689F, 3.0003F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r157 = tail4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(153, 137).addBox(0.0F, -0.5556F, 0.039F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4363F, 1.0008F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r158 = tail4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(56, 0).addBox(-0.5F, -0.0055F, 0.139F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.006F))
				.texOffs(21, 55).addBox(-0.5F, -0.5055F, 0.139F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.1128F, -0.104F, -0.0087F, 0.0F, 0.0F));

		PartDefinition leftPlate5 = tail4.addOrReplaceChild("leftPlate5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.426F, -0.068F, 4.7079F, -0.4346F, 0.3244F, 0.7185F));

		PartDefinition cube_r159 = leftPlate5.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(77, 123).addBox(-0.5F, -9.3298F, -0.0228F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0936F, 0.0969F, -1.1027F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r160 = leftPlate5.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(72, 123).addBox(-0.5F, 0.1055F, -1.0608F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.0936F, -9.2031F, 0.3973F, -0.0218F, 0.0F, 0.0F));

		PartDefinition rightPlate5 = tail4.addOrReplaceChild("rightPlate5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.426F, -0.068F, 4.7079F, -0.4346F, -0.3244F, -0.7185F));

		PartDefinition cube_r161 = rightPlate5.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(77, 123).mirror().addBox(-0.5F, -9.3298F, -0.0228F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0936F, 0.0969F, -1.1027F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r162 = rightPlate5.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(72, 123).mirror().addBox(-0.5F, 0.1055F, -1.0608F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(1.0936F, -9.2031F, 0.3973F, -0.0218F, 0.0F, 0.0F));

		PartDefinition leftPlate16 = tail4.addOrReplaceChild("leftPlate16", CubeListBuilder.create(), PartPose.offsetAndRotation(2.126F, 0.1473F, 8.1682F, -0.3907F, 0.3769F, 0.8462F));

		PartDefinition cube_r163 = leftPlate16.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(23, 124).addBox(-0.5F, -9.3298F, -0.0228F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0936F, 0.0969F, -1.1027F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r164 = leftPlate16.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(18, 124).addBox(-0.5F, 0.1055F, -1.0608F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-1.0936F, -9.2031F, 0.3973F, -0.0218F, 0.0F, 0.0F));

		PartDefinition rightPlate16 = tail4.addOrReplaceChild("rightPlate16", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.126F, 0.1473F, 8.1682F, -0.3907F, -0.3769F, -0.8462F));

		PartDefinition cube_r165 = rightPlate16.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(23, 124).mirror().addBox(-0.5F, -9.3298F, -0.0228F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0936F, 0.0969F, -1.1027F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r166 = rightPlate16.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(18, 124).mirror().addBox(-0.5F, 0.1055F, -1.0608F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(1.0936F, -9.2031F, 0.3973F, -0.0218F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(96, 12).addBox(-0.5F, -0.3784F, -0.1333F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0449F, 9.0715F, 0.234F, 0.167F, 0.0552F));

		PartDefinition cube_r167 = tail5.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(154, 44).addBox(0.0F, -0.3F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(154, 41).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.8536F, 0.6337F, 0.1396F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(67, 46).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1793F, 5.7177F, 0.2531F, 0.0F, 0.0F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(18, 118).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0092F, 7.8474F, -0.1222F, 0.0F, 0.0F));

		PartDefinition leftPlate13 = tail5.addOrReplaceChild("leftPlate13", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2263F, -0.2592F, 3.9083F, -0.4945F, -0.3232F, 1.1345F));

		PartDefinition cube_r168 = leftPlate13.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(59, 84).addBox(-0.5F, -9.3298F, -0.0228F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0936F, -8.9031F, 0.0973F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r169 = leftPlate13.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(54, 84).addBox(-0.5F, 0.1055F, -1.0608F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.0936F, -18.2031F, 1.5973F, -0.0044F, 0.0F, 0.0F));

		PartDefinition rightPlate13 = tail5.addOrReplaceChild("rightPlate13", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2263F, -0.2592F, 3.9083F, -0.4945F, 0.3232F, -1.1345F));

		PartDefinition cube_r170 = rightPlate13.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(59, 84).mirror().addBox(-0.5F, -9.3298F, -0.0228F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0936F, -8.9031F, 0.0973F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r171 = rightPlate13.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(54, 84).mirror().addBox(-0.5F, 0.1055F, -1.0608F, 1.0F, 18.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.0936F, -18.2031F, 1.5973F, -0.0044F, 0.0F, 0.0F));

		PartDefinition leftPlate18 = tail5.addOrReplaceChild("leftPlate18", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2092F, -0.9643F, 9.4739F, -0.8733F, -0.2303F, 1.2428F));

		PartDefinition cube_r172 = leftPlate18.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(10, 100).addBox(-0.5F, -9.3298F, -0.0228F, 1.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0936F, -5.9031F, 0.0973F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r173 = leftPlate18.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(46, 99).addBox(-0.5F, 0.1055F, -1.0608F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.0936F, -15.2031F, 1.5973F, 0.0087F, 0.0F, 0.0F));

		PartDefinition rightPlate18 = tail5.addOrReplaceChild("rightPlate18", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2092F, -0.9643F, 9.4739F, -0.8733F, 0.2303F, -1.2428F));

		PartDefinition cube_r174 = rightPlate18.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(10, 100).mirror().addBox(-0.5F, -9.3298F, -0.0228F, 1.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0936F, -5.9031F, 0.0973F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r175 = rightPlate18.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(46, 99).mirror().addBox(-0.5F, 0.1055F, -1.0608F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.0936F, -15.2031F, 1.5973F, 0.0087F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7594F, -6.9171F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r176 = body2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(131, 142).addBox(0.0F, -4.5F, -0.1F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3747F, -2.0108F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r177 = body2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(128, 142).addBox(0.0F, -4.4F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2913F, -4.1115F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r178 = body2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(125, 142).addBox(-0.5F, -4.4893F, 0.0354F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0747F, -6.1227F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r179 = body2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(86, 24).addBox(-1.0F, -1.8893F, 2.3354F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, 2.0294F, -8.2369F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r180 = body2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(8, 152).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.0276F, -3.9453F, 0.3496F, 0.3688F, 1.9754F));

		PartDefinition cube_r181 = body2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(98, 145).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.0276F, -3.9453F, -0.3152F, 0.4191F, 0.4852F));

		PartDefinition cube_r182 = body2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(28, 153).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.0724F, -5.9453F, 0.2565F, 0.1509F, 1.9513F));

		PartDefinition cube_r183 = body2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(80, 145).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.0724F, -5.9453F, -0.0973F, 0.3008F, 0.5624F));

		PartDefinition cube_r184 = body2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(25, 153).mirror().addBox(-3.4468F, 3.1437F, -0.2288F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.0724F, -5.9453F, -0.2167F, 0.2314F, 0.1155F));

		PartDefinition cube_r185 = body2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(8, 152).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.0276F, -3.9453F, 0.3496F, -0.3688F, -1.9754F));

		PartDefinition cube_r186 = body2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(98, 145).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.0276F, -3.9453F, -0.3152F, -0.4191F, -0.4852F));

		PartDefinition cube_r187 = body2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(28, 153).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.0724F, -5.9453F, 0.2565F, -0.1509F, -1.9513F));

		PartDefinition cube_r188 = body2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(80, 145).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.0724F, -5.9453F, -0.0973F, -0.3008F, -0.5624F));

		PartDefinition cube_r189 = body2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(25, 153).addBox(3.4468F, 3.1437F, -0.2288F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.0724F, -5.9453F, -0.2167F, -0.2314F, -0.1155F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.6544F, -5.9869F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r190 = body3.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(24, 147).mirror().addBox(-3.4468F, 3.1437F, -0.2288F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, 0.0431F, -1.7084F, -0.0043F, 0.2024F, 0.1614F));

		PartDefinition cube_r191 = body3.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(99, 59).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, 0.0431F, -1.7084F, 0.0826F, 0.185F, 0.6058F));

		PartDefinition cube_r192 = body3.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(22, 153).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, 0.0431F, -1.7084F, 0.1791F, -0.0438F, 1.9472F));

		PartDefinition cube_r193 = body3.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(14, 153).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, 0.6431F, -3.7084F, 0.1338F, -0.1573F, 1.9517F));

		PartDefinition cube_r194 = body3.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(146, 145).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, 0.6431F, -3.7084F, 0.1837F, 0.1146F, 0.6209F));

		PartDefinition cube_r195 = body3.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(42, 55).mirror().addBox(-3.4468F, 3.1437F, -0.2288F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, 0.6431F, -3.7084F, 0.1183F, 0.1813F, 0.1848F));

		PartDefinition cube_r196 = body3.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(24, 147).addBox(3.4468F, 3.1437F, -0.2288F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, 0.0431F, -1.7084F, -0.0043F, -0.2024F, -0.1614F));

		PartDefinition cube_r197 = body3.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(99, 59).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, 0.0431F, -1.7084F, 0.0826F, -0.185F, -0.6058F));

		PartDefinition cube_r198 = body3.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(22, 153).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, 0.0431F, -1.7084F, 0.1791F, 0.0438F, -1.9472F));

		PartDefinition cube_r199 = body3.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(14, 153).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, 0.6431F, -3.7084F, 0.1338F, 0.1573F, -1.9517F));

		PartDefinition cube_r200 = body3.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(146, 145).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, 0.6431F, -3.7084F, 0.1837F, -0.1146F, -0.6209F));

		PartDefinition cube_r201 = body3.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(42, 55).addBox(3.4468F, 3.1437F, -0.2288F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, 0.6431F, -3.7084F, 0.1183F, -0.1813F, -0.1848F));

		PartDefinition cube_r202 = body3.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(122, 142).addBox(-0.5F, -4.5007F, -0.0096F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1793F, -2.0222F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r203 = body3.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(112, 142).addBox(-0.5F, -4.7006F, -0.0096F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4562F, -3.9395F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r204 = body3.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(103, 32).addBox(-1.0F, -1.1007F, -0.4096F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.6F, -4.2F, 0.2705F, 0.0F, 0.0F));

		PartDefinition leftPlate19 = body3.addOrReplaceChild("leftPlate19", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6F, -5.647F, -4.5847F, -0.0161F, 0.3258F, 0.1807F));

		PartDefinition cube_r205 = leftPlate19.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(79, 84).addBox(-0.5F, -0.3333F, -0.4228F, 1.0F, 9.0F, 4.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-0.2372F, -6.9866F, -2.0615F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r206 = leftPlate19.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(88, 126).addBox(-0.5F, -0.3118F, -2.5957F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.2372F, -9.393F, 0.7873F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r207 = leftPlate19.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(64, 135).addBox(-0.5F, -0.2238F, -1.8743F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-0.2372F, -11.693F, -0.4127F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r208 = leftPlate19.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(131, 56).addBox(-0.5F, -0.3054F, -0.2413F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.2372F, -10.493F, -1.8127F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r209 = leftPlate19.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(148, 126).addBox(-0.5F, -0.1909F, -0.678F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.178F)), PartPose.offsetAndRotation(-0.2372F, -11.693F, -0.5127F, -0.6458F, 0.0F, 0.0F));

		PartDefinition rightPlate19 = body3.addOrReplaceChild("rightPlate19", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6F, -5.647F, -4.5847F, -0.0161F, -0.3258F, -0.1807F));

		PartDefinition cube_r210 = rightPlate19.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(79, 84).mirror().addBox(-0.5F, -0.3333F, -0.4228F, 1.0F, 9.0F, 4.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(0.2372F, -6.9866F, -2.0615F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r211 = rightPlate19.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(88, 126).mirror().addBox(-0.5F, -0.3118F, -2.5957F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.2372F, -9.393F, 0.7873F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r212 = rightPlate19.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(64, 135).mirror().addBox(-0.5F, -0.2238F, -1.8743F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(0.2372F, -11.693F, -0.4127F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r213 = rightPlate19.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(131, 56).mirror().addBox(-0.5F, -0.3054F, -0.2413F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.2372F, -10.493F, -1.8127F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r214 = rightPlate19.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(148, 126).mirror().addBox(-0.5F, -0.1909F, -0.678F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.178F)).mirror(false), PartPose.offsetAndRotation(0.2372F, -11.693F, -0.5127F, -0.6458F, 0.0F, 0.0F));

		PartDefinition leftPlate31 = body3.addOrReplaceChild("leftPlate31", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5198F, -7.2435F, -0.4459F, -0.1033F, 0.3258F, 0.1807F));

		PartDefinition cube_r215 = leftPlate31.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(43, 84).addBox(-0.5F, -0.3333F, -0.4228F, 1.0F, 10.0F, 4.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-0.2372F, -6.9867F, -2.0615F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r216 = leftPlate31.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(127, 111).addBox(-0.5F, -0.3118F, -2.5957F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.2372F, -9.3931F, 0.7873F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r217 = leftPlate31.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(52, 134).addBox(-0.5F, -0.2238F, -1.8743F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-0.2372F, -11.693F, -0.4127F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r218 = leftPlate31.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(7, 130).addBox(-0.5F, -0.3054F, -0.2413F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.2372F, -10.4931F, -1.8127F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r219 = leftPlate31.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(147, 0).addBox(-0.5F, -0.1909F, -0.678F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.178F)), PartPose.offsetAndRotation(-0.2372F, -11.693F, -0.5127F, -0.6458F, 0.0F, 0.0F));

		PartDefinition rightPlate31 = body3.addOrReplaceChild("rightPlate31", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5198F, -7.2435F, -0.4459F, -0.1033F, -0.3258F, -0.1807F));

		PartDefinition cube_r220 = rightPlate31.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(43, 84).mirror().addBox(-0.5F, -0.3333F, -0.4228F, 1.0F, 10.0F, 4.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(0.2372F, -6.9867F, -2.0615F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r221 = rightPlate31.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(127, 111).mirror().addBox(-0.5F, -0.3118F, -2.5957F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.2372F, -9.3931F, 0.7873F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r222 = rightPlate31.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(52, 134).mirror().addBox(-0.5F, -0.2238F, -1.8743F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(0.2372F, -11.693F, -0.4127F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r223 = rightPlate31.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(7, 130).mirror().addBox(-0.5F, -0.3054F, -0.2413F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.2372F, -10.4931F, -1.8127F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r224 = rightPlate31.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(147, 0).mirror().addBox(-0.5F, -0.1909F, -0.678F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.178F)).mirror(false), PartPose.offsetAndRotation(0.2372F, -11.693F, -0.5127F, -0.6458F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5974F, -4.5501F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r225 = body4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(143, 44).addBox(-0.5F, -4.8007F, -0.0096F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6859F, -1.2431F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r226 = body4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(143, 5).addBox(-0.5F, -4.9006F, -0.0096F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1514F, -3.1703F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r227 = body4.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(3, 143).addBox(0.0F, -5.0F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.385F, -5.107F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r228 = body4.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(0, 143).addBox(0.0F, -4.7F, 0.0F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.9195F, -7.0342F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r229 = body4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(53, 116).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, 0.8957F, -6.8583F, 0.3606F, 0.1316F, 0.2227F));

		PartDefinition cube_r230 = body4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(148, 120).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, 0.8957F, -6.8583F, 0.3818F, -0.0289F, 0.6294F));

		PartDefinition cube_r231 = body4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(131, 153).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, 0.8957F, -6.8583F, 0.0366F, -0.3831F, 1.9778F));

		PartDefinition cube_r232 = body4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(15, 116).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, 0.3957F, -4.9583F, 0.309F, 0.143F, 0.2157F));

		PartDefinition cube_r233 = body4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(148, 114).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, 0.3957F, -4.9583F, 0.3395F, 0.002F, 0.63F));

		PartDefinition cube_r234 = body4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(128, 153).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, 0.3957F, -4.9583F, 0.0586F, -0.335F, 1.9701F));

		PartDefinition cube_r235 = body4.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(29, 106).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, -0.1543F, -2.9583F, 0.2399F, 0.1576F, 0.2053F));

		PartDefinition cube_r236 = body4.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(143, 145).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, -0.1543F, -2.9583F, 0.283F, 0.0431F, 0.6287F));

		PartDefinition cube_r237 = body4.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(153, 126).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, -0.1543F, -2.9583F, 0.0867F, -0.2705F, 1.9617F));

		PartDefinition cube_r238 = body4.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(29, 121).mirror().addBox(-3.4468F, 3.1437F, -0.2288F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, -0.5543F, -1.0583F, 0.1879F, 0.1681F, 0.1969F));

		PartDefinition cube_r239 = body4.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(101, 145).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, -0.5543F, -1.0583F, 0.2406F, 0.0738F, 0.6263F));

		PartDefinition cube_r240 = body4.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(125, 153).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0064F, -0.5543F, -1.0583F, 0.1072F, -0.2221F, 1.9567F));

		PartDefinition cube_r241 = body4.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(131, 153).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, 0.8957F, -6.8583F, 0.0366F, 0.3831F, -1.9778F));

		PartDefinition cube_r242 = body4.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(148, 120).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, 0.8957F, -6.8583F, 0.3818F, 0.0289F, -0.6294F));

		PartDefinition cube_r243 = body4.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(53, 116).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, 0.8957F, -6.8583F, 0.3606F, -0.1316F, -0.2227F));

		PartDefinition cube_r244 = body4.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(128, 153).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, 0.3957F, -4.9583F, 0.0586F, 0.335F, -1.9701F));

		PartDefinition cube_r245 = body4.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(148, 114).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, 0.3957F, -4.9583F, 0.3395F, -0.002F, -0.63F));

		PartDefinition cube_r246 = body4.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(15, 116).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, 0.3957F, -4.9583F, 0.309F, -0.143F, -0.2157F));

		PartDefinition cube_r247 = body4.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(153, 126).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, -0.1543F, -2.9583F, 0.0867F, 0.2705F, -1.9617F));

		PartDefinition cube_r248 = body4.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(143, 145).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, -0.1543F, -2.9583F, 0.283F, -0.0431F, -0.6287F));

		PartDefinition cube_r249 = body4.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(29, 106).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, -0.1543F, -2.9583F, 0.2399F, -0.1576F, -0.2053F));

		PartDefinition cube_r250 = body4.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(125, 153).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, -0.5543F, -1.0583F, 0.1072F, 0.2221F, -1.9567F));

		PartDefinition cube_r251 = body4.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(101, 145).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, -0.5543F, -1.0583F, 0.2406F, -0.0738F, -0.6263F));

		PartDefinition cube_r252 = body4.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(29, 121).addBox(3.4468F, 3.1437F, -0.2288F, 0.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0064F, -0.5543F, -1.0583F, 0.1879F, -0.1681F, -0.1969F));

		PartDefinition cube_r253 = body4.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(15, 77).addBox(-1.0F, -1.1007F, -7.4096F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.4F, 0.2705F, 0.0F, 0.0F));

		PartDefinition leftPlate30 = body4.addOrReplaceChild("leftPlate30", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2F, -6.0589F, -6.7511F, 0.2021F, 0.3258F, 0.1807F));

		PartDefinition cube_r254 = leftPlate30.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(96, 0).addBox(-0.5F, -6.382F, -2.3125F, 1.0F, 7.0F, 4.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-0.7604F, 1.5953F, -0.4452F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r255 = leftPlate30.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(128, 95).addBox(-0.5F, -0.3118F, -2.5957F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.7604F, -6.8111F, 0.9037F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r256 = leftPlate30.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(71, 135).addBox(-0.5F, -0.2238F, -1.7743F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-0.7604F, -9.1111F, -0.2963F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r257 = leftPlate30.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(131, 70).addBox(-0.5F, -0.3054F, -0.2413F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.185F)), PartPose.offsetAndRotation(-0.7604F, -7.9111F, -1.6963F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r258 = leftPlate30.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(148, 138).addBox(-0.5F, -0.1909F, -0.678F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.7604F, -9.1111F, -0.3963F, -0.6458F, 0.0F, 0.0F));

		PartDefinition rightPlate30 = body4.addOrReplaceChild("rightPlate30", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2F, -6.0589F, -6.7511F, 0.2021F, -0.3258F, -0.1807F));

		PartDefinition cube_r259 = rightPlate30.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(96, 0).mirror().addBox(-0.5F, -6.382F, -2.3125F, 1.0F, 7.0F, 4.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(0.7604F, 1.5953F, -0.4452F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r260 = rightPlate30.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(128, 95).mirror().addBox(-0.5F, -0.3118F, -2.5957F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.7604F, -6.8111F, 0.9037F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r261 = rightPlate30.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(71, 135).mirror().addBox(-0.5F, -0.2238F, -1.7743F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(0.7604F, -9.1111F, -0.2963F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r262 = rightPlate30.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(131, 70).mirror().addBox(-0.5F, -0.3054F, -0.2413F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.185F)).mirror(false), PartPose.offsetAndRotation(0.7604F, -7.9111F, -1.6963F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r263 = rightPlate30.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(148, 138).mirror().addBox(-0.5F, -0.1909F, -0.678F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.7604F, -9.1111F, -0.3963F, -0.6458F, 0.0F, 0.0F));

		PartDefinition leftPlate20 = body4.addOrReplaceChild("leftPlate20", CubeListBuilder.create().texOffs(0, 85).addBox(-1.6692F, -7.0988F, -2.7795F, 1.0F, 8.0F, 4.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(2.3F, -5.393F, -3.3826F, 0.045F, 0.3258F, 0.1807F));

		PartDefinition cube_r264 = leftPlate20.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(127, 6).addBox(-0.5F, -0.3118F, -2.5957F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-1.1692F, -9.1451F, 0.5229F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r265 = leftPlate20.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(134, 20).addBox(-0.5F, -0.2238F, -1.7743F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-1.1692F, -11.4451F, -0.6772F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r266 = leftPlate20.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(131, 63).addBox(-0.5F, -0.4054F, -0.2687F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-1.1692F, -10.2451F, -2.0772F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r267 = leftPlate20.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(148, 134).addBox(-0.5F, -0.1909F, -0.678F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.178F)), PartPose.offsetAndRotation(-1.1692F, -11.4451F, -0.7772F, -0.6632F, 0.0F, 0.0F));

		PartDefinition rightPlate20 = body4.addOrReplaceChild("rightPlate20", CubeListBuilder.create().texOffs(0, 85).mirror().addBox(0.6692F, -7.0988F, -2.7795F, 1.0F, 8.0F, 4.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(-3.3F, -5.393F, -3.3826F, 0.045F, -0.3258F, -0.1807F));

		PartDefinition cube_r268 = rightPlate20.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(127, 6).mirror().addBox(-0.5F, -0.3118F, -2.5957F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(1.1692F, -9.1451F, 0.5229F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r269 = rightPlate20.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(134, 20).mirror().addBox(-0.5F, -0.2238F, -1.7743F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(1.1692F, -11.4451F, -0.6772F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r270 = rightPlate20.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(131, 63).mirror().addBox(-0.5F, -0.4054F, -0.2687F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(1.1692F, -10.2451F, -2.0772F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r271 = rightPlate20.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(148, 134).mirror().addBox(-0.5F, -0.1909F, -0.678F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.178F)).mirror(false), PartPose.offsetAndRotation(1.1692F, -11.4451F, -0.7772F, -0.6632F, 0.0F, 0.0F));

		PartDefinition upperbody = body4.addOrReplaceChild("upperbody", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 1.8059F, -6.692F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r272 = upperbody.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(74, 101).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.3829F, -1.8375F, 0.2973F, 0.1317F, 0.1972F));

		PartDefinition cube_r273 = upperbody.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(94, 148).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.3829F, -1.8375F, 0.3244F, -0.0037F, 0.6132F));

		PartDefinition cube_r274 = upperbody.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(107, 153).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, -0.3829F, -1.8375F, 0.0491F, -0.3215F, 1.9563F));

		PartDefinition cube_r275 = upperbody.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(38, 66).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.2671F, -3.7625F, 0.3619F, 0.1186F, 0.2053F));

		PartDefinition cube_r276 = upperbody.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(91, 148).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.2671F, -3.7625F, 0.3779F, -0.0413F, 0.612F));

		PartDefinition cube_r277 = upperbody.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(83, 153).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.2671F, -3.7625F, 0.0226F, -0.3821F, 1.9655F));

		PartDefinition cube_r278 = upperbody.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(85, 116).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.8671F, -5.6125F, 0.4264F, 0.1051F, 0.2125F));

		PartDefinition cube_r279 = upperbody.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(88, 148).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.8671F, -5.6125F, 0.4317F, -0.0789F, 0.6087F));

		PartDefinition cube_r280 = upperbody.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(68, 153).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5064F, 0.8671F, -5.6125F, -0.0052F, -0.4424F, 1.9766F));

		PartDefinition cube_r281 = upperbody.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(74, 101).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.3829F, -1.8375F, 0.2973F, -0.1317F, -0.1972F));

		PartDefinition cube_r282 = upperbody.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(94, 148).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.3829F, -1.8375F, 0.3244F, 0.0037F, -0.6132F));

		PartDefinition cube_r283 = upperbody.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(107, 153).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, -0.3829F, -1.8375F, 0.0491F, 0.3215F, -1.9563F));

		PartDefinition cube_r284 = upperbody.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(38, 66).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.2671F, -3.7625F, 0.3619F, -0.1186F, -0.2053F));

		PartDefinition cube_r285 = upperbody.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(91, 148).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.2671F, -3.7625F, 0.3779F, 0.0413F, -0.612F));

		PartDefinition cube_r286 = upperbody.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(83, 153).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.2671F, -3.7625F, 0.0226F, 0.3821F, -1.9655F));

		PartDefinition cube_r287 = upperbody.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(85, 116).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.8671F, -5.6125F, 0.4264F, -0.1051F, -0.2125F));

		PartDefinition cube_r288 = upperbody.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(88, 148).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.8671F, -5.6125F, 0.4317F, 0.0789F, -0.6087F));

		PartDefinition cube_r289 = upperbody.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(68, 153).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5064F, 0.8671F, -5.6125F, -0.0052F, 0.4424F, -1.9766F));

		PartDefinition cube_r290 = upperbody.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(145, 61).addBox(-0.5F, -4.7553F, 0.0204F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2397F, -2.0572F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r291 = upperbody.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(41, 145).addBox(-0.5F, -4.4553F, -0.0796F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2362F, -3.8994F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r292 = upperbody.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(63, 46).addBox(-0.5F, -4.0803F, -0.9796F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.567F, -4.9485F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r293 = upperbody.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(86, 41).addBox(-1.0F, -0.7053F, 1.6204F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, 2.0165F, -7.2176F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftPlate21 = upperbody.addOrReplaceChild("leftPlate21", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, -3.679F, -5.8388F, 0.1847F, 0.3258F, 0.1807F));

		PartDefinition cube_r294 = leftPlate21.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(60, 106).addBox(-0.5F, -0.3333F, -0.4228F, 1.0F, 7.0F, 3.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.7604F, -6.4047F, -1.9452F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r295 = leftPlate21.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(108, 125).addBox(-0.519F, -0.2425F, -1.8205F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.7414F, -5.3265F, 1.2955F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r296 = leftPlate21.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(7, 137).addBox(-0.5F, -0.3118F, -1.5957F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.7604F, -6.8111F, 0.9037F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r297 = leftPlate21.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(78, 135).addBox(-0.5F, -0.2238F, -1.7743F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.7604F, -9.1111F, -0.2963F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r298 = leftPlate21.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(136, 118).addBox(-0.5F, -0.4054F, -0.2895F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.189F)), PartPose.offsetAndRotation(-0.7604F, -7.9111F, -1.6963F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r299 = leftPlate21.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(12, 149).addBox(-0.5F, -0.1909F, -0.678F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.7604F, -9.1111F, -0.3963F, -0.6458F, 0.0F, 0.0F));

		PartDefinition rightPlate21 = upperbody.addOrReplaceChild("rightPlate21", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, -3.679F, -5.8388F, 0.1847F, -0.3258F, -0.1807F));

		PartDefinition cube_r300 = rightPlate21.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(60, 106).mirror().addBox(-0.5F, -0.3333F, -0.4228F, 1.0F, 7.0F, 3.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.7604F, -6.4047F, -1.9452F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r301 = rightPlate21.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(108, 125).mirror().addBox(-0.481F, -0.2425F, -1.8205F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.7414F, -5.3265F, 1.2955F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r302 = rightPlate21.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(7, 137).mirror().addBox(-0.5F, -0.3118F, -1.5957F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.7604F, -6.8111F, 0.9037F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r303 = rightPlate21.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(78, 135).mirror().addBox(-0.5F, -0.2238F, -1.7743F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.7604F, -9.1111F, -0.2963F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r304 = rightPlate21.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(136, 118).mirror().addBox(-0.5F, -0.4054F, -0.2895F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.189F)).mirror(false), PartPose.offsetAndRotation(0.7604F, -7.9111F, -1.6963F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r305 = rightPlate21.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(12, 149).mirror().addBox(-0.5F, -0.1909F, -0.678F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.7604F, -9.1111F, -0.3963F, -0.6458F, 0.0F, 0.0F));

		PartDefinition leftPlate29 = upperbody.addOrReplaceChild("leftPlate29", CubeListBuilder.create(), PartPose.offsetAndRotation(2.1F, -5.9384F, -3.107F, 0.0538F, 0.3258F, 0.1807F));

		PartDefinition cube_r306 = leftPlate29.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(90, 84).addBox(-0.5F, -0.3333F, -0.5228F, 1.0F, 8.0F, 4.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-0.7604F, -6.4047F, -1.9452F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r307 = leftPlate29.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(115, 132).addBox(-0.5F, -0.2238F, -1.7743F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.7604F, -9.1111F, -0.2963F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r308 = leftPlate29.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(32, 129).addBox(-0.5F, -0.4054F, -0.3413F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.187F)), PartPose.offsetAndRotation(-0.7604F, -7.9111F, -1.6963F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r309 = leftPlate29.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(149, 4).addBox(-0.5F, -0.1909F, -0.678F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.7604F, -9.1111F, -0.3963F, -0.6632F, 0.0F, 0.0F));

		PartDefinition rightPlate29 = upperbody.addOrReplaceChild("rightPlate29", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.1F, -5.9384F, -3.107F, 0.0538F, -0.3258F, -0.1807F));

		PartDefinition cube_r310 = rightPlate29.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(90, 84).mirror().addBox(-0.5F, -0.3333F, -0.5228F, 1.0F, 8.0F, 4.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(0.7604F, -6.4047F, -1.9452F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r311 = rightPlate29.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(115, 132).mirror().addBox(-0.5F, -0.2238F, -1.7743F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.7604F, -9.1111F, -0.2963F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r312 = rightPlate29.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(32, 129).mirror().addBox(-0.5F, -0.4054F, -0.3413F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.187F)).mirror(false), PartPose.offsetAndRotation(0.7604F, -7.9111F, -1.6963F, -0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r313 = rightPlate29.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(149, 4).mirror().addBox(-0.5F, -0.1909F, -0.678F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.7604F, -9.1111F, -0.3963F, -0.6632F, 0.0F, 0.0F));

		PartDefinition chest = upperbody.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3936F, 2.0346F, -5.1865F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r314 = chest.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(77, 9).mirror().addBox(-0.5F, 0.0F, 0.9F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.15F, 15.4876F, 0.4222F, -0.2437F, -0.7548F, 0.6056F));

		PartDefinition cube_r315 = chest.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(77, 0).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.15F, 15.4876F, 0.4222F, -0.2877F, -0.8383F, 0.6428F));

		PartDefinition cube_r316 = chest.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(67, 56).mirror().addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.15F, 15.4876F, 0.4222F, -0.366F, -0.9369F, 0.6988F));

		PartDefinition cube_r317 = chest.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(85, 65).mirror().addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.15F, 15.4876F, 0.4222F, -0.488F, -1.0552F, 0.8023F));

		PartDefinition cube_r318 = chest.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(140, 142).mirror().addBox(-3.4468F, 3.1437F, -0.2288F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1129F, 1.1324F, -7.726F, 0.5491F, 0.0997F, 0.0505F));

		PartDefinition cube_r319 = chest.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(148, 36).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1129F, 1.1324F, -7.726F, 0.5434F, -0.1297F, 0.4226F));

		PartDefinition cube_r320 = chest.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(47, 153).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1129F, 1.1324F, -7.726F, -0.0382F, -0.5611F, 1.818F));

		PartDefinition cube_r321 = chest.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(106, 140).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1129F, 0.4324F, -5.926F, 0.4439F, 0.1044F, 0.0398F));

		PartDefinition cube_r322 = chest.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(148, 17).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1129F, 0.4324F, -5.926F, 0.4475F, -0.0862F, 0.4329F));

		PartDefinition cube_r323 = chest.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(37, 153).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1129F, 0.4324F, -5.926F, -0.0097F, -0.4593F, 1.804F));

		PartDefinition cube_r324 = chest.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(49, 135).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1129F, -0.0676F, -4.026F, 0.3387F, 0.108F, 0.1508F));

		PartDefinition cube_r325 = chest.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(148, 11).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1129F, -0.0676F, -4.026F, 0.3524F, -0.0419F, 0.5612F));

		PartDefinition cube_r326 = chest.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(34, 153).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1129F, -0.0676F, -4.026F, 0.0161F, -0.3573F, 1.9159F));

		PartDefinition cube_r327 = chest.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(82, 123).mirror().addBox(-3.4468F, 3.1438F, -0.2288F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1129F, -0.7676F, -2.026F, 0.2509F, 0.11F, 0.1936F));

		PartDefinition cube_r328 = chest.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(27, 147).mirror().addBox(-1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1129F, -0.7676F, -2.026F, 0.2735F, -0.0048F, 0.6154F));

		PartDefinition cube_r329 = chest.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(31, 153).mirror().addBox(-0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1129F, -0.7676F, -2.026F, 0.0361F, -0.2722F, 1.9621F));

		PartDefinition cube_r330 = chest.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(77, 9).addBox(-0.5F, 0.0F, 0.9F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6372F, 15.4876F, 0.4222F, -0.2437F, 0.7548F, -0.6056F));

		PartDefinition cube_r331 = chest.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(77, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6372F, 15.4876F, 0.4222F, -0.2877F, 0.8383F, -0.6428F));

		PartDefinition cube_r332 = chest.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(67, 56).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6372F, 15.4876F, 0.4222F, -0.366F, 0.9369F, -0.6988F));

		PartDefinition cube_r333 = chest.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(85, 65).addBox(-0.5F, 0.0F, -0.1F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6372F, 15.4876F, 0.4222F, -0.488F, 1.0552F, -0.8023F));

		PartDefinition cube_r334 = chest.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(131, 0).addBox(-0.5F, -0.9F, 0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.3936F, 15.5144F, -1.673F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r335 = chest.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(23, 44).addBox(-1.0F, -1.0F, -9.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.2936F, 15.6425F, -1.6132F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r336 = chest.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(19, 66).addBox(-1.0F, -0.7053F, -6.3796F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.8936F, -0.1506F, -1.7052F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r337 = chest.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(140, 142).addBox(3.4468F, 3.1437F, -0.2288F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.1324F, -7.726F, 0.5491F, -0.0997F, -0.0505F));

		PartDefinition cube_r338 = chest.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(148, 36).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.1324F, -7.726F, 0.5434F, 0.1297F, -0.4226F));

		PartDefinition cube_r339 = chest.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(47, 153).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 1.1324F, -7.726F, -0.0382F, 0.5611F, -1.818F));

		PartDefinition cube_r340 = chest.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(106, 140).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4324F, -5.926F, 0.4439F, -0.1044F, -0.0398F));

		PartDefinition cube_r341 = chest.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(148, 17).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4324F, -5.926F, 0.4475F, 0.0862F, -0.4329F));

		PartDefinition cube_r342 = chest.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(37, 153).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, 0.4324F, -5.926F, -0.0097F, 0.4593F, -1.804F));

		PartDefinition cube_r343 = chest.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(49, 135).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.0676F, -4.026F, 0.3387F, -0.108F, -0.1508F));

		PartDefinition cube_r344 = chest.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(148, 11).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.0676F, -4.026F, 0.3524F, 0.0419F, -0.5612F));

		PartDefinition cube_r345 = chest.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(34, 153).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.0676F, -4.026F, 0.0161F, 0.3573F, -1.9159F));

		PartDefinition cube_r346 = chest.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(82, 123).addBox(3.4468F, 3.1438F, -0.2288F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.7676F, -2.026F, 0.2509F, -0.11F, -0.1936F));

		PartDefinition cube_r347 = chest.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(27, 147).addBox(1.788F, 0.3285F, -0.2261F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.7676F, -2.026F, 0.2735F, 0.0048F, -0.6154F));

		PartDefinition cube_r348 = chest.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(31, 153).addBox(0.0218F, -0.1722F, -0.1801F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.7676F, -2.026F, 0.0361F, 0.2722F, -1.9621F));

		PartDefinition cube_r349 = chest.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(59, 142).addBox(-0.5F, -4.2053F, -0.0796F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8936F, 1.267F, -7.8639F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r350 = chest.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(137, 142).addBox(0.5F, -4.2053F, -0.0796F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1064F, -0.728F, -2.2018F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r351 = chest.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(45, 141).addBox(-0.5F, -4.4053F, 0.0204F, 0.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8936F, 0.6003F, -6.0819F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r352 = chest.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(134, 142).addBox(-0.5F, -4.3053F, 0.0204F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8936F, -0.0965F, -4.2046F, 0.192F, 0.0F, 0.0F));

		PartDefinition frontleftleg2 = chest.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(7.2335F, 8.6259F, -2.5178F, 0.396F, -0.0552F, -0.1188F));

		PartDefinition cube_r353 = frontleftleg2.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(116, 27).addBox(-1.0F, 6.8603F, -0.8828F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, 4.7991F, 0.0926F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r354 = frontleftleg2.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(101, 20).addBox(-1.0F, -2.0F, -1.85F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-0.5F, 5.4868F, -0.581F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r355 = frontleftleg2.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(0, 48).addBox(-1.0034F, -2.4331F, -2.2516F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.5F, 1.5991F, -0.8074F, -2.2777F, 0.0F, 0.0F));

		PartDefinition frontleftleg3 = frontleftleg2.addOrReplaceChild("frontleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2103F, 15.055F, -3.5134F, -1.1404F, 0.07F, 0.1047F));

		PartDefinition cube_r356 = frontleftleg3.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(111, 7).addBox(-0.7F, -2.8F, 0.3F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3351F, 2.7441F, -2.2153F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r357 = frontleftleg3.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(42, 116).addBox(-1.0F, -1.2F, 0.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.3351F, -0.1826F, -0.5701F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r358 = frontleftleg3.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(69, 87).addBox(-1.0F, -4.0F, -0.9F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.3351F, 4.2385F, 0.8673F, 0.1942F, 0.0238F, 0.0046F));

		PartDefinition cube_r359 = frontleftleg3.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(127, 118).addBox(0.4996F, -2.2987F, -1.8189F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.8348F, 0.2198F, 2.1143F, 0.2008F, -0.0041F, 0.0035F));

		PartDefinition cube_r360 = frontleftleg3.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(103, 134).addBox(0.4996F, -2.2987F, -0.9189F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8348F, 3.1428F, 1.9536F, -0.192F, 0.0F, 0.0F));

		PartDefinition frontleftleg4 = frontleftleg3.addOrReplaceChild("frontleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.312F, 12.3645F, 0.9587F, 0.2435F, -0.2124F, -0.0884F));

		PartDefinition cube_r361 = frontleftleg4.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(128, 108).addBox(-1.1F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1613F, 1.5265F, -0.5689F, 0.189F, 0.3463F, 0.5131F));

		PartDefinition cube_r362 = frontleftleg4.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(139, 79).addBox(-0.3F, -2.1F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-2.3179F, 1.6268F, -1.1068F, -1.0401F, 0.422F, 0.2359F));

		PartDefinition cube_r363 = frontleftleg4.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(31, 141).addBox(-1.0F, 0.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4179F, 1.0265F, 0.0463F, -1.0893F, -0.0774F, -0.0404F));

		PartDefinition cube_r364 = frontleftleg4.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(85, 133).addBox(-1.5F, -2.4F, -0.525F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4179F, 1.0265F, -0.4537F, -0.4363F, 0.0F, 0.0F));

		PartDefinition frontrightleg2 = chest.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.4463F, 8.6259F, -2.5178F, 0.8759F, 0.0552F, 0.1188F));

		PartDefinition cube_r365 = frontrightleg2.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(117, 97).addBox(-1.0F, 6.8603F, -0.8828F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 4.7991F, 0.0926F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r366 = frontrightleg2.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(20, 106).addBox(-1.0F, -2.0F, -1.85F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(0.5F, 5.4868F, -0.581F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r367 = frontrightleg2.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(46, 53).addBox(-0.9966F, -2.4331F, -2.2516F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5F, 1.5991F, -0.8074F, -2.2777F, 0.0F, 0.0F));

		PartDefinition frontrightleg3 = frontrightleg2.addOrReplaceChild("frontrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2103F, 15.055F, -3.5134F, -0.9659F, -0.07F, -0.1047F));

		PartDefinition cube_r368 = frontrightleg3.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(5, 116).addBox(-0.3F, -2.8F, 0.3F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3351F, 2.7441F, -2.2153F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r369 = frontrightleg3.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(117, 104).addBox(-1.0F, -1.2F, 0.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3351F, -0.1826F, -0.5701F, -0.733F, 0.0F, 0.0F));

		PartDefinition cube_r370 = frontrightleg3.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(37, 99).addBox(-1.0F, -4.0F, -0.9F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.3351F, 4.2385F, 0.8673F, 0.1942F, -0.0238F, -0.0046F));

		PartDefinition cube_r371 = frontrightleg3.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(130, 77).addBox(-2.4996F, -2.2987F, -1.8189F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8348F, 0.2198F, 2.1143F, 0.2008F, 0.0041F, -0.0035F));

		PartDefinition cube_r372 = frontrightleg3.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(136, 5).addBox(-2.4996F, -2.2987F, -0.9189F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8348F, 3.1428F, 1.9536F, -0.192F, 0.0F, 0.0F));

		PartDefinition frontrightleg4 = frontrightleg3.addOrReplaceChild("frontrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.312F, 12.3645F, 0.9587F, 0.5053F, 0.2124F, 0.0884F));

		PartDefinition cube_r373 = frontrightleg4.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(141, 127).addBox(-0.9F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1613F, 1.5265F, -0.5689F, 0.189F, -0.3463F, -0.5131F));

		PartDefinition cube_r374 = frontrightleg4.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(115, 139).addBox(-1.7F, -2.1F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.3179F, 1.6268F, -1.1068F, -1.0401F, -0.422F, -0.2359F));

		PartDefinition cube_r375 = frontrightleg4.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(141, 123).addBox(-1.0F, 0.8F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4179F, 1.0265F, 0.0463F, -1.0893F, 0.0774F, 0.0404F));

		PartDefinition cube_r376 = frontrightleg4.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(94, 133).addBox(-1.5F, -2.4F, -0.525F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4179F, 1.0265F, -0.4537F, -0.4363F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.4391F, -1.3177F, 2.3661F, -0.2161F, -0.0301F, -0.1364F));

		PartDefinition cube_r377 = bone2.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(0, 60).addBox(0.8F, -6.2929F, 5.8125F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.325F, 10.4F, -2.4F, 0.3665F, 0.0F, -0.192F));

		PartDefinition cube_r378 = bone2.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(121, 79).addBox(0.8F, -8.6426F, 11.2933F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.325F, 10.4F, -2.4F, 0.4625F, 0.0F, -0.192F));

		PartDefinition cube_r379 = bone2.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(90, 97).addBox(0.8F, -5.9501F, 8.0915F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.325F, 10.4F, -2.4F, 0.6807F, 0.0F, -0.192F));

		PartDefinition cube_r380 = bone2.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(64, 74).addBox(-1.0F, 0.825F, -4.55F, 1.0F, 6.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.9938F, 9.7251F, -5.1572F, 0.1372F, 0.4256F, 0.7448F));

		PartDefinition cube_r381 = bone2.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(69, 24).addBox(-1.0F, 0.0F, -3.5F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9938F, 9.7251F, -5.1572F, -0.3864F, 0.4256F, 0.7448F));

		PartDefinition cube_r382 = bone2.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(0, 71).addBox(-0.8637F, -5.631F, -6.4792F, 1.0F, 7.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.325F, 10.4F, -2.4F, -0.574F, 0.1685F, 0.0737F));

		PartDefinition cube_r383 = bone2.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(101, 41).addBox(-0.8637F, -4.1481F, -1.3906F, 1.0F, 5.0F, 4.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(1.325F, 10.4F, -2.4F, 0.0805F, 0.1685F, 0.0737F));

		PartDefinition cube_r384 = bone2.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(96, 73).addBox(0.8F, -4.763F, 3.8337F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.325F, 10.4F, -2.4F, 0.8203F, 0.0F, -0.192F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.652F, -1.3177F, 2.3661F, -0.2161F, 0.0301F, 0.1364F));

		PartDefinition cube_r385 = bone4.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-1.8F, -6.2929F, 5.8125F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 10.4F, -2.4F, 0.3665F, 0.0F, 0.192F));

		PartDefinition cube_r386 = bone4.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(121, 79).mirror().addBox(-1.8F, -8.6426F, 11.2933F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 10.4F, -2.4F, 0.4625F, 0.0F, 0.192F));

		PartDefinition cube_r387 = bone4.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(90, 97).mirror().addBox(-1.8F, -5.9501F, 8.0915F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 10.4F, -2.4F, 0.6807F, 0.0F, 0.192F));

		PartDefinition cube_r388 = bone4.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(64, 74).mirror().addBox(0.0F, 0.825F, -4.55F, 1.0F, 6.0F, 6.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.9938F, 9.7251F, -5.1572F, 0.1372F, -0.4256F, -0.7448F));

		PartDefinition cube_r389 = bone4.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(69, 24).mirror().addBox(0.0F, 0.0F, -3.5F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9938F, 9.7251F, -5.1572F, -0.3864F, -0.4256F, -0.7448F));

		PartDefinition cube_r390 = bone4.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(0, 71).mirror().addBox(-0.1363F, -5.631F, -6.4792F, 1.0F, 7.0F, 6.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 10.4F, -2.4F, -0.574F, -0.1685F, -0.0737F));

		PartDefinition cube_r391 = bone4.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(101, 41).mirror().addBox(-0.1363F, -4.1481F, -1.3906F, 1.0F, 5.0F, 4.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 10.4F, -2.4F, 0.0805F, -0.1685F, -0.0737F));

		PartDefinition cube_r392 = bone4.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(96, 73).mirror().addBox(-1.8F, -4.763F, 3.8337F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.325F, 10.4F, -2.4F, 0.8203F, 0.0F, 0.192F));

		PartDefinition leftPlate23 = chest.addOrReplaceChild("leftPlate23", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3125F, -4.4156F, -7.6038F, 0.2411F, 0.4443F, 0.2922F));

		PartDefinition cube_r393 = leftPlate23.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(127, 13).addBox(-0.5F, -0.3845F, -0.4083F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0792F, -1.6662F, -1.1893F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r394 = leftPlate23.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(137, 98).addBox(-0.5F, -0.9F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.225F)), PartPose.offsetAndRotation(-0.0792F, -2.4621F, -0.1444F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r395 = leftPlate23.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(143, 140).addBox(-0.5F, -0.5238F, -0.7993F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.0792F, -4.0726F, 0.0596F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r396 = leftPlate23.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(143, 135).addBox(-0.5F, -1.8485F, -0.2172F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.0792F, -2.6726F, -1.0404F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightPlate23 = chest.addOrReplaceChild("rightPlate23", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5253F, -4.4156F, -7.6038F, 0.2411F, -0.4443F, -0.2922F));

		PartDefinition cube_r397 = rightPlate23.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(127, 13).mirror().addBox(-0.5F, -0.3845F, -0.4083F, 1.0F, 3.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0792F, -1.6662F, -1.1893F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r398 = rightPlate23.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(137, 98).mirror().addBox(-0.5F, -0.9F, -0.9F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.225F)).mirror(false), PartPose.offsetAndRotation(0.0792F, -2.4621F, -0.1444F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r399 = rightPlate23.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(143, 140).mirror().addBox(-0.5F, -0.5238F, -0.7993F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.0792F, -4.0726F, 0.0596F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r400 = rightPlate23.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(143, 135).mirror().addBox(-0.5F, -1.8485F, -0.2172F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0792F, -2.6726F, -1.0404F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftPlate28 = chest.addOrReplaceChild("leftPlate28", CubeListBuilder.create(), PartPose.offsetAndRotation(1.6936F, -5.0685F, -4.7122F, 0.1579F, 0.3628F, 0.2583F));

		PartDefinition cube_r401 = leftPlate28.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(116, 124).addBox(-0.5F, -0.3F, -0.3F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0792F, -2.8139F, -1.5017F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r402 = leftPlate28.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(129, 32).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.0792F, -3.1358F, -0.3537F, -1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r403 = leftPlate28.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(143, 118).addBox(-0.5F, -0.2238F, -0.7743F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.0792F, -5.1726F, -0.1404F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r404 = leftPlate28.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(143, 113).addBox(-0.5F, -1.8485F, -0.2172F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.0792F, -3.7726F, -1.2404F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightPlate28 = chest.addOrReplaceChild("rightPlate28", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9064F, -5.0685F, -4.7122F, 0.1579F, -0.3628F, -0.2583F));

		PartDefinition cube_r405 = rightPlate28.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(116, 124).mirror().addBox(-0.5F, -0.3F, -0.3F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0792F, -2.8139F, -1.5017F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r406 = rightPlate28.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(129, 32).mirror().addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0792F, -3.1358F, -0.3537F, -1.5359F, 0.0F, 0.0F));

		PartDefinition cube_r407 = rightPlate28.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(143, 118).mirror().addBox(-0.5F, -0.2238F, -0.7743F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.0792F, -5.1726F, -0.1404F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r408 = rightPlate28.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(143, 113).mirror().addBox(-0.5F, -1.8485F, -0.2172F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0792F, -3.7726F, -1.2404F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftPlate22 = chest.addOrReplaceChild("leftPlate22", CubeListBuilder.create().texOffs(56, 117).addBox(-0.5792F, -3.0995F, -1.8121F, 1.0F, 5.0F, 3.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(1.9936F, -6.9258F, -2.0347F, 0.1061F, 0.3258F, 0.1807F));

		PartDefinition cube_r409 = leftPlate22.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(32, 77).addBox(-0.5F, -0.2118F, -0.7957F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.0792F, -2.9913F, 1.2491F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r410 = leftPlate22.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(137, 93).addBox(-0.5F, -1.05F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0792F, -2.9923F, -0.2989F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r411 = leftPlate22.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(143, 108).addBox(-0.5F, -0.2238F, -0.7743F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.187F)), PartPose.offsetAndRotation(-0.0792F, -5.1726F, -0.1404F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r412 = leftPlate22.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(93, 143).addBox(-0.5F, -1.8485F, -0.2172F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.189F)), PartPose.offsetAndRotation(-0.0792F, -3.7726F, -1.2404F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightPlate22 = chest.addOrReplaceChild("rightPlate22", CubeListBuilder.create().texOffs(56, 117).mirror().addBox(-0.4208F, -3.0995F, -1.8121F, 1.0F, 5.0F, 3.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-1.2064F, -6.9258F, -2.0347F, 0.1061F, -0.3258F, -0.1807F));

		PartDefinition cube_r413 = rightPlate22.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(32, 77).mirror().addBox(-0.5F, -0.2118F, -0.7957F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.0792F, -2.9913F, 1.2491F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r414 = rightPlate22.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(137, 93).mirror().addBox(-0.5F, -1.05F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0792F, -2.9923F, -0.2989F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r415 = rightPlate22.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(143, 108).mirror().addBox(-0.5F, -0.2238F, -0.7743F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.187F)).mirror(false), PartPose.offsetAndRotation(0.0792F, -5.1726F, -0.1404F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r416 = rightPlate22.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(93, 143).mirror().addBox(-0.5F, -1.8485F, -0.2172F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.189F)).mirror(false), PartPose.offsetAndRotation(0.0792F, -3.7726F, -1.2404F, -0.3491F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3936F, 1.6927F, -7.7892F, -0.1373F, 0.0F, 0.0F));

		PartDefinition cube_r417 = neck.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(148, 61).addBox(0.5F, -3.2317F, -0.0564F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2879F, -3.7993F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r418 = neck.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(77, 145).addBox(0.5F, -3.7317F, -0.0564F, 0.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.1279F, -1.843F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r419 = neck.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(74, 116).addBox(0.0F, -0.1318F, -0.1564F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.2672F, -3.7014F, 0.2094F, 0.0F, 0.0F));

		PartDefinition leftPlate26 = neck.addOrReplaceChild("leftPlate26", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2292F, -4.3797F, -2.9124F, 0.2411F, 0.4443F, 0.2922F));

		PartDefinition cube_r420 = leftPlate26.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(122, 137).addBox(-0.5F, -1.2F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0792F, -1.1662F, -0.0893F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r421 = leftPlate26.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(141, 17).addBox(-0.519F, -1.8331F, -0.4918F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.0602F, -0.688F, -0.3486F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r422 = leftPlate26.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(137, 103).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.225F)), PartPose.offsetAndRotation(-0.0792F, -2.6138F, -0.257F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r423 = leftPlate26.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(144, 93).addBox(-0.5F, -0.2238F, -0.7743F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.0792F, -4.0726F, 0.0596F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r424 = leftPlate26.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(14, 144).addBox(-0.5F, -1.8485F, -0.2172F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.0792F, -2.6726F, -1.0404F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightPlate26 = neck.addOrReplaceChild("rightPlate26", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2292F, -4.3797F, -2.9124F, 0.2411F, -0.4443F, -0.2922F));

		PartDefinition cube_r425 = rightPlate26.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(122, 137).mirror().addBox(-0.5F, -1.2F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0792F, -1.1662F, -0.0893F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r426 = rightPlate26.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(141, 17).mirror().addBox(-0.481F, -1.8331F, -0.4918F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0602F, -0.688F, -0.3486F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r427 = rightPlate26.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(137, 103).mirror().addBox(-0.5F, -0.8F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.225F)).mirror(false), PartPose.offsetAndRotation(0.0792F, -2.6138F, -0.257F, 0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r428 = rightPlate26.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(144, 93).mirror().addBox(-0.5F, -0.2238F, -0.7743F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.0792F, -4.0726F, 0.0596F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r429 = rightPlate26.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(14, 144).mirror().addBox(-0.5F, -1.8485F, -0.2172F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0792F, -2.6726F, -1.0404F, -0.3491F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6196F, -3.4561F, -0.14F, 0.1059F, 0.1206F));

		PartDefinition cube_r430 = neck2.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(62, 150).addBox(0.5F, -2.967F, -3.042F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(14, 131).addBox(0.5F, -2.767F, -1.042F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4071F, -0.9546F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r431 = neck2.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(86, 50).addBox(0.0F, -0.042F, -3.042F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.3024F, -2.9519F, 0.0524F, 0.0F, 0.0F));

		PartDefinition neck4 = neck2.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.3984F, -5.7008F, -0.1063F, 0.1736F, -0.0184F));

		PartDefinition cube_r432 = neck4.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(65, 150).addBox(0.5F, -2.15F, -1.05F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.5927F, 0.0199F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r433 = neck4.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(50, 153).addBox(0.5F, -1.75F, -1.75F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.5578F, -1.9798F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r434 = neck4.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(88, 107).addBox(0.0F, 0.05F, -1.85F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.008F))
				.texOffs(107, 65).addBox(0.0F, -0.65F, -1.85F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.2F, -0.0349F, 0.0F, 0.0F));

		PartDefinition leftPlate2 = neck4.addOrReplaceChild("leftPlate2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5068F, -4.3397F, -4.6964F, -0.1362F, 0.3226F, 0.4129F));

		PartDefinition cube_r435 = leftPlate2.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(138, 26).addBox(-0.5F, -1.2F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.019F, -0.204F, 0.4172F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r436 = leftPlate2.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(0, 138).addBox(-0.519F, -1.5331F, -0.8918F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.0F, 0.2742F, 0.1579F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r437 = leftPlate2.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(149, 46).addBox(-0.5F, 0.0762F, -1.6493F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.019F, -3.1104F, 0.5661F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r438 = leftPlate2.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(19, 145).addBox(-0.5F, -2.8238F, -0.7743F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.019F, -0.652F, 1.4126F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r439 = leftPlate2.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(149, 42).addBox(-0.5F, -1.8985F, -0.2172F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(-0.019F, -0.7603F, -0.9045F, -0.1396F, 0.0F, 0.0F));

		PartDefinition rightPlate2 = neck4.addOrReplaceChild("rightPlate2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5068F, -4.3397F, -4.6964F, -0.1362F, -0.3226F, -0.4129F));

		PartDefinition cube_r440 = rightPlate2.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(138, 26).mirror().addBox(-0.5F, -1.2F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.019F, -0.204F, 0.4172F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r441 = rightPlate2.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(0, 138).mirror().addBox(-0.481F, -1.5331F, -0.8918F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2742F, 0.1579F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r442 = rightPlate2.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(149, 46).mirror().addBox(-0.5F, 0.0762F, -1.6493F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.019F, -3.1104F, 0.5661F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r443 = rightPlate2.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(19, 145).mirror().addBox(-0.5F, -2.8238F, -0.7743F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.019F, -0.652F, 1.4126F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r444 = rightPlate2.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(149, 42).mirror().addBox(-0.5F, -1.8985F, -0.2172F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(0.019F, -0.7603F, -0.9045F, -0.1396F, 0.0F, 0.0F));

		PartDefinition leftPlate34 = neck4.addOrReplaceChild("leftPlate34", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5925F, -4.1685F, -1.403F, 0.061F, 0.2803F, 0.4136F));

		PartDefinition cube_r445 = leftPlate34.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(136, 44).addBox(-0.5F, -1.2F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, -0.1491F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r446 = leftPlate34.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(52, 140).addBox(-0.519F, -1.8331F, -0.4918F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.1739F, 0.1789F, -0.4084F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r447 = leftPlate34.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(115, 144).addBox(-0.5F, -0.2238F, -0.7743F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -3.2056F, -0.0002F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r448 = leftPlate34.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(62, 145).addBox(-0.5F, -1.8485F, -0.2171F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.1549F, -1.8056F, -1.1002F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r449 = leftPlate34.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(140, 0).addBox(-0.5F, -0.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(0.1549F, -1.6228F, -0.0626F, -0.7592F, 0.0F, 0.0F));

		PartDefinition rightPlate34 = neck4.addOrReplaceChild("rightPlate34", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5925F, -4.1685F, -1.403F, 0.061F, -0.2803F, -0.4136F));

		PartDefinition cube_r450 = rightPlate34.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(136, 44).mirror().addBox(-0.5F, -1.2F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, -0.1491F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r451 = rightPlate34.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(52, 140).mirror().addBox(-0.481F, -1.8331F, -0.4918F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.1739F, 0.1789F, -0.4084F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r452 = rightPlate34.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(115, 144).mirror().addBox(-0.5F, -0.2238F, -0.7743F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -3.2056F, -0.0002F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r453 = rightPlate34.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(62, 145).mirror().addBox(-0.5F, -1.8485F, -0.2171F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.8056F, -1.1002F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r454 = rightPlate34.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(140, 0).mirror().addBox(-0.5F, -0.9F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.6228F, -0.0626F, -0.7592F, 0.0F, 0.0F));

		PartDefinition neck3 = neck4.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.3702F, -4.806F, -0.0415F, 0.1425F, 0.1181F));

		PartDefinition cube_r455 = neck3.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(56, 153).addBox(-0.5F, -1.85F, -1.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3372F, 0.0252F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r456 = neck3.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(53, 153).addBox(-0.5F, -1.875F, -1.025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.4919F, -1.9953F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r457 = neck3.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(120, 57).addBox(-1.0F, -0.25F, -2.35F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.008F))
				.texOffs(116, 118).addBox(-1.0F, -0.65F, -2.35F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1658F, -1.7431F, -0.1134F, 0.0F, 0.0F));

		PartDefinition leftPlate3 = neck3.addOrReplaceChild("leftPlate3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8236F, -3.959F, -2.8094F, -0.1734F, 0.2446F, 0.4739F));

		PartDefinition cube_r458 = leftPlate3.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(138, 54).addBox(-0.5F, -1.275F, -1.35F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.019F, -0.204F, 0.4172F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r459 = leftPlate3.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(138, 31).addBox(-0.5F, -1.0F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.019F, -0.204F, 0.4172F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r460 = leftPlate3.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(31, 145).addBox(-0.5F, -0.1488F, -0.7493F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offsetAndRotation(-0.019F, -2.8499F, -0.1903F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r461 = leftPlate3.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(145, 26).addBox(-0.5F, -2.8238F, -0.7743F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.019F, -0.652F, 1.4126F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r462 = leftPlate3.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(149, 73).addBox(-0.5F, -0.175F, -0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(-0.019F, -2.6101F, -0.7343F, -0.144F, 0.0F, 0.0F));

		PartDefinition rightPlate3 = neck3.addOrReplaceChild("rightPlate3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8236F, -3.959F, -2.8094F, -0.1734F, -0.2446F, -0.4739F));

		PartDefinition cube_r463 = rightPlate3.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(138, 54).mirror().addBox(-0.5F, -1.275F, -1.35F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.019F, -0.204F, 0.4172F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r464 = rightPlate3.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(138, 31).mirror().addBox(-0.5F, -1.0F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.019F, -0.204F, 0.4172F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r465 = rightPlate3.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(31, 145).mirror().addBox(-0.5F, -0.1488F, -0.7493F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false), PartPose.offsetAndRotation(0.019F, -2.8499F, -0.1903F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r466 = rightPlate3.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(145, 26).mirror().addBox(-0.5F, -2.8238F, -0.7743F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.019F, -0.652F, 1.4126F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r467 = rightPlate3.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(149, 73).mirror().addBox(-0.5F, -0.175F, -0.125F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(0.019F, -2.6101F, -0.7343F, -0.144F, 0.0F, 0.0F));

		PartDefinition neck5 = neck3.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4582F, -3.9543F, -0.0612F, 0.0863F, 0.0467F));

		PartDefinition cube_r468 = neck5.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(59, 153).addBox(-0.5F, -1.85F, -0.95F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3624F, -1.0791F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r469 = neck5.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(120, 0).addBox(-1.0F, -0.65F, -2.35F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1658F, -1.7431F, -0.1134F, 0.0F, 0.0F));

		PartDefinition leftPlate35 = neck5.addOrReplaceChild("leftPlate35", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7058F, -4.0634F, -4.083F, -0.1711F, 0.3226F, 0.4129F));

		PartDefinition cube_r470 = leftPlate35.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(138, 64).addBox(-0.519F, -1.5331F, -0.5918F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.0F, 0.2742F, 0.1579F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r471 = leftPlate35.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(149, 89).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.019F, -2.1502F, -0.1386F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r472 = leftPlate35.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(67, 145).addBox(-0.5F, -0.4985F, -0.1172F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(-0.019F, -1.7104F, -0.5339F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r473 = leftPlate35.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(150, 70).addBox(-0.5F, 1.1262F, -1.3743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.225F)), PartPose.offsetAndRotation(-0.019F, -3.1104F, 0.5661F, 0.3316F, 0.0F, 0.0F));

		PartDefinition rightPlate35 = neck5.addOrReplaceChild("rightPlate35", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7058F, -4.0634F, -4.083F, -0.1711F, -0.3226F, -0.4129F));

		PartDefinition cube_r474 = rightPlate35.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(138, 64).mirror().addBox(-0.481F, -1.5331F, -0.5918F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2742F, 0.1579F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r475 = rightPlate35.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(149, 89).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.019F, -2.1502F, -0.1386F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r476 = rightPlate35.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(67, 145).mirror().addBox(-0.5F, -0.4985F, -0.1172F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(0.019F, -1.7104F, -0.5339F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r477 = rightPlate35.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(150, 70).mirror().addBox(-0.5F, 1.1262F, -1.3743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.225F)).mirror(false), PartPose.offsetAndRotation(0.019F, -3.1104F, 0.5661F, 0.3316F, 0.0F, 0.0F));

		PartDefinition leftPlate17 = neck5.addOrReplaceChild("leftPlate17", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7058F, -3.6432F, -1.5318F, -0.1886F, 0.3226F, 0.4129F));

		PartDefinition cube_r478 = leftPlate17.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(99, 140).addBox(-0.5F, -1.2F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.019F, -0.204F, 0.4172F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r479 = leftPlate17.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(138, 59).addBox(-0.519F, -1.5331F, -0.8918F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.0F, 0.2742F, 0.1579F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r480 = leftPlate17.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(149, 81).addBox(-0.5F, 0.0762F, -1.5493F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(150, 67).addBox(-0.5F, 0.9762F, -1.6743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.019F, -3.1104F, 0.5661F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r481 = leftPlate17.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(145, 31).addBox(-0.5F, -2.8238F, -0.7743F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.019F, -0.652F, 1.4126F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r482 = leftPlate17.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(149, 77).addBox(-0.5F, -0.8985F, -0.4172F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(-0.019F, -1.7104F, -0.5339F, -0.1745F, 0.0F, 0.0F));

		PartDefinition rightPlate17 = neck5.addOrReplaceChild("rightPlate17", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7058F, -3.6432F, -1.5318F, -0.1886F, -0.3226F, -0.4129F));

		PartDefinition cube_r483 = rightPlate17.addOrReplaceChild("cube_r483", CubeListBuilder.create().texOffs(99, 140).mirror().addBox(-0.5F, -1.2F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.019F, -0.204F, 0.4172F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r484 = rightPlate17.addOrReplaceChild("cube_r484", CubeListBuilder.create().texOffs(138, 59).mirror().addBox(-0.481F, -1.5331F, -0.8918F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2742F, 0.1579F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r485 = rightPlate17.addOrReplaceChild("cube_r485", CubeListBuilder.create().texOffs(149, 81).mirror().addBox(-0.5F, 0.0762F, -1.5493F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.21F)).mirror(false)
				.texOffs(150, 67).mirror().addBox(-0.5F, 0.9762F, -1.6743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.019F, -3.1104F, 0.5661F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r486 = rightPlate17.addOrReplaceChild("cube_r486", CubeListBuilder.create().texOffs(145, 31).mirror().addBox(-0.5F, -2.8238F, -0.7743F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.019F, -0.652F, 1.4126F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r487 = rightPlate17.addOrReplaceChild("cube_r487", CubeListBuilder.create().texOffs(149, 77).mirror().addBox(-0.5F, -0.8985F, -0.4172F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(0.019F, -1.7104F, -0.5339F, -0.1745F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4437F, -3.8827F, -0.0313F, 0.0156F, 0.13F));

		PartDefinition cube_r488 = neck6.addOrReplaceChild("cube_r488", CubeListBuilder.create().texOffs(116, 153).addBox(-0.5F, -1.45F, -0.95F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3886F, -2.0787F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r489 = neck6.addOrReplaceChild("cube_r489", CubeListBuilder.create().texOffs(110, 153).addBox(-0.5F, -1.35F, 0.05F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3624F, -1.079F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r490 = neck6.addOrReplaceChild("cube_r490", CubeListBuilder.create().texOffs(120, 63).addBox(-1.0F, -0.65F, -2.35F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1658F, -1.7431F, -0.1134F, 0.0F, 0.0F));

		PartDefinition leftPlate36 = neck6.addOrReplaceChild("leftPlate36", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7058F, -3.5906F, -2.7962F, -0.1362F, 0.3226F, 0.4129F));

		PartDefinition cube_r491 = leftPlate36.addOrReplaceChild("cube_r491", CubeListBuilder.create().texOffs(140, 130).addBox(-0.519F, -1.5331F, -0.5918F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.0F, 0.2742F, 0.1579F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r492 = leftPlate36.addOrReplaceChild("cube_r492", CubeListBuilder.create().texOffs(149, 85).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.019F, -2.1502F, -0.1386F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r493 = leftPlate36.addOrReplaceChild("cube_r493", CubeListBuilder.create().texOffs(36, 145).addBox(-0.5F, -0.4985F, -0.1172F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(-0.019F, -1.7104F, -0.5339F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r494 = leftPlate36.addOrReplaceChild("cube_r494", CubeListBuilder.create().texOffs(68, 150).addBox(-0.5F, 1.1262F, -1.3743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.225F)), PartPose.offsetAndRotation(-0.019F, -3.1104F, 0.5661F, 0.3316F, 0.0F, 0.0F));

		PartDefinition rightPlate36 = neck6.addOrReplaceChild("rightPlate36", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7058F, -3.5906F, -2.7962F, -0.1362F, -0.3226F, -0.4129F));

		PartDefinition cube_r495 = rightPlate36.addOrReplaceChild("cube_r495", CubeListBuilder.create().texOffs(140, 130).mirror().addBox(-0.481F, -1.5331F, -0.5918F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2742F, 0.1579F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r496 = rightPlate36.addOrReplaceChild("cube_r496", CubeListBuilder.create().texOffs(149, 85).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.019F, -2.1502F, -0.1386F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r497 = rightPlate36.addOrReplaceChild("cube_r497", CubeListBuilder.create().texOffs(36, 145).mirror().addBox(-0.5F, -0.4985F, -0.1172F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(0.019F, -1.7104F, -0.5339F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r498 = rightPlate36.addOrReplaceChild("cube_r498", CubeListBuilder.create().texOffs(68, 150).mirror().addBox(-0.5F, 1.1262F, -1.3743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.225F)).mirror(false), PartPose.offsetAndRotation(0.019F, -3.1104F, 0.5661F, 0.3316F, 0.0F, 0.0F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4783F, -3.9616F, 0.0552F, 0.0871F, 0.0048F));

		PartDefinition cube_r499 = neck7.addOrReplaceChild("cube_r499", CubeListBuilder.create().texOffs(119, 153).addBox(-0.5F, -1.35F, -2.95F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(113, 153).addBox(-0.5F, -1.15F, -0.95F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3624F, -1.0791F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r500 = neck7.addOrReplaceChild("cube_r500", CubeListBuilder.create().texOffs(88, 120).addBox(-1.0F, -0.65F, -2.35F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1658F, -1.7431F, -0.1134F, 0.0F, 0.0F));

		PartDefinition leftPlate37 = neck7.addOrReplaceChild("leftPlate37", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7635F, -3.0232F, -3.1251F, 0.0034F, 0.3226F, 0.4129F));

		PartDefinition cube_r501 = leftPlate37.addOrReplaceChild("cube_r501", CubeListBuilder.create().texOffs(138, 69).addBox(-0.519F, -1.5331F, -0.5918F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.0F, 0.2742F, 0.1579F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r502 = leftPlate37.addOrReplaceChild("cube_r502", CubeListBuilder.create().texOffs(149, 93).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.019F, -2.1502F, -0.1386F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r503 = leftPlate37.addOrReplaceChild("cube_r503", CubeListBuilder.create().texOffs(145, 68).addBox(-0.5F, -0.1485F, -0.1172F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(-0.019F, -2.0551F, -0.4731F, -0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r504 = leftPlate37.addOrReplaceChild("cube_r504", CubeListBuilder.create().texOffs(83, 150).addBox(-0.5F, 1.1262F, -1.3743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.225F)), PartPose.offsetAndRotation(-0.019F, -3.1104F, 0.5661F, 0.3316F, 0.0F, 0.0F));

		PartDefinition rightPlate37 = neck7.addOrReplaceChild("rightPlate37", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7635F, -3.0232F, -3.1251F, 0.0034F, -0.3226F, -0.4129F));

		PartDefinition cube_r505 = rightPlate37.addOrReplaceChild("cube_r505", CubeListBuilder.create().texOffs(138, 69).mirror().addBox(-0.481F, -1.5331F, -0.5918F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2742F, 0.1579F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r506 = rightPlate37.addOrReplaceChild("cube_r506", CubeListBuilder.create().texOffs(149, 93).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.019F, -2.1502F, -0.1386F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r507 = rightPlate37.addOrReplaceChild("cube_r507", CubeListBuilder.create().texOffs(145, 68).mirror().addBox(-0.5F, -0.1485F, -0.1172F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(0.019F, -2.0551F, -0.4731F, -0.1178F, 0.0F, 0.0F));

		PartDefinition cube_r508 = rightPlate37.addOrReplaceChild("cube_r508", CubeListBuilder.create().texOffs(83, 150).mirror().addBox(-0.5F, 1.1262F, -1.3743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.225F)).mirror(false), PartPose.offsetAndRotation(0.019F, -3.1104F, 0.5661F, 0.3316F, 0.0F, 0.0F));

		PartDefinition leftPlate38 = neck7.addOrReplaceChild("leftPlate38", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7927F, -3.0324F, -0.9055F, -0.1362F, 0.3226F, 0.4129F));

		PartDefinition cube_r509 = leftPlate38.addOrReplaceChild("cube_r509", CubeListBuilder.create().texOffs(85, 138).addBox(-0.519F, -1.5331F, -0.5918F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.0F, 0.2742F, 0.1579F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r510 = leftPlate38.addOrReplaceChild("cube_r510", CubeListBuilder.create().texOffs(149, 97).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.019F, -2.1502F, -0.1386F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r511 = leftPlate38.addOrReplaceChild("cube_r511", CubeListBuilder.create().texOffs(72, 145).addBox(-0.5F, -0.1985F, -0.1172F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(-0.019F, -2.0058F, -0.4818F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r512 = leftPlate38.addOrReplaceChild("cube_r512", CubeListBuilder.create().texOffs(149, 150).addBox(-0.5F, 1.1262F, -1.3743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.225F)), PartPose.offsetAndRotation(-0.019F, -3.1104F, 0.5661F, 0.3316F, 0.0F, 0.0F));

		PartDefinition rightPlate38 = neck7.addOrReplaceChild("rightPlate38", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7927F, -3.0324F, -0.9055F, -0.1362F, -0.3226F, -0.4129F));

		PartDefinition cube_r513 = rightPlate38.addOrReplaceChild("cube_r513", CubeListBuilder.create().texOffs(85, 138).mirror().addBox(-0.481F, -1.5331F, -0.5918F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2742F, 0.1579F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r514 = rightPlate38.addOrReplaceChild("cube_r514", CubeListBuilder.create().texOffs(149, 97).mirror().addBox(-0.5F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.019F, -2.1502F, -0.1386F, 0.733F, 0.0F, 0.0F));

		PartDefinition cube_r515 = rightPlate38.addOrReplaceChild("cube_r515", CubeListBuilder.create().texOffs(72, 145).mirror().addBox(-0.5F, -0.1985F, -0.1172F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(0.019F, -2.0058F, -0.4818F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r516 = rightPlate38.addOrReplaceChild("cube_r516", CubeListBuilder.create().texOffs(149, 150).mirror().addBox(-0.5F, 1.1262F, -1.3743F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.225F)).mirror(false), PartPose.offsetAndRotation(0.019F, -3.1104F, 0.5661F, 0.3316F, 0.0F, 0.0F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4695F, -3.9185F, 0.099F, 0.0868F, 0.0086F));

		PartDefinition cube_r517 = neck8.addOrReplaceChild("cube_r517", CubeListBuilder.create().texOffs(122, 153).addBox(-0.5F, -1.15F, -0.95F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3624F, -1.079F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r518 = neck8.addOrReplaceChild("cube_r518", CubeListBuilder.create().texOffs(154, 47).addBox(-0.5F, -0.85F, -0.95F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5888F, -3.0662F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r519 = neck8.addOrReplaceChild("cube_r519", CubeListBuilder.create().texOffs(108, 83).addBox(-1.0F, -0.65F, -3.35F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1658F, -1.7431F, -0.1134F, 0.0F, 0.0F));

		PartDefinition leftPlate39 = neck8.addOrReplaceChild("leftPlate39", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7544F, -2.6832F, -1.031F, -0.2147F, 0.3226F, 0.4129F));

		PartDefinition cube_r520 = leftPlate39.addOrReplaceChild("cube_r520", CubeListBuilder.create().texOffs(92, 138).addBox(-0.519F, -1.5331F, -0.5918F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.0F, 0.2742F, 0.1579F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r521 = leftPlate39.addOrReplaceChild("cube_r521", CubeListBuilder.create().texOffs(149, 146).addBox(-0.5F, 0.4265F, 0.0578F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(-0.019F, -1.7104F, -0.5339F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r522 = leftPlate39.addOrReplaceChild("cube_r522", CubeListBuilder.create().texOffs(151, 14).addBox(-0.5F, 0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F))
				.texOffs(151, 11).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.019F, -1.489F, -0.1155F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r523 = leftPlate39.addOrReplaceChild("cube_r523", CubeListBuilder.create().texOffs(0, 150).addBox(-0.5F, -0.375F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.019F, -1.285F, -0.0474F, 0.9425F, 0.0F, 0.0F));

		PartDefinition rightPlate39 = neck8.addOrReplaceChild("rightPlate39", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7544F, -2.6832F, -1.031F, -0.2147F, -0.3226F, -0.4129F));

		PartDefinition cube_r524 = rightPlate39.addOrReplaceChild("cube_r524", CubeListBuilder.create().texOffs(92, 138).mirror().addBox(-0.481F, -1.5331F, -0.5918F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2742F, 0.1579F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r525 = rightPlate39.addOrReplaceChild("cube_r525", CubeListBuilder.create().texOffs(149, 146).mirror().addBox(-0.5F, 0.4265F, 0.0578F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(0.019F, -1.7104F, -0.5339F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r526 = rightPlate39.addOrReplaceChild("cube_r526", CubeListBuilder.create().texOffs(151, 14).mirror().addBox(-0.5F, 0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false)
				.texOffs(151, 11).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.019F, -1.489F, -0.1155F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r527 = rightPlate39.addOrReplaceChild("cube_r527", CubeListBuilder.create().texOffs(0, 150).mirror().addBox(-0.5F, -0.375F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.019F, -1.285F, -0.0474F, 0.9425F, 0.0F, 0.0F));

		PartDefinition leftPlate40 = neck8.addOrReplaceChild("leftPlate40", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9774F, -2.9893F, -3.2537F, -0.1275F, 0.3226F, 0.4129F));

		PartDefinition cube_r528 = leftPlate40.addOrReplaceChild("cube_r528", CubeListBuilder.create().texOffs(139, 74).addBox(-0.519F, -1.5331F, -0.5918F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.0F, 0.2742F, 0.1579F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r529 = leftPlate40.addOrReplaceChild("cube_r529", CubeListBuilder.create().texOffs(149, 101).addBox(-0.5F, 0.4265F, 0.0578F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.186F)), PartPose.offsetAndRotation(-0.019F, -1.7104F, -0.5339F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r530 = leftPlate40.addOrReplaceChild("cube_r530", CubeListBuilder.create().texOffs(151, 20).addBox(-0.5F, 0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F))
				.texOffs(151, 17).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.019F, -1.489F, -0.1155F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r531 = leftPlate40.addOrReplaceChild("cube_r531", CubeListBuilder.create().texOffs(17, 150).addBox(-0.5F, -0.375F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.019F, -1.285F, -0.0474F, 0.9425F, 0.0F, 0.0F));

		PartDefinition rightPlate40 = neck8.addOrReplaceChild("rightPlate40", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9774F, -2.9893F, -3.2537F, -0.1275F, -0.3226F, -0.4129F));

		PartDefinition cube_r532 = rightPlate40.addOrReplaceChild("cube_r532", CubeListBuilder.create().texOffs(139, 74).mirror().addBox(-0.481F, -1.5331F, -0.5918F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.2742F, 0.1579F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r533 = rightPlate40.addOrReplaceChild("cube_r533", CubeListBuilder.create().texOffs(149, 101).mirror().addBox(-0.5F, 0.4265F, 0.0578F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.186F)).mirror(false), PartPose.offsetAndRotation(0.019F, -1.7104F, -0.5339F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r534 = rightPlate40.addOrReplaceChild("cube_r534", CubeListBuilder.create().texOffs(151, 20).mirror().addBox(-0.5F, 0.3F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false)
				.texOffs(151, 17).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.019F, -1.489F, -0.1155F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r535 = rightPlate40.addOrReplaceChild("cube_r535", CubeListBuilder.create().texOffs(17, 150).mirror().addBox(-0.5F, -0.375F, -0.625F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.019F, -1.285F, -0.0474F, 0.9425F, 0.0F, 0.0F));

		PartDefinition head = neck8.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1332F, -4.8009F, -0.381F, 0.0F, 0.0F));

		PartDefinition cube_r536 = head.addOrReplaceChild("cube_r536", CubeListBuilder.create().texOffs(57, 150).addBox(-0.5F, -0.2885F, -0.5483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.0F, 4.2406F, -8.6029F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r537 = head.addOrReplaceChild("cube_r537", CubeListBuilder.create().texOffs(109, 79).addBox(-1.5F, -0.025F, -0.0131F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -2.0853F, -0.3558F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r538 = head.addOrReplaceChild("cube_r538", CubeListBuilder.create().texOffs(141, 22).addBox(-0.5F, 0.0215F, -2.0057F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0F, -1.626F, -2.2889F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r539 = head.addOrReplaceChild("cube_r539", CubeListBuilder.create().texOffs(48, 145).addBox(-0.5F, -2.7849F, -0.2048F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.0F, 3.6168F, -8.6982F, -0.8378F, 0.0F, 0.0F));

		PartDefinition cube_r540 = head.addOrReplaceChild("cube_r540", CubeListBuilder.create().texOffs(150, 56).addBox(-0.5F, -0.7099F, -0.5548F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 4.2406F, -8.6029F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r541 = head.addOrReplaceChild("cube_r541", CubeListBuilder.create().texOffs(19, 141).addBox(-1.0F, 0.0012F, -1.9882F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.7831F, -5.4724F, 0.7025F, 0.0F, 0.0F));

		PartDefinition cube_r542 = head.addOrReplaceChild("cube_r542", CubeListBuilder.create().texOffs(56, 11).addBox(-2.0F, 0.0329F, 0.0047F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6457F, -2.2924F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r543 = head.addOrReplaceChild("cube_r543", CubeListBuilder.create().texOffs(54, 24).addBox(-1.5F, 0.0F, 0.0119F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.9534F, -1.3433F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r544 = head.addOrReplaceChild("cube_r544", CubeListBuilder.create().texOffs(139, 89).addBox(-1.0F, -0.0152F, -2.0058F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.5F, -0.4234F, -3.8761F, 0.6589F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.6028F, -1.0518F, -2.7607F));

		PartDefinition cube_r545 = leftFace.addOrReplaceChild("cube_r545", CubeListBuilder.create().texOffs(120, 51).addBox(0.1346F, -0.3053F, -5.5426F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-1.4047F, 2.0568F, 0.2766F, 0.4831F, 0.1323F, 0.0F));

		PartDefinition cube_r546 = leftFace.addOrReplaceChild("cube_r546", CubeListBuilder.create().texOffs(141, 40).addBox(0.0397F, -2.0589F, -6.2974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.4047F, 2.0568F, 0.2766F, 0.7453F, 0.1047F, 0.0F));

		PartDefinition cube_r547 = leftFace.addOrReplaceChild("cube_r547", CubeListBuilder.create().texOffs(123, 21).addBox(0.0399F, -0.9908F, -3.9603F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-1.5433F, 3.233F, -1.0415F, 0.4747F, 0.1047F, 0.0F));

		PartDefinition cube_r548 = leftFace.addOrReplaceChild("cube_r548", CubeListBuilder.create().texOffs(151, 38).addBox(-0.5982F, -0.8166F, -3.0841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.1047F, 2.0568F, 1.5766F, 0.2217F, 0.2967F, 0.0F));

		PartDefinition cube_r549 = leftFace.addOrReplaceChild("cube_r549", CubeListBuilder.create().texOffs(38, 141).addBox(0.265F, -2.3982F, -6.3817F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4047F, 2.0568F, 0.2766F, 0.7889F, 0.1047F, 0.0F));

		PartDefinition cube_r550 = leftFace.addOrReplaceChild("cube_r550", CubeListBuilder.create().texOffs(151, 35).addBox(0.265F, -0.4597F, -1.9005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4047F, 2.0568F, 0.2766F, 0.2217F, 0.1047F, 0.0F));

		PartDefinition cube_r551 = leftFace.addOrReplaceChild("cube_r551", CubeListBuilder.create().texOffs(108, 90).addBox(-0.0601F, -1.6461F, -4.5408F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.4047F, 2.0568F, 0.2766F, 0.6755F, 0.1047F, 0.0F));

		PartDefinition cube_r552 = leftFace.addOrReplaceChild("cube_r552", CubeListBuilder.create().texOffs(141, 36).addBox(-0.0601F, -0.8987F, -1.8094F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.4047F, 2.0568F, 0.2766F, 0.6144F, 0.1047F, 0.0F));

		PartDefinition cube_r553 = leftFace.addOrReplaceChild("cube_r553", CubeListBuilder.create().texOffs(122, 132).addBox(-0.5F, -0.075F, -0.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.1837F, 0.8184F, -0.8837F, 0.7505F, 0.223F, 0.1713F));

		PartDefinition cube_r554 = leftFace.addOrReplaceChild("cube_r554", CubeListBuilder.create().texOffs(130, 83).addBox(-1.0F, -2.0F, -0.025F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.1297F, 2.0568F, 1.5766F, 0.4835F, 0.0F, 0.0F));

		PartDefinition cube_r555 = leftFace.addOrReplaceChild("cube_r555", CubeListBuilder.create().texOffs(136, 108).addBox(-1.025F, -2.0F, -2.025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1047F, 2.0568F, 1.5766F, 0.1423F, 0.2221F, 0.0355F));

		PartDefinition cube_r556 = leftFace.addOrReplaceChild("cube_r556", CubeListBuilder.create().texOffs(64, 141).addBox(-0.6102F, -2.5458F, -1.5998F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.1047F, 2.0068F, 1.5766F, 0.2213F, 0.0166F, -0.0897F));

		PartDefinition cube_r557 = leftFace.addOrReplaceChild("cube_r557", CubeListBuilder.create().texOffs(151, 108).addBox(-0.3201F, -2.7423F, -1.4948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.1047F, 2.0068F, 1.5766F, 0.4198F, 0.2378F, -0.0388F));

		PartDefinition cube_r558 = leftFace.addOrReplaceChild("cube_r558", CubeListBuilder.create().texOffs(65, 11).addBox(-1.3117F, -2.8985F, -1.496F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.1047F, 2.0068F, 1.5766F, 0.5773F, 0.2436F, -0.0366F));

		PartDefinition cube_r559 = leftFace.addOrReplaceChild("cube_r559", CubeListBuilder.create().texOffs(127, 27).addBox(-1.1985F, -3.0743F, -3.3087F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.1047F, 2.0068F, 1.5766F, 0.7963F, 0.3499F, 0.0598F));

		PartDefinition cube_r560 = leftFace.addOrReplaceChild("cube_r560", CubeListBuilder.create().texOffs(112, 40).addBox(-1.65F, -0.6F, -3.7F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.5776F, 1.1931F, -1.075F, 0.712F, 0.1439F, -0.0123F));

		PartDefinition cube_r561 = leftFace.addOrReplaceChild("cube_r561", CubeListBuilder.create().texOffs(40, 27).addBox(-0.5F, -1.0F, -0.3875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.3858F, 1.4567F, 2.8755F, 0.3665F, 0.0698F, 0.0F));

		PartDefinition cube_r562 = leftFace.addOrReplaceChild("cube_r562", CubeListBuilder.create().texOffs(96, 20).addBox(-0.5F, -1.0338F, -0.6073F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.3858F, 1.4567F, 2.8755F, 0.672F, 0.0698F, 0.0F));

		PartDefinition cube_r563 = leftFace.addOrReplaceChild("cube_r563", CubeListBuilder.create().texOffs(72, 11).addBox(-0.8081F, -0.7955F, -0.1572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9075F, 5.6886F, -5.6554F, 0.5648F, 0.014F, -0.3535F));

		PartDefinition cube_r564 = leftFace.addOrReplaceChild("cube_r564", CubeListBuilder.create().texOffs(63, 24).addBox(-0.5121F, -0.4336F, -0.6093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(-1.2909F, 5.3639F, -5.6286F, 0.0754F, 0.6874F, -0.0574F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.6028F, -1.0518F, -2.7607F));

		PartDefinition cube_r565 = rightFace.addOrReplaceChild("cube_r565", CubeListBuilder.create().texOffs(120, 51).mirror().addBox(-1.1346F, -0.3053F, -5.5426F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(1.4047F, 2.0568F, 0.2766F, 0.4831F, -0.1323F, 0.0F));

		PartDefinition cube_r566 = rightFace.addOrReplaceChild("cube_r566", CubeListBuilder.create().texOffs(141, 40).mirror().addBox(-1.0397F, -2.0589F, -6.2974F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.4047F, 2.0568F, 0.2766F, 0.7453F, -0.1047F, 0.0F));

		PartDefinition cube_r567 = rightFace.addOrReplaceChild("cube_r567", CubeListBuilder.create().texOffs(123, 21).mirror().addBox(-1.0399F, -0.9908F, -3.9603F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(1.5433F, 3.233F, -1.0415F, 0.4747F, -0.1047F, 0.0F));

		PartDefinition cube_r568 = rightFace.addOrReplaceChild("cube_r568", CubeListBuilder.create().texOffs(151, 38).mirror().addBox(-0.4018F, -0.8166F, -3.0841F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.1047F, 2.0568F, 1.5766F, 0.2217F, -0.2967F, 0.0F));

		PartDefinition cube_r569 = rightFace.addOrReplaceChild("cube_r569", CubeListBuilder.create().texOffs(38, 141).mirror().addBox(-1.265F, -2.3982F, -6.3817F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.4047F, 2.0568F, 0.2766F, 0.7889F, -0.1047F, 0.0F));

		PartDefinition cube_r570 = rightFace.addOrReplaceChild("cube_r570", CubeListBuilder.create().texOffs(151, 35).mirror().addBox(-1.265F, -0.4597F, -1.9005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.4047F, 2.0568F, 0.2766F, 0.2217F, -0.1047F, 0.0F));

		PartDefinition cube_r571 = rightFace.addOrReplaceChild("cube_r571", CubeListBuilder.create().texOffs(108, 90).mirror().addBox(-0.94F, -1.6461F, -4.5408F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(1.4047F, 2.0568F, 0.2766F, 0.6755F, -0.1047F, 0.0F));

		PartDefinition cube_r572 = rightFace.addOrReplaceChild("cube_r572", CubeListBuilder.create().texOffs(141, 36).mirror().addBox(-0.94F, -0.8987F, -1.8094F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.4047F, 2.0568F, 0.2766F, 0.6144F, -0.1047F, 0.0F));

		PartDefinition cube_r573 = rightFace.addOrReplaceChild("cube_r573", CubeListBuilder.create().texOffs(122, 132).mirror().addBox(-0.5F, -0.075F, -0.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.1837F, 0.8184F, -0.8837F, 0.7505F, -0.223F, -0.1713F));

		PartDefinition cube_r574 = rightFace.addOrReplaceChild("cube_r574", CubeListBuilder.create().texOffs(130, 83).mirror().addBox(-1.0F, -2.0F, -0.025F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(1.1297F, 2.0568F, 1.5766F, 0.4835F, 0.0F, 0.0F));

		PartDefinition cube_r575 = rightFace.addOrReplaceChild("cube_r575", CubeListBuilder.create().texOffs(136, 108).mirror().addBox(0.025F, -2.0F, -2.025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.1047F, 2.0568F, 1.5766F, 0.1423F, -0.2221F, -0.0355F));

		PartDefinition cube_r576 = rightFace.addOrReplaceChild("cube_r576", CubeListBuilder.create().texOffs(64, 141).mirror().addBox(-0.3898F, -2.5458F, -1.5998F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.1047F, 2.0068F, 1.5766F, 0.2213F, -0.0166F, 0.0897F));

		PartDefinition cube_r577 = rightFace.addOrReplaceChild("cube_r577", CubeListBuilder.create().texOffs(151, 108).mirror().addBox(-0.6799F, -2.7423F, -1.4948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.1047F, 2.0068F, 1.5766F, 0.4198F, -0.2378F, 0.0388F));

		PartDefinition cube_r578 = rightFace.addOrReplaceChild("cube_r578", CubeListBuilder.create().texOffs(65, 11).mirror().addBox(-0.6883F, -2.8985F, -1.496F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.1047F, 2.0068F, 1.5766F, 0.5773F, -0.2436F, 0.0366F));

		PartDefinition cube_r579 = rightFace.addOrReplaceChild("cube_r579", CubeListBuilder.create().texOffs(127, 27).mirror().addBox(-0.8015F, -3.0743F, -3.3087F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.1047F, 2.0068F, 1.5766F, 0.7963F, -0.3499F, -0.0598F));

		PartDefinition cube_r580 = rightFace.addOrReplaceChild("cube_r580", CubeListBuilder.create().texOffs(112, 40).mirror().addBox(-0.35F, -0.6F, -3.7F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(0.5776F, 1.1931F, -1.075F, 0.712F, -0.1439F, 0.0123F));

		PartDefinition cube_r581 = rightFace.addOrReplaceChild("cube_r581", CubeListBuilder.create().texOffs(40, 27).mirror().addBox(-0.5F, -1.0F, -0.3875F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.3858F, 1.4567F, 2.8755F, 0.3665F, -0.0698F, 0.0F));

		PartDefinition cube_r582 = rightFace.addOrReplaceChild("cube_r582", CubeListBuilder.create().texOffs(96, 20).mirror().addBox(-0.5F, -1.0338F, -0.6073F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.3858F, 1.4567F, 2.8755F, 0.672F, -0.0698F, 0.0F));

		PartDefinition cube_r583 = rightFace.addOrReplaceChild("cube_r583", CubeListBuilder.create().texOffs(72, 11).mirror().addBox(-0.1919F, -0.7955F, -0.1572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9075F, 5.6886F, -5.6554F, 0.5648F, -0.014F, 0.3535F));

		PartDefinition cube_r584 = rightFace.addOrReplaceChild("cube_r584", CubeListBuilder.create().texOffs(63, 24).mirror().addBox(-0.4878F, -0.4336F, -0.6093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(1.2909F, 5.3639F, -5.6286F, 0.0754F, -0.6874F, 0.0574F));

		PartDefinition eye = head.addOrReplaceChild("eye", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0308F, -0.1672F, -2.2107F, -0.1708F, 0.1865F, 0.0028F));

		PartDefinition cube_r585 = eye.addOrReplaceChild("cube_r585", CubeListBuilder.create().texOffs(150, 50).addBox(-0.5F, -0.425F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.0015F, 0.6535F, -0.9229F, 0.9502F, 0.0062F, 0.0354F));

		PartDefinition cube_r586 = eye.addOrReplaceChild("cube_r586", CubeListBuilder.create().texOffs(125, 47).addBox(-0.5F, -0.25F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0252F, 1.3259F, -0.9068F, 1.9276F, 0.0062F, 0.0354F));

		PartDefinition cube_r587 = eye.addOrReplaceChild("cube_r587", CubeListBuilder.create().texOffs(47, 150).addBox(-0.755F, -0.1119F, 0.6803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2442F, 1.1477F, 0.368F, 2.2767F, 0.0062F, 0.0354F));

		PartDefinition cube_r588 = eye.addOrReplaceChild("cube_r588", CubeListBuilder.create().texOffs(35, 150).addBox(-0.5F, -0.756F, -1.0055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(-0.0109F, -0.4636F, 0.9582F, -0.694F, -0.1702F, -0.0218F));

		PartDefinition cube_r589 = eye.addOrReplaceChild("cube_r589", CubeListBuilder.create().texOffs(150, 32).addBox(-0.5F, -0.8143F, -0.6901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0109F, -0.4636F, 0.9582F, 0.279F, -0.1702F, -0.0218F));

		PartDefinition cube_r590 = eye.addOrReplaceChild("cube_r590", CubeListBuilder.create().texOffs(30, 150).addBox(-0.5F, -0.2168F, -0.6923F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)), PartPose.offsetAndRotation(-0.0109F, -0.4636F, 0.9582F, 0.1917F, -0.1702F, -0.0218F));

		PartDefinition cube_r591 = eye.addOrReplaceChild("cube_r591", CubeListBuilder.create().texOffs(150, 29).addBox(-0.5F, -1.1719F, -0.3802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.0109F, -0.4636F, 0.9582F, 0.0783F, -0.1702F, -0.0218F));

		PartDefinition cube_r592 = eye.addOrReplaceChild("cube_r592", CubeListBuilder.create().texOffs(150, 26).addBox(-0.5F, 0.1589F, -0.6779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.0109F, -0.4636F, 0.9582F, 0.1655F, -0.1702F, -0.0218F));

		PartDefinition cube_r593 = eye.addOrReplaceChild("cube_r593", CubeListBuilder.create().texOffs(149, 105).addBox(-0.5F, -0.7034F, -0.5785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)), PartPose.offsetAndRotation(-0.0109F, -0.4636F, 0.9582F, -0.3581F, -0.1702F, -0.0218F));

		PartDefinition cube_r594 = eye.addOrReplaceChild("cube_r594", CubeListBuilder.create().texOffs(97, 151).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(0.0246F, -0.1012F, -1.0313F, 0.4616F, 0.0062F, 0.0354F));

		PartDefinition cube_r595 = eye.addOrReplaceChild("cube_r595", CubeListBuilder.create().texOffs(151, 62).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.006F, 0.3543F, -1.4214F, 0.863F, 0.0062F, 0.0354F));

		PartDefinition cube_r596 = eye.addOrReplaceChild("cube_r596", CubeListBuilder.create().texOffs(151, 59).addBox(-0.5F, -0.65F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-0.0056F, 0.7636F, -0.9572F, 1.6047F, 0.0062F, 0.0354F));

		PartDefinition cube_r597 = eye.addOrReplaceChild("cube_r597", CubeListBuilder.create().texOffs(149, 8).addBox(-0.5F, -0.4F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0285F, -0.1262F, -0.5477F, 0.2085F, 0.0062F, 0.0354F));

		PartDefinition cube_r598 = eye.addOrReplaceChild("cube_r598", CubeListBuilder.create().texOffs(148, 23).addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)), PartPose.offsetAndRotation(0.0143F, 0.3782F, 0.0392F, 0.1736F, 0.0062F, 0.0354F));

		PartDefinition cube_r599 = eye.addOrReplaceChild("cube_r599", CubeListBuilder.create().texOffs(136, 17).addBox(-0.4125F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(37, 81).addBox(-0.5875F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0543F, 0.4956F, -0.4912F, 0.6972F, 0.0062F, 0.0354F));

		PartDefinition eye2 = head.addOrReplaceChild("eye2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0308F, -0.1672F, -2.2107F, -0.1708F, -0.1865F, -0.0028F));

		PartDefinition cube_r600 = eye2.addOrReplaceChild("cube_r600", CubeListBuilder.create().texOffs(150, 50).mirror().addBox(-0.5F, -0.425F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.0015F, 0.6535F, -0.9229F, 0.9502F, -0.0062F, -0.0354F));

		PartDefinition cube_r601 = eye2.addOrReplaceChild("cube_r601", CubeListBuilder.create().texOffs(125, 47).mirror().addBox(-0.5F, -0.25F, -0.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0252F, 1.3259F, -0.9068F, 1.9276F, -0.0062F, -0.0354F));

		PartDefinition cube_r602 = eye2.addOrReplaceChild("cube_r602", CubeListBuilder.create().texOffs(47, 150).mirror().addBox(-0.245F, -0.1119F, 0.6803F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2442F, 1.1477F, 0.368F, 2.2767F, -0.0062F, -0.0354F));

		PartDefinition cube_r603 = eye2.addOrReplaceChild("cube_r603", CubeListBuilder.create().texOffs(35, 150).mirror().addBox(-0.5F, -0.756F, -1.0055F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(0.0109F, -0.4636F, 0.9582F, -0.694F, 0.1702F, 0.0218F));

		PartDefinition cube_r604 = eye2.addOrReplaceChild("cube_r604", CubeListBuilder.create().texOffs(150, 32).mirror().addBox(-0.5F, -0.8143F, -0.6901F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0109F, -0.4636F, 0.9582F, 0.279F, 0.1702F, 0.0218F));

		PartDefinition cube_r605 = eye2.addOrReplaceChild("cube_r605", CubeListBuilder.create().texOffs(30, 150).mirror().addBox(-0.5F, -0.2168F, -0.6923F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.195F)).mirror(false), PartPose.offsetAndRotation(0.0109F, -0.4636F, 0.9582F, 0.1917F, 0.1702F, 0.0218F));

		PartDefinition cube_r606 = eye2.addOrReplaceChild("cube_r606", CubeListBuilder.create().texOffs(150, 29).mirror().addBox(-0.5F, -1.1719F, -0.3802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.0109F, -0.4636F, 0.9582F, 0.0783F, 0.1702F, 0.0218F));

		PartDefinition cube_r607 = eye2.addOrReplaceChild("cube_r607", CubeListBuilder.create().texOffs(150, 26).mirror().addBox(-0.5F, 0.1589F, -0.6779F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.0109F, -0.4636F, 0.9582F, 0.1655F, 0.1702F, 0.0218F));

		PartDefinition cube_r608 = eye2.addOrReplaceChild("cube_r608", CubeListBuilder.create().texOffs(149, 105).mirror().addBox(-0.5F, -0.7034F, -0.5785F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.206F)).mirror(false), PartPose.offsetAndRotation(0.0109F, -0.4636F, 0.9582F, -0.3581F, 0.1702F, 0.0218F));

		PartDefinition cube_r609 = eye2.addOrReplaceChild("cube_r609", CubeListBuilder.create().texOffs(97, 151).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-0.0246F, -0.1012F, -1.0313F, 0.4616F, -0.0062F, -0.0354F));

		PartDefinition cube_r610 = eye2.addOrReplaceChild("cube_r610", CubeListBuilder.create().texOffs(151, 62).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.006F, 0.3543F, -1.4214F, 0.863F, -0.0062F, -0.0354F));

		PartDefinition cube_r611 = eye2.addOrReplaceChild("cube_r611", CubeListBuilder.create().texOffs(151, 59).mirror().addBox(-0.5F, -0.65F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(0.0056F, 0.7636F, -0.9572F, 1.6047F, -0.0062F, -0.0354F));

		PartDefinition cube_r612 = eye2.addOrReplaceChild("cube_r612", CubeListBuilder.create().texOffs(149, 8).mirror().addBox(-0.5F, -0.4F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.0285F, -0.1262F, -0.5477F, 0.2085F, -0.0062F, -0.0354F));

		PartDefinition cube_r613 = eye2.addOrReplaceChild("cube_r613", CubeListBuilder.create().texOffs(148, 23).mirror().addBox(-0.5F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false), PartPose.offsetAndRotation(-0.0143F, 0.3782F, 0.0392F, 0.1736F, -0.0062F, -0.0354F));

		PartDefinition cube_r614 = eye2.addOrReplaceChild("cube_r614", CubeListBuilder.create().texOffs(136, 17).mirror().addBox(-0.5875F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(37, 81).mirror().addBox(-0.4125F, -0.55F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.0543F, 0.4956F, -0.4912F, 0.6972F, -0.0062F, -0.0354F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0293F, 0.5345F, 0.8072F, 0.0F, 0.0F));

		PartDefinition cube_r615 = jaw.addOrReplaceChild("cube_r615", CubeListBuilder.create().texOffs(52, 150).mirror().addBox(-0.1849F, -0.2234F, -0.7604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.45F, -0.2997F, -1.5768F, -0.0611F, -0.2269F, 0.0F));

		PartDefinition cube_r616 = jaw.addOrReplaceChild("cube_r616", CubeListBuilder.create().texOffs(151, 117).mirror().addBox(-0.1849F, -1.3211F, -0.6843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.45F, -0.2997F, -1.5768F, 1.693F, -0.2269F, 0.0F));

		PartDefinition cube_r617 = jaw.addOrReplaceChild("cube_r617", CubeListBuilder.create().texOffs(112, 149).mirror().addBox(-0.1885F, -1.5063F, 0.3706F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.2997F, -3.0768F, 1.8151F, -0.1047F, 0.0F));

		PartDefinition cube_r618 = jaw.addOrReplaceChild("cube_r618", CubeListBuilder.create().texOffs(53, 145).mirror().addBox(-0.1885F, -0.128F, -0.7873F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.205F)).mirror(false)
				.texOffs(145, 51).mirror().addBox(-0.1885F, -0.203F, -0.1873F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.2997F, -3.0768F, -1.7191F, -0.1047F, 0.0F));

		PartDefinition cube_r619 = jaw.addOrReplaceChild("cube_r619", CubeListBuilder.create().texOffs(137, 149).mirror().addBox(-0.1135F, 0.8623F, -0.8732F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.3497F, -2.9268F, -1.7366F, -0.1047F, 0.0F));

		PartDefinition cube_r620 = jaw.addOrReplaceChild("cube_r620", CubeListBuilder.create().texOffs(145, 56).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-0.4514F, -1.4535F, -5.4003F, -1.4224F, -0.1047F, 0.0F));

		PartDefinition cube_r621 = jaw.addOrReplaceChild("cube_r621", CubeListBuilder.create().texOffs(117, 149).mirror().addBox(-0.1885F, 2.2103F, -1.391F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.2997F, -3.0768F, -1.4748F, -0.1047F, 0.0F));

		PartDefinition cube_r622 = jaw.addOrReplaceChild("cube_r622", CubeListBuilder.create().texOffs(151, 120).mirror().addBox(-0.1885F, 4.9698F, -2.1948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(132, 149).mirror().addBox(-0.1885F, 3.4698F, -2.1948F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.2997F, -3.0768F, -1.2654F, -0.1047F, 0.0F));

		PartDefinition cube_r623 = jaw.addOrReplaceChild("cube_r623", CubeListBuilder.create().texOffs(142, 151).mirror().addBox(-0.1885F, 5.631F, 1.3227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(151, 123).mirror().addBox(-0.1885F, 5.031F, 1.3227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.2997F, -3.0768F, -1.8588F, -0.1047F, 0.0F));

		PartDefinition cube_r624 = jaw.addOrReplaceChild("cube_r624", CubeListBuilder.create().texOffs(127, 149).mirror().addBox(-0.1885F, 3.8153F, -1.3816F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.2997F, -3.0768F, -1.3701F, -0.1047F, 0.0F));

		PartDefinition cube_r625 = jaw.addOrReplaceChild("cube_r625", CubeListBuilder.create().texOffs(122, 149).mirror().addBox(-0.1885F, 2.367F, -0.5937F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.2997F, -3.0768F, -1.5621F, -0.1047F, 0.0F));

		PartDefinition cube_r626 = jaw.addOrReplaceChild("cube_r626", CubeListBuilder.create().texOffs(71, 141).mirror().addBox(-0.1849F, 0.8114F, -1.1512F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)).mirror(false), PartPose.offsetAndRotation(-1.45F, -0.2997F, -1.5768F, -1.597F, -0.2269F, 0.0F));

		PartDefinition cube_r627 = jaw.addOrReplaceChild("cube_r627", CubeListBuilder.create().texOffs(107, 149).mirror().addBox(-0.1849F, -0.2574F, -0.7359F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.3832F, -0.4319F, -1.8661F, -1.946F, -0.2269F, 0.0F));

		PartDefinition cube_r628 = jaw.addOrReplaceChild("cube_r628", CubeListBuilder.create().texOffs(149, 142).mirror().addBox(-0.1849F, -0.2601F, -0.807F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(-1.45F, -0.2997F, -1.5768F, -1.5621F, -0.2269F, 0.0F));

		PartDefinition cube_r629 = jaw.addOrReplaceChild("cube_r629", CubeListBuilder.create().texOffs(151, 114).mirror().addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1253F, -0.9116F, -1.0276F, -1.5621F, 0.0175F, 0.0F));

		PartDefinition cube_r630 = jaw.addOrReplaceChild("cube_r630", CubeListBuilder.create().texOffs(150, 53).mirror().addBox(-0.5F, -0.55F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)).mirror(false)
				.texOffs(151, 111).mirror().addBox(-0.5F, -0.55F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.1248F, -0.3019F, -1.0009F, -0.9163F, 0.0175F, 0.0F));

		PartDefinition cube_r631 = jaw.addOrReplaceChild("cube_r631", CubeListBuilder.create().texOffs(152, 0).mirror().addBox(-0.2F, -0.8F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)).mirror(false)
				.texOffs(78, 141).mirror().addBox(-0.2F, -0.8F, -2.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.4003F, 0.4232F, -0.0611F, 0.0175F, 0.0F));

		PartDefinition cube_r632 = jaw.addOrReplaceChild("cube_r632", CubeListBuilder.create().texOffs(151, 111).addBox(-0.5F, -0.55F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(150, 53).addBox(-0.5F, -0.55F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.1248F, -0.3019F, -1.0009F, -0.9163F, -0.0175F, 0.0F));

		PartDefinition cube_r633 = jaw.addOrReplaceChild("cube_r633", CubeListBuilder.create().texOffs(151, 117).addBox(-0.8151F, -1.3211F, -0.6843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.45F, -0.2997F, -1.5768F, 1.693F, 0.2269F, 0.0F));

		PartDefinition cube_r634 = jaw.addOrReplaceChild("cube_r634", CubeListBuilder.create().texOffs(112, 149).addBox(-0.8115F, -1.5063F, 0.3706F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.1F, -0.2997F, -3.0768F, 1.8151F, 0.1047F, 0.0F));

		PartDefinition cube_r635 = jaw.addOrReplaceChild("cube_r635", CubeListBuilder.create().texOffs(53, 145).addBox(-0.8115F, -0.128F, -0.7873F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.205F))
				.texOffs(145, 51).addBox(-0.8115F, -0.203F, -0.1873F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1F, -0.2997F, -3.0768F, -1.7191F, 0.1047F, 0.0F));

		PartDefinition cube_r636 = jaw.addOrReplaceChild("cube_r636", CubeListBuilder.create().texOffs(137, 149).addBox(-0.8865F, 0.8623F, -0.8732F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1F, -0.3497F, -2.9268F, -1.7366F, 0.1047F, 0.0F));

		PartDefinition cube_r637 = jaw.addOrReplaceChild("cube_r637", CubeListBuilder.create().texOffs(145, 56).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(0.4514F, -1.4535F, -5.4003F, -1.4224F, 0.1047F, 0.0F));

		PartDefinition cube_r638 = jaw.addOrReplaceChild("cube_r638", CubeListBuilder.create().texOffs(117, 149).addBox(-0.8115F, 2.2103F, -1.391F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1F, -0.2997F, -3.0768F, -1.4748F, 0.1047F, 0.0F));

		PartDefinition cube_r639 = jaw.addOrReplaceChild("cube_r639", CubeListBuilder.create().texOffs(151, 120).addBox(-0.8115F, 4.9698F, -2.1948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(132, 149).addBox(-0.8115F, 3.4698F, -2.1948F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.194F)), PartPose.offsetAndRotation(1.1F, -0.2997F, -3.0768F, -1.2654F, 0.1047F, 0.0F));

		PartDefinition cube_r640 = jaw.addOrReplaceChild("cube_r640", CubeListBuilder.create().texOffs(142, 151).addBox(-0.8115F, 5.631F, 1.3227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.204F))
				.texOffs(151, 123).addBox(-0.8115F, 5.031F, 1.3227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(1.1F, -0.2997F, -3.0768F, -1.8588F, 0.1047F, 0.0F));

		PartDefinition cube_r641 = jaw.addOrReplaceChild("cube_r641", CubeListBuilder.create().texOffs(127, 149).addBox(-0.8115F, 3.8153F, -1.3816F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1F, -0.2997F, -3.0768F, -1.3701F, 0.1047F, 0.0F));

		PartDefinition cube_r642 = jaw.addOrReplaceChild("cube_r642", CubeListBuilder.create().texOffs(122, 149).addBox(-0.8115F, 2.367F, -0.5937F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.197F)), PartPose.offsetAndRotation(1.1F, -0.2997F, -3.0768F, -1.5621F, 0.1047F, 0.0F));

		PartDefinition cube_r643 = jaw.addOrReplaceChild("cube_r643", CubeListBuilder.create().texOffs(71, 141).addBox(-0.8151F, 0.8114F, -1.1512F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(1.45F, -0.2997F, -1.5768F, -1.597F, 0.2269F, 0.0F));

		PartDefinition cube_r644 = jaw.addOrReplaceChild("cube_r644", CubeListBuilder.create().texOffs(107, 149).addBox(-0.8151F, -0.2574F, -0.7359F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.3832F, -0.4319F, -1.8661F, -1.946F, 0.2269F, 0.0F));

		PartDefinition cube_r645 = jaw.addOrReplaceChild("cube_r645", CubeListBuilder.create().texOffs(149, 142).addBox(-0.8151F, -0.2601F, -0.807F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(1.45F, -0.2997F, -1.5768F, -1.5621F, 0.2269F, 0.0F));

		PartDefinition cube_r646 = jaw.addOrReplaceChild("cube_r646", CubeListBuilder.create().texOffs(151, 114).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.1253F, -0.9116F, -1.0276F, -1.5621F, -0.0175F, 0.0F));

		PartDefinition cube_r647 = jaw.addOrReplaceChild("cube_r647", CubeListBuilder.create().texOffs(152, 0).addBox(-0.8F, -0.8F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F))
				.texOffs(78, 141).addBox(-0.8F, -0.8F, -2.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.4F, 0.4003F, 0.4232F, -0.0611F, -0.0175F, 0.0F));

		PartDefinition cube_r648 = jaw.addOrReplaceChild("cube_r648", CubeListBuilder.create().texOffs(52, 150).addBox(-0.8151F, -0.2234F, -0.7604F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.199F)), PartPose.offsetAndRotation(1.45F, -0.2997F, -1.5768F, -0.0611F, 0.2269F, 0.0F));

		PartDefinition leftPlate25 = neck2.addOrReplaceChild("leftPlate25", CubeListBuilder.create(), PartPose.offsetAndRotation(1.2168F, -4.5488F, -3.2818F, 0.1768F, 0.3632F, 0.333F));

		PartDefinition cube_r649 = leftPlate25.addOrReplaceChild("cube_r649", CubeListBuilder.create().texOffs(19, 136).addBox(-0.5F, -1.2F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1549F, -0.2992F, -0.1491F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r650 = leftPlate25.addOrReplaceChild("cube_r650", CubeListBuilder.create().texOffs(136, 137).addBox(-0.519F, -1.8331F, -0.4918F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.1739F, 0.1789F, -0.4084F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r651 = leftPlate25.addOrReplaceChild("cube_r651", CubeListBuilder.create().texOffs(129, 137).addBox(-0.5F, -1.0F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.224F)), PartPose.offsetAndRotation(0.1549F, -1.7794F, -0.2223F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r652 = leftPlate25.addOrReplaceChild("cube_r652", CubeListBuilder.create().texOffs(144, 103).addBox(-0.5F, -0.2238F, -0.7743F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(0.1549F, -3.2056F, -0.0002F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r653 = leftPlate25.addOrReplaceChild("cube_r653", CubeListBuilder.create().texOffs(144, 98).addBox(-0.5F, -1.8485F, -0.2172F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(0.1549F, -1.8056F, -1.1002F, -0.3491F, 0.0F, 0.0F));

		PartDefinition rightPlate25 = neck2.addOrReplaceChild("rightPlate25", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.2168F, -4.5488F, -3.2818F, 0.1768F, -0.3632F, -0.333F));

		PartDefinition cube_r654 = rightPlate25.addOrReplaceChild("cube_r654", CubeListBuilder.create().texOffs(19, 136).mirror().addBox(-0.5F, -1.2F, -1.3F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -0.2992F, -0.1491F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r655 = rightPlate25.addOrReplaceChild("cube_r655", CubeListBuilder.create().texOffs(136, 137).mirror().addBox(-0.481F, -1.8331F, -0.4918F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.1739F, 0.1789F, -0.4084F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r656 = rightPlate25.addOrReplaceChild("cube_r656", CubeListBuilder.create().texOffs(129, 137).mirror().addBox(-0.5F, -1.0F, -0.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.224F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.7794F, -0.2223F, -0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r657 = rightPlate25.addOrReplaceChild("cube_r657", CubeListBuilder.create().texOffs(144, 103).mirror().addBox(-0.5F, -0.2238F, -0.7743F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -3.2056F, -0.0002F, 0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r658 = rightPlate25.addOrReplaceChild("cube_r658", CubeListBuilder.create().texOffs(144, 98).mirror().addBox(-0.5F, -1.8485F, -0.2172F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(-0.1549F, -1.8056F, -1.1002F, -0.3491F, 0.0F, 0.0F));

		PartDefinition leftPlate15 = body2.addOrReplaceChild("leftPlate15", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6486F, -7.0545F, -1.249F, -0.208F, 0.3258F, 0.1807F));

		PartDefinition cube_r659 = leftPlate15.addOrReplaceChild("cube_r659", CubeListBuilder.create().texOffs(32, 84).addBox(-0.5F, -0.3333F, -0.4228F, 1.0F, 10.0F, 4.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-0.2372F, -6.9867F, -2.0615F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r660 = leftPlate15.addOrReplaceChild("cube_r660", CubeListBuilder.create().texOffs(134, 124).addBox(-0.5F, -0.3118F, -1.5957F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.22F)), PartPose.offsetAndRotation(-0.2372F, -9.3931F, 0.7873F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r661 = leftPlate15.addOrReplaceChild("cube_r661", CubeListBuilder.create().texOffs(26, 141).addBox(-0.5F, -3.8971F, -0.5435F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.18F)), PartPose.offsetAndRotation(-0.2372F, -9.2931F, 0.7873F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r662 = leftPlate15.addOrReplaceChild("cube_r662", CubeListBuilder.create().texOffs(121, 87).addBox(-0.5F, -0.3054F, -0.2413F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.19F)), PartPose.offsetAndRotation(-0.2372F, -10.4931F, -1.8127F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r663 = leftPlate15.addOrReplaceChild("cube_r663", CubeListBuilder.create().texOffs(88, 143).addBox(-0.5F, -2.7965F, -0.4091F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.187F)), PartPose.offsetAndRotation(-0.2372F, -10.4931F, -1.6127F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r664 = leftPlate15.addOrReplaceChild("cube_r664", CubeListBuilder.create().texOffs(136, 113).addBox(-0.5F, -1.0F, -0.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.213F)), PartPose.offsetAndRotation(-0.2372F, -10.7477F, -0.6791F, 0.7418F, -0.0019F, -0.0018F));

		PartDefinition rightPlate15 = body2.addOrReplaceChild("rightPlate15", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6486F, -7.0545F, -1.249F, -0.208F, -0.3258F, -0.1807F));

		PartDefinition cube_r665 = rightPlate15.addOrReplaceChild("cube_r665", CubeListBuilder.create().texOffs(32, 84).mirror().addBox(-0.5F, -0.3333F, -0.4228F, 1.0F, 10.0F, 4.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(0.2372F, -6.9867F, -2.0615F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r666 = rightPlate15.addOrReplaceChild("cube_r666", CubeListBuilder.create().texOffs(134, 124).mirror().addBox(-0.5F, -0.3118F, -1.5957F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.2372F, -9.3931F, 0.7873F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r667 = rightPlate15.addOrReplaceChild("cube_r667", CubeListBuilder.create().texOffs(26, 141).mirror().addBox(-0.5F, -3.8971F, -0.5435F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.18F)).mirror(false), PartPose.offsetAndRotation(0.2372F, -9.2931F, 0.7873F, 0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r668 = rightPlate15.addOrReplaceChild("cube_r668", CubeListBuilder.create().texOffs(121, 87).mirror().addBox(-0.5F, -0.3054F, -0.2413F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.19F)).mirror(false), PartPose.offsetAndRotation(0.2372F, -10.4931F, -1.8127F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r669 = rightPlate15.addOrReplaceChild("cube_r669", CubeListBuilder.create().texOffs(88, 143).mirror().addBox(-0.5F, -2.7965F, -0.4091F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.187F)).mirror(false), PartPose.offsetAndRotation(0.2372F, -10.4931F, -1.6127F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r670 = rightPlate15.addOrReplaceChild("cube_r670", CubeListBuilder.create().texOffs(136, 113).mirror().addBox(-0.5F, -1.0F, -0.85F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.213F)).mirror(false), PartPose.offsetAndRotation(0.2372F, -10.7477F, -0.6791F, 0.7418F, 0.0019F, 0.0018F));

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