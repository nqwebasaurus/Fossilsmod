package fossils.fossils.client.blockentity.model.balaena;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class BalaenaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart chest;
	private final ModelPart body6;
	private final ModelPart body;
	private final ModelPart body5;
	private final ModelPart body4;
	private final ModelPart body3;
	private final ModelPart body2;
	private final ModelPart hips;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart Baleen;
	private final ModelPart Baleen2;
	private final ModelPart leftOrbit;
	private final ModelPart rightOrbit;
	private final ModelPart jaw;

	public BalaenaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.chest = this.fossil.getChild("chest");
		this.body6 = this.chest.getChild("body6");
		this.body = this.body6.getChild("body");
		this.body5 = this.body.getChild("body5");
		this.body4 = this.body5.getChild("body4");
		this.body3 = this.body4.getChild("body3");
		this.body2 = this.body3.getChild("body2");
		this.hips = this.body2.getChild("hips");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.bone = this.chest.getChild("bone");
		this.bone2 = this.chest.getChild("bone2");
		this.neck2 = this.chest.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.Baleen = this.head.getChild("Baleen");
		this.Baleen2 = this.head.getChild("Baleen2");
		this.leftOrbit = this.head.getChild("leftOrbit");
		this.rightOrbit = this.head.getChild("rightOrbit");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition chest = fossil.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -15.9543F, -15.5138F, -0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r1 = chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(55, 332).addBox(-0.5F, -5.9606F, 0.0306F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.3146F, -1.2706F, 0.1309F, 0.0F, 0.0F));

		PartDefinition chest16_r1 = chest.addOrReplaceChild("chest16_r1", CubeListBuilder.create().texOffs(329, 50).mirror().addBox(-4.5406F, -0.0294F, -0.2984F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7384F, 3.0735F, -10.3314F, 0.196F, 0.1776F, -0.541F));

		PartDefinition chest17_r1 = chest.addOrReplaceChild("chest17_r1", CubeListBuilder.create().texOffs(136, 302).mirror().addBox(-14.1027F, -1.9456F, -0.2984F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7384F, 3.0735F, -10.3314F, 0.1023F, 0.2435F, -0.9823F));

		PartDefinition chest18_r1 = chest.addOrReplaceChild("chest18_r1", CubeListBuilder.create().texOffs(286, 92).mirror().addBox(-21.8246F, -9.2391F, -0.3197F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7384F, 3.0735F, -10.3314F, -0.0476F, 0.2595F, -1.5683F));

		PartDefinition chest18_r2 = chest.addOrReplaceChild("chest18_r2", CubeListBuilder.create().texOffs(289, 275).mirror().addBox(-24.1356F, -20.8285F, -1.5247F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7384F, 0.8735F, -4.0314F, 0.0425F, 0.3301F, -1.994F));

		PartDefinition chest17_r2 = chest.addOrReplaceChild("chest17_r2", CubeListBuilder.create().texOffs(283, 169).mirror().addBox(-21.7934F, -11.4961F, -1.5247F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7384F, 0.8735F, -4.0314F, 0.2054F, 0.2637F, -1.4502F));

		PartDefinition chest16_r2 = chest.addOrReplaceChild("chest16_r2", CubeListBuilder.create().texOffs(298, 301).mirror().addBox(-15.2891F, -3.8659F, -1.5034F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7384F, 0.8735F, -4.0314F, 0.3132F, 0.1143F, -0.8922F));

		PartDefinition chest15_r1 = chest.addOrReplaceChild("chest15_r1", CubeListBuilder.create().texOffs(329, 53).mirror().addBox(-6.4274F, -1.2684F, -1.5034F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7384F, 0.8735F, -4.0314F, 0.3317F, -0.026F, -0.4783F));

		PartDefinition chest16_r3 = chest.addOrReplaceChild("chest16_r3", CubeListBuilder.create().texOffs(331, 127).mirror().addBox(-1.8854F, -0.3028F, -1.5034F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7384F, 0.8735F, -4.0314F, 0.269F, -0.1982F, 0.0664F));

		PartDefinition chest16_r4 = chest.addOrReplaceChild("chest16_r4", CubeListBuilder.create().texOffs(329, 47).mirror().addBox(-4.4125F, -0.1295F, -1.3732F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3384F, -1.7265F, 2.8686F, 0.2366F, 0.1036F, 0.3212F));

		PartDefinition chest15_r2 = chest.addOrReplaceChild("chest15_r2", CubeListBuilder.create().texOffs(277, 328).mirror().addBox(-8.6519F, -2.48F, -1.3732F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3384F, -1.7265F, 2.8686F, 0.1449F, 0.2141F, -0.2427F));

		PartDefinition chest16_r5 = chest.addOrReplaceChild("chest16_r5", CubeListBuilder.create().texOffs(290, 149).mirror().addBox(-16.7932F, -5.9042F, -1.3732F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3384F, -1.7265F, 2.8686F, 0.0394F, 0.255F, -0.6896F));

		PartDefinition chest17_r3 = chest.addOrReplaceChild("chest17_r3", CubeListBuilder.create().texOffs(286, 89).mirror().addBox(-21.9668F, -14.0233F, -1.3945F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3384F, -1.7265F, 2.8686F, -0.1065F, 0.2353F, -1.2745F));

		PartDefinition chest18_r3 = chest.addOrReplaceChild("chest18_r3", CubeListBuilder.create().texOffs(238, 167).mirror().addBox(-32.0222F, -23.1038F, -1.3945F, 20.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3384F, -1.7265F, 2.8686F, -0.21F, 0.1508F, -1.8014F));

		PartDefinition chest17_r4 = chest.addOrReplaceChild("chest17_r4", CubeListBuilder.create().texOffs(259, 95).mirror().addBox(-27.1877F, -23.1205F, -1.6954F, 15.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7384F, -0.5265F, 0.2686F, -0.0857F, 0.1998F, -1.8913F));

		PartDefinition chest16_r6 = chest.addOrReplaceChild("chest16_r6", CubeListBuilder.create().texOffs(289, 278).mirror().addBox(-22.1185F, -13.955F, -1.6954F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7384F, -0.5265F, 0.2686F, 0.0272F, 0.2155F, -1.3561F));

		PartDefinition chest15_r3 = chest.addOrReplaceChild("chest15_r3", CubeListBuilder.create().texOffs(301, 76).mirror().addBox(-16.8844F, -5.765F, -1.6742F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7384F, -0.5265F, 0.2686F, 0.1397F, 0.1668F, -0.7801F));

		PartDefinition chest15_r4 = chest.addOrReplaceChild("chest15_r4", CubeListBuilder.create().texOffs(323, 301).mirror().addBox(-4.3442F, 0.0223F, -1.6742F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7384F, -0.5265F, 0.2686F, 0.2155F, -0.0266F, 0.2088F));

		PartDefinition chest14_r1 = chest.addOrReplaceChild("chest14_r1", CubeListBuilder.create().texOffs(324, 110).mirror().addBox(-8.6758F, -2.3154F, -1.6742F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7384F, -0.5265F, 0.2686F, 0.1967F, 0.0926F, -0.3464F));

		PartDefinition cube_r2 = chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(144, 278).mirror().addBox(-0.9015F, -4.0219F, -0.4549F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8146F, 0.2294F, 0.1216F, 0.3737F, -1.477F));

		PartDefinition cube_r3 = chest.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(11, 309).mirror().addBox(-0.5F, -5.0181F, -1.3376F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.1146F, 4.6294F, 0.3834F, 0.3737F, -1.477F));

		PartDefinition cube_r4 = chest.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(144, 278).addBox(-0.0985F, -4.0219F, -0.4549F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.8146F, 0.2294F, 0.1216F, -0.3737F, 1.477F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(11, 309).addBox(-0.5F, -5.0181F, -1.3376F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.1146F, 4.6294F, 0.3834F, -0.3737F, 1.477F));

		PartDefinition cube_r6 = chest.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(48, 332).addBox(-0.5F, -5.9181F, -2.1376F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.1146F, 4.6294F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(242, 306).addBox(-0.0996F, 0.2888F, -6.0118F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.0146F, -3.2706F, 0.3712F, 0.1313F, -0.3244F));

		PartDefinition chest17_r5 = chest.addOrReplaceChild("chest17_r5", CubeListBuilder.create().texOffs(238, 167).addBox(12.0222F, -23.1038F, -1.3945F, 20.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3384F, -1.7265F, 2.8686F, -0.21F, -0.1508F, 1.8014F));

		PartDefinition chest16_r7 = chest.addOrReplaceChild("chest16_r7", CubeListBuilder.create().texOffs(286, 89).addBox(10.9668F, -14.0233F, -1.3945F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3384F, -1.7265F, 2.8686F, -0.1065F, -0.2353F, 1.2745F));

		PartDefinition chest15_r5 = chest.addOrReplaceChild("chest15_r5", CubeListBuilder.create().texOffs(290, 149).addBox(6.7932F, -5.9042F, -1.3732F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3384F, -1.7265F, 2.8686F, 0.0394F, -0.255F, 0.6896F));

		PartDefinition chest14_r2 = chest.addOrReplaceChild("chest14_r2", CubeListBuilder.create().texOffs(277, 328).addBox(3.652F, -2.48F, -1.3732F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3384F, -1.7265F, 2.8686F, 0.1449F, -0.2141F, 0.2427F));

		PartDefinition chest15_r6 = chest.addOrReplaceChild("chest15_r6", CubeListBuilder.create().texOffs(329, 47).addBox(-0.5875F, -0.1295F, -1.3732F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3384F, -1.7265F, 2.8686F, 0.2366F, -0.1036F, -0.3212F));

		PartDefinition chest17_r6 = chest.addOrReplaceChild("chest17_r6", CubeListBuilder.create().texOffs(286, 92).addBox(10.8246F, -9.2391F, -0.3197F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7384F, 3.0735F, -10.3314F, -0.0476F, -0.2595F, 1.5683F));

		PartDefinition chest16_r8 = chest.addOrReplaceChild("chest16_r8", CubeListBuilder.create().texOffs(136, 302).addBox(4.1027F, -1.9456F, -0.2984F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7384F, 3.0735F, -10.3314F, 0.1023F, -0.2435F, 0.9823F));

		PartDefinition chest15_r7 = chest.addOrReplaceChild("chest15_r7", CubeListBuilder.create().texOffs(329, 50).addBox(-0.4594F, -0.0294F, -0.2984F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7384F, 3.0735F, -10.3314F, 0.196F, -0.1776F, 0.541F));

		PartDefinition chest15_r8 = chest.addOrReplaceChild("chest15_r8", CubeListBuilder.create().texOffs(331, 127).addBox(-2.1146F, -0.3028F, -1.5034F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7384F, 0.8735F, -4.0314F, 0.269F, 0.1982F, -0.0664F));

		PartDefinition chest14_r3 = chest.addOrReplaceChild("chest14_r3", CubeListBuilder.create().texOffs(329, 53).addBox(1.4274F, -1.2684F, -1.5034F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7384F, 0.8735F, -4.0314F, 0.3317F, 0.026F, 0.4783F));

		PartDefinition chest15_r9 = chest.addOrReplaceChild("chest15_r9", CubeListBuilder.create().texOffs(298, 301).addBox(5.2891F, -3.8659F, -1.5034F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7384F, 0.8735F, -4.0314F, 0.3132F, -0.1143F, 0.8922F));

		PartDefinition chest16_r9 = chest.addOrReplaceChild("chest16_r9", CubeListBuilder.create().texOffs(283, 169).addBox(10.7934F, -11.4961F, -1.5247F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7384F, 0.8735F, -4.0314F, 0.2054F, -0.2637F, 1.4502F));

		PartDefinition chest17_r7 = chest.addOrReplaceChild("chest17_r7", CubeListBuilder.create().texOffs(289, 275).addBox(13.1356F, -20.8285F, -1.5247F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7384F, 0.8735F, -4.0314F, 0.0425F, -0.3301F, 1.994F));

		PartDefinition chest13_r1 = chest.addOrReplaceChild("chest13_r1", CubeListBuilder.create().texOffs(324, 110).addBox(3.6758F, -2.3154F, -1.6742F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7384F, -0.5265F, 0.2686F, 0.1967F, -0.0926F, 0.3464F));

		PartDefinition chest14_r4 = chest.addOrReplaceChild("chest14_r4", CubeListBuilder.create().texOffs(323, 301).addBox(-0.6558F, 0.0223F, -1.6742F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7384F, -0.5265F, 0.2686F, 0.2155F, 0.0266F, -0.2088F));

		PartDefinition chest14_r5 = chest.addOrReplaceChild("chest14_r5", CubeListBuilder.create().texOffs(301, 76).addBox(6.8845F, -5.765F, -1.6742F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7384F, -0.5265F, 0.2686F, 0.1397F, -0.1668F, 0.7801F));

		PartDefinition chest15_r10 = chest.addOrReplaceChild("chest15_r10", CubeListBuilder.create().texOffs(289, 278).addBox(11.1185F, -13.955F, -1.6954F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7384F, -0.5265F, 0.2686F, 0.0272F, -0.2155F, 1.3561F));

		PartDefinition chest16_r10 = chest.addOrReplaceChild("chest16_r10", CubeListBuilder.create().texOffs(259, 95).addBox(12.1877F, -23.1205F, -1.6954F, 15.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7384F, -0.5265F, 0.2686F, -0.0857F, -0.1998F, 1.8913F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(224, 140).addBox(-2.0F, -0.1935F, -0.3873F, 4.0F, 4.0F, 13.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.2854F, -5.5706F, 0.3054F, 0.0F, 0.0F));

		PartDefinition body6 = chest.addOrReplaceChild("body6", CubeListBuilder.create().texOffs(29, 206).addBox(-2.0F, -1.4F, -0.3F, 4.0F, 4.0F, 14.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.393F, 6.83F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body6.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(98, 331).addBox(-0.5F, -6.7698F, -0.0994F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, 11.8F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body6.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(28, 333).addBox(-0.5F, -6.4F, -0.1F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, 7.8F, 0.0175F, 0.0F, 0.0F));

		PartDefinition chest14_r6 = body6.addOrReplaceChild("chest14_r6", CubeListBuilder.create().texOffs(326, 220).mirror().addBox(-8.8796F, -2.343F, -1.1028F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5384F, -1.9335F, 11.6387F, -0.1084F, 0.309F, -0.3967F));

		PartDefinition chest15_r11 = body6.addOrReplaceChild("chest15_r11", CubeListBuilder.create().texOffs(313, 89).mirror().addBox(-4.5309F, 0.1084F, -1.1028F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5384F, -1.9335F, 11.6387F, 0.0806F, 0.3171F, 0.2003F));

		PartDefinition chest15_r12 = body6.addOrReplaceChild("chest15_r12", CubeListBuilder.create().texOffs(294, 95).mirror().addBox(-17.0574F, -5.8761F, -1.1028F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5384F, -1.9335F, 11.6387F, -0.2301F, 0.2342F, -0.8434F));

		PartDefinition chest17_r8 = body6.addOrReplaceChild("chest17_r8", CubeListBuilder.create().texOffs(241, 67).mirror().addBox(-32.169F, -23.3253F, -1.1241F, 20.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5384F, -1.9335F, 11.6387F, -0.3147F, -0.0898F, -1.8928F));

		PartDefinition chest16_r11 = body6.addOrReplaceChild("chest16_r11", CubeListBuilder.create().texOffs(288, 6).mirror().addBox(-22.2047F, -14.1416F, -1.1241F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5384F, -1.9335F, 11.6387F, -0.3181F, 0.0766F, -1.3957F));

		PartDefinition chest13_r2 = body6.addOrReplaceChild("chest13_r2", CubeListBuilder.create().texOffs(326, 217).mirror().addBox(-8.8796F, -2.343F, -1.1028F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5384F, -1.9335F, 7.6387F, -0.0744F, 0.3223F, -0.3862F));

		PartDefinition chest14_r7 = body6.addOrReplaceChild("chest14_r7", CubeListBuilder.create().texOffs(310, 169).mirror().addBox(-4.5309F, 0.1084F, -1.1028F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5384F, -1.9335F, 7.6387F, 0.1165F, 0.31F, 0.2113F));

		PartDefinition chest14_r8 = body6.addOrReplaceChild("chest14_r8", CubeListBuilder.create().texOffs(294, 32).mirror().addBox(-17.0574F, -5.8761F, -1.1028F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5384F, -1.9335F, 7.6387F, -0.2061F, 0.2602F, -0.8375F));

		PartDefinition chest16_r12 = body6.addOrReplaceChild("chest16_r12", CubeListBuilder.create().texOffs(238, 161).mirror().addBox(-33.169F, -23.3253F, -1.1241F, 21.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5384F, -1.9335F, 7.6387F, -0.3257F, -0.0567F, -1.892F));

		PartDefinition chest15_r13 = body6.addOrReplaceChild("chest15_r13", CubeListBuilder.create().texOffs(288, 3).mirror().addBox(-22.2047F, -14.1416F, -1.1241F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5384F, -1.9335F, 7.6387F, -0.3119F, 0.1109F, -1.3951F));

		PartDefinition chest16_r13 = body6.addOrReplaceChild("chest16_r13", CubeListBuilder.create().texOffs(238, 164).mirror().addBox(-32.2005F, -23.2359F, -1.0921F, 20.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6384F, -1.9335F, -0.3613F, -0.3313F, -0.0401F, -1.8917F));

		PartDefinition chest15_r14 = body6.addOrReplaceChild("chest15_r14", CubeListBuilder.create().texOffs(288, 0).mirror().addBox(-22.1873F, -14.0485F, -1.0921F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6384F, -1.9335F, -0.3613F, -0.3089F, 0.1281F, -1.3948F));

		PartDefinition chest14_r9 = body6.addOrReplaceChild("chest14_r9", CubeListBuilder.create().texOffs(294, 12).mirror().addBox(-16.9928F, -5.8069F, -1.0708F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6384F, -1.9335F, -0.3613F, -0.194F, 0.2731F, -0.8343F));

		PartDefinition chest13_r3 = body6.addOrReplaceChild("chest13_r3", CubeListBuilder.create().texOffs(326, 27).mirror().addBox(-8.7917F, -2.3076F, -1.0708F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6384F, -1.9335F, -0.3613F, -0.0573F, 0.3288F, -0.3807F));

		PartDefinition chest14_r10 = body6.addOrReplaceChild("chest14_r10", CubeListBuilder.create().texOffs(320, 131).mirror().addBox(-4.4377F, 0.0911F, -1.0708F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6384F, -1.9335F, -0.3613F, 0.1344F, 0.3063F, 0.2168F));

		PartDefinition chest15_r15 = body6.addOrReplaceChild("chest15_r15", CubeListBuilder.create().texOffs(238, 158).mirror().addBox(-33.169F, -23.3253F, -1.1241F, 21.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5384F, -1.9335F, 3.6387F, -0.3257F, -0.0567F, -1.892F));

		PartDefinition chest13_r4 = body6.addOrReplaceChild("chest13_r4", CubeListBuilder.create().texOffs(309, 225).mirror().addBox(-4.5309F, 0.1084F, -1.1028F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5384F, -1.9335F, 3.6387F, 0.1165F, 0.31F, 0.2113F));

		PartDefinition cube_r11 = body6.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(331, 272).mirror().addBox(-1.2F, -3.2F, 5.6F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(21, 333).mirror().addBox(-1.1F, -4.9F, 2.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(333, 10).mirror().addBox(-1.0F, -7.9F, -5.4F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4F, 5.7F, 0.4097F, 0.0187F, -1.326F));

		PartDefinition cube_r12 = body6.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(295, 332).mirror().addBox(-1.1F, -6.5F, -2.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.4F, 5.7F, 0.3748F, 0.0187F, -1.326F));

		PartDefinition chest12_r1 = body6.addOrReplaceChild("chest12_r1", CubeListBuilder.create().texOffs(325, 166).mirror().addBox(-8.8796F, -2.343F, -1.1028F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5384F, -1.9335F, 3.6387F, -0.0744F, 0.3223F, -0.3862F));

		PartDefinition chest13_r5 = body6.addOrReplaceChild("chest13_r5", CubeListBuilder.create().texOffs(293, 216).mirror().addBox(-17.0574F, -5.8761F, -1.1028F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5384F, -1.9335F, 3.6387F, -0.2061F, 0.2602F, -0.8375F));

		PartDefinition chest14_r11 = body6.addOrReplaceChild("chest14_r11", CubeListBuilder.create().texOffs(283, 287).mirror().addBox(-22.2047F, -14.1416F, -1.1241F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5384F, -1.9335F, 3.6387F, -0.3119F, 0.1109F, -1.3951F));

		PartDefinition cube_r13 = body6.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(331, 272).addBox(0.2F, -3.2F, 5.6F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(21, 333).addBox(0.1F, -4.9F, 2.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(333, 10).addBox(0.0F, -7.9F, -5.4F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, 5.7F, 0.4097F, -0.0187F, 1.326F));

		PartDefinition cube_r14 = body6.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(295, 332).addBox(0.1F, -6.5F, -2.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, 5.7F, 0.3748F, -0.0187F, 1.326F));

		PartDefinition cube_r15 = body6.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(288, 332).addBox(-0.5F, -6.3F, -2.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.4F, 5.7F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r16 = body6.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(332, 238).addBox(-0.5F, -7.4F, -1.3F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition chest13_r6 = body6.addOrReplaceChild("chest13_r6", CubeListBuilder.create().texOffs(320, 131).addBox(-1.5623F, 0.0911F, -1.0708F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6384F, -1.9335F, -0.3613F, 0.1344F, -0.3063F, -0.2168F));

		PartDefinition chest12_r2 = body6.addOrReplaceChild("chest12_r2", CubeListBuilder.create().texOffs(326, 27).addBox(3.7917F, -2.3076F, -1.0708F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6384F, -1.9335F, -0.3613F, -0.0573F, -0.3288F, 0.3807F));

		PartDefinition chest13_r7 = body6.addOrReplaceChild("chest13_r7", CubeListBuilder.create().texOffs(294, 12).addBox(6.9927F, -5.8069F, -1.0708F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6384F, -1.9335F, -0.3613F, -0.194F, -0.2731F, 0.8343F));

		PartDefinition chest14_r12 = body6.addOrReplaceChild("chest14_r12", CubeListBuilder.create().texOffs(288, 0).addBox(11.1874F, -14.0485F, -1.0921F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6384F, -1.9335F, -0.3613F, -0.3089F, -0.1281F, 1.3948F));

		PartDefinition chest15_r16 = body6.addOrReplaceChild("chest15_r16", CubeListBuilder.create().texOffs(238, 164).addBox(12.2005F, -23.2359F, -1.0921F, 20.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6384F, -1.9335F, -0.3613F, -0.3313F, 0.0401F, 1.8917F));

		PartDefinition chest15_r17 = body6.addOrReplaceChild("chest15_r17", CubeListBuilder.create().texOffs(288, 6).addBox(11.2047F, -14.1416F, -1.1241F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5384F, -1.9335F, 11.6387F, -0.3181F, -0.0766F, 1.3957F));

		PartDefinition chest16_r14 = body6.addOrReplaceChild("chest16_r14", CubeListBuilder.create().texOffs(241, 67).addBox(12.169F, -23.3253F, -1.1241F, 20.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5384F, -1.9335F, 11.6387F, -0.3147F, 0.0898F, 1.8928F));

		PartDefinition chest14_r13 = body6.addOrReplaceChild("chest14_r13", CubeListBuilder.create().texOffs(294, 95).addBox(7.0574F, -5.8761F, -1.1028F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5384F, -1.9335F, 11.6387F, -0.2301F, -0.2342F, 0.8434F));

		PartDefinition chest14_r14 = body6.addOrReplaceChild("chest14_r14", CubeListBuilder.create().texOffs(313, 89).addBox(-2.4691F, 0.1084F, -1.1028F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5384F, -1.9335F, 11.6387F, 0.0806F, -0.3171F, -0.2003F));

		PartDefinition chest13_r8 = body6.addOrReplaceChild("chest13_r8", CubeListBuilder.create().texOffs(326, 220).addBox(3.8796F, -2.343F, -1.1028F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5384F, -1.9335F, 11.6387F, -0.1084F, -0.309F, 0.3967F));

		PartDefinition chest14_r15 = body6.addOrReplaceChild("chest14_r15", CubeListBuilder.create().texOffs(288, 3).addBox(11.2047F, -14.1416F, -1.1241F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5384F, -1.9335F, 7.6387F, -0.3119F, -0.1109F, 1.3951F));

		PartDefinition chest15_r18 = body6.addOrReplaceChild("chest15_r18", CubeListBuilder.create().texOffs(238, 161).addBox(12.169F, -23.3253F, -1.1241F, 21.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5384F, -1.9335F, 7.6387F, -0.3257F, 0.0567F, 1.892F));

		PartDefinition chest13_r9 = body6.addOrReplaceChild("chest13_r9", CubeListBuilder.create().texOffs(294, 32).addBox(7.0574F, -5.8761F, -1.1028F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5384F, -1.9335F, 7.6387F, -0.2061F, -0.2602F, 0.8375F));

		PartDefinition chest13_r10 = body6.addOrReplaceChild("chest13_r10", CubeListBuilder.create().texOffs(310, 169).addBox(-2.4691F, 0.1084F, -1.1028F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5384F, -1.9335F, 7.6387F, 0.1165F, -0.31F, -0.2113F));

		PartDefinition chest12_r3 = body6.addOrReplaceChild("chest12_r3", CubeListBuilder.create().texOffs(326, 217).addBox(3.8796F, -2.343F, -1.1028F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5384F, -1.9335F, 7.6387F, -0.0744F, -0.3223F, 0.3862F));

		PartDefinition chest12_r4 = body6.addOrReplaceChild("chest12_r4", CubeListBuilder.create().texOffs(309, 225).addBox(-2.4691F, 0.1084F, -1.1028F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5384F, -1.9335F, 3.6387F, 0.1165F, -0.31F, -0.2113F));

		PartDefinition chest11_r1 = body6.addOrReplaceChild("chest11_r1", CubeListBuilder.create().texOffs(325, 166).addBox(3.8796F, -2.343F, -1.1028F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5384F, -1.9335F, 3.6387F, -0.0744F, -0.3223F, 0.3862F));

		PartDefinition chest12_r5 = body6.addOrReplaceChild("chest12_r5", CubeListBuilder.create().texOffs(293, 216).addBox(7.0574F, -5.8761F, -1.1028F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5384F, -1.9335F, 3.6387F, -0.2061F, -0.2602F, 0.8375F));

		PartDefinition chest14_r16 = body6.addOrReplaceChild("chest14_r16", CubeListBuilder.create().texOffs(238, 158).addBox(12.169F, -23.3253F, -1.1241F, 21.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5384F, -1.9335F, 3.6387F, -0.3257F, 0.0567F, 1.892F));

		PartDefinition chest13_r11 = body6.addOrReplaceChild("chest13_r11", CubeListBuilder.create().texOffs(283, 287).addBox(11.2047F, -14.1416F, -1.1241F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5384F, -1.9335F, 3.6387F, -0.3119F, -0.1109F, 1.3951F));

		PartDefinition body = body6.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7413F, 13.7215F, -0.0349F, -0.0436F, 0.0015F));

		PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(153, 324).addBox(-0.5F, -8.0603F, 0.0117F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.2F, 13.6F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(326, 289).addBox(-0.5F, -7.5905F, 0.0111F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.2F, 9.6F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r19 = body.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(326, 172).addBox(-0.5F, -7.3207F, 0.0105F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.2F, 5.6F, -0.0262F, 0.0F, 0.0F));

		PartDefinition chest20_r1 = body.addOrReplaceChild("chest20_r1", CubeListBuilder.create().texOffs(257, 13).mirror().addBox(-28.169F, -23.3253F, -1.1241F, 16.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5384F, -3.2748F, 13.6171F, -0.2923F, -0.156F, -1.8955F));

		PartDefinition chest19_r1 = body.addOrReplaceChild("chest19_r1", CubeListBuilder.create().texOffs(288, 143).mirror().addBox(-22.2047F, -14.1416F, -1.1241F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5384F, -3.2748F, 13.6171F, -0.3302F, 0.0078F, -1.3962F));

		PartDefinition chest18_r4 = body.addOrReplaceChild("chest18_r4", CubeListBuilder.create().texOffs(301, 70).mirror().addBox(-17.0574F, -5.8761F, -1.1028F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5384F, -3.2748F, 13.6171F, -0.2773F, 0.1818F, -0.8531F));

		PartDefinition chest17_r9 = body.addOrReplaceChild("chest17_r9", CubeListBuilder.create().texOffs(328, 223).mirror().addBox(-8.8796F, -2.343F, -1.1028F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5384F, -3.2748F, 13.6171F, -0.1754F, 0.2813F, -0.4163F));

		PartDefinition chest18_r5 = body.addOrReplaceChild("chest18_r5", CubeListBuilder.create().texOffs(98, 328).mirror().addBox(-4.5309F, 0.1084F, -1.1028F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5384F, -3.2748F, 13.6171F, 0.0083F, 0.3302F, 0.1773F));

		PartDefinition chest19_r2 = body.addOrReplaceChild("chest19_r2", CubeListBuilder.create().texOffs(253, 35).mirror().addBox(-29.169F, -23.3253F, -1.1241F, 17.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5384F, -3.2748F, 9.6171F, -0.2923F, -0.156F, -1.8955F));

		PartDefinition chest18_r6 = body.addOrReplaceChild("chest18_r6", CubeListBuilder.create().texOffs(288, 140).mirror().addBox(-22.2047F, -14.1416F, -1.1241F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5384F, -3.2748F, 9.6171F, -0.3302F, 0.0078F, -1.3962F));

		PartDefinition chest17_r10 = body.addOrReplaceChild("chest17_r10", CubeListBuilder.create().texOffs(207, 300).mirror().addBox(-17.0574F, -5.8761F, -1.1028F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5384F, -3.2748F, 9.6171F, -0.2773F, 0.1818F, -0.8531F));

		PartDefinition chest16_r15 = body.addOrReplaceChild("chest16_r15", CubeListBuilder.create().texOffs(327, 284).mirror().addBox(-8.8796F, -2.343F, -1.1028F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5384F, -3.2748F, 9.6171F, -0.1754F, 0.2813F, -0.4163F));

		PartDefinition chest17_r11 = body.addOrReplaceChild("chest17_r11", CubeListBuilder.create().texOffs(321, 249).mirror().addBox(-4.5309F, 0.1084F, -1.1028F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.5384F, -3.2748F, 9.6171F, 0.0083F, 0.3302F, 0.1773F));

		PartDefinition chest16_r16 = body.addOrReplaceChild("chest16_r16", CubeListBuilder.create().texOffs(315, 160).mirror().addBox(-4.5309F, 0.1084F, -1.1029F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5384F, -3.2748F, 5.9171F, 0.0445F, 0.3238F, 0.1889F));

		PartDefinition chest15_r19 = body.addOrReplaceChild("chest15_r19", CubeListBuilder.create().texOffs(327, 281).mirror().addBox(-8.8796F, -2.343F, -1.1029F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5384F, -3.2748F, 5.9171F, -0.142F, 0.2953F, -0.4068F));

		PartDefinition chest16_r17 = body.addOrReplaceChild("chest16_r17", CubeListBuilder.create().texOffs(182, 300).mirror().addBox(-17.0574F, -5.8761F, -1.1029F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5384F, -3.2748F, 5.9171F, -0.2539F, 0.208F, -0.8486F));

		PartDefinition chest17_r12 = body.addOrReplaceChild("chest17_r12", CubeListBuilder.create().texOffs(288, 137).mirror().addBox(-22.2047F, -14.1416F, -1.1241F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5384F, -3.2748F, 5.9171F, -0.3241F, 0.0422F, -1.3961F));

		PartDefinition chest18_r7 = body.addOrReplaceChild("chest18_r7", CubeListBuilder.create().texOffs(253, 32).mirror().addBox(-30.169F, -23.3253F, -1.1241F, 18.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5384F, -3.2748F, 5.9171F, -0.3036F, -0.1229F, -1.8939F));

		PartDefinition chest17_r13 = body.addOrReplaceChild("chest17_r13", CubeListBuilder.create().texOffs(238, 170).mirror().addBox(-32.169F, -23.3253F, -1.1241F, 20.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5384F, -3.2748F, 1.9171F, -0.3147F, -0.0898F, -1.8928F));

		PartDefinition chest16_r18 = body.addOrReplaceChild("chest16_r18", CubeListBuilder.create().texOffs(288, 9).mirror().addBox(-22.2047F, -14.1416F, -1.1241F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5384F, -3.2748F, 1.9171F, -0.3181F, 0.0766F, -1.3957F));

		PartDefinition chest15_r20 = body.addOrReplaceChild("chest15_r20", CubeListBuilder.create().texOffs(295, 57).mirror().addBox(-17.0574F, -5.8761F, -1.1028F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5384F, -3.2748F, 1.9171F, -0.2301F, 0.2342F, -0.8434F));

		PartDefinition chest14_r17 = body.addOrReplaceChild("chest14_r17", CubeListBuilder.create().texOffs(327, 211).mirror().addBox(-8.8796F, -2.343F, -1.1028F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5384F, -3.2748F, 1.9171F, -0.1084F, 0.309F, -0.3967F));

		PartDefinition chest15_r21 = body.addOrReplaceChild("chest15_r21", CubeListBuilder.create().texOffs(313, 92).mirror().addBox(-4.5309F, 0.1084F, -1.1028F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.5384F, -3.2748F, 1.9171F, 0.0806F, 0.3171F, 0.2003F));

		PartDefinition cube_r20 = body.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(319, 330).mirror().addBox(-0.6F, -2.7561F, 11.3117F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(129, 331).mirror().addBox(-0.8F, -3.1561F, 7.3117F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(332, 193).mirror().addBox(-0.9F, -4.7561F, 3.5117F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(259, 291).mirror().addBox(-1.0F, -6.0561F, -0.2883F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.1F, 1.9F, 0.3438F, -0.0166F, -1.2653F));

		PartDefinition cube_r21 = body.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(319, 330).addBox(-0.4F, -2.7561F, 11.3117F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(129, 331).addBox(-0.2F, -3.1561F, 7.3117F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(332, 193).addBox(-0.1F, -4.7561F, 3.5117F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(259, 291).addBox(0.0F, -6.0561F, -0.2883F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.1F, 1.9F, 0.3438F, 0.0166F, 1.2653F));

		PartDefinition cube_r22 = body.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(312, 330).addBox(-0.5F, -7.0561F, -0.2883F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -2.1F, 1.9F, -0.0175F, 0.0F, 0.0F));

		PartDefinition chest17_r14 = body.addOrReplaceChild("chest17_r14", CubeListBuilder.create().texOffs(98, 328).addBox(-0.4691F, 0.1084F, -1.1028F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5384F, -3.2748F, 13.6171F, 0.0083F, -0.3302F, -0.1773F));

		PartDefinition chest16_r19 = body.addOrReplaceChild("chest16_r19", CubeListBuilder.create().texOffs(328, 223).addBox(3.8796F, -2.343F, -1.1028F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5384F, -3.2748F, 13.6171F, -0.1754F, -0.2813F, 0.4163F));

		PartDefinition chest17_r15 = body.addOrReplaceChild("chest17_r15", CubeListBuilder.create().texOffs(301, 70).addBox(7.0574F, -5.8761F, -1.1028F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5384F, -3.2748F, 13.6171F, -0.2773F, -0.1818F, 0.8531F));

		PartDefinition chest18_r8 = body.addOrReplaceChild("chest18_r8", CubeListBuilder.create().texOffs(288, 143).addBox(11.2047F, -14.1416F, -1.1241F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5384F, -3.2748F, 13.6171F, -0.3302F, -0.0078F, 1.3962F));

		PartDefinition chest19_r3 = body.addOrReplaceChild("chest19_r3", CubeListBuilder.create().texOffs(257, 13).addBox(12.169F, -23.3253F, -1.1241F, 16.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5384F, -3.2748F, 13.6171F, -0.2923F, 0.156F, 1.8955F));

		PartDefinition chest16_r20 = body.addOrReplaceChild("chest16_r20", CubeListBuilder.create().texOffs(321, 249).addBox(-1.4691F, 0.1084F, -1.1028F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5384F, -3.2748F, 9.6171F, 0.0083F, -0.3302F, -0.1773F));

		PartDefinition chest15_r22 = body.addOrReplaceChild("chest15_r22", CubeListBuilder.create().texOffs(327, 284).addBox(3.8796F, -2.343F, -1.1028F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5384F, -3.2748F, 9.6171F, -0.1754F, -0.2813F, 0.4163F));

		PartDefinition chest16_r21 = body.addOrReplaceChild("chest16_r21", CubeListBuilder.create().texOffs(207, 300).addBox(7.0574F, -5.8761F, -1.1028F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5384F, -3.2748F, 9.6171F, -0.2773F, -0.1818F, 0.8531F));

		PartDefinition chest17_r16 = body.addOrReplaceChild("chest17_r16", CubeListBuilder.create().texOffs(288, 140).addBox(11.2047F, -14.1416F, -1.1241F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5384F, -3.2748F, 9.6171F, -0.3302F, -0.0078F, 1.3962F));

		PartDefinition chest18_r9 = body.addOrReplaceChild("chest18_r9", CubeListBuilder.create().texOffs(253, 35).addBox(12.169F, -23.3253F, -1.1241F, 17.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5384F, -3.2748F, 9.6171F, -0.2923F, 0.156F, 1.8955F));

		PartDefinition chest17_r17 = body.addOrReplaceChild("chest17_r17", CubeListBuilder.create().texOffs(253, 32).addBox(12.169F, -23.3253F, -1.1241F, 18.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5384F, -3.2748F, 5.9171F, -0.3036F, 0.1229F, 1.8939F));

		PartDefinition chest16_r22 = body.addOrReplaceChild("chest16_r22", CubeListBuilder.create().texOffs(288, 137).addBox(11.2047F, -14.1416F, -1.1241F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5384F, -3.2748F, 5.9171F, -0.3241F, -0.0422F, 1.3961F));

		PartDefinition chest15_r23 = body.addOrReplaceChild("chest15_r23", CubeListBuilder.create().texOffs(182, 300).addBox(7.0574F, -5.8761F, -1.1029F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5384F, -3.2748F, 5.9171F, -0.2539F, -0.208F, 0.8486F));

		PartDefinition chest14_r18 = body.addOrReplaceChild("chest14_r18", CubeListBuilder.create().texOffs(327, 281).addBox(3.8796F, -2.343F, -1.1029F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5384F, -3.2748F, 5.9171F, -0.142F, -0.2953F, 0.4068F));

		PartDefinition chest15_r24 = body.addOrReplaceChild("chest15_r24", CubeListBuilder.create().texOffs(315, 160).addBox(-2.4691F, 0.1084F, -1.1029F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5384F, -3.2748F, 5.9171F, 0.0445F, -0.3238F, -0.1889F));

		PartDefinition chest14_r19 = body.addOrReplaceChild("chest14_r19", CubeListBuilder.create().texOffs(313, 92).addBox(-2.4691F, 0.1084F, -1.1028F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5384F, -3.2748F, 1.9171F, 0.0806F, -0.3171F, -0.2003F));

		PartDefinition chest13_r12 = body.addOrReplaceChild("chest13_r12", CubeListBuilder.create().texOffs(327, 211).addBox(3.8796F, -2.343F, -1.1028F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5384F, -3.2748F, 1.9171F, -0.1084F, -0.309F, 0.3967F));

		PartDefinition chest14_r20 = body.addOrReplaceChild("chest14_r20", CubeListBuilder.create().texOffs(295, 57).addBox(7.0574F, -5.8761F, -1.1028F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5384F, -3.2748F, 1.9171F, -0.2301F, -0.2342F, 0.8434F));

		PartDefinition chest15_r25 = body.addOrReplaceChild("chest15_r25", CubeListBuilder.create().texOffs(288, 9).addBox(11.2047F, -14.1416F, -1.1241F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5384F, -3.2748F, 1.9171F, -0.3181F, -0.0766F, 1.3957F));

		PartDefinition chest16_r23 = body.addOrReplaceChild("chest16_r23", CubeListBuilder.create().texOffs(238, 170).addBox(12.169F, -23.3253F, -1.1241F, 20.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5384F, -3.2748F, 1.9171F, -0.3147F, 0.0898F, 1.8928F));

		PartDefinition cube_r23 = body.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(175, 26).addBox(-2.0F, -3.9154F, 0.0794F, 4.0F, 4.0F, 18.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 1.8F, -0.4F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body5 = body.addOrReplaceChild("body5", CubeListBuilder.create().texOffs(97, 158).addBox(-2.0F, -2.4F, 0.0F, 4.0F, 4.0F, 19.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1509F, 16.9254F, -0.1397F, 0.0259F, -0.0036F));

		PartDefinition cube_r24 = body5.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(174, 324).addBox(-0.5F, -8.7F, 0.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3F, 16.0F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r25 = body5.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(324, 98).addBox(-0.5F, -8.6F, -0.1F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, 12.1F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r26 = body5.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(167, 324).addBox(-0.5F, -8.5F, 0.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, 8.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r27 = body5.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(160, 324).addBox(-0.5F, -8.0F, -0.1F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 4.1F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r28 = body5.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(84, 325).mirror().addBox(-0.4F, -6.5F, -1.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.015F, -2.0383F, 17.4412F, -0.1669F, -0.0355F, -1.4888F));

		PartDefinition chest19_r4 = body5.addOrReplaceChild("chest19_r4", CubeListBuilder.create().texOffs(232, 300).mirror().addBox(-2.8457F, 0.444F, -0.448F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0384F, -2.2239F, 13.1917F, 0.222F, 0.3948F, -0.2364F));

		PartDefinition chest20_r2 = body5.addOrReplaceChild("chest20_r2", CubeListBuilder.create().texOffs(292, 35).mirror().addBox(-12.7667F, -0.8002F, -0.448F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0384F, -2.2239F, 13.1917F, 0.024F, 0.4494F, -0.7118F));

		PartDefinition chest21_r1 = body5.addOrReplaceChild("chest21_r1", CubeListBuilder.create().texOffs(282, 26).mirror().addBox(-21.3132F, -7.5552F, -0.4693F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0384F, -2.2239F, 13.1917F, -0.2346F, 0.3877F, -1.3307F));

		PartDefinition cube_r29 = body5.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(113, 329).mirror().addBox(-0.9298F, -8.143F, -0.7236F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0689F, -2.2426F, 12.7905F, -0.1693F, -0.0209F, -1.4027F));

		PartDefinition chest19_r5 = body5.addOrReplaceChild("chest19_r5", CubeListBuilder.create().texOffs(316, 257).mirror().addBox(-2.8832F, 0.5302F, -0.4332F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8384F, -2.2239F, 5.2917F, -0.0573F, 0.3288F, -0.3807F));

		PartDefinition chest20_r3 = body5.addOrReplaceChild("chest20_r3", CubeListBuilder.create().texOffs(259, 153).mirror().addBox(-12.8371F, -0.738F, -0.4332F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8384F, -2.2239F, 5.2917F, -0.194F, 0.2731F, -0.8343F));

		PartDefinition chest21_r2 = body5.addOrReplaceChild("chest21_r2", CubeListBuilder.create().texOffs(282, 29).mirror().addBox(-21.4061F, -7.5406F, -0.4545F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8384F, -2.2239F, 5.2917F, -0.3089F, 0.1281F, -1.3948F));

		PartDefinition chest22_r1 = body5.addOrReplaceChild("chest22_r1", CubeListBuilder.create().texOffs(302, 166).mirror().addBox(-23.7779F, -17.2093F, -0.4545F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.8384F, -2.2239F, 5.2917F, -0.3313F, -0.0401F, -1.8917F));

		PartDefinition cube_r30 = body5.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(63, 329).mirror().addBox(-0.9298F, -8.143F, -0.7236F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2065F, -2.3505F, 8.7944F, -0.0384F, -0.0209F, -1.4027F));

		PartDefinition chest21_r3 = body5.addOrReplaceChild("chest21_r3", CubeListBuilder.create().texOffs(329, 169).mirror().addBox(-18.7779F, -17.2093F, -0.4545F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0384F, -2.2239F, 9.2917F, -0.345F, 0.0013F, -1.8914F));

		PartDefinition chest20_r4 = body5.addOrReplaceChild("chest20_r4", CubeListBuilder.create().texOffs(0, 221).mirror().addBox(-21.4061F, -7.5406F, -0.4545F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0384F, -2.2239F, 9.2917F, -0.3011F, 0.1711F, -1.3936F));

		PartDefinition chest19_r6 = body5.addOrReplaceChild("chest19_r6", CubeListBuilder.create().texOffs(290, 146).mirror().addBox(-12.8371F, -0.738F, -0.4332F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0384F, -2.2239F, 9.2917F, -0.1633F, 0.3053F, -0.8255F));

		PartDefinition chest18_r10 = body5.addOrReplaceChild("chest18_r10", CubeListBuilder.create().texOffs(29, 203).mirror().addBox(-2.8832F, 0.5302F, -0.4332F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0384F, -2.2239F, 9.2917F, -0.0143F, 0.3447F, -0.3665F));

		PartDefinition chest20_r5 = body5.addOrReplaceChild("chest20_r5", CubeListBuilder.create().texOffs(258, 217).mirror().addBox(-27.3105F, -18.16F, -0.5859F, 15.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0384F, -2.7239F, 0.4917F, -0.3251F, -0.0346F, -1.829F));

		PartDefinition chest19_r7 = body5.addOrReplaceChild("chest19_r7", CubeListBuilder.create().texOffs(289, 257).mirror().addBox(-20.1434F, -8.7274F, -0.5859F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0384F, -2.7239F, 0.4917F, -0.295F, 0.1428F, -1.2887F));

		PartDefinition chest18_r11 = body5.addOrReplaceChild("chest18_r11", CubeListBuilder.create().texOffs(301, 73).mirror().addBox(-12.5725F, -0.991F, -0.23F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0384F, -2.7239F, 0.4917F, -0.1656F, 0.2682F, -0.6009F));

		PartDefinition chest17_r18 = body5.addOrReplaceChild("chest17_r18", CubeListBuilder.create().texOffs(48, 329).mirror().addBox(-2.7503F, 0.1891F, -0.23F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0384F, -2.7239F, 0.4917F, -0.0337F, 0.3124F, -0.1474F));

		PartDefinition cube_r31 = body5.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(7, 328).mirror().addBox(-0.9298F, -8.143F, -0.7236F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.4F, 4.8F, 0.0488F, -0.0209F, -1.4027F));

		PartDefinition cube_r32 = body5.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(270, 327).mirror().addBox(-1.0F, -7.5F, 0.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -2.4F, 0.0F, 0.091F, -0.0116F, -1.3578F));

		PartDefinition cube_r33 = body5.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(84, 325).addBox(-0.6F, -6.5F, -1.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.015F, -2.0383F, 17.4412F, -0.1669F, 0.0355F, 1.4888F));

		PartDefinition cube_r34 = body5.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(113, 329).addBox(-0.0702F, -8.143F, -0.7236F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0689F, -2.2426F, 12.7905F, -0.1693F, 0.0209F, 1.4027F));

		PartDefinition cube_r35 = body5.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(63, 329).addBox(-0.0702F, -8.143F, -0.7236F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2065F, -2.3505F, 8.7944F, -0.0384F, 0.0209F, 1.4027F));

		PartDefinition cube_r36 = body5.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(7, 328).addBox(-0.0702F, -8.143F, -0.7236F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, 4.8F, 0.0488F, 0.0209F, 1.4027F));

		PartDefinition cube_r37 = body5.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(270, 327).addBox(0.0F, -7.5F, 0.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, 0.0F, 0.091F, 0.0116F, 1.3578F));

		PartDefinition cube_r38 = body5.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(263, 327).addBox(-0.5F, -7.6F, 0.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.4F, 0.0F, -0.1571F, 0.0F, 0.0F));

		PartDefinition chest21_r4 = body5.addOrReplaceChild("chest21_r4", CubeListBuilder.create().texOffs(302, 166).addBox(14.7779F, -17.2093F, -0.4545F, 9.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8384F, -2.2239F, 5.2917F, -0.3313F, 0.0401F, 1.8917F));

		PartDefinition chest20_r6 = body5.addOrReplaceChild("chest20_r6", CubeListBuilder.create().texOffs(282, 29).addBox(10.4061F, -7.5406F, -0.4545F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8384F, -2.2239F, 5.2917F, -0.3089F, -0.1281F, 1.3948F));

		PartDefinition chest19_r8 = body5.addOrReplaceChild("chest19_r8", CubeListBuilder.create().texOffs(259, 153).addBox(2.8371F, -0.738F, -0.4332F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8384F, -2.2239F, 5.2917F, -0.194F, -0.2731F, 0.8343F));

		PartDefinition chest18_r12 = body5.addOrReplaceChild("chest18_r12", CubeListBuilder.create().texOffs(316, 257).addBox(-3.1168F, 0.5302F, -0.4332F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.8384F, -2.2239F, 5.2917F, -0.0573F, -0.3288F, 0.3807F));

		PartDefinition chest20_r7 = body5.addOrReplaceChild("chest20_r7", CubeListBuilder.create().texOffs(282, 26).addBox(10.3132F, -7.5552F, -0.4693F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0384F, -2.2239F, 13.1917F, -0.2346F, -0.3877F, 1.3307F));

		PartDefinition chest19_r9 = body5.addOrReplaceChild("chest19_r9", CubeListBuilder.create().texOffs(292, 35).addBox(2.7667F, -0.8002F, -0.448F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0384F, -2.2239F, 13.1917F, 0.024F, -0.4494F, 0.7118F));

		PartDefinition chest18_r13 = body5.addOrReplaceChild("chest18_r13", CubeListBuilder.create().texOffs(232, 300).addBox(-0.1543F, 0.444F, -0.448F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0384F, -2.2239F, 13.1917F, 0.222F, -0.3948F, 0.2364F));

		PartDefinition chest17_r19 = body5.addOrReplaceChild("chest17_r19", CubeListBuilder.create().texOffs(29, 203).addBox(-2.1168F, 0.5302F, -0.4332F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0384F, -2.2239F, 9.2917F, -0.0143F, -0.3447F, 0.3665F));

		PartDefinition chest18_r14 = body5.addOrReplaceChild("chest18_r14", CubeListBuilder.create().texOffs(290, 146).addBox(2.8371F, -0.738F, -0.4332F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0384F, -2.2239F, 9.2917F, -0.1633F, -0.3053F, 0.8255F));

		PartDefinition chest19_r10 = body5.addOrReplaceChild("chest19_r10", CubeListBuilder.create().texOffs(0, 221).addBox(10.4061F, -7.5406F, -0.4545F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0384F, -2.2239F, 9.2917F, -0.3011F, -0.1711F, 1.3936F));

		PartDefinition chest20_r8 = body5.addOrReplaceChild("chest20_r8", CubeListBuilder.create().texOffs(329, 169).addBox(14.7779F, -17.2093F, -0.4545F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0384F, -2.2239F, 9.2917F, -0.345F, -0.0013F, 1.8914F));

		PartDefinition chest16_r24 = body5.addOrReplaceChild("chest16_r24", CubeListBuilder.create().texOffs(48, 329).addBox(-2.2497F, 0.1891F, -0.23F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0384F, -2.7239F, 0.4917F, -0.0337F, -0.3124F, 0.1474F));

		PartDefinition chest17_r20 = body5.addOrReplaceChild("chest17_r20", CubeListBuilder.create().texOffs(301, 73).addBox(2.5725F, -0.991F, -0.23F, 10.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0384F, -2.7239F, 0.4917F, -0.1656F, -0.2682F, 0.6009F));

		PartDefinition chest18_r15 = body5.addOrReplaceChild("chest18_r15", CubeListBuilder.create().texOffs(289, 257).addBox(9.1434F, -8.7274F, -0.5859F, 11.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0384F, -2.7239F, 0.4917F, -0.295F, -0.1428F, 1.2887F));

		PartDefinition chest19_r11 = body5.addOrReplaceChild("chest19_r11", CubeListBuilder.create().texOffs(258, 217).addBox(12.3105F, -18.16F, -0.5859F, 15.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0384F, -2.7239F, 0.4917F, -0.3251F, 0.0346F, 1.829F));

		PartDefinition body4 = body5.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(144, 158).addBox(-2.0F, -1.0F, 0.1F, 4.0F, 4.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2953F, 18.7348F, -0.1398F, -0.0432F, 0.0061F));

		PartDefinition cube_r39 = body4.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(41, 323).addBox(-0.5F, -9.5432F, 0.2034F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 17.1F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r40 = body4.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 323).addBox(-0.5F, -9.6F, 0.0F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 13.1F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r41 = body4.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(322, 312).addBox(-0.5F, -9.7F, 0.0F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 9.1F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r42 = body4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(220, 324).addBox(-0.5F, -9.0F, 0.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 5.1F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r43 = body4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(181, 325).addBox(-0.5F, -8.9F, 0.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9F, 1.1F, -0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r44 = body4.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(318, 214).mirror().addBox(-6.0F, -0.6F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 1.0F, 18.1F, 0.0F, -0.1309F, -0.1222F));

		PartDefinition cube_r45 = body4.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(264, 198).mirror().addBox(-6.3F, -0.8F, -1.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 1.0F, 14.1F, 0.0F, -0.0873F, -0.1047F));

		PartDefinition cube_r46 = body4.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(308, 211).mirror().addBox(-6.9F, -0.9F, -1.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.0F, 10.1F, 0.0F, 0.0F, -0.1222F));

		PartDefinition cube_r47 = body4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(198, 97).mirror().addBox(-6.6F, -1.0F, -1.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.0F, 6.1F, 0.0F, 0.0873F, -0.1309F));

		PartDefinition cube_r48 = body4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(315, 163).mirror().addBox(-6.7F, -1.2F, -1.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 1.0F, 2.1F, 0.0F, 0.1745F, -0.1309F));

		PartDefinition cube_r49 = body4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(318, 214).addBox(0.0F, -0.6F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 1.0F, 18.1F, 0.0F, 0.1309F, 0.1222F));

		PartDefinition cube_r50 = body4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(264, 198).addBox(-0.7F, -0.8F, -1.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 1.0F, 14.1F, 0.0F, 0.0873F, 0.1047F));

		PartDefinition cube_r51 = body4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(308, 211).addBox(-0.1F, -0.9F, -1.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 1.0F, 10.1F, 0.0F, 0.0F, 0.1222F));

		PartDefinition cube_r52 = body4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(198, 97).addBox(-0.4F, -1.0F, -1.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 1.0F, 6.1F, 0.0F, -0.0873F, 0.1309F));

		PartDefinition cube_r53 = body4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(315, 163).addBox(-0.3F, -1.2F, -1.0F, 7.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 1.0F, 2.1F, 0.0F, -0.1745F, 0.1309F));

		PartDefinition body3 = body4.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(155, 62).addBox(-2.0F, -1.85F, 0.0F, 4.0F, 4.0F, 20.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, 0.9902F, 18.8764F, 0.0699F, -0.0435F, -0.003F));

		PartDefinition cube_r54 = body3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(249, 323).addBox(-0.5F, -8.6159F, 0.0252F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.75F, 18.1F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r55 = body3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(201, 323).addBox(-0.5F, -8.7218F, 0.0462F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.95F, 14.1F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r56 = body3.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(90, 162).addBox(-0.5F, -8.9218F, 0.3462F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.75F, 9.8F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r57 = body3.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(194, 323).addBox(-0.5F, -9.3332F, 0.3792F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.75F, 5.8F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r58 = body3.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(70, 323).addBox(-0.5F, -9.2348F, 0.1833F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.85F, 2.0F, -0.2967F, 0.0F, 0.0F));

		PartDefinition cube_r59 = body3.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(332, 92).mirror().addBox(-3.2F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 0.15F, 19.0F, 0.0F, 0.0F, -0.1222F));

		PartDefinition cube_r60 = body3.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(331, 106).mirror().addBox(-3.8F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.15F, 15.0F, 0.0F, -0.1309F, -0.1047F));

		PartDefinition cube_r61 = body3.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(322, 235).mirror().addBox(-4.2F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 0.15F, 11.0F, 0.0F, -0.1745F, -0.0873F));

		PartDefinition cube_r62 = body3.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(320, 56).mirror().addBox(-5.5F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9F, 0.15F, 7.0F, 0.0F, -0.1745F, -0.0873F));

		PartDefinition cube_r63 = body3.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(319, 95).mirror().addBox(-5.5F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, 0.15F, 3.0F, 0.0F, -0.2182F, -0.0873F));

		PartDefinition cube_r64 = body3.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(332, 92).addBox(0.2F, 0.0F, -1.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.15F, 19.0F, 0.0F, 0.0F, 0.1222F));

		PartDefinition cube_r65 = body3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(331, 106).addBox(-0.2F, 0.0F, -1.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.15F, 15.0F, 0.0F, 0.1309F, 0.1047F));

		PartDefinition cube_r66 = body3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(322, 235).addBox(-0.8F, 0.0F, -1.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.15F, 11.0F, 0.0F, 0.1745F, 0.0873F));

		PartDefinition cube_r67 = body3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(320, 56).addBox(-0.5F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9F, 0.15F, 7.0F, 0.0F, 0.1745F, 0.0873F));

		PartDefinition cube_r68 = body3.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(319, 95).addBox(-0.5F, 0.0F, -1.0F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1F, 0.15F, 3.0F, 0.0F, 0.2182F, 0.0873F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.493F, 20.1306F, 0.3756F, -0.0406F, -0.016F));

		PartDefinition cube_r69 = body2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(14, 328).addBox(-0.5F, -6.7229F, 0.1088F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5344F, 13.8003F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r70 = body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(77, 325).addBox(-0.5F, -7.4578F, 0.133F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7344F, 9.9003F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r71 = body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(227, 324).addBox(-0.5F, -7.6885F, -0.3529F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0344F, 6.5003F, -0.4276F, 0.0F, 0.0F));

		PartDefinition cube_r72 = body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(256, 323).addBox(-0.5F, -8.1356F, 0.2012F, 1.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9656F, 2.1003F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r73 = body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(136, 336).mirror().addBox(-2.0F, 0.2079F, -1.9781F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 3.6801F, 15.3443F, -0.333F, -0.7683F, 0.1732F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(336, 95).mirror().addBox(-2.0F, 0.2079F, -1.9781F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.8485F, 11.4317F, -0.292F, -0.7638F, 0.205F));

		PartDefinition cube_r75 = body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(335, 232).mirror().addBox(-2.0F, 0.2079F, -1.9781F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.0168F, 7.5191F, -0.292F, -0.7638F, 0.205F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(335, 214).mirror().addBox(-2.0F, 0.2079F, -1.9781F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.1852F, 3.6066F, -0.292F, -0.7638F, 0.205F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(136, 336).addBox(0.0F, 0.2079F, -1.9781F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 3.6801F, 15.3443F, -0.333F, 0.7683F, -0.1732F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(336, 95).addBox(0.0F, 0.2079F, -1.9781F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 2.8485F, 11.4317F, -0.292F, 0.7638F, -0.205F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(335, 232).addBox(0.0F, 0.2079F, -1.9781F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 2.0168F, 7.5191F, -0.292F, 0.7638F, -0.205F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(335, 214).addBox(0.0F, 0.2079F, -1.9781F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.1852F, 3.6066F, -0.292F, 0.7638F, -0.205F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(141, 182).addBox(-1.5F, -0.1513F, 8.7474F, 3.0F, 4.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.0656F, -8.4997F, -0.2094F, 0.0F, 0.0F));

		PartDefinition hips = body2.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.5025F, 17.1822F, 0.4098F, -0.0174F, 0.04F));

		PartDefinition cube_r82 = hips.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(332, 202).addBox(-0.5F, -4.4993F, 16.0005F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(45, 162).addBox(-1.5F, -0.0986F, 0.0389F, 3.0F, 4.0F, 19.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.4F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r83 = hips.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(326, 330).addBox(-0.5F, -4.6037F, -2.1164F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 4.9F, 13.2F, -0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r84 = hips.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(105, 331).addBox(-0.5F, -5.0246F, -1.8398F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 3.0F, 9.4F, -0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r85 = hips.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(305, 330).addBox(-0.5F, -5.4412F, 0.0155F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.6F, 4.1F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r86 = hips.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(91, 328).addBox(-0.5F, -6.1032F, 0.1348F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.4F, -0.576F, 0.0F, 0.0F));

		PartDefinition cube_r87 = hips.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(333, 85).addBox(-0.5F, -1.8F, -1.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.6868F, 5.1473F, -1.1257F, 0.0F, 0.0F));

		PartDefinition cube_r88 = hips.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(333, 78).addBox(-0.5F, -2.7F, -1.9F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 9.1636F, 9.5333F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r89 = hips.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(331, 98).addBox(-0.5F, -2.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.9563F, 15.267F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r90 = hips.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(336, 262).mirror().addBox(-0.5F, -0.1772F, 0.6544F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-6.2454F, 13.4135F, -8.1584F, -2.3824F, 0.4707F, 0.2669F));

		PartDefinition cube_r91 = hips.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(11, 320).mirror().addBox(-0.5F, -0.9571F, -4.1851F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-6.2454F, 13.4135F, -8.1584F, -2.6006F, 0.4707F, 0.2669F));

		PartDefinition cube_r92 = hips.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(330, 304).mirror().addBox(0.7F, -1.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.2F, 9.7293F, -6.7563F, 0.4431F, -0.1807F, -0.1257F));

		PartDefinition cube_r93 = hips.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(274, 300).mirror().addBox(-2.5F, -0.1F, -3.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(274, 300).addBox(2.5F, -0.1F, -3.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-1.0F, 10.7141F, -8.497F, -0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r94 = hips.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(53, 306).mirror().addBox(-2.1F, 0.0F, -0.8F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.7F, 10.6225F, -3.5971F, -0.6361F, 0.2123F, -0.1544F));

		PartDefinition cube_r95 = hips.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(315, 113).mirror().addBox(0.0F, -1.0F, -5.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.2F, 9.7293F, -6.7563F, 0.4708F, -0.3767F, -0.2257F));

		PartDefinition cube_r96 = hips.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(323, 260).mirror().addBox(-0.2F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.2F, 10.6641F, -5.8328F, -0.4637F, 0.2749F, -0.1349F));

		PartDefinition cube_r97 = hips.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(172, 336).mirror().addBox(-2.0F, 0.4305F, -1.9026F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 7.9516F, 15.9605F, -0.7618F, -0.8973F, 0.6407F));

		PartDefinition cube_r98 = hips.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(163, 336).mirror().addBox(-2.0F, 0.4305F, -1.9026F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 6.2296F, 12.3502F, -0.6646F, -0.7982F, 0.5113F));

		PartDefinition cube_r99 = hips.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(333, 19).mirror().addBox(-2.0F, 0.4305F, -1.9026F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 4.5075F, 8.7398F, -0.6937F, -0.8321F, 0.5513F));

		PartDefinition cube_r100 = hips.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(154, 336).mirror().addBox(-2.0F, 0.4305F, -1.9026F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 2.7855F, 5.1295F, -0.6646F, -0.7982F, 0.5113F));

		PartDefinition cube_r101 = hips.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(145, 336).mirror().addBox(-2.0F, 0.4305F, -1.9026F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.0634F, 1.5191F, -0.5934F, -0.6922F, 0.4065F));

		PartDefinition cube_r102 = hips.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(172, 336).addBox(0.0F, 0.4305F, -1.9026F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 7.9516F, 15.9605F, -0.7618F, 0.8973F, -0.6407F));

		PartDefinition cube_r103 = hips.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(163, 336).addBox(0.0F, 0.4305F, -1.9026F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 6.2296F, 12.3502F, -0.6646F, 0.7982F, -0.5113F));

		PartDefinition cube_r104 = hips.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(333, 19).addBox(0.0F, 0.4305F, -1.9026F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 4.5075F, 8.7398F, -0.6937F, 0.8321F, -0.5513F));

		PartDefinition cube_r105 = hips.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(154, 336).addBox(0.0F, 0.4305F, -1.9026F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 2.7855F, 5.1295F, -0.6646F, 0.7982F, -0.5113F));

		PartDefinition cube_r106 = hips.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(145, 336).addBox(0.0F, 0.4305F, -1.9026F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.0634F, 1.5191F, -0.5934F, 0.6922F, -0.4065F));

		PartDefinition cube_r107 = hips.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(330, 304).addBox(-2.7F, -1.0F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(5.2F, 9.7293F, -6.7563F, 0.4431F, 0.1807F, 0.1257F));

		PartDefinition cube_r108 = hips.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(315, 113).addBox(-2.0F, -1.0F, -5.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(5.2F, 9.7293F, -6.7563F, 0.4708F, 0.3767F, 0.2257F));

		PartDefinition cube_r109 = hips.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(336, 262).addBox(-0.5F, -0.1772F, 0.6544F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(6.2454F, 13.4135F, -8.1584F, -2.3824F, -0.4707F, -0.2669F));

		PartDefinition cube_r110 = hips.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(11, 320).addBox(-0.5F, -0.9571F, -4.1851F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(6.2454F, 13.4135F, -8.1584F, -2.6006F, -0.4707F, -0.2669F));

		PartDefinition cube_r111 = hips.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(53, 306).addBox(0.1F, 0.0F, -0.8F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.7F, 10.6225F, -3.5971F, -0.6361F, -0.2123F, 0.1544F));

		PartDefinition cube_r112 = hips.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(323, 260).addBox(-1.8F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.2F, 10.6641F, -5.8328F, -0.4637F, -0.2749F, 0.1349F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(204, 49).addBox(-1.0F, -1.8F, 0.0F, 2.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(136, 288).addBox(-0.5F, -4.3F, 13.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.6562F, 16.6935F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r113 = tail.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(90, 175).addBox(-0.5F, -2.9F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.8F, 9.0F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r114 = tail.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(333, 287).addBox(-0.5F, -3.3002F, -0.0131F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, 5.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r115 = tail.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(215, 336).addBox(-0.5F, -5.0F, -0.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(70, 336).addBox(-0.5F, -1.0F, -0.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3936F, 9.6992F, -1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r116 = tail.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(333, 252).addBox(-0.5F, -0.8F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.8552F, 4.7456F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r117 = tail.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(208, 332).addBox(-0.5F, -4.0002F, -0.0131F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, 1.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(99, 248).addBox(-1.0F, -1.9F, 0.0F, 2.0F, 4.0F, 12.0F, new CubeDeformation(0.009F))
				.texOffs(335, 72).addBox(-0.5F, -3.9F, 1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(336, 185).addBox(-0.5F, -3.5F, 5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(188, 336).addBox(-0.5F, -3.2F, 9.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 0.0898F, 15.9733F, 0.1226F, 0.0866F, 0.0107F));

		PartDefinition cube_r118 = tail2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(236, 336).addBox(-0.5F, -17.0F, 1.7F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(229, 336).addBox(-0.5F, -13.0F, 1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(222, 336).addBox(-0.5F, -9.0F, 0.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.3037F, -6.274F, -1.3439F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(268, 173).addBox(-1.0F, -1.3F, 0.0F, 2.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
				.texOffs(195, 336).addBox(-0.5F, -2.7F, 1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(336, 258).addBox(-0.5F, -2.3F, 5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2449F, 11.7572F, 0.1747F, 0.043F, 0.0076F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(161, 259).addBox(-1.0F, -1.2F, 0.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.1F, 9.0F, 0.2014F, 0.0942F, -0.0253F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(21.3117F, 29.6575F, 2.3382F, 0.6886F, 0.1586F, -0.601F));

		PartDefinition cube_r119 = leftarm.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(336, 266).addBox(-1.5F, -1.0F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0062F, 5.824F, -0.1751F, -0.8989F, 0.0014F, -0.001F));

		PartDefinition cube_r120 = leftarm.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(322, 12).addBox(-1.5F, -3.7F, -0.2F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.0061F, 7.1647F, -1.0709F, -0.0699F, 0.0014F, -0.001F));

		PartDefinition cube_r121 = leftarm.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(335, 226).addBox(-1.5F, 0.1F, 0.9F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-0.0049F, 5.7072F, 0.7773F, 0.7591F, 0.0014F, -0.001F));

		PartDefinition cube_r122 = leftarm.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(320, 121).addBox(-1.5F, -2.3F, -0.9F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-0.0049F, 5.7072F, 0.7773F, 0.4537F, 0.0014F, -0.001F));

		PartDefinition cube_r123 = leftarm.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(317, 304).addBox(-1.5F, -1.45F, -1.3F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0091F, 2.1599F, 0.2237F, -0.3753F, 0.0014F, -0.001F));

		PartDefinition cube_r124 = leftarm.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(295, 48).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5106F, -0.2658F, 0.8287F, -0.2444F, 0.0014F, -0.001F));

		PartDefinition cube_r125 = leftarm.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(331, 119).addBox(-1.5F, 1.0F, -0.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0128F, 1.4604F, -1.9015F, 0.1832F, 0.0014F, -0.001F));

		PartDefinition cube_r126 = leftarm.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(316, 274).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.5128F, 1.4604F, -1.9015F, 0.1832F, 0.0014F, -0.001F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 10.1526F, 2.0504F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r127 = leftarm2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(305, 325).addBox(-4.8523F, 2.5471F, -1.0079F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6843F, 3.5923F, 5.0125F, 1.5708F, -0.8116F, -1.5708F));

		PartDefinition cube_r128 = leftarm2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(124, 319).addBox(-2.0392F, -4.6421F, -1.0079F, 2.0F, 9.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.6843F, 3.5923F, 5.0125F, 1.5708F, -1.4224F, -1.5708F));

		PartDefinition cube_r129 = leftarm2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(277, 336).addBox(-4.7764F, 0.8057F, -0.5079F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6843F, 3.5923F, 5.0125F, -1.5708F, 0.4014F, 1.5708F));

		PartDefinition cube_r130 = leftarm2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(333, 295).addBox(-5.1534F, -2.1552F, -1.0079F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6843F, 3.5923F, 5.0125F, -1.5708F, -0.5585F, 1.5708F));

		PartDefinition cube_r131 = leftarm2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(149, 267).addBox(-1.0F, -1.0F, -0.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1764F, 1.4441F, -0.3362F, 1.5708F, -1.1868F, -1.5708F));

		PartDefinition cube_r132 = leftarm2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(326, 0).addBox(-1.0F, -0.6F, -0.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1764F, 0.5919F, -0.9948F, -1.5708F, -1.0385F, 1.5708F));

		PartDefinition cube_r133 = leftarm2.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(326, 22).addBox(-1.6F, -1.5F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6764F, 11.9719F, 2.4845F, 1.5708F, -0.925F, -1.5708F));

		PartDefinition cube_r134 = leftarm2.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(308, 197).addBox(-2.0335F, 0.4378F, 0.0F, 3.0F, 11.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.3236F, 0.4954F, -0.4664F, 1.5708F, -1.2741F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1854F, 11.9499F, 4.4269F, 0.6859F, 0.0442F, 0.0229F));

		PartDefinition cube_r135 = leftArm3.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(0, 187).addBox(0.4F, -2.0F, -7.5F, 0.0F, 19.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.4F, 0.0F, 3.1416F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-21.3117F, 29.6575F, 2.3382F, 0.6886F, -0.1586F, 0.601F));

		PartDefinition cube_r136 = rightarm.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(77, 337).addBox(-0.5F, -1.0F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0062F, 5.824F, -0.1751F, -0.8989F, -0.0014F, 0.001F));

		PartDefinition cube_r137 = rightarm.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(209, 322).addBox(-0.5F, -3.7F, -0.2F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0061F, 7.1647F, -1.0709F, -0.0699F, -0.0014F, 0.001F));

		PartDefinition cube_r138 = rightarm.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 336).addBox(-0.5F, 0.1F, 0.9F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(0.0049F, 5.7072F, 0.7773F, 0.7591F, -0.0014F, 0.001F));

		PartDefinition cube_r139 = rightarm.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(321, 239).addBox(-0.5F, -2.3F, -0.9F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.0049F, 5.7072F, 0.7773F, 0.4537F, -0.0014F, 0.001F));

		PartDefinition cube_r140 = rightarm.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(319, 30).addBox(-0.5F, -1.45F, -1.3F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0091F, 2.1599F, 0.2237F, -0.3753F, -0.0014F, 0.001F));

		PartDefinition cube_r141 = rightarm.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(296, 113).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5106F, -0.2658F, 0.8287F, -0.2444F, -0.0014F, 0.001F));

		PartDefinition cube_r142 = rightarm.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(120, 331).addBox(-0.5F, 1.0F, -0.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0128F, 1.4604F, -1.9015F, 0.1832F, -0.0014F, 0.001F));

		PartDefinition cube_r143 = rightarm.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(223, 317).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.5128F, 1.4604F, -1.9015F, 0.1832F, -0.0014F, 0.001F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 10.1526F, 2.0504F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r144 = rightarm2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(318, 325).addBox(0.8524F, 2.5471F, -1.0079F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6843F, 3.5923F, 5.0125F, 1.5708F, 0.8116F, 1.5708F));

		PartDefinition cube_r145 = rightarm2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(133, 319).addBox(0.0392F, -4.6421F, -1.0079F, 2.0F, 9.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.6843F, 3.5923F, 5.0125F, 1.5708F, 1.4224F, 1.5708F));

		PartDefinition cube_r146 = rightarm2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(84, 337).addBox(2.7764F, 0.8057F, -0.5079F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6843F, 3.5923F, 5.0125F, -1.5708F, -0.4014F, -1.5708F));

		PartDefinition cube_r147 = rightarm2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(333, 334).addBox(3.1534F, -2.1552F, -1.0079F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6843F, 3.5923F, 5.0125F, -1.5708F, 0.5585F, -1.5708F));

		PartDefinition cube_r148 = rightarm2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(277, 331).addBox(-2.0F, -1.0F, -0.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.1764F, 1.4441F, -0.3362F, 1.5708F, 1.1868F, 1.5708F));

		PartDefinition cube_r149 = rightarm2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(326, 5).addBox(-3.0F, -0.6F, -0.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1764F, 0.5919F, -0.9948F, -1.5708F, 1.0385F, -1.5708F));

		PartDefinition cube_r150 = rightarm2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(329, 319).addBox(-2.4F, -1.5F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6764F, 11.9719F, 2.4845F, 1.5708F, 0.925F, 1.5708F));

		PartDefinition cube_r151 = rightarm2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(0, 309).addBox(-0.9665F, 0.4378F, 0.0F, 3.0F, 11.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.3236F, 0.4954F, -0.4664F, 1.5708F, 1.2741F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create().texOffs(90, 198).addBox(0.4F, 0.0F, -6.1F, 0.0F, 19.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1854F, 11.9499F, 4.4269F, 0.6859F, -0.0442F, -0.0229F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(16.4183F, 24.875F, 2.6769F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r152 = bone.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(193, 274).addBox(0.4928F, -9.2932F, 2.3058F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-12.4007F, 5.574F, -0.7737F, 1.7414F, 0.6155F, 1.1599F));

		PartDefinition cube_r153 = bone.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(157, 294).addBox(-0.5F, -2.5F, -3.1F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-13.5024F, 6.1087F, -2.4223F, 0.2764F, 0.6206F, 1.1882F));

		PartDefinition cube_r154 = bone.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(238, 319).addBox(-0.5F, -1.8F, -4.5F, 1.0F, 5.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-9.9684F, 2.6203F, -4.9485F, 0.956F, 0.6155F, 1.1599F));

		PartDefinition cube_r155 = bone.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(317, 172).addBox(0.1715F, 0.9063F, 1.6744F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-12.4007F, 5.574F, -0.7737F, -1.783F, 0.5954F, 1.2119F));

		PartDefinition cube_r156 = bone.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(324, 38).addBox(-0.5F, -2.4F, -2.3F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-14.0013F, 1.242F, -8.789F, -3.092F, 0.5954F, 1.2119F));

		PartDefinition cube_r157 = bone.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(24, 324).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.9184F, 0.596F, -8.6298F, 2.6414F, 0.5954F, 1.2119F));

		PartDefinition cube_r158 = bone.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(294, 323).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.9184F, 0.596F, -8.6298F, -2.4637F, 0.5954F, 1.2119F));

		PartDefinition cube_r159 = bone.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(94, 312).addBox(-0.1408F, -11.1493F, -5.6467F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(142, 319).addBox(-0.6408F, -9.1936F, -9.7929F, 2.0F, 6.0F, 3.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(4.4103F, -7.2746F, 3.6046F, 1.8927F, 0.2516F, 0.1327F));

		PartDefinition cube_r160 = bone.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(35, 336).addBox(-0.6408F, -7.6867F, -10.2844F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(325, 185).addBox(-1.6408F, -4.6867F, -10.2844F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.4103F, -7.2746F, 3.6046F, 1.4127F, 0.2516F, 0.1327F));

		PartDefinition cube_r161 = bone.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(113, 305).addBox(-1.9891F, -8.0532F, -8.2515F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4103F, -7.2746F, 3.6046F, 1.284F, -0.2467F, 0.1972F));

		PartDefinition cube_r162 = bone.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(207, 259).addBox(-1.9891F, -9.4597F, -6.2906F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.4103F, -7.2746F, 3.6046F, 1.5021F, -0.2467F, 0.1972F));

		PartDefinition cube_r163 = bone.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(99, 232).addBox(-0.9383F, -4.679F, -9.6755F, 2.0F, 6.0F, 7.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(4.4103F, -7.2746F, 3.6046F, 1.3691F, 0.2516F, 0.1327F));

		PartDefinition cube_r164 = bone.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(0, 225).addBox(-0.9383F, -7.3452F, -6.1123F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.4103F, -7.2746F, 3.6046F, 1.8054F, 0.2516F, 0.1327F));

		PartDefinition cube_r165 = bone.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 162).addBox(-0.9383F, -5.4527F, -1.3024F, 2.0F, 4.0F, 20.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(4.4103F, -7.2746F, 3.6046F, 2.4163F, 0.2516F, 0.1327F));

		PartDefinition cube_r166 = bone.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(272, 61).addBox(-0.9226F, -9.1861F, 5.0168F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F))
				.texOffs(94, 319).addBox(-0.9226F, -8.7861F, 5.0168F, 2.0F, 4.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.4103F, -7.2746F, 3.6046F, -0.0098F, 0.2516F, 0.1327F));

		PartDefinition cube_r167 = bone.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(268, 273).addBox(-0.9226F, -4.0345F, 4.7513F, 2.0F, 5.0F, 8.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(4.4103F, -7.2746F, 3.6046F, 0.8629F, 0.2516F, 0.1327F));

		PartDefinition cube_r168 = bone.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(119, 205).addBox(-0.9226F, -5.2521F, -1.7233F, 2.0F, 7.0F, 15.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(4.4103F, -7.2746F, 3.6046F, 1.2992F, 0.2516F, 0.1327F));

		PartDefinition cube_r169 = bone.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(226, 222).addBox(-0.9226F, -1.3567F, -4.1335F, 2.0F, 4.0F, 14.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(4.4103F, -7.2746F, 3.6046F, 0.7407F, 0.2516F, 0.1327F));

		PartDefinition cube_r170 = bone.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(66, 206).addBox(-0.9383F, -9.9964F, 7.8745F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.4103F, -7.2746F, 3.6046F, 1.9363F, 0.2516F, 0.1327F));

		PartDefinition cube_r171 = bone.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(220, 17).addBox(-0.9383F, -7.244F, 0.2684F, 2.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4103F, -7.2746F, 3.6046F, 1.5872F, 0.2516F, 0.1327F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.4183F, 24.875F, 2.6769F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r172 = bone2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(193, 274).mirror().addBox(-1.4928F, -9.2932F, 2.3058F, 1.0F, 4.0F, 5.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(12.4007F, 5.574F, -0.7737F, 1.7414F, -0.6155F, -1.1599F));

		PartDefinition cube_r173 = bone2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(157, 294).mirror().addBox(-0.5F, -2.5F, -3.1F, 1.0F, 4.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(13.5024F, 6.1087F, -2.4223F, 0.2764F, -0.6206F, -1.1882F));

		PartDefinition cube_r174 = bone2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(238, 319).mirror().addBox(-0.5F, -1.8F, -4.5F, 1.0F, 5.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(9.9684F, 2.6203F, -4.9485F, 0.956F, -0.6155F, -1.1599F));

		PartDefinition cube_r175 = bone2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(317, 172).mirror().addBox(-1.1715F, 0.9063F, 1.6744F, 1.0F, 9.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(12.4007F, 5.574F, -0.7737F, -1.783F, -0.5954F, -1.2119F));

		PartDefinition cube_r176 = bone2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(324, 38).mirror().addBox(-0.5F, -2.4F, -2.3F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(14.0013F, 1.242F, -8.789F, -3.092F, -0.5954F, -1.2119F));

		PartDefinition cube_r177 = bone2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(24, 324).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(11.9184F, 0.596F, -8.6298F, 2.6414F, -0.5954F, -1.2119F));

		PartDefinition cube_r178 = bone2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(294, 323).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(11.9184F, 0.596F, -8.6298F, -2.4637F, -0.5954F, -1.2119F));

		PartDefinition cube_r179 = bone2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(94, 312).mirror().addBox(-0.8592F, -11.1493F, -5.6467F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(142, 319).mirror().addBox(-1.3592F, -9.1936F, -9.7929F, 2.0F, 6.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-4.4103F, -7.2746F, 3.6046F, 1.8927F, -0.2516F, -0.1327F));

		PartDefinition cube_r180 = bone2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(35, 336).mirror().addBox(-1.3592F, -7.6867F, -10.2844F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(325, 185).mirror().addBox(-2.3592F, -4.6867F, -10.2844F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.4103F, -7.2746F, 3.6046F, 1.4127F, -0.2516F, -0.1327F));

		PartDefinition cube_r181 = bone2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(113, 305).mirror().addBox(0.9891F, -8.0532F, -8.2515F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4103F, -7.2746F, 3.6046F, 1.284F, 0.2467F, -0.1972F));

		PartDefinition cube_r182 = bone2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(207, 259).mirror().addBox(0.9891F, -9.4597F, -6.2906F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.4103F, -7.2746F, 3.6046F, 1.5021F, 0.2467F, -0.1972F));

		PartDefinition cube_r183 = bone2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(99, 232).mirror().addBox(-1.0617F, -4.679F, -9.6755F, 2.0F, 6.0F, 7.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-4.4103F, -7.2746F, 3.6046F, 1.3691F, -0.2516F, -0.1327F));

		PartDefinition cube_r184 = bone2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(0, 225).mirror().addBox(-1.0617F, -7.3452F, -6.1123F, 2.0F, 4.0F, 14.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.4103F, -7.2746F, 3.6046F, 1.8054F, -0.2516F, -0.1327F));

		PartDefinition cube_r185 = bone2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(0, 162).mirror().addBox(-1.0617F, -5.4527F, -1.3024F, 2.0F, 4.0F, 20.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-4.4103F, -7.2746F, 3.6046F, 2.4163F, -0.2516F, -0.1327F));

		PartDefinition cube_r186 = bone2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(272, 61).mirror().addBox(-1.0774F, -9.1861F, 5.0168F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(94, 319).mirror().addBox(-1.0774F, -8.7861F, 5.0168F, 2.0F, 4.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-4.4103F, -7.2746F, 3.6046F, -0.0098F, -0.2516F, -0.1327F));

		PartDefinition cube_r187 = bone2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(268, 273).mirror().addBox(-1.0774F, -4.0345F, 4.7513F, 2.0F, 5.0F, 8.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-4.4103F, -7.2746F, 3.6046F, 0.8629F, -0.2516F, -0.1327F));

		PartDefinition cube_r188 = bone2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(119, 205).mirror().addBox(-1.0774F, -5.2521F, -1.7233F, 2.0F, 7.0F, 15.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-4.4103F, -7.2746F, 3.6046F, 1.2992F, -0.2516F, -0.1327F));

		PartDefinition cube_r189 = bone2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(226, 222).mirror().addBox(-1.0774F, -1.3567F, -4.1335F, 2.0F, 4.0F, 14.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-4.4103F, -7.2746F, 3.6046F, 0.7407F, -0.2516F, -0.1327F));

		PartDefinition cube_r190 = bone2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(66, 206).mirror().addBox(-1.0617F, -9.9964F, 7.8745F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-4.4103F, -7.2746F, 3.6046F, 1.9363F, -0.2516F, -0.1327F));

		PartDefinition cube_r191 = bone2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(220, 17).mirror().addBox(-1.0617F, -7.244F, 0.2684F, 2.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4103F, -7.2746F, 3.6046F, 1.5872F, -0.2516F, -0.1327F));

		PartDefinition neck2 = chest.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.6838F, -5.0159F, 0.288F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0744F, -0.277F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r192 = neck.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(307, 98).addBox(-2.5F, -3.7679F, -0.0951F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 1.062F, -3.6409F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r193 = neck.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(252, 336).mirror().addBox(-2.4F, -0.1F, 1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 7.2161F, -21.9238F, -3.1416F, -0.9774F, 1.5708F));

		PartDefinition cube_r194 = neck.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(243, 336).mirror().addBox(-1.8F, 0.7F, 1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 7.2161F, -21.9238F, -2.5819F, -0.8501F, 0.8757F));

		PartDefinition cube_r195 = neck.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(316, 252).mirror().addBox(-5.8281F, -1.458F, -1.8213F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 10.0161F, -21.9238F, -2.1416F, 0.3166F, 0.214F));

		PartDefinition cube_r196 = neck.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(293, 252).mirror().addBox(-8.6292F, -0.6067F, -1.8213F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-2.9F, 10.0161F, -21.9238F, -2.1697F, 0.4258F, 0.1365F));

		PartDefinition cube_r197 = neck.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(333, 172).mirror().addBox(0.2F, 0.3113F, 0.4609F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -7.8088F, -3.8916F, -0.282F, 0.1593F, 0.5009F));

		PartDefinition cube_r198 = neck.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(333, 172).addBox(-0.2F, 0.3113F, 0.4609F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.8088F, -3.8916F, -0.282F, -0.1593F, -0.5009F));

		PartDefinition cube_r199 = neck.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(316, 252).addBox(-0.1719F, -1.458F, -1.8213F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 10.0161F, -21.9238F, -2.1416F, -0.3166F, -0.214F));

		PartDefinition cube_r200 = neck.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(252, 336).addBox(-0.6F, -0.1F, 1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9F, 7.2161F, -21.9238F, -3.1416F, 0.9774F, -1.5708F));

		PartDefinition cube_r201 = neck.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(243, 336).addBox(-1.2F, 0.7F, 1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(2.9F, 7.2161F, -21.9238F, -2.5819F, 0.8501F, -0.8757F));

		PartDefinition cube_r202 = neck.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(293, 252).addBox(-0.3708F, -0.6067F, -1.8213F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(2.9F, 10.0161F, -21.9238F, -2.1697F, -0.4258F, -0.1365F));

		PartDefinition cube_r203 = neck.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(304, 268).addBox(-3.0F, -2.5F, 0.5F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.5517F, -21.4264F, -2.1642F, 0.0F, 0.0F));

		PartDefinition cube_r204 = neck.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(194, 315).addBox(-2.5F, -2.0F, -0.5F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, -1.438F, -5.5409F, -0.3229F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1162F, -10.8226F, -1.1327F, 0.0975F, -0.0026F));

		PartDefinition cube_r205 = head.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(229, 175).addBox(-8.0F, 0.1F, 0.0F, 15.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.257F, -6.9443F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r206 = head.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(198, 100).addBox(-8.0F, 0.1F, 0.0F, 15.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.2541F, -7.0752F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r207 = head.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(155, 87).addBox(-14.0F, 3.1F, -4.0F, 27.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -7.6277F, -4.926F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r208 = head.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(212, 257).addBox(-5.0F, -3.9F, 7.8F, 10.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.651F, -10.7465F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r209 = head.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(218, 85).addBox(-7.0F, -5.9F, -5.5F, 14.0F, 8.0F, 6.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, -1.4192F, -6.5753F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r210 = head.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(204, 70).addBox(-7.0F, -8.0F, 8.4F, 14.0F, 8.0F, 6.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 10.6437F, -7.2424F, 1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r211 = head.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(228, 274).addBox(-4.0F, -9.1F, -0.3F, 8.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7377F, -33.7009F, 1.789F, 0.0F, 0.0F));

		PartDefinition cube_r212 = head.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(259, 83).addBox(-5.0F, -7.1F, -0.3F, 10.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3478F, -26.7275F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r213 = head.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(245, 70).addBox(-6.0F, 0.3F, -0.3F, 12.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.211F, -27.1034F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r214 = head.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(90, 182).addBox(-7.0F, -1.5F, -6.3F, 14.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5597F, -12.3253F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r215 = head.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(310, 187).addBox(-3.0F, -6.175F, -0.95F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.024F)), PartPose.offsetAndRotation(0.0F, -6.964F, -11.4392F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r216 = head.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(128, 258).addBox(-7.0F, -6.175F, -1.95F, 14.0F, 6.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -7.7471F, -5.4905F, 1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r217 = head.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(191, 175).addBox(-8.0F, -4.175F, -1.45F, 16.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -5.3141F, -2.2764F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r218 = head.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(150, 240).addBox(-3.0F, 0.075F, 0.0F, 7.0F, 9.0F, 8.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -8.102F, -24.7327F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r219 = head.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(175, 49).addBox(-3.0F, 0.075F, 0.5F, 7.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -5.7726F, -30.801F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r220 = head.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(27, 261).addBox(-3.0F, 0.0F, 0.1F, 7.0F, 4.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, -4.8388F, -34.6905F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r221 = head.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(121, 198).addBox(-2.0F, 0.0F, -1.9F, 5.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(81, 267).addBox(-0.5F, 0.0F, -3.9F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8968F, -44.9599F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r222 = head.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(154, 224).addBox(-3.0F, 0.0F, -4.9F, 7.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.6886F, -40.2919F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r223 = head.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(259, 220).addBox(-3.0F, 0.0F, 0.1F, 7.0F, 4.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 0.623F, -45.2953F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r224 = head.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(278, 70).addBox(-2.0F, 1.0F, 0.1F, 5.0F, 3.0F, 6.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-0.5F, 4.1497F, -50.1494F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r225 = head.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(142, 329).addBox(-1.0F, 0.0F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 89.4487F, -80.7172F, 2.042F, 0.0F, 0.0F));

		PartDefinition cube_r226 = head.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(319, 203).addBox(-0.5F, -1.8F, -3.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 86.562F, -78.5569F, 1.5621F, 0.0F, 0.0F));

		PartDefinition cube_r227 = head.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(322, 228).addBox(-1.5F, 0.0F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 85.6781F, -82.0525F, 1.9111F, 0.0F, 0.0F));

		PartDefinition cube_r228 = head.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(293, 240).addBox(-0.5F, -3.9F, -0.2F, 1.0F, 4.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 52.2398F, -78.7671F, 1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r229 = head.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(184, 203).addBox(-2.5F, -1.9F, -0.2F, 5.0F, 5.0F, 15.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 4.6618F, -45.3435F, 0.4625F, 0.0F, 0.0F));

		PartDefinition cube_r230 = head.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(225, 203).addBox(-1.5F, -1.9F, -0.2F, 3.0F, 5.0F, 13.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 12.3945F, -55.7936F, 0.637F, 0.0F, 0.0F));

		PartDefinition cube_r231 = head.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(243, 258).addBox(-1.0F, -1.9F, -0.2F, 2.0F, 5.0F, 10.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 19.0207F, -63.2832F, 0.7243F, 0.0F, 0.0F));

		PartDefinition cube_r232 = head.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(0, 255).addBox(-0.5F, -0.9F, -0.2F, 1.0F, 4.0F, 12.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 26.5678F, -69.8438F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r233 = head.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(57, 294).addBox(-0.5F, -0.9F, -0.2F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 32.046F, -74.2014F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r234 = head.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(19, 294).addBox(-0.5F, -0.9F, -0.2F, 1.0F, 4.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 38.1978F, -77.5415F, 1.0734F, 0.0F, 0.0F));

		PartDefinition cube_r235 = head.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(101, 293).addBox(-0.5F, -0.9F, -0.2F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 44.7328F, -80.0501F, 1.2043F, 0.0F, 0.0F));

		PartDefinition cube_r236 = head.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(292, 123).addBox(-0.5F, -4.6F, 0.1F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 59.2663F, -79.1094F, 1.4224F, 0.0F, 0.0F));

		PartDefinition cube_r237 = head.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(36, 299).addBox(-0.5F, -2.5F, -0.4F, 1.0F, 3.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 65.4273F, -80.7625F, 1.4661F, 0.0F, 0.0F));

		PartDefinition cube_r238 = head.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(298, 290).addBox(-0.5F, -2.6F, -1.1F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 71.3264F, -80.8655F, 1.5533F, 0.0F, 0.0F));

		PartDefinition cube_r239 = head.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(0, 298).addBox(-0.5F, -3.1F, 0.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 78.2291F, -79.4633F, 1.7104F, 0.0F, 0.0F));

		PartDefinition cube_r240 = head.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(0, 286).addBox(-0.5F, -3.1F, 0.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 85.1119F, -78.1877F, 1.7541F, 0.0F, 0.0F));

		PartDefinition cube_r241 = head.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(290, 38).addBox(-1.5F, 0.0F, -7.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 78.9011F, -83.8051F, 1.8239F, 0.0F, 0.0F));

		PartDefinition cube_r242 = head.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(128, 248).addBox(-2.0F, 0.0F, -7.0F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 71.9532F, -84.6582F, 1.693F, 0.0F, 0.0F));

		PartDefinition cube_r243 = head.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(144, 284).addBox(-2.0F, 0.0F, -7.0F, 4.0F, 2.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 64.9535F, -84.5971F, 1.5621F, 0.0F, 0.0F));

		PartDefinition cube_r244 = head.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(282, 16).addBox(-2.0F, 0.0F, -7.0F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 57.9631F, -84.2308F, 1.5184F, 0.0F, 0.0F));

		PartDefinition cube_r245 = head.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(121, 278).addBox(-2.0F, 0.0F, -7.0F, 4.0F, 2.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 51.0312F, -83.2566F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r246 = head.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(38, 278).addBox(-2.0F, 0.0F, -7.0F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 44.2106F, -81.6819F, 1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r247 = head.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(259, 231).addBox(-3.0F, 0.0F, -7.0F, 5.0F, 2.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, 37.6539F, -79.2305F, 1.213F, 0.0F, 0.0F));

		PartDefinition cube_r248 = head.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(54, 267).addBox(-3.0F, 0.0F, -8.0F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 30.5904F, -75.4747F, 1.0821F, 0.0F, 0.0F));

		PartDefinition cube_r249 = head.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(95, 265).addBox(-2.0F, 0.0F, -8.0F, 5.0F, 2.0F, 8.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5F, 23.881F, -71.1176F, 0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(264, 187).addBox(-2.0F, 0.0F, -8.0F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 17.7977F, -65.922F, 0.8639F, 0.0F, 0.0F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(263, 38).addBox(-2.5F, 0.0F, -8.0F, 5.0F, 2.0F, 8.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 12.0917F, -60.3147F, 0.7941F, 0.0F, 0.0F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(191, 224).addBox(-2.0F, -1.0F, -8.0F, 4.0F, 3.0F, 13.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.0F, 8.7425F, -52.7793F, 0.6632F, 0.0F, 0.0F));

		PartDefinition Baleen = head.addOrReplaceChild("Baleen", CubeListBuilder.create(), PartPose.offset(6.7161F, 25.7552F, -68.2585F));

		PartDefinition cube_r253 = Baleen.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(127, 140).addBox(5.0F, -0.475F, -16.5F, 31.0F, 0.0F, 17.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-5.239F, 34.5272F, -17.5947F, 0.7821F, -0.9766F, 0.8337F));

		PartDefinition cube_r254 = Baleen.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(0, 108).addBox(-1.0F, -0.5F, -16.5F, 46.0F, 0.0F, 17.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.4768F, 19.7444F, -9.6677F, 0.7043F, -0.9124F, 0.9344F));

		PartDefinition cube_r255 = Baleen.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(0, 62).addBox(-2.0F, 1.5F, -3.5F, 55.0F, 0.0F, 22.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.4435F, 15.9865F, -8.3472F, 0.5781F, -0.9081F, 0.9395F));

		PartDefinition cube_r256 = Baleen.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(127, 108).addBox(1.2F, 1.55F, 0.5F, 41.0F, 0.0F, 15.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5153F, -21.0306F, 21.388F, 0.3399F, -0.5758F, 1.1045F));

		PartDefinition cube_r257 = Baleen.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(0, 0).addBox(-0.8F, 1.5F, 0.5F, 57.0F, 0.0F, 30.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3738F, -0.6985F, 1.0476F));

		PartDefinition Baleen2 = head.addOrReplaceChild("Baleen2", CubeListBuilder.create(), PartPose.offset(-6.7161F, 25.7552F, -68.2585F));

		PartDefinition cube_r258 = Baleen2.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(0, 144).addBox(-36.0F, -0.475F, -16.5F, 31.0F, 0.0F, 17.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.239F, 34.5272F, -17.5947F, 0.7821F, 0.9766F, -0.8337F));

		PartDefinition cube_r259 = Baleen2.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(0, 126).addBox(-45.0F, -0.5F, -16.5F, 46.0F, 0.0F, 17.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.4768F, 19.7444F, -9.6677F, 0.7043F, 0.9124F, -0.9344F));

		PartDefinition cube_r260 = Baleen2.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(0, 85).addBox(-53.0F, 1.5F, -3.5F, 55.0F, 0.0F, 22.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.4435F, 15.9865F, -8.3472F, 0.5781F, 0.9081F, -0.9395F));

		PartDefinition cube_r261 = Baleen2.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(127, 124).addBox(-42.2F, 1.55F, 0.5F, 41.0F, 0.0F, 15.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5153F, -21.0306F, 21.388F, 0.3399F, 0.5758F, -1.1045F));

		PartDefinition cube_r262 = Baleen2.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(0, 31).addBox(-56.2F, 1.5F, 0.5F, 57.0F, 0.0F, 30.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3738F, 0.6985F, -1.0476F));

		PartDefinition leftOrbit = head.addOrReplaceChild("leftOrbit", CubeListBuilder.create(), PartPose.offset(3.2F, 11.6405F, -7.4633F));

		PartDefinition cube_r263 = leftOrbit.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(278, 80).addBox(-1.4F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(19.5647F, -2.8271F, -0.2833F, 1.0068F, -1.2912F, 0.5539F));

		PartDefinition cube_r264 = leftOrbit.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(311, 312).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.109F, -1.6026F, 0.2968F, 0.8692F, -1.0978F, 1.0547F));

		PartDefinition cube_r265 = leftOrbit.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(326, 69).addBox(4.9082F, -3.0877F, -4.9058F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0859F, -8.3001F, -3.0442F, 0.5376F, -1.0978F, 1.0547F));

		PartDefinition cube_r266 = leftOrbit.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(309, 60).addBox(-3.0207F, -3.2081F, 1.8436F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.7121F, -18.0546F, -0.3277F, -0.0213F, -0.0833F, -1.4858F));

		PartDefinition cube_r267 = leftOrbit.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(309, 79).addBox(-3.0207F, -5.0081F, -0.0564F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.7121F, -18.0546F, -0.3277F, 0.415F, -0.0833F, -1.4858F));

		PartDefinition cube_r268 = leftOrbit.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(309, 38).addBox(-3.0207F, -5.0081F, -0.0564F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(7.7121F, -18.0546F, -0.3277F, -0.3268F, -0.0833F, -1.4858F));

		PartDefinition cube_r269 = leftOrbit.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(0, 272).addBox(-3.0207F, -6.0081F, -0.0564F, 3.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.9724F, -15.9556F, -2.3083F, -0.3365F, 0.0168F, -1.197F));

		PartDefinition cube_r270 = leftOrbit.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(271, 123).addBox(-3.0207F, -6.0081F, -0.0564F, 3.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.3306F, -12.2744F, -4.1669F, -0.3171F, 0.1155F, -0.9072F));

		PartDefinition cube_r271 = leftOrbit.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(38, 288).addBox(-3.0207F, -3.7081F, -5.3564F, 3.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.1859F, -8.3001F, 0.0558F, -0.2196F, 0.2576F, -0.3937F));

		PartDefinition cube_r272 = leftOrbit.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(330, 134).addBox(-1.0207F, -4.5841F, -2.9263F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.1859F, -8.3001F, 0.0558F, 0.8276F, 0.2576F, -0.3937F));

		PartDefinition cube_r273 = leftOrbit.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(259, 300).addBox(-0.5F, -2.1F, -1.4F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.658F, -18.8427F, -7.851F, 0.742F, -0.2834F, -1.6935F));

		PartDefinition cube_r274 = leftOrbit.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(195, 303).addBox(-1.025F, -5.0F, 0.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2828F, -19.4461F, -5.6664F, 0.5325F, -0.2834F, -1.6935F));

		PartDefinition cube_r275 = leftOrbit.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(298, 312).addBox(-0.725F, -1.1F, -2.7F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.417F, -18.2936F, -3.7221F, 1.0592F, -0.4621F, -1.4876F));

		PartDefinition cube_r276 = leftOrbit.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(255, 312).addBox(-0.5707F, -4.6842F, -0.1263F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.1032F, -16.5341F, -2.5073F, 0.2546F, -0.2364F, -1.289F));

		PartDefinition cube_r277 = leftOrbit.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(333, 59).addBox(-1.0207F, -2.6842F, -0.1263F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.9213F, -15.753F, -2.7977F, -0.1454F, 0.0117F, -1.0344F));

		PartDefinition cube_r278 = leftOrbit.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(330, 143).addBox(-1.0207F, -4.9841F, -0.1263F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0777F, -12.8468F, -5.3651F, -0.5466F, 0.1559F, -0.9209F));

		PartDefinition cube_r279 = leftOrbit.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(334, 158).addBox(-1.0207F, -1.9841F, -0.1263F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.2311F, -11.3101F, -5.9201F, -0.2885F, 0.2224F, -0.7092F));

		PartDefinition cube_r280 = leftOrbit.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(332, 30).addBox(-1.0207F, -2.9842F, -0.1263F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.5404F, -8.7544F, -5.0516F, 0.304F, 0.2576F, -0.3937F));

		PartDefinition cube_r281 = leftOrbit.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(281, 320).addBox(-0.5F, -1.8F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(19.641F, -5.2612F, -0.5914F, 1.7682F, 0.1208F, 0.0499F));

		PartDefinition cube_r282 = leftOrbit.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(21, 272).addBox(-9.9281F, -1.2919F, 0.0011F, 10.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(20.2021F, -3.6873F, 0.9171F, 1.1282F, 0.3455F, -0.1103F));

		PartDefinition cube_r283 = leftOrbit.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(268, 319).addBox(1.8795F, 2.5774F, -2.1992F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(16.0859F, -8.3001F, -3.0442F, 1.1574F, 0.1208F, 0.0499F));

		PartDefinition cube_r284 = leftOrbit.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(68, 223).addBox(-3.1F, -0.8F, -7.2F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(16.9462F, -10.0212F, 3.9741F, 1.6457F, 0.2551F, 0.7637F));

		PartDefinition cube_r285 = leftOrbit.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(298, 304).addBox(0.0F, -0.8F, 4.5F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(16.9462F, -10.0212F, 3.9741F, 1.457F, -0.0014F, -1.3231F));

		PartDefinition cube_r286 = leftOrbit.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(304, 260).addBox(-4.2F, -0.8F, -0.5F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(16.9462F, -10.0212F, 3.9741F, 1.5002F, 0.0894F, -0.41F));

		PartDefinition cube_r287 = leftOrbit.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(210, 303).addBox(-0.1F, -0.8F, -1.5F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(16.9462F, -10.0212F, 3.9741F, 1.227F, 0.504F, -1.1309F));

		PartDefinition cube_r288 = leftOrbit.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(289, 281).addBox(-7.2745F, -1.3176F, -0.5796F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(20.7418F, -7.9635F, 2.7942F, 1.0624F, 0.1607F, -0.4167F));

		PartDefinition cube_r289 = leftOrbit.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(319, 195).addBox(-2.0102F, -0.6286F, 0.1602F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(20.1859F, -8.3001F, 0.0558F, 1.1187F, 0.2184F, -0.3755F));

		PartDefinition cube_r290 = leftOrbit.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(172, 274).addBox(-2.0F, 0.0F, -7.9F, 2.0F, 4.0F, 8.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.3F, -9.7776F, -41.666F, 0.8536F, 0.0973F, 0.1452F));

		PartDefinition cube_r291 = leftOrbit.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(245, 241).addBox(-1.4F, -1.5F, -7.5F, 2.0F, 3.0F, 13.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.9F, -2.3685F, -46.8059F, 0.6707F, 0.1373F, 0.1081F));

		PartDefinition cube_r292 = leftOrbit.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(285, 207).addBox(-0.675F, 0.1F, 0.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.7128F, 46.1106F, -75.5072F, 1.4073F, -0.4934F, 0.1008F));

		PartDefinition cube_r293 = leftOrbit.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(212, 241).addBox(-5.1F, -1.5F, -6.0F, 4.0F, 3.0F, 12.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(3.3626F, -10.2814F, -12.6227F, 2.9439F, 1.2394F, -3.0705F));

		PartDefinition cube_r294 = leftOrbit.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(184, 182).addBox(-2.0F, -0.6F, -14.5F, 5.0F, 3.0F, 17.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(9.0576F, -9.8337F, -10.7501F, 0.1225F, 1.0202F, 0.3628F));

		PartDefinition cube_r295 = leftOrbit.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(321, 268).addBox(-1.3F, -0.5F, -3.1F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(21.3931F, -5.3597F, -6.2214F, -3.1077F, 0.637F, -2.7143F));

		PartDefinition cube_r296 = leftOrbit.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(336, 190).addBox(-1.1F, -0.5F, -0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(20.2648F, -2.5321F, -3.2481F, 1.9402F, 1.1393F, 2.2934F));

		PartDefinition cube_r297 = leftOrbit.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(259, 148).addBox(-1.2F, 0.7F, -3.3F, 12.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(20.2203F, -4.6265F, -7.681F, -2.8753F, 0.4748F, -2.6807F));

		PartDefinition cube_r298 = leftOrbit.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(333, 330).addBox(-3.2F, 0.4F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(20.2203F, -4.6265F, -7.681F, -1.9256F, 0.9904F, -1.4693F));

		PartDefinition cube_r299 = leftOrbit.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(333, 181).addBox(-2.7F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(20.7769F, -5.6517F, -7.1074F, -1.763F, -0.0701F, -1.1553F));

		PartDefinition cube_r300 = leftOrbit.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(335, 43).addBox(-1.7F, -0.7F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(20.7769F, -5.6517F, -7.1074F, -1.7893F, -0.4975F, -1.0633F));

		PartDefinition cube_r301 = leftOrbit.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(228, 269).addBox(-3.0F, -0.5F, -1.5F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(21.3931F, -5.3597F, -6.2214F, -2.9996F, 1.3771F, -2.5951F));

		PartDefinition cube_r302 = leftOrbit.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(257, 0).addBox(-3.2F, -1.4F, 1.8F, 4.0F, 1.0F, 11.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(9.0576F, -9.8337F, -10.7501F, -0.112F, 1.3247F, 0.2985F));

		PartDefinition cube_r303 = leftOrbit.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(258, 202).addBox(1.6F, -0.4F, 1.2F, 1.0F, 2.0F, 12.0F, new CubeDeformation(-0.004F))
				.texOffs(97, 144).addBox(0.6F, -1.4F, 1.2F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(9.0576F, -9.8337F, -10.7501F, -0.0741F, 1.1944F, 0.3382F));

		PartDefinition cube_r304 = leftOrbit.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(81, 276).addBox(-2.3F, -1.4F, -10.3F, 4.0F, 3.0F, 7.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(9.0576F, -9.8337F, -10.7501F, -3.0923F, 0.9858F, -2.6933F));

		PartDefinition cube_r305 = leftOrbit.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(45, 186).addBox(-3.9F, -1.4F, -13.3F, 6.0F, 3.0F, 16.0F, new CubeDeformation(-0.017F)), PartPose.offsetAndRotation(9.0576F, -9.8337F, -10.7501F, -0.8009F, 1.5329F, -0.3934F));

		PartDefinition cube_r306 = leftOrbit.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(191, 158).addBox(-6.0F, -0.4F, -14.5F, 9.0F, 2.0F, 14.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(9.0576F, -9.8337F, -10.7501F, -0.0375F, 0.7586F, 0.3814F));

		PartDefinition cube_r307 = leftOrbit.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(218, 0).addBox(-3.0F, -1.4F, -10.5F, 6.0F, 3.0F, 13.0F, new CubeDeformation(0.024F)), PartPose.offsetAndRotation(9.0576F, -9.8337F, -10.7501F, -0.0521F, 1.0202F, 0.3628F));

		PartDefinition cube_r308 = leftOrbit.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(220, 38).addBox(-5.375F, 0.1F, 0.0F, 12.0F, 1.0F, 9.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.9275F, -14.7311F, -17.268F, -0.1402F, 0.0326F, 0.59F));

		PartDefinition cube_r309 = leftOrbit.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(155, 97).addBox(-5.375F, 0.1F, 0.0F, 12.0F, 1.0F, 9.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.8632F, -13.6623F, -26.1407F, 0.1652F, 0.0326F, 0.59F));

		PartDefinition cube_r310 = leftOrbit.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(0, 244).addBox(-2.375F, 0.1F, 0.0F, 9.0F, 1.0F, 9.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.0356F, -11.3241F, -34.6217F, 0.3398F, 0.0326F, 0.59F));

		PartDefinition cube_r311 = leftOrbit.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(259, 138).addBox(-2.375F, 0.1F, 0.0F, 6.0F, 1.0F, 8.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.3782F, -6.6192F, -41.6121F, 0.4285F, -0.0865F, 0.5357F));

		PartDefinition cube_r312 = leftOrbit.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(229, 187).addBox(-0.375F, 0.1F, 0.0F, 4.0F, 1.0F, 13.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.4145F, 1.373F, -51.7071F, 0.6547F, -0.2054F, 0.4803F));

		PartDefinition cube_r313 = leftOrbit.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(271, 113).addBox(-0.375F, 0.1F, 0.0F, 4.0F, 1.0F, 8.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.3928F, 6.9766F, -57.4167F, 0.7123F, -0.3394F, 0.3641F));

		PartDefinition cube_r314 = leftOrbit.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(122, 267).addBox(-0.375F, 0.1F, 0.0F, 4.0F, 1.0F, 9.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.3259F, 13.8996F, -63.1672F, 0.8125F, -0.3788F, 0.3273F));

		PartDefinition cube_r315 = leftOrbit.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(78, 287).addBox(-0.375F, 0.1F, 0.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5151F, 19.7034F, -67.0761F, 0.9223F, -0.3908F, 0.3136F));

		PartDefinition cube_r316 = leftOrbit.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(286, 220).addBox(-0.375F, 0.1F, 0.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.7257F, 25.8598F, -70.401F, 1.0246F, -0.4169F, 0.2756F));

		PartDefinition cube_r317 = leftOrbit.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(286, 80).addBox(-0.375F, 0.1F, 0.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.6893F, 32.3681F, -72.9779F, 1.1472F, -0.4609F, 0.1923F));

		PartDefinition cube_r318 = leftOrbit.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(286, 61).addBox(-0.375F, 0.1F, 0.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.8225F, 39.1642F, -74.6496F, 1.2984F, -0.4784F, 0.1475F));

		PartDefinition cube_r319 = leftOrbit.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(285, 198).addBox(-0.675F, 0.1F, 0.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.7795F, 53.0896F, -76.0453F, 1.4831F, -0.5F, 0.0517F));

		PartDefinition cube_r320 = leftOrbit.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(284, 231).addBox(-0.675F, 0.1F, 0.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.9639F, 60.0797F, -76.3695F, 1.518F, -0.5F, 0.0517F));

		PartDefinition cube_r321 = leftOrbit.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(136, 294).addBox(-0.675F, 0.1F, 0.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.2696F, 66.0479F, -75.834F, 1.6728F, -0.5018F, 0.002F));

		PartDefinition cube_r322 = leftOrbit.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(309, 219).addBox(-0.675F, -0.5F, 0.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.9545F, 69.8383F, -74.5995F, 1.7775F, -0.5018F, 0.002F));

		PartDefinition cube_r323 = leftOrbit.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(309, 24).addBox(-2.425F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.5844F, 71.6028F, -73.2213F, 1.8883F, -0.496F, -0.0476F));

		PartDefinition cube_r324 = leftOrbit.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(330, 152).addBox(0.0F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.8229F, 78.575F, -71.3281F, 2.0039F, -0.4676F, -0.109F));

		PartDefinition cube_r325 = leftOrbit.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(330, 113).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.8229F, 78.575F, -71.3281F, 2.0417F, -0.4295F, -0.1962F));

		PartDefinition cube_r326 = leftOrbit.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(54, 261).addBox(-1.1503F, -1.251F, -3.5946F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.2199F, 76.7863F, -70.3287F, 1.9005F, -0.5427F, 0.1039F));

		PartDefinition cube_r327 = leftOrbit.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(307, 107).addBox(-2.7301F, -1.0642F, -2.0904F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-1.0265F, 74.8972F, -71.648F, 1.8655F, -0.5092F, -0.0002F));

		PartDefinition cube_r328 = leftOrbit.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(234, 329).addBox(1.6F, 0.025F, -1.6F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.7F, -12.5373F, -37.4966F, 0.6654F, 0.4646F, 0.3381F));

		PartDefinition cube_r329 = leftOrbit.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(307, 229).addBox(3.0F, 0.0F, -4.9F, 2.0F, 4.0F, 5.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.7F, -12.5373F, -37.4966F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r330 = leftOrbit.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(33, 225).addBox(-0.5F, -1.0F, -7.6F, 4.0F, 3.0F, 13.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.2F, -2.898F, -45.316F, 0.6674F, 0.103F, 0.0809F));

		PartDefinition cube_r331 = leftOrbit.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(178, 303).addBox(-1.0F, 0.0F, -7.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-1.2F, 60.3128F, -77.195F, 1.6927F, -0.0085F, 0.0693F));

		PartDefinition cube_r332 = leftOrbit.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(315, 152).addBox(-0.3F, -1.875F, -0.95F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(-3.2F, -18.6044F, -3.9759F, 1.3588F, 0.6003F, -0.121F));

		PartDefinition cube_r333 = leftOrbit.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(291, 187).addBox(-2.0F, 0.0F, -7.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-1.7F, 67.2606F, -76.3419F, 1.8233F, -0.0175F, 0.0676F));

		PartDefinition cube_r334 = leftOrbit.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(329, 312).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-2.7F, 77.8082F, -73.254F, 2.0386F, -0.0593F, 0.1168F));

		PartDefinition cube_r335 = leftOrbit.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(161, 303).addBox(-1.0F, 0.0F, -7.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.7F, 32.5702F, -74.2186F, 1.3444F, 0.0157F, 0.068F));

		PartDefinition cube_r336 = leftOrbit.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(175, 0).addBox(-7.0F, 0.075F, 0.0F, 7.0F, 11.0F, 14.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.3F, -19.7425F, -17.2694F, -0.0902F, 0.2785F, -0.0203F));

		PartDefinition cube_r337 = leftOrbit.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(305, 15).addBox(3.0F, 2.0F, 0.1F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-3.7F, -7.4908F, -42.6861F, 0.6283F, 0.0F, 0.0F));

		PartDefinition rightOrbit = head.addOrReplaceChild("rightOrbit", CubeListBuilder.create(), PartPose.offset(-3.2F, 11.6405F, -7.4633F));

		PartDefinition cube_r338 = rightOrbit.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(278, 80).mirror().addBox(0.4F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-19.5647F, -2.8271F, -0.2833F, 1.0068F, 1.2912F, -0.5539F));

		PartDefinition cube_r339 = rightOrbit.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(311, 312).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-15.109F, -1.6026F, 0.2968F, 0.8692F, 1.0978F, -1.0547F));

		PartDefinition cube_r340 = rightOrbit.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(326, 69).mirror().addBox(-5.9082F, -3.0877F, -4.9058F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-16.0859F, -8.3001F, -3.0442F, 0.5376F, 1.0978F, -1.0547F));

		PartDefinition cube_r341 = rightOrbit.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(309, 60).mirror().addBox(0.0207F, -3.2081F, 1.8436F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.7121F, -18.0546F, -0.3277F, -0.0213F, 0.0833F, 1.4858F));

		PartDefinition cube_r342 = rightOrbit.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(309, 79).mirror().addBox(0.0207F, -5.0081F, -0.0564F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-7.7121F, -18.0546F, -0.3277F, 0.415F, 0.0833F, 1.4858F));

		PartDefinition cube_r343 = rightOrbit.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(309, 38).mirror().addBox(0.0207F, -5.0081F, -0.0564F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-7.7121F, -18.0546F, -0.3277F, -0.3268F, 0.0833F, 1.4858F));

		PartDefinition cube_r344 = rightOrbit.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(0, 272).mirror().addBox(0.0207F, -6.0081F, -0.0564F, 3.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.9724F, -15.9556F, -2.3083F, -0.3365F, -0.0168F, 1.197F));

		PartDefinition cube_r345 = rightOrbit.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(271, 123).mirror().addBox(0.0207F, -6.0081F, -0.0564F, 3.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-17.3306F, -12.2744F, -4.1669F, -0.3171F, -0.1155F, 0.9072F));

		PartDefinition cube_r346 = rightOrbit.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(38, 288).mirror().addBox(0.0207F, -3.7081F, -5.3564F, 3.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-20.1859F, -8.3001F, 0.0558F, -0.2196F, -0.2576F, 0.3937F));

		PartDefinition cube_r347 = rightOrbit.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(330, 134).mirror().addBox(0.0207F, -4.5841F, -2.9263F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-20.1859F, -8.3001F, 0.0558F, 0.8276F, -0.2576F, 0.3937F));

		PartDefinition cube_r348 = rightOrbit.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(259, 300).mirror().addBox(-0.5F, -2.1F, -1.4F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.658F, -18.8427F, -7.851F, 0.742F, 0.2834F, 1.6935F));

		PartDefinition cube_r349 = rightOrbit.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(195, 303).mirror().addBox(0.025F, -5.0F, 0.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.2828F, -19.4461F, -5.6664F, 0.5325F, 0.2834F, 1.6935F));

		PartDefinition cube_r350 = rightOrbit.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(298, 312).mirror().addBox(-0.275F, -1.1F, -2.7F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.417F, -18.2936F, -3.7221F, 1.0592F, 0.4621F, 1.4876F));

		PartDefinition cube_r351 = rightOrbit.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(255, 312).mirror().addBox(-0.4293F, -4.6842F, -0.1263F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-11.1032F, -16.5341F, -2.5073F, 0.2546F, 0.2364F, 1.289F));

		PartDefinition cube_r352 = rightOrbit.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(333, 59).mirror().addBox(0.0207F, -2.6842F, -0.1263F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.9213F, -15.753F, -2.7977F, -0.1454F, -0.0117F, 1.0344F));

		PartDefinition cube_r353 = rightOrbit.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(330, 143).mirror().addBox(0.0207F, -4.9841F, -0.1263F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-16.0777F, -12.8468F, -5.3651F, -0.5466F, -0.1559F, 0.9209F));

		PartDefinition cube_r354 = rightOrbit.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(334, 158).mirror().addBox(0.0207F, -1.9841F, -0.1263F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-17.2311F, -11.3101F, -5.9201F, -0.2885F, -0.2224F, 0.7092F));

		PartDefinition cube_r355 = rightOrbit.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(332, 30).mirror().addBox(0.0207F, -2.9842F, -0.1263F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-18.5404F, -8.7544F, -5.0516F, 0.304F, -0.2576F, 0.3937F));

		PartDefinition cube_r356 = rightOrbit.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(281, 320).mirror().addBox(-0.5F, -1.8F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-19.641F, -5.2612F, -0.5914F, 1.7682F, -0.1208F, -0.0499F));

		PartDefinition cube_r357 = rightOrbit.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(21, 272).mirror().addBox(-0.0719F, -1.2919F, 0.0011F, 10.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-20.2021F, -3.6873F, 0.9171F, 1.1282F, -0.3455F, 0.1103F));

		PartDefinition cube_r358 = rightOrbit.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(268, 319).mirror().addBox(-3.8795F, 2.5774F, -2.1992F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-16.0859F, -8.3001F, -3.0442F, 1.1574F, -0.1208F, -0.0499F));

		PartDefinition cube_r359 = rightOrbit.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(68, 223).mirror().addBox(0.1F, -0.8F, -7.2F, 3.0F, 1.0F, 7.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-16.9462F, -10.0212F, 3.9741F, 1.6457F, -0.2551F, -0.7637F));

		PartDefinition cube_r360 = rightOrbit.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(298, 304).mirror().addBox(-3.0F, -0.8F, 4.5F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-16.9462F, -10.0212F, 3.9741F, 1.457F, 0.0014F, 1.3231F));

		PartDefinition cube_r361 = rightOrbit.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(304, 260).mirror().addBox(1.2F, -0.8F, -0.5F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-16.9462F, -10.0212F, 3.9741F, 1.5002F, -0.0894F, 0.41F));

		PartDefinition cube_r362 = rightOrbit.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(210, 303).mirror().addBox(-2.9F, -0.8F, -1.5F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-16.9462F, -10.0212F, 3.9741F, 1.227F, -0.504F, 1.1309F));

		PartDefinition cube_r363 = rightOrbit.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(289, 281).mirror().addBox(0.2745F, -1.3176F, -0.5796F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-20.7418F, -7.9635F, 2.7942F, 1.0624F, -0.1607F, 0.4167F));

		PartDefinition cube_r364 = rightOrbit.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(319, 195).mirror().addBox(0.0102F, -0.6286F, 0.1602F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-20.1859F, -8.3001F, 0.0558F, 1.1187F, -0.2184F, 0.3755F));

		PartDefinition cube_r365 = rightOrbit.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(172, 274).mirror().addBox(0.0F, 0.0F, -7.9F, 2.0F, 4.0F, 8.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3F, -9.7776F, -41.666F, 0.8536F, -0.0973F, -0.1452F));

		PartDefinition cube_r366 = rightOrbit.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(245, 241).mirror().addBox(-0.6F, -1.5F, -7.5F, 2.0F, 3.0F, 13.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.9F, -2.3685F, -46.8059F, 0.6707F, -0.1373F, -0.1081F));

		PartDefinition cube_r367 = rightOrbit.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(285, 207).mirror().addBox(-3.325F, 0.1F, 0.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.7128F, 46.1106F, -75.5072F, 1.4073F, 0.4934F, -0.1008F));

		PartDefinition cube_r368 = rightOrbit.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(212, 241).mirror().addBox(1.1F, -1.5F, -6.0F, 4.0F, 3.0F, 12.0F, new CubeDeformation(-0.013F)).mirror(false), PartPose.offsetAndRotation(-3.3626F, -10.2814F, -12.6227F, 2.9439F, -1.2394F, 3.0705F));

		PartDefinition cube_r369 = rightOrbit.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(184, 182).mirror().addBox(-3.0F, -0.6F, -14.5F, 5.0F, 3.0F, 17.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-9.0576F, -9.8337F, -10.7501F, 0.1225F, -1.0202F, -0.3628F));

		PartDefinition cube_r370 = rightOrbit.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(321, 268).mirror().addBox(-3.7F, -0.5F, -3.1F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-21.3931F, -5.3597F, -6.2214F, -3.1077F, -0.637F, 2.7143F));

		PartDefinition cube_r371 = rightOrbit.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(336, 190).mirror().addBox(-1.9F, -0.5F, -0.1F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-20.2648F, -2.5321F, -3.2481F, 1.9402F, -1.1393F, -2.2934F));

		PartDefinition cube_r372 = rightOrbit.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(259, 148).mirror().addBox(-10.8F, 0.7F, -3.3F, 12.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-20.2203F, -4.6265F, -7.681F, -2.8753F, -0.4748F, 2.6807F));

		PartDefinition cube_r373 = rightOrbit.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(333, 330).mirror().addBox(0.2F, 0.4F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-20.2203F, -4.6265F, -7.681F, -1.9256F, -0.9904F, 1.4693F));

		PartDefinition cube_r374 = rightOrbit.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(333, 181).mirror().addBox(-0.3F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-20.7769F, -5.6517F, -7.1074F, -1.763F, 0.0701F, 1.1553F));

		PartDefinition cube_r375 = rightOrbit.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(335, 43).mirror().addBox(-0.3F, -0.7F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-20.7769F, -5.6517F, -7.1074F, -1.7893F, 0.4975F, 1.0633F));

		PartDefinition cube_r376 = rightOrbit.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(228, 269).mirror().addBox(-2.0F, -0.5F, -1.5F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-21.3931F, -5.3597F, -6.2214F, -2.9996F, -1.3771F, 2.5951F));

		PartDefinition cube_r377 = rightOrbit.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(257, 0).mirror().addBox(-0.8F, -1.4F, 1.8F, 4.0F, 1.0F, 11.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-9.0576F, -9.8337F, -10.7501F, -0.112F, -1.3247F, -0.2985F));

		PartDefinition cube_r378 = rightOrbit.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(258, 202).mirror().addBox(-2.6F, -0.4F, 1.2F, 1.0F, 2.0F, 12.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(97, 144).mirror().addBox(-2.6F, -1.4F, 1.2F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-9.0576F, -9.8337F, -10.7501F, -0.0741F, -1.1944F, -0.3382F));

		PartDefinition cube_r379 = rightOrbit.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(81, 276).mirror().addBox(-1.7F, -1.4F, -10.3F, 4.0F, 3.0F, 7.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-9.0576F, -9.8337F, -10.7501F, -3.0923F, -0.9858F, 2.6933F));

		PartDefinition cube_r380 = rightOrbit.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(45, 186).mirror().addBox(-2.1F, -1.4F, -13.3F, 6.0F, 3.0F, 16.0F, new CubeDeformation(-0.017F)).mirror(false), PartPose.offsetAndRotation(-9.0576F, -9.8337F, -10.7501F, -0.8009F, -1.5329F, 0.3934F));

		PartDefinition cube_r381 = rightOrbit.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(191, 158).mirror().addBox(-3.0F, -0.4F, -14.5F, 9.0F, 2.0F, 14.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-9.0576F, -9.8337F, -10.7501F, -0.0375F, -0.7586F, -0.3814F));

		PartDefinition cube_r382 = rightOrbit.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(218, 0).mirror().addBox(-3.0F, -1.4F, -10.5F, 6.0F, 3.0F, 13.0F, new CubeDeformation(0.024F)).mirror(false), PartPose.offsetAndRotation(-9.0576F, -9.8337F, -10.7501F, -0.0521F, -1.0202F, -0.3628F));

		PartDefinition cube_r383 = rightOrbit.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(220, 38).mirror().addBox(-6.625F, 0.1F, 0.0F, 12.0F, 1.0F, 9.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.9275F, -14.7311F, -17.268F, -0.1402F, -0.0326F, -0.59F));

		PartDefinition cube_r384 = rightOrbit.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(155, 97).mirror().addBox(-6.625F, 0.1F, 0.0F, 12.0F, 1.0F, 9.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.8632F, -13.6623F, -26.1407F, 0.1652F, -0.0326F, -0.59F));

		PartDefinition cube_r385 = rightOrbit.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(0, 244).mirror().addBox(-6.625F, 0.1F, 0.0F, 9.0F, 1.0F, 9.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.0356F, -11.3241F, -34.6217F, 0.3398F, -0.0326F, -0.59F));

		PartDefinition cube_r386 = rightOrbit.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(259, 138).mirror().addBox(-3.625F, 0.1F, 0.0F, 6.0F, 1.0F, 8.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-1.3782F, -6.6192F, -41.6121F, 0.4285F, 0.0865F, -0.5357F));

		PartDefinition cube_r387 = rightOrbit.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(229, 187).mirror().addBox(-3.625F, 0.1F, 0.0F, 4.0F, 1.0F, 13.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.4145F, 1.373F, -51.7071F, 0.6547F, 0.2054F, -0.4803F));

		PartDefinition cube_r388 = rightOrbit.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(271, 113).mirror().addBox(-3.625F, 0.1F, 0.0F, 4.0F, 1.0F, 8.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.3928F, 6.9766F, -57.4167F, 0.7123F, 0.3394F, -0.3641F));

		PartDefinition cube_r389 = rightOrbit.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(122, 267).mirror().addBox(-3.625F, 0.1F, 0.0F, 4.0F, 1.0F, 9.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.3259F, 13.8996F, -63.1672F, 0.8125F, 0.3788F, -0.3273F));

		PartDefinition cube_r390 = rightOrbit.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(78, 287).mirror().addBox(-3.625F, 0.1F, 0.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.5151F, 19.7034F, -67.0761F, 0.9223F, 0.3908F, -0.3136F));

		PartDefinition cube_r391 = rightOrbit.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(286, 220).mirror().addBox(-3.625F, 0.1F, 0.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.7257F, 25.8598F, -70.401F, 1.0246F, 0.4169F, -0.2756F));

		PartDefinition cube_r392 = rightOrbit.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(286, 80).mirror().addBox(-3.625F, 0.1F, 0.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.6893F, 32.3681F, -72.9779F, 1.1472F, 0.4609F, -0.1923F));

		PartDefinition cube_r393 = rightOrbit.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(286, 61).mirror().addBox(-3.625F, 0.1F, 0.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.8225F, 39.1642F, -74.6496F, 1.2984F, 0.4784F, -0.1475F));

		PartDefinition cube_r394 = rightOrbit.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(285, 198).mirror().addBox(-3.325F, 0.1F, 0.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.7795F, 53.0896F, -76.0453F, 1.4831F, 0.5F, -0.0517F));

		PartDefinition cube_r395 = rightOrbit.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(284, 231).mirror().addBox(-3.325F, 0.1F, 0.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.9639F, 60.0797F, -76.3695F, 1.518F, 0.5F, -0.0517F));

		PartDefinition cube_r396 = rightOrbit.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(136, 294).mirror().addBox(-3.325F, 0.1F, 0.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.2696F, 66.0479F, -75.834F, 1.6728F, 0.5018F, -0.002F));

		PartDefinition cube_r397 = rightOrbit.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(309, 219).mirror().addBox(-3.325F, -0.5F, 0.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.9545F, 69.8383F, -74.5995F, 1.7775F, 0.5018F, -0.002F));

		PartDefinition cube_r398 = rightOrbit.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(309, 24).mirror().addBox(-1.575F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.5844F, 71.6028F, -73.2213F, 1.8883F, 0.496F, 0.0476F));

		PartDefinition cube_r399 = rightOrbit.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(330, 152).mirror().addBox(-1.0F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.8229F, 78.575F, -71.3281F, 2.0039F, 0.4676F, 0.109F));

		PartDefinition cube_r400 = rightOrbit.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(330, 113).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.8229F, 78.575F, -71.3281F, 2.0417F, 0.4295F, 0.1962F));

		PartDefinition cube_r401 = rightOrbit.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(54, 261).mirror().addBox(0.1503F, -1.251F, -3.5946F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(0.2199F, 76.7863F, -70.3287F, 1.9005F, 0.5427F, -0.1039F));

		PartDefinition cube_r402 = rightOrbit.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(307, 107).mirror().addBox(-1.2699F, -1.0642F, -2.0904F, 4.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(1.0265F, 74.8972F, -71.648F, 1.8655F, 0.5092F, 0.0002F));

		PartDefinition cube_r403 = rightOrbit.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(234, 329).mirror().addBox(-4.6F, 0.025F, -1.6F, 3.0F, 4.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(3.7F, -12.5373F, -37.4966F, 0.6654F, -0.4646F, -0.3381F));

		PartDefinition cube_r404 = rightOrbit.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(307, 229).mirror().addBox(-5.0F, 0.0F, -4.9F, 2.0F, 4.0F, 5.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(3.7F, -12.5373F, -37.4966F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r405 = rightOrbit.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(33, 225).mirror().addBox(-3.5F, -1.0F, -7.6F, 4.0F, 3.0F, 13.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(3.2F, -2.898F, -45.316F, 0.6674F, -0.103F, -0.0809F));

		PartDefinition cube_r406 = rightOrbit.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(178, 303).mirror().addBox(0.0F, 0.0F, -7.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(1.2F, 60.3128F, -77.195F, 1.6927F, 0.0085F, -0.0693F));

		PartDefinition cube_r407 = rightOrbit.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(315, 152).mirror().addBox(-5.7F, -1.875F, -0.95F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.016F)).mirror(false), PartPose.offsetAndRotation(3.2F, -18.6044F, -3.9759F, 1.3588F, -0.6003F, 0.121F));

		PartDefinition cube_r408 = rightOrbit.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(291, 187).mirror().addBox(0.0F, 0.0F, -7.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(1.7F, 67.2606F, -76.3419F, 1.8233F, 0.0175F, -0.0676F));

		PartDefinition cube_r409 = rightOrbit.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(329, 312).mirror().addBox(-0.5F, 0.0F, -4.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(2.7F, 77.8082F, -73.254F, 2.0386F, 0.0593F, -0.1168F));

		PartDefinition cube_r410 = rightOrbit.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(161, 303).mirror().addBox(0.0F, 0.0F, -7.0F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.7F, 32.5702F, -74.2186F, 1.3444F, -0.0157F, -0.068F));

		PartDefinition cube_r411 = rightOrbit.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(175, 0).mirror().addBox(0.0F, 0.075F, 0.0F, 7.0F, 11.0F, 14.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-0.3F, -19.7425F, -17.2694F, -0.0902F, -0.2785F, 0.0203F));

		PartDefinition cube_r412 = rightOrbit.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(305, 15).mirror().addBox(-5.0F, 2.0F, 0.1F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(3.7F, -7.4908F, -42.6861F, 0.6283F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 5.4312F, 2.4323F, 1.3003F, 0.0F, 0.0F));

		PartDefinition cube_r413 = jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(113, 317).addBox(-43.9085F, 68.5161F, 35.8483F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-19.1116F, -2.0138F, -10.7334F, -2.1853F, -0.4683F, 0.4272F));

		PartDefinition cube_r414 = jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(331, 324).addBox(-1.0F, 0.7622F, -0.0779F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.9697F, -17.3131F, -111.2246F, -2.5331F, -0.5435F, 0.5097F));

		PartDefinition cube_r415 = jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(61, 315).addBox(-1.0F, -6.8092F, -0.3066F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-9.9697F, -16.3131F, -109.2246F, -2.2713F, -0.5435F, 0.5097F));

		PartDefinition cube_r416 = jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(41, 310).addBox(-36.2086F, 57.7753F, 33.9004F, 2.0F, 9.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-19.1116F, -2.0138F, -10.7334F, -2.1126F, -0.3726F, 0.4082F));

		PartDefinition cube_r417 = jaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(30, 310).addBox(-36.2086F, 65.0807F, 36.8152F, 2.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.1116F, -2.0138F, -10.7334F, -2.1562F, -0.3726F, 0.4082F));

		PartDefinition cube_r418 = jaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(118, 303).addBox(-30.6775F, 56.3662F, 24.2457F, 2.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.1116F, -2.0138F, -10.7334F, -1.9543F, -0.2923F, 0.3964F));

		PartDefinition cube_r419 = jaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(170, 313).addBox(-17.1117F, 58.5297F, 23.4384F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-19.3366F, -1.5138F, -8.6584F, -1.9164F, -0.08F, 0.3461F));

		PartDefinition cube_r420 = jaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(70, 312).addBox(-17.1117F, 55.6104F, 15.564F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.012F))
				.texOffs(87, 296).addBox(-17.1117F, 55.6104F, 13.064F, 2.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.3366F, -1.5138F, -8.6584F, -1.7855F, -0.08F, 0.3461F));

		PartDefinition cube_r421 = jaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(131, 305).addBox(-12.3402F, 48.4924F, 13.1905F, 2.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.3366F, -1.5138F, -8.6584F, -1.7385F, 0.0022F, 0.3449F));

		PartDefinition cube_r422 = jaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(167, 287).addBox(-7.3394F, 40.0301F, 11.5083F, 2.0F, 10.0F, 5.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-19.3366F, -1.5138F, -8.6584F, -1.7204F, 0.1007F, 0.3468F));

		PartDefinition cube_r423 = jaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(283, 290).addBox(-3.1199F, 32.4024F, 10.1294F, 2.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.3366F, -1.5138F, -8.6584F, -1.6841F, 0.1991F, 0.3522F));

		PartDefinition cube_r424 = jaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(104, 276).addBox(-0.3531F, 23.1062F, 8.1529F, 2.0F, 10.0F, 6.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-19.3366F, -1.5138F, -8.6584F, -1.6528F, 0.2809F, 0.3596F));

		PartDefinition cube_r425 = jaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(21, 278).addBox(1.4164F, 15.2035F, 6.5123F, 2.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.3366F, -1.5138F, -8.6584F, -1.5831F, 0.3461F, 0.3677F));

		PartDefinition cube_r426 = jaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(271, 98).addBox(-1.0F, -3.0F, -3.9F, 2.0F, 6.0F, 8.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-22.8322F, 4.987F, -16.3948F, -1.4323F, 0.2645F, 0.3579F));

		PartDefinition cube_r427 = jaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(268, 258).addBox(0.061F, 10.9862F, 2.8597F, 2.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.3366F, -1.5138F, -8.6584F, -1.4847F, 0.2645F, 0.3579F));

		PartDefinition cube_r428 = jaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(149, 272).addBox(-0.9351F, -4.7953F, 1.7367F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-18.8674F, -3.6964F, -6.7479F, -1.0582F, -0.0718F, 0.3459F));

		PartDefinition cube_r429 = jaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(315, 136).addBox(-0.9351F, -3.5604F, 0.6335F, 4.0F, 4.0F, 3.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-18.8674F, -3.6964F, -6.7479F, -0.6219F, -0.0718F, 0.3459F));

		PartDefinition cube_r430 = jaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(315, 144).addBox(-0.9351F, -2.5054F, -0.4093F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-18.8674F, -3.6964F, -6.7479F, 0.0326F, -0.0718F, 0.3459F));

		PartDefinition cube_r431 = jaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(253, 17).addBox(-0.9351F, -2.9295F, -0.9197F, 4.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-18.8674F, -3.6964F, -6.7479F, -0.8837F, -0.0718F, 0.3459F));

		PartDefinition cube_r432 = jaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(181, 241).addBox(0.0649F, -0.3705F, -1.0564F, 2.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-18.8674F, -3.6964F, -6.7479F, -1.0146F, -0.0718F, 0.3459F));

		PartDefinition cube_r433 = jaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(240, 119).addBox(0.0649F, -1.1832F, -0.5756F, 2.0F, 5.0F, 13.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-18.8674F, -3.6964F, -6.7479F, -1.4073F, -0.0718F, 0.3459F));

		PartDefinition cube_r434 = jaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(68, 232).addBox(-0.0878F, -0.1885F, -2.3487F, 2.0F, 6.0F, 13.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-19.3366F, -1.5138F, -8.6584F, -1.4941F, 0.24F, 0.3556F));

		PartDefinition cube_r435 = jaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(37, 242).addBox(-1.0F, -3.35F, -6.25F, 2.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-22.1227F, 2.3657F, -17.3317F, -1.4847F, 0.2645F, 0.3579F));

		PartDefinition cube_r436 = jaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(266, 287).addBox(0.061F, 10.9336F, -4.8738F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-19.3366F, -1.5138F, -8.6584F, -1.2665F, 0.2645F, 0.3579F));

		PartDefinition cube_r437 = jaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(285, 153).addBox(1.4164F, 15.9877F, -3.8809F, 2.0F, 9.0F, 6.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-19.3366F, -1.5138F, -8.6584F, -1.3213F, 0.3461F, 0.3677F));

		PartDefinition cube_r438 = jaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(193, 284).addBox(-0.3531F, 24.9606F, -0.0584F, 2.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.3366F, -1.5138F, -8.6584F, -1.4783F, 0.2809F, 0.3596F));

		PartDefinition cube_r439 = jaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(291, 172).addBox(-3.1199F, 33.2264F, 3.8931F, 2.0F, 9.0F, 5.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-19.3366F, -1.5138F, -8.6584F, -1.5969F, 0.1991F, 0.3522F));

		PartDefinition cube_r440 = jaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(292, 98).addBox(-7.3394F, 41.4879F, 5.351F, 2.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.3366F, -1.5138F, -8.6584F, -1.6331F, 0.1007F, 0.3468F));

		PartDefinition cube_r441 = jaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(144, 305).addBox(-12.3402F, 48.6503F, 9.615F, 2.0F, 9.0F, 4.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-19.3366F, -1.5138F, -8.6584F, -1.721F, 0.0022F, 0.3449F));

		PartDefinition cube_r442 = jaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(17, 306).addBox(-30.6775F, 56.958F, 19.8875F, 2.0F, 9.0F, 4.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-19.1116F, -2.0138F, -10.7334F, -1.9107F, -0.2923F, 0.3964F));

		PartDefinition cube_r443 = jaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(83, 312).addBox(-36.2086F, 60.9363F, 25.6945F, 2.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.1116F, -2.0138F, -10.7334F, -2.0166F, -0.3726F, 0.4082F));

		PartDefinition cube_r444 = jaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(315, 0).addBox(-36.2086F, 68.4264F, 28.7165F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-19.1116F, -2.0138F, -10.7334F, -2.0602F, -0.3726F, 0.4082F));

		PartDefinition cube_r445 = jaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(335, 66).addBox(-1.0F, 1.0392F, -2.3189F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-7.9697F, -17.3131F, -111.2246F, -1.9397F, -0.5435F, 0.5097F));

		PartDefinition cube_r446 = jaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(306, 172).addBox(-1.0F, -6.3241F, -1.8751F, 2.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.9697F, -16.3131F, -109.2246F, -2.2539F, -0.5435F, 0.5097F));

		PartDefinition cube_r447 = jaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(324, 79).addBox(-43.9085F, 67.7228F, 40.7873F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.1116F, -2.0138F, -10.7334F, -2.2289F, -0.4683F, 0.4272F));

		PartDefinition cube_r448 = jaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(324, 59).addBox(41.9085F, 67.7228F, 40.7873F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.9116F, -2.0138F, -10.7334F, -2.2289F, 0.4683F, -0.4272F));

		PartDefinition cube_r449 = jaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(315, 289).addBox(41.9085F, 68.5161F, 35.8483F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(17.9116F, -2.0138F, -10.7334F, -2.1853F, 0.4683F, -0.4272F));

		PartDefinition cube_r450 = jaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(27, 255).addBox(-1.0F, 0.7622F, -0.0779F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.7698F, -17.3131F, -111.2246F, -2.5331F, 0.5435F, -0.5097F));

		PartDefinition cube_r451 = jaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(52, 315).addBox(-1.0F, -6.8092F, -0.3066F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(8.7698F, -16.3131F, -109.2246F, -2.2713F, 0.5435F, -0.5097F));

		PartDefinition cube_r452 = jaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(182, 287).addBox(34.2086F, 57.7753F, 33.9004F, 2.0F, 9.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(17.9116F, -2.0138F, -10.7334F, -2.1126F, 0.3726F, -0.4082F));

		PartDefinition cube_r453 = jaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(309, 122).addBox(34.2086F, 65.0807F, 36.8152F, 2.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.9116F, -2.0138F, -10.7334F, -2.1562F, 0.3726F, -0.4082F));

		PartDefinition cube_r454 = jaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(302, 152).addBox(28.6775F, 56.3662F, 24.2457F, 2.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.9116F, -2.0138F, -10.7334F, -1.9543F, 0.2923F, -0.3964F));

		PartDefinition cube_r455 = jaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(157, 313).addBox(15.1117F, 58.5297F, 23.4384F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(18.1366F, -1.5138F, -8.6584F, -1.9164F, 0.08F, -0.3461F));

		PartDefinition cube_r456 = jaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(210, 311).addBox(15.1117F, 55.6104F, 15.564F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.012F))
				.texOffs(74, 296).addBox(15.1117F, 55.6104F, 13.064F, 2.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.1366F, -1.5138F, -8.6584F, -1.7855F, 0.08F, -0.3461F));

		PartDefinition cube_r457 = jaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(100, 305).addBox(10.3402F, 48.4924F, 13.1905F, 2.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.1366F, -1.5138F, -8.6584F, -1.7385F, -0.0022F, -0.3449F));

		PartDefinition cube_r458 = jaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(29, 187).addBox(5.3394F, 40.0301F, 11.5083F, 2.0F, 10.0F, 5.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(18.1366F, -1.5138F, -8.6584F, -1.7204F, -0.1007F, -0.3468F));

		PartDefinition cube_r459 = jaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(289, 260).addBox(1.1199F, 32.4024F, 10.1294F, 2.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.1366F, -1.5138F, -8.6584F, -1.6841F, -0.1991F, -0.3522F));

		PartDefinition cube_r460 = jaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(249, 274).addBox(-1.6469F, 23.1062F, 8.1529F, 2.0F, 10.0F, 6.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(18.1366F, -1.5138F, -8.6584F, -1.6528F, -0.2809F, -0.3596F));

		PartDefinition cube_r461 = jaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(276, 241).addBox(-3.4164F, 15.2035F, 6.5123F, 2.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.1366F, -1.5138F, -8.6584F, -1.5831F, -0.3461F, -0.3677F));

		PartDefinition cube_r462 = jaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(207, 269).addBox(-1.0F, -3.0F, -3.9F, 2.0F, 6.0F, 8.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(21.6321F, 4.987F, -16.3948F, -1.4323F, -0.2645F, -0.3579F));

		PartDefinition cube_r463 = jaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(186, 259).addBox(-2.061F, 10.9862F, 2.8597F, 2.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.1366F, -1.5138F, -8.6584F, -1.4847F, -0.2645F, -0.3579F));

		PartDefinition cube_r464 = jaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(272, 49).addBox(-3.0649F, -4.7953F, 1.7367F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(17.6674F, -3.6964F, -6.7479F, -1.0582F, 0.0718F, -0.3459F));

		PartDefinition cube_r465 = jaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(314, 48).addBox(-3.0649F, -3.5604F, 0.6335F, 4.0F, 4.0F, 3.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(17.6674F, -3.6964F, -6.7479F, -0.6219F, 0.0718F, -0.3459F));

		PartDefinition cube_r466 = jaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(312, 281).addBox(-3.0649F, -2.5054F, -0.4093F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(17.6674F, -3.6964F, -6.7479F, 0.0326F, 0.0718F, -0.3459F));

		PartDefinition cube_r467 = jaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(66, 252).addBox(-3.0649F, -2.9295F, -0.9197F, 4.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.6674F, -3.6964F, -6.7479F, -0.8837F, 0.0718F, -0.3459F));

		PartDefinition cube_r468 = jaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(241, 49).addBox(-2.0649F, -0.3705F, -1.0564F, 2.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.6674F, -3.6964F, -6.7479F, -1.0146F, 0.0718F, -0.3459F));

		PartDefinition cube_r469 = jaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(240, 100).addBox(-2.0649F, -1.1832F, -0.5756F, 2.0F, 5.0F, 13.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(17.6674F, -3.6964F, -6.7479F, -1.4073F, 0.0718F, -0.3459F));

		PartDefinition cube_r470 = jaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(119, 228).addBox(-1.9122F, -0.1885F, -2.3487F, 2.0F, 6.0F, 13.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(18.1366F, -1.5138F, -8.6584F, -1.4941F, -0.24F, -0.3556F));

		PartDefinition cube_r471 = jaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(154, 205).addBox(-1.0F, -3.35F, -6.25F, 2.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.9227F, 2.3657F, -17.3317F, -1.4847F, -0.2645F, -0.3579F));

		PartDefinition cube_r472 = jaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(227, 287).addBox(-2.061F, 10.9336F, -4.8738F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(18.1366F, -1.5138F, -8.6584F, -1.2665F, -0.2645F, -0.3579F));

		PartDefinition cube_r473 = jaw.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(210, 284).addBox(-3.4164F, 15.9877F, -3.8809F, 2.0F, 9.0F, 6.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(18.1366F, -1.5138F, -8.6584F, -1.3213F, -0.3461F, -0.3677F));

		PartDefinition cube_r474 = jaw.addOrReplaceChild("cube_r474", CubeListBuilder.create().texOffs(61, 278).addBox(-1.6469F, 24.9606F, -0.0584F, 2.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.1366F, -1.5138F, -8.6584F, -1.4783F, -0.2809F, -0.3596F));

		PartDefinition cube_r475 = jaw.addOrReplaceChild("cube_r475", CubeListBuilder.create().texOffs(121, 288).addBox(1.1199F, 33.2264F, 3.8931F, 2.0F, 9.0F, 5.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(18.1366F, -1.5138F, -8.6584F, -1.5969F, -0.1991F, -0.3522F));

		PartDefinition cube_r476 = jaw.addOrReplaceChild("cube_r476", CubeListBuilder.create().texOffs(244, 291).addBox(5.3394F, 41.4879F, 5.351F, 2.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.1366F, -1.5138F, -8.6584F, -1.6331F, -0.1007F, -0.3468F));

		PartDefinition cube_r477 = jaw.addOrReplaceChild("cube_r477", CubeListBuilder.create().texOffs(229, 303).addBox(10.3402F, 48.6503F, 9.615F, 2.0F, 9.0F, 4.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(18.1366F, -1.5138F, -8.6584F, -1.721F, -0.0022F, -0.3449F));

		PartDefinition cube_r478 = jaw.addOrReplaceChild("cube_r478", CubeListBuilder.create().texOffs(274, 305).addBox(28.6775F, 56.958F, 19.8875F, 2.0F, 9.0F, 4.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(17.9116F, -2.0138F, -10.7334F, -1.9107F, 0.2923F, -0.3964F));

		PartDefinition cube_r479 = jaw.addOrReplaceChild("cube_r479", CubeListBuilder.create().texOffs(310, 239).addBox(34.2086F, 60.9363F, 25.6945F, 2.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.9116F, -2.0138F, -10.7334F, -2.0166F, 0.3726F, -0.4082F));

		PartDefinition cube_r480 = jaw.addOrReplaceChild("cube_r480", CubeListBuilder.create().texOffs(183, 313).addBox(34.2086F, 68.4264F, 28.7165F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(17.9116F, -2.0138F, -10.7334F, -2.0602F, 0.3726F, -0.4082F));

		PartDefinition cube_r481 = jaw.addOrReplaceChild("cube_r481", CubeListBuilder.create().texOffs(335, 37).addBox(-1.0F, 1.0392F, -2.3189F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(6.7698F, -17.3131F, -111.2246F, -1.9397F, 0.5435F, -0.5097F));

		PartDefinition cube_r482 = jaw.addOrReplaceChild("cube_r482", CubeListBuilder.create().texOffs(287, 305).addBox(-1.0F, -6.3241F, -1.8751F, 2.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.7698F, -16.3131F, -109.2246F, -2.2539F, 0.5435F, -0.5097F));

		return LayerDefinition.create(meshdefinition, 352, 352);
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