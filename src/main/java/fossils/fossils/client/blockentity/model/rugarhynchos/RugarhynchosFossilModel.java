package fossils.fossils.client.blockentity.model.rugarhynchos;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class RugarhynchosFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart Rightthigh;
	private final ModelPart Rightshin;
	private final ModelPart leftFoot3;
	private final ModelPart leftFoot4;
	private final ModelPart Leftthigh;
	private final ModelPart Leftshin;
	private final ModelPart rightFoot3;
	private final ModelPart rightFoot4;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart tail10;
	private final ModelPart tail11;
	private final ModelPart tail12;
	private final ModelPart tail13;
	private final ModelPart tail14;
	private final ModelPart body;
	private final ModelPart body3;
	private final ModelPart body4;
	private final ModelPart body5;
	private final ModelPart body2;
	private final ModelPart chest;
	private final ModelPart Rightupperarm;
	private final ModelPart Rightlowerarm;
	private final ModelPart leftFoot;
	private final ModelPart leftFoot2;
	private final ModelPart Leftupperarm;
	private final ModelPart Leftlowerarm;
	private final ModelPart rightFoot;
	private final ModelPart rightFoot2;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart lower_jaw;

	public RugarhynchosFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.Rightthigh = this.hips.getChild("Rightthigh");
		this.Rightshin = this.Rightthigh.getChild("Rightshin");
		this.leftFoot3 = this.Rightshin.getChild("leftFoot3");
		this.leftFoot4 = this.leftFoot3.getChild("leftFoot4");
		this.Leftthigh = this.hips.getChild("Leftthigh");
		this.Leftshin = this.Leftthigh.getChild("Leftshin");
		this.rightFoot3 = this.Leftshin.getChild("rightFoot3");
		this.rightFoot4 = this.rightFoot3.getChild("rightFoot4");
		this.bone2 = this.hips.getChild("bone2");
		this.bone3 = this.hips.getChild("bone3");
		this.tail = this.hips.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.tail10 = this.tail9.getChild("tail10");
		this.tail11 = this.tail10.getChild("tail11");
		this.tail12 = this.tail11.getChild("tail12");
		this.tail13 = this.tail12.getChild("tail13");
		this.tail14 = this.tail13.getChild("tail14");
		this.body = this.hips.getChild("body");
		this.body3 = this.body.getChild("body3");
		this.body4 = this.body3.getChild("body4");
		this.body5 = this.body4.getChild("body5");
		this.body2 = this.body5.getChild("body2");
		this.chest = this.body2.getChild("chest");
		this.Rightupperarm = this.chest.getChild("Rightupperarm");
		this.Rightlowerarm = this.Rightupperarm.getChild("Rightlowerarm");
		this.leftFoot = this.Rightlowerarm.getChild("leftFoot");
		this.leftFoot2 = this.leftFoot.getChild("leftFoot2");
		this.Leftupperarm = this.chest.getChild("Leftupperarm");
		this.Leftlowerarm = this.Leftupperarm.getChild("Leftlowerarm");
		this.rightFoot = this.Leftlowerarm.getChild("rightFoot");
		this.rightFoot2 = this.rightFoot.getChild("rightFoot2");
		this.bone = this.chest.getChild("bone");
		this.bone4 = this.chest.getChild("bone4");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.head = this.neck6.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.lower_jaw = this.head.getChild("lower_jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -9.2169F, 16.5208F, 0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(30, 71).mirror().addBox(0.0F, -1.075F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(117, 138).mirror().addBox(0.0F, -1.075F, 5.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-6.168F, -2.2837F, -0.8479F, 0.0152F, 0.2261F, 1.0321F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(80, 16).mirror().addBox(0.0F, 0.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-4.4392F, -2.4939F, 2.224F, -0.1332F, 0.2261F, 1.0321F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(50, 19).mirror().addBox(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.1648F, 2.4038F, -0.0465F, 0.2577F, 1.3902F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(34, 56).mirror().addBox(-3.6F, -0.5904F, 2.891F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(34, 56).addBox(-0.4F, -0.5904F, 2.891F, 4.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(27, 134).addBox(0.0F, -2.8654F, 2.891F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(73, 74).addBox(-0.5F, -3.2904F, 1.791F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F))
				.texOffs(0, 69).addBox(-0.5F, -1.0904F, 1.891F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.2266F, -3.0755F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(135, 0).addBox(0.0F, -1.8F, -0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6257F, 3.3799F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(30, 71).addBox(-1.0F, -1.075F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.006F))
				.texOffs(117, 138).addBox(-1.0F, -1.075F, 5.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(6.168F, -2.2837F, -0.8479F, 0.0152F, -0.2261F, -1.0321F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(80, 16).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(4.4392F, -2.4939F, 2.224F, -0.1332F, -0.2261F, -1.0321F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(50, 19).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, -3.1648F, 2.4038F, -0.0465F, -0.2577F, -1.3902F));

		PartDefinition Rightthigh = hips.addOrReplaceChild("Rightthigh", CubeListBuilder.create().texOffs(122, 55).addBox(-0.3136F, -1.0328F, -0.6681F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.5274F, 1.8359F, -0.8089F, -1.169F, -0.7626F, 0.2973F));

		PartDefinition Rightthigh_r1 = Rightthigh.addOrReplaceChild("Rightthigh_r1", CubeListBuilder.create().texOffs(77, 131).addBox(-0.4993F, -0.8357F, 0.3406F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(135, 99).addBox(-0.4993F, 0.0643F, -0.0344F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1982F, 4.0508F, -6.2236F, -0.6102F, -0.0052F, 0.006F));

		PartDefinition Rightthigh_r2 = Rightthigh.addOrReplaceChild("Rightthigh_r2", CubeListBuilder.create().texOffs(22, 117).addBox(-0.4993F, -2.1357F, -0.6344F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1864F, 2.1672F, -1.7681F, -1.0465F, -0.0052F, 0.006F));

		PartDefinition Rightthigh_r3 = Rightthigh.addOrReplaceChild("Rightthigh_r3", CubeListBuilder.create().texOffs(136, 16).addBox(-0.5087F, 0.1551F, -1.4993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1864F, 0.8672F, 0.6319F, -0.6538F, -0.0069F, 0.0039F));

		PartDefinition Rightthigh_r4 = Rightthigh.addOrReplaceChild("Rightthigh_r4", CubeListBuilder.create().texOffs(122, 60).addBox(-0.5F, 0.0847F, -0.9893F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1864F, 2.9248F, -0.8735F, -1.1781F, 0.0F, 0.0F));

		PartDefinition Rightthigh_r5 = Rightthigh.addOrReplaceChild("Rightthigh_r5", CubeListBuilder.create().texOffs(135, 44).addBox(-0.5F, -0.4153F, -0.4893F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1864F, 0.8672F, 0.6319F, -0.829F, 0.0F, 0.0F));

		PartDefinition Rightshin = Rightthigh.addOrReplaceChild("Rightshin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2176F, 6.3549F, -7.9705F, 0.8753F, -0.2116F, -0.4759F));

		PartDefinition Rightshin_r1 = Rightshin.addOrReplaceChild("Rightshin_r1", CubeListBuilder.create().texOffs(111, 133).addBox(-0.5901F, 0.8698F, 0.4046F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.1826F, 4.0105F, 0.6973F, -0.2618F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r2 = Rightshin.addOrReplaceChild("Rightshin_r2", CubeListBuilder.create().texOffs(101, 132).addBox(-0.5901F, 0.6748F, 0.6356F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1826F, 4.0105F, 0.6973F, -0.48F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r3 = Rightshin.addOrReplaceChild("Rightshin_r3", CubeListBuilder.create().texOffs(136, 24).addBox(-0.5901F, -1.6148F, 0.3721F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0424F, 5.0105F, 0.6473F, -0.2182F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r4 = Rightshin.addOrReplaceChild("Rightshin_r4", CubeListBuilder.create().texOffs(106, 133).addBox(-0.5901F, -3.934F, 0.6637F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.0424F, 5.0105F, 0.6473F, 0.0F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r5 = Rightshin.addOrReplaceChild("Rightshin_r5", CubeListBuilder.create().texOffs(134, 103).addBox(-0.4039F, -3.2277F, -1.8008F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4576F, 4.1105F, 0.6473F, -0.5672F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r6 = Rightshin.addOrReplaceChild("Rightshin_r6", CubeListBuilder.create().texOffs(132, 69).addBox(-0.4039F, -3.6571F, -1.6073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.4576F, 4.1105F, 0.6473F, -0.2182F, 1.3526F, 0.0F));

		PartDefinition Rightshin_r7 = Rightshin.addOrReplaceChild("Rightshin_r7", CubeListBuilder.create().texOffs(16, 120).addBox(-0.4039F, -0.9602F, -1.507F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.4576F, 4.1105F, 0.6473F, -0.0873F, 1.3526F, 0.0F));

		PartDefinition leftFoot3 = Rightshin.addOrReplaceChild("leftFoot3", CubeListBuilder.create().texOffs(47, 84).addBox(0.0F, -0.4F, -2.1F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2331F, 8.1401F, 1.3419F, -3.1225F, 0.4321F, -2.9957F));

		PartDefinition leftFoot4 = leftFoot3.addOrReplaceChild("leftFoot4", CubeListBuilder.create().texOffs(25, 18).addBox(0.0F, -1.0F, -3.0F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offset(2.0F, 0.6F, 0.9F));

		PartDefinition Leftthigh = hips.addOrReplaceChild("Leftthigh", CubeListBuilder.create().texOffs(75, 122).addBox(-0.6864F, -1.0328F, -0.6681F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-3.5274F, 1.8359F, -0.8089F, -1.1977F, 0.756F, -0.317F));

		PartDefinition Leftthigh_r1 = Leftthigh.addOrReplaceChild("Leftthigh_r1", CubeListBuilder.create().texOffs(129, 131).addBox(-0.5007F, -0.8357F, 0.3406F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(0, 136).addBox(-0.5007F, 0.0643F, -0.0344F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1982F, 4.0508F, -6.2236F, -0.6102F, 0.0052F, -0.006F));

		PartDefinition Leftthigh_r2 = Leftthigh.addOrReplaceChild("Leftthigh_r2", CubeListBuilder.create().texOffs(27, 117).addBox(-0.5007F, -2.1357F, -0.6344F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1864F, 2.1672F, -1.7681F, -1.0465F, 0.0052F, -0.006F));

		PartDefinition Leftthigh_r3 = Leftthigh.addOrReplaceChild("Leftthigh_r3", CubeListBuilder.create().texOffs(136, 20).addBox(-0.4913F, 0.1551F, -1.4993F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1864F, 0.8672F, 0.6319F, -0.6538F, 0.0069F, -0.0039F));

		PartDefinition Leftthigh_r4 = Leftthigh.addOrReplaceChild("Leftthigh_r4", CubeListBuilder.create().texOffs(112, 122).addBox(-0.5F, 0.0847F, -0.9893F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1864F, 2.9248F, -0.8735F, -1.1781F, 0.0F, 0.0F));

		PartDefinition Leftthigh_r5 = Leftthigh.addOrReplaceChild("Leftthigh_r5", CubeListBuilder.create().texOffs(66, 135).addBox(-0.5F, -0.4153F, -0.4893F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1864F, 0.8672F, 0.6319F, -0.829F, 0.0F, 0.0F));

		PartDefinition Leftshin = Leftthigh.addOrReplaceChild("Leftshin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2176F, 6.3549F, -7.9705F, 0.876F, 0.2127F, 0.4771F));

		PartDefinition Leftshin_r1 = Leftshin.addOrReplaceChild("Leftshin_r1", CubeListBuilder.create().texOffs(22, 134).addBox(-0.4099F, 0.8698F, 0.4046F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.1826F, 4.0105F, 0.6973F, -0.2618F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r2 = Leftshin.addOrReplaceChild("Leftshin_r2", CubeListBuilder.create().texOffs(61, 133).addBox(-0.4099F, 0.6748F, 0.6356F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.1826F, 4.0105F, 0.6973F, -0.48F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r3 = Leftshin.addOrReplaceChild("Leftshin_r3", CubeListBuilder.create().texOffs(136, 28).addBox(-0.4099F, -1.6148F, 0.3721F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0424F, 5.0105F, 0.6473F, -0.2182F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r4 = Leftshin.addOrReplaceChild("Leftshin_r4", CubeListBuilder.create().texOffs(17, 134).addBox(-0.4099F, -3.934F, 0.6637F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.0424F, 5.0105F, 0.6473F, 0.0F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r5 = Leftshin.addOrReplaceChild("Leftshin_r5", CubeListBuilder.create().texOffs(134, 131).addBox(-0.5961F, -3.2277F, -1.8008F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4576F, 4.1105F, 0.6473F, -0.5672F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r6 = Leftshin.addOrReplaceChild("Leftshin_r6", CubeListBuilder.create().texOffs(82, 132).addBox(-0.5961F, -3.6571F, -1.6073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4576F, 4.1105F, 0.6473F, -0.2182F, -1.3526F, 0.0F));

		PartDefinition Leftshin_r7 = Leftshin.addOrReplaceChild("Leftshin_r7", CubeListBuilder.create().texOffs(107, 121).addBox(-0.5961F, -0.9602F, -1.507F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.4576F, 4.1105F, 0.6473F, -0.0873F, -1.3526F, 0.0F));

		PartDefinition rightFoot3 = Leftshin.addOrReplaceChild("rightFoot3", CubeListBuilder.create().texOffs(15, 87).addBox(-2.0F, -0.4F, -2.1F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2331F, 8.1401F, 1.3419F, -3.1225F, -0.4321F, 2.9957F));

		PartDefinition rightFoot4 = rightFoot3.addOrReplaceChild("rightFoot4", CubeListBuilder.create().texOffs(25, 25).addBox(-7.0F, -1.0F, -3.0F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.005F)), PartPose.offset(-2.0F, 0.6F, 0.9F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9739F, -1.0263F, 1.1296F, -0.0873F, 0.0F, 0.1309F));

		PartDefinition Hips_r1 = bone2.addOrReplaceChild("Hips_r1", CubeListBuilder.create().texOffs(41, 122).addBox(-0.5F, -0.525F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.151F, 1.724F, 0.1059F, -1.9722F, 0.0F, 0.0F));

		PartDefinition Hips_r2 = bone2.addOrReplaceChild("Hips_r2", CubeListBuilder.create().texOffs(21, 126).addBox(-0.5F, -1.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.151F, -0.1091F, -1.2681F, -3.1067F, 0.0F, 0.0F));

		PartDefinition Hips_r3 = bone2.addOrReplaceChild("Hips_r3", CubeListBuilder.create().texOffs(97, 114).addBox(-0.5F, -0.6091F, -1.0238F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.151F, 0.1909F, 0.2937F, 2.8137F, 0.082F, 1.1008F));

		PartDefinition Hips_r4 = bone2.addOrReplaceChild("Hips_r4", CubeListBuilder.create().texOffs(9, 120).addBox(-0.5F, -1.7183F, -0.0814F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.151F, 0.1909F, 0.2937F, 1.4175F, 0.082F, 1.1008F));

		PartDefinition Hips_r5 = bone2.addOrReplaceChild("Hips_r5", CubeListBuilder.create().texOffs(93, 120).addBox(-0.5F, -1.0183F, -0.5814F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.151F, 0.1909F, 0.2937F, 1.6356F, 0.082F, 1.1008F));

		PartDefinition Hips_r6 = bone2.addOrReplaceChild("Hips_r6", CubeListBuilder.create().texOffs(76, 136).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.151F, -0.282F, 1.7365F, 2.138F, 0.0F, 0.0F));

		PartDefinition Hips_r7 = bone2.addOrReplaceChild("Hips_r7", CubeListBuilder.create().texOffs(119, 10).addBox(-0.4251F, -1.532F, 0.5186F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8661F, 3.2823F, -2.1355F, -0.7083F, 0.0806F, 0.8304F));

		PartDefinition Hips_r8 = bone2.addOrReplaceChild("Hips_r8", CubeListBuilder.create().texOffs(74, 104).addBox(-0.4251F, 1.1433F, -2.4918F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.8661F, 3.2823F, -2.1355F, 2.2151F, 0.0806F, 0.8304F));

		PartDefinition Hips_r9 = bone2.addOrReplaceChild("Hips_r9", CubeListBuilder.create().texOffs(65, 24).addBox(-1.2F, -1.1885F, -2.2314F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.851F, 1.6025F, -1.2586F, 1.3861F, 0.0806F, 0.394F));

		PartDefinition Hips_r10 = bone2.addOrReplaceChild("Hips_r10", CubeListBuilder.create().texOffs(136, 118).addBox(-0.3775F, -1.0769F, -1.8027F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.3661F, 3.2823F, -2.1355F, -0.9529F, 0.1269F, 0.8186F));

		PartDefinition Hips_r11 = bone2.addOrReplaceChild("Hips_r11", CubeListBuilder.create().texOffs(122, 125).addBox(-0.3775F, 0.0598F, -0.6207F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3661F, 3.2823F, -2.1355F, -2.6109F, 0.1269F, 0.8186F));

		PartDefinition Hips_r12 = bone2.addOrReplaceChild("Hips_r12", CubeListBuilder.create().texOffs(129, 57).addBox(-0.1913F, 0.0767F, 1.1691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.3661F, 3.2823F, -2.1355F, -2.5494F, 0.2571F, 0.8538F));

		PartDefinition Hips_r13 = bone2.addOrReplaceChild("Hips_r13", CubeListBuilder.create().texOffs(136, 139).addBox(-0.1913F, 0.8858F, 1.0784F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-1.3661F, 3.2823F, -2.1355F, -2.1131F, 0.2571F, 0.8538F));

		PartDefinition Hips_r14 = bone2.addOrReplaceChild("Hips_r14", CubeListBuilder.create().texOffs(5, 140).addBox(-0.1913F, -1.9771F, 1.2251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(-1.3661F, 3.2823F, -2.1355F, 2.7738F, 0.2571F, 0.8538F));

		PartDefinition Hips_r15 = bone2.addOrReplaceChild("Hips_r15", CubeListBuilder.create().texOffs(125, 92).addBox(-0.1913F, 0.8027F, 0.8419F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-1.3661F, 3.2823F, -2.1355F, -2.5058F, 0.2571F, 0.8538F));

		PartDefinition Hips_r16 = bone2.addOrReplaceChild("Hips_r16", CubeListBuilder.create().texOffs(35, 140).addBox(-1.2F, -0.2182F, -0.9482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.851F, 1.6025F, -1.4586F, 0.2953F, 0.0806F, 0.394F));

		PartDefinition Hips_r17 = bone2.addOrReplaceChild("Hips_r17", CubeListBuilder.create().texOffs(64, 125).addBox(-0.5F, -1.225F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.151F, 1.5926F, -0.5565F, 0.6545F, 0.0F, 0.0F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9739F, 4.9737F, 1.1296F, -0.0873F, 0.0F, -0.1309F));

		PartDefinition Hips_r18 = bone3.addOrReplaceChild("Hips_r18", CubeListBuilder.create().texOffs(41, 122).mirror().addBox(-0.5F, -0.525F, -2.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.151F, -4.276F, 0.1059F, -1.9722F, 0.0F, 0.0F));

		PartDefinition Hips_r19 = bone3.addOrReplaceChild("Hips_r19", CubeListBuilder.create().texOffs(21, 126).mirror().addBox(-0.5F, -1.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.151F, -6.1091F, -1.2681F, -3.1067F, 0.0F, 0.0F));

		PartDefinition Hips_r20 = bone3.addOrReplaceChild("Hips_r20", CubeListBuilder.create().texOffs(97, 114).mirror().addBox(-0.5F, -0.6091F, -1.0238F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.151F, -5.8091F, 0.2937F, 2.8137F, -0.082F, -1.1008F));

		PartDefinition Hips_r21 = bone3.addOrReplaceChild("Hips_r21", CubeListBuilder.create().texOffs(9, 120).mirror().addBox(-0.5F, -1.7183F, -0.0814F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.151F, -5.8091F, 0.2937F, 1.4175F, -0.082F, -1.1008F));

		PartDefinition Hips_r22 = bone3.addOrReplaceChild("Hips_r22", CubeListBuilder.create().texOffs(93, 120).mirror().addBox(-0.5F, -1.0183F, -0.5814F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.151F, -5.8091F, 0.2937F, 1.6356F, -0.082F, -1.1008F));

		PartDefinition Hips_r23 = bone3.addOrReplaceChild("Hips_r23", CubeListBuilder.create().texOffs(76, 136).mirror().addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.151F, -6.282F, 1.7365F, 2.138F, 0.0F, 0.0F));

		PartDefinition Hips_r24 = bone3.addOrReplaceChild("Hips_r24", CubeListBuilder.create().texOffs(119, 10).mirror().addBox(-0.5749F, -1.532F, 0.5186F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.8661F, -2.7177F, -2.1355F, -0.7083F, -0.0806F, -0.8304F));

		PartDefinition Hips_r25 = bone3.addOrReplaceChild("Hips_r25", CubeListBuilder.create().texOffs(74, 104).mirror().addBox(-0.5749F, 1.1433F, -2.4918F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.8661F, -2.7177F, -2.1355F, 2.2151F, -0.0806F, -0.8304F));

		PartDefinition Hips_r26 = bone3.addOrReplaceChild("Hips_r26", CubeListBuilder.create().texOffs(65, 24).mirror().addBox(0.2F, -1.1885F, -2.2314F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.851F, -4.3975F, -1.2586F, 1.3861F, -0.0806F, -0.394F));

		PartDefinition Hips_r27 = bone3.addOrReplaceChild("Hips_r27", CubeListBuilder.create().texOffs(136, 118).mirror().addBox(-0.6225F, -1.0769F, -1.8027F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.3661F, -2.7177F, -2.1355F, -0.9529F, -0.1269F, -0.8186F));

		PartDefinition Hips_r28 = bone3.addOrReplaceChild("Hips_r28", CubeListBuilder.create().texOffs(122, 125).mirror().addBox(-0.6225F, 0.0598F, -0.6207F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3661F, -2.7177F, -2.1355F, -2.6109F, -0.1269F, -0.8186F));

		PartDefinition Hips_r29 = bone3.addOrReplaceChild("Hips_r29", CubeListBuilder.create().texOffs(129, 57).mirror().addBox(-0.8087F, 0.0767F, 1.1691F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.3661F, -2.7177F, -2.1355F, -2.5494F, -0.2571F, -0.8538F));

		PartDefinition Hips_r30 = bone3.addOrReplaceChild("Hips_r30", CubeListBuilder.create().texOffs(136, 139).mirror().addBox(-0.8087F, 0.8858F, 1.0784F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(1.3661F, -2.7177F, -2.1355F, -2.1131F, -0.2571F, -0.8538F));

		PartDefinition Hips_r31 = bone3.addOrReplaceChild("Hips_r31", CubeListBuilder.create().texOffs(5, 140).mirror().addBox(-0.8087F, -1.9771F, 1.2251F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(1.3661F, -2.7177F, -2.1355F, 2.7738F, -0.2571F, -0.8538F));

		PartDefinition Hips_r32 = bone3.addOrReplaceChild("Hips_r32", CubeListBuilder.create().texOffs(125, 92).mirror().addBox(-0.8087F, 0.8027F, 0.8419F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(1.3661F, -2.7177F, -2.1355F, -2.5058F, -0.2571F, -0.8538F));

		PartDefinition Hips_r33 = bone3.addOrReplaceChild("Hips_r33", CubeListBuilder.create().texOffs(35, 140).mirror().addBox(0.2F, -0.2182F, -0.9482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.851F, -4.3975F, -1.4586F, 0.2953F, -0.0806F, -0.394F));

		PartDefinition Hips_r34 = bone3.addOrReplaceChild("Hips_r34", CubeListBuilder.create().texOffs(64, 125).mirror().addBox(-0.5F, -1.225F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.151F, -4.4074F, -0.5565F, 0.6545F, 0.0F, 0.0F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.6542F, 4.6243F, 0.1188F, -0.0424F, 0.0102F));

		PartDefinition cube_r9 = tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(80, 0).mirror().addBox(0.0F, -1.0F, -0.075F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3229F, -1.835F, 0.6902F, -0.0556F, 0.4097F, 1.0507F));

		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(50, 8).mirror().addBox(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.6504F, 3.8181F, -0.0808F, 0.4293F, 1.3786F));

		PartDefinition cube_r11 = tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(75, 64).mirror().addBox(-2.5F, 0.0F, 1.0F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3867F, 0.1394F, -0.4366F, 0.0316F, -0.0148F));

		PartDefinition cube_r12 = tail.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(75, 64).addBox(-0.5F, 0.0F, 1.0F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3867F, 0.1394F, -0.4366F, -0.0316F, 0.0148F));

		PartDefinition cube_r13 = tail.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(141, 35).addBox(0.0F, -2.5047F, 0.1213F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.6579F, 4.5345F, -0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r14 = tail.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(122, 138).addBox(0.0F, -2.2571F, -0.9436F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.0615F, 3.8605F, -0.5498F, 0.0F, 0.0F));

		PartDefinition cube_r15 = tail.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(55, 140).addBox(0.0F, -0.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9232F, 4.0048F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r16 = tail.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(141, 31).addBox(0.0F, -1.9313F, -1.1862F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.0986F, 2.4594F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r17 = tail.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(80, 0).addBox(-1.0F, -1.0F, -0.075F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.3229F, -1.835F, 0.6902F, -0.0556F, -0.4097F, -1.0507F));

		PartDefinition cube_r18 = tail.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(50, 8).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.6504F, 3.8181F, -0.0808F, -0.4293F, -1.3786F));

		PartDefinition cube_r19 = tail.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(17, 79).addBox(-0.5F, -0.8F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1932F, 0.7611F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r20 = tail.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(80, 8).addBox(-0.5F, -0.9432F, -0.4009F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1844F, 0.3155F, -0.4363F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.1642F, 5.6001F, -0.1649F, -0.0818F, 0.0304F));

		PartDefinition cube_r21 = tail2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(34, 52).addBox(0.0F, -1.9F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.1976F, 4.8945F, -0.4451F, 0.0F, 0.0F));

		PartDefinition cube_r22 = tail2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(71, 140).addBox(0.0F, -1.903F, 0.1625F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.3865F, 2.8405F, -0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r23 = tail2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(68, 140).addBox(0.0F, 0.4F, 0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.7315F, 3.8451F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r24 = tail2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(42, 137).addBox(0.0F, -0.5F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1173F, 1.8772F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r25 = tail2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(65, 140).addBox(0.0F, 0.1F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.532F, -0.098F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r26 = tail2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(141, 27).addBox(0.0F, -2.0169F, -0.2974F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.0054F, 1.2492F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r27 = tail2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(45, 66).mirror().addBox(0.0F, 0.0F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.4289F, -2.0806F, 0.2989F, 0.0436F, 0.3405F, 1.3391F));

		PartDefinition cube_r28 = tail2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(53, 56).mirror().addBox(0.0F, 0.0F, -3.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.6647F, 3.3401F, -0.0786F, 0.3405F, 1.3391F));

		PartDefinition cube_r29 = tail2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(-2.6F, 0.2F, -3.5F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3493F, 0.0328F, -0.0119F));

		PartDefinition cube_r30 = tail2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(0, 77).addBox(-0.4F, 0.2F, -3.5F, 3.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3493F, -0.0328F, 0.0119F));

		PartDefinition cube_r31 = tail2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(45, 66).addBox(-1.0F, 0.0F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(3.4289F, -2.0806F, 0.2989F, 0.0436F, -0.3405F, -1.3391F));

		PartDefinition cube_r32 = tail2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(53, 56).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, -1.6647F, 3.3401F, -0.0786F, -0.3405F, -1.3391F));

		PartDefinition cube_r33 = tail2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(15, 67).addBox(-0.5F, -2.5F, -4.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F))
				.texOffs(60, 66).addBox(-0.5F, -0.3F, -4.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.3344F, 4.2704F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9117F, 5.6011F, -0.1322F, -0.0857F, 0.0166F));

		PartDefinition cube_r34 = tail3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(77, 140).addBox(-0.5F, -1.8257F, -0.0177F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.043F, 4.8453F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r35 = tail3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(5, 123).addBox(0.0F, -0.8F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4721F, 5.1299F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r36 = tail3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(82, 122).addBox(0.0F, -1.3F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.4647F, 3.12F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r37 = tail3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(52, 98).addBox(0.0F, -0.9F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.9642F, 0.9662F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r38 = tail3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(74, 140).addBox(-0.5F, -1.8757F, 0.0323F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3589F, 2.9659F, -0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r39 = tail3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(30, 58).addBox(-0.5F, -2.0257F, -0.1177F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0354F, 1.0783F, -0.3403F, 0.0F, 0.0F));

		PartDefinition cube_r40 = tail3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(59, 39).mirror().addBox(0.0F, -1.0F, -3.1F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4526F, -1.4143F, 2.9483F, 0.0293F, 0.2555F, 1.3452F));

		PartDefinition cube_r41 = tail3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(15, 58).mirror().addBox(0.0F, 0.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.8325F, 3.0603F, -0.0579F, 0.2555F, 1.3452F));

		PartDefinition cube_r42 = tail3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(87, 24).mirror().addBox(-1.9F, 0.0F, 1.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1285F, -0.0533F, -0.2621F, 0.0506F, -0.0136F));

		PartDefinition cube_r43 = tail3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(87, 24).addBox(-0.1F, 0.0F, 1.0F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1285F, -0.0533F, -0.2621F, -0.0506F, 0.0136F));

		PartDefinition cube_r44 = tail3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(59, 39).addBox(-1.0F, -1.0F, -3.1F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.4526F, -1.4143F, 2.9483F, 0.0293F, -0.2555F, -1.3452F));

		PartDefinition cube_r45 = tail3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(15, 58).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.8325F, 3.0603F, -0.0579F, -0.2555F, -1.3452F));

		PartDefinition cube_r46 = tail3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(72, 24).addBox(-1.0F, -3.15F, -3.25F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(65, 16).addBox(-1.0F, -0.95F, -2.75F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.2749F, 2.4865F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.8214F, 5.7215F, -0.2701F, -0.0871F, 0.0052F));

		PartDefinition cube_r47 = tail4.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(83, 140).addBox(0.0F, -1.293F, -0.0134F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.3821F, 2.9408F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r48 = tail4.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(80, 140).addBox(0.0F, -1.468F, -0.0134F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -0.5199F, 0.9168F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r49 = tail4.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(78, 127).addBox(0.0F, -0.7F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0662F, 3.6204F, 0.4887F, 0.0F, 0.0F));

		PartDefinition cube_r50 = tail4.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(28, 126).addBox(0.0F, -0.5F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7332F, 1.4092F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r51 = tail4.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(74, 40).mirror().addBox(0.0F, -0.6F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-2.4318F, -2.0113F, 2.1574F, 0.1083F, 0.0843F, 1.308F));

		PartDefinition cube_r52 = tail4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(0.0F, 0.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.527F, 2.2025F, -0.0226F, 0.0843F, 1.308F));

		PartDefinition cube_r53 = tail4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(74, 40).addBox(-1.0F, -0.6F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(2.4318F, -2.0113F, 2.1574F, 0.1083F, -0.0843F, -1.308F));

		PartDefinition cube_r54 = tail4.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 60).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, -2.527F, 2.2025F, -0.0226F, -0.0843F, -1.308F));

		PartDefinition cube_r55 = tail4.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(74, 32).addBox(-0.5F, -0.35F, -7.15F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F))
				.texOffs(43, 91).addBox(-0.5F, 1.75F, -6.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -1.8166F, 6.3062F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(13, 94).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(98, 56).addBox(-0.5F, -2.6325F, -0.0812F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3431F, 4.8318F, -0.0957F, -0.1033F, 0.0607F));

		PartDefinition cube_r56 = tail5.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(61, 141).addBox(0.0F, -0.925F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5635F, 3.9159F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r57 = tail5.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(22, 108).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5325F, 2.0188F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r58 = tail5.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(140, 85).addBox(0.0F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3325F, 0.0188F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r59 = tail5.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(13, 101).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.4659F, -2.3737F, -0.0812F, 0.1222F, 0.0F, 1.309F));

		PartDefinition cube_r60 = tail5.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(98, 63).mirror().addBox(0.0F, 0.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.6325F, 2.4188F, 0.0F, 0.0F, 1.309F));

		PartDefinition cube_r61 = tail5.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(13, 101).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.4659F, -2.3737F, -0.0812F, 0.1222F, 0.0F, -1.309F));

		PartDefinition cube_r62 = tail5.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(98, 63).addBox(-1.0F, 0.0F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6325F, 2.4188F, 0.0F, 0.0F, -1.309F));

		PartDefinition cube_r63 = tail5.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(26, 94).addBox(0.0F, 0.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3348F, 3.266F, 0.6196F, 0.0F, 0.0F));

		PartDefinition cube_r64 = tail5.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(140, 46).addBox(0.0F, -0.6F, -0.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4269F, 1.2656F, 0.6196F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(88, 94).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0146F, 4.9356F, 0.0265F, -0.1248F, -0.038F));

		PartDefinition cube_r65 = tail6.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(15, 49).addBox(0.0F, 0.2F, -0.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0291F, 4.7972F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r66 = tail6.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(37, 134).addBox(0.0F, 1.3F, 1.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(126, 133).addBox(0.0F, 0.2F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2778F, 0.3356F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r67 = tail6.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(128, 89).addBox(0.0F, -0.775F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5146F, 2.992F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r68 = tail6.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(121, 92).addBox(0.0F, -0.925F, -0.075F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4724F, 1.0611F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r69 = tail6.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(101, 77).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.6325F, 0.0188F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r70 = tail6.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(82, 101).mirror().addBox(0.0F, 0.4F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(101, 70).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.6325F, 0.0188F, 0.0601F, 0.1011F, 1.3076F));

		PartDefinition cube_r71 = tail6.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(82, 101).addBox(-1.0F, 0.4F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F))
				.texOffs(101, 70).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6325F, 0.0188F, 0.0601F, -0.1011F, -1.3076F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(95, 0).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(58, 141).addBox(0.0F, -1.1825F, 2.0188F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(101, 141).addBox(0.0F, -1.1825F, 4.0188F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0111F, 5.0006F, 0.0325F, -0.0733F, -0.0568F));

		PartDefinition cube_r72 = tail7.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(141, 52).addBox(0.0F, 3.3F, 3.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(46, 8).addBox(0.0F, 2.0F, 1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.018F, -0.2034F, 0.6632F, 0.0F, 0.0F));

		PartDefinition cube_r73 = tail7.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(97, 134).addBox(0.0F, -0.75F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5325F, 0.0188F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r74 = tail7.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(95, 101).mirror().addBox(0.0F, -0.05F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.0877F, 0.1216F, 0.0537F, 0.0672F, 1.2572F));

		PartDefinition cube_r75 = tail7.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(95, 101).addBox(-1.0F, -0.05F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0877F, 0.1216F, 0.0537F, -0.0672F, -1.2572F));

		PartDefinition cube_r76 = tail7.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(101, 94).addBox(-0.5F, -0.05F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0325F, 0.2188F, -0.0524F, 0.0F, 0.0F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(30, 90).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(62, 90).addBox(-0.5F, -1.7325F, 0.0188F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(104, 141).addBox(0.0F, -1.1075F, 1.0188F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(107, 141).addBox(0.0F, -1.0575F, 3.0188F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0194F, 4.9264F, 0.065F, -0.2124F, -0.0492F));

		PartDefinition cube_r77 = tail8.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(75, 90).mirror().addBox(0.0F, -0.5F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.2325F, 5.0188F, 0.024F, 0.085F, -0.2277F));

		PartDefinition cube_r78 = tail8.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(75, 90).addBox(-1.0F, -0.5F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2325F, 5.0188F, 0.024F, -0.085F, 0.2277F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(85, 108).addBox(-0.5F, -0.5325F, 0.0188F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(74, 108).addBox(-0.5F, -1.8325F, 0.0188F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(141, 108).addBox(0.0F, -1.0479F, 0.0209F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(110, 141).addBox(0.0F, -1.0479F, 2.0209F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0097F, 4.8979F, 0.072F, -0.3445F, -0.0548F));

		PartDefinition tail10 = tail9.addOrReplaceChild("tail10", CubeListBuilder.create().texOffs(62, 84).addBox(-0.5F, -0.2801F, -0.0033F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2525F, 4.0221F, 0.0004F, -0.3936F, 0.0613F));

		PartDefinition cube_r79 = tail10.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(113, 141).addBox(0.0F, -0.525F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(141, 111).addBox(0.0F, -0.525F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2704F, 0.0988F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail11 = tail10.addOrReplaceChild("tail11", CubeListBuilder.create().texOffs(108, 0).addBox(-0.5F, -0.2801F, -0.0033F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0052F, 4.0007F, -0.1002F, -0.4326F, -0.0026F));

		PartDefinition cube_r80 = tail11.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(141, 118).addBox(0.0F, -0.525F, 5.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(116, 141).addBox(0.0F, -0.525F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2652F, -3.9019F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail12 = tail11.addOrReplaceChild("tail12", CubeListBuilder.create().texOffs(108, 6).addBox(-0.5F, -0.2051F, -0.0046F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0552F, 4.0016F, 0.0999F, -0.3589F, -0.0853F));

		PartDefinition tail13 = tail12.addOrReplaceChild("tail13", CubeListBuilder.create().texOffs(11, 108).addBox(-0.5F, -0.2051F, -0.0046F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, -0.1387F, -0.5646F, 0.0399F));

		PartDefinition tail14 = tail13.addOrReplaceChild("tail14", CubeListBuilder.create().texOffs(108, 12).addBox(-0.5F, -0.2051F, -0.0046F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.1321F, 0.2068F, 0.1938F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0755F, -1.1507F, -0.1835F, 0.0424F, -0.0102F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(132, 89).addBox(0.0F, -2.0F, -0.0026F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0032F, -7.8614F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(45, 134).addBox(0.0F, -3.075F, 11.9974F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(32, 134).addBox(0.0F, -3.0F, 14.9974F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(19, 42).addBox(-0.5F, -3.5F, 8.8974F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 39).addBox(-0.5F, -1.3F, 8.9974F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.197F, -16.9052F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(0, 9).addBox(-3.5F, -1.0F, -3.0F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.3933F, -4.7811F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(27, 0).mirror().addBox(0.0F, -1.95F, 0.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-7.0373F, -1.113F, -7.9593F, 0.1091F, 0.0378F, 1.0468F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(38, 32).mirror().addBox(0.0F, 0.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4392F, -2.4371F, -3.8977F, -0.0218F, 0.0378F, 1.0468F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(0, 26).mirror().addBox(0.0F, 0.0F, -4.0F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.1311F, -3.8674F, -0.0076F, 0.043F, 1.3961F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(126, 101).mirror().addBox(-3.9F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.5107F, -0.8609F, 0.0262F, 0.0005F, -0.0174F));

		PartDefinition cube_r88 = body.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(141, 25).mirror().addBox(-4.6031F, -1.4925F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.5107F, -0.8609F, 0.024F, 0.0104F, -0.41F));

		PartDefinition cube_r89 = body.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(126, 67).mirror().addBox(-3.9F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.5107F, -3.8609F, 0.0262F, 0.0005F, -0.0174F));

		PartDefinition cube_r90 = body.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(141, 23).mirror().addBox(-4.6031F, -1.4925F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.5107F, -3.8609F, 0.024F, 0.0104F, -0.41F));

		PartDefinition cube_r91 = body.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(139, 106).mirror().addBox(-4.6031F, -1.4925F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.5107F, -6.6609F, 0.024F, 0.0104F, -0.41F));

		PartDefinition cube_r92 = body.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(117, 45).mirror().addBox(-3.9F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.1F, -0.5107F, -6.6609F, 0.0262F, 0.0005F, -0.0174F));

		PartDefinition cube_r93 = body.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(141, 25).addBox(3.6031F, -1.4925F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.4F, -0.5107F, -0.8609F, 0.024F, -0.0104F, 0.41F));

		PartDefinition cube_r94 = body.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(126, 101).addBox(0.9F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.4F, -0.5107F, -0.8609F, 0.0262F, -0.0005F, 0.0174F));

		PartDefinition cube_r95 = body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(141, 23).addBox(3.6031F, -1.4925F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.4F, -0.5107F, -3.8609F, 0.024F, -0.0104F, 0.41F));

		PartDefinition cube_r96 = body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(126, 67).addBox(0.9F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.4F, -0.5107F, -3.8609F, 0.0262F, -0.0005F, 0.0174F));

		PartDefinition cube_r97 = body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(117, 45).addBox(-0.1F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, -0.5107F, -6.6609F, 0.0262F, -0.0005F, 0.0174F));

		PartDefinition cube_r98 = body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(139, 106).addBox(3.6031F, -1.4925F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.1F, -0.5107F, -6.6609F, 0.024F, -0.0104F, 0.41F));

		PartDefinition cube_r99 = body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(27, 0).addBox(-1.0F, -1.95F, 0.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(7.0373F, -1.113F, -7.9593F, 0.1091F, -0.0378F, -1.0468F));

		PartDefinition cube_r100 = body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(38, 32).addBox(-1.0F, 0.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4392F, -2.4371F, -3.8977F, -0.0218F, -0.0378F, -1.0468F));

		PartDefinition cube_r101 = body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, 0.0F, -4.0F, 1.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -3.1311F, -3.8674F, -0.0076F, -0.043F, -1.3961F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4524F, -7.868F, -0.1077F, 0.0436F, -0.0023F));

		PartDefinition cube_r102 = body3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(50, 134).addBox(0.0F, -0.95F, -0.9F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.2599F, -5.0918F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r103 = body3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(126, 27).addBox(0.0F, -2.0F, -1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4896F, -2.0219F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r104 = body3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -1.9881F, -5.928F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 5.1754F, 0.7697F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r105 = body3.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(46, 0).mirror().addBox(-3.0F, 0.0F, -3.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-4.4392F, -1.9182F, -3.2004F, 0.0697F, 0.0362F, -0.4787F));

		PartDefinition cube_r106 = body3.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(38, 42).mirror().addBox(-4.0F, 0.0F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.6106F, -3.2549F, 0.0774F, 0.0136F, -0.174F));

		PartDefinition cube_r107 = body3.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(141, 21).mirror().addBox(-2.009F, -4.7327F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.0417F, -1.7929F, 0.003F, 0.026F, -1.4573F));

		PartDefinition cube_r108 = body3.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(141, 19).mirror().addBox(-4.6031F, -1.4925F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.0417F, -1.7929F, 0.024F, 0.0104F, -0.41F));

		PartDefinition cube_r109 = body3.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(119, 15).mirror().addBox(-3.9F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.0417F, -1.7929F, 0.0262F, 0.0005F, -0.0174F));

		PartDefinition cube_r110 = body3.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(115, 53).mirror().addBox(-3.9F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2417F, -4.7929F, 0.0262F, 0.0005F, -0.0174F));

		PartDefinition cube_r111 = body3.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(141, 17).mirror().addBox(-4.6031F, -1.4925F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2417F, -4.7929F, 0.024F, 0.0104F, -0.41F));

		PartDefinition cube_r112 = body3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(141, 15).mirror().addBox(-2.009F, -4.7327F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2417F, -4.7929F, 0.003F, 0.026F, -1.4573F));

		PartDefinition cube_r113 = body3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(119, 15).addBox(-0.1F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.6F, 0.0417F, -1.7929F, 0.0262F, -0.0005F, 0.0174F));

		PartDefinition cube_r114 = body3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(141, 19).addBox(3.6031F, -1.4925F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.6F, 0.0417F, -1.7929F, 0.024F, -0.0104F, 0.41F));

		PartDefinition cube_r115 = body3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(141, 21).addBox(1.0091F, -4.7327F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.6F, 0.0417F, -1.7929F, 0.003F, -0.026F, 1.4573F));

		PartDefinition cube_r116 = body3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(141, 15).addBox(1.009F, -4.7327F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1F, 0.2417F, -4.7929F, 0.003F, -0.026F, 1.4573F));

		PartDefinition cube_r117 = body3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(141, 17).addBox(3.6031F, -1.4925F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1F, 0.2417F, -4.7929F, 0.024F, -0.0104F, 0.41F));

		PartDefinition cube_r118 = body3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(115, 53).addBox(-1.1F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1F, 0.2417F, -4.7929F, 0.0262F, -0.0005F, 0.0174F));

		PartDefinition cube_r119 = body3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(46, 0).addBox(0.0F, 0.0F, -3.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(4.4392F, -1.9182F, -3.2004F, 0.0697F, -0.0362F, 0.4787F));

		PartDefinition cube_r120 = body3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(38, 42).addBox(0.0F, 0.0F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, -2.6106F, -3.2549F, 0.0774F, -0.0136F, 0.174F));

		PartDefinition cube_r121 = body3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(74, 48).addBox(-0.5F, -3.3716F, 3.9779F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 1.298F, -9.9468F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r122 = body3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(45, 74).addBox(-0.5F, -0.3715F, 3.9779F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.498F, -9.9468F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body4 = body3.addOrReplaceChild("body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2962F, -5.9764F, -0.0029F, 0.0436F, 0.0024F));

		PartDefinition cube_r123 = body4.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(126, 33).addBox(0.0F, -2.2715F, -0.0221F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0795F, -2.8849F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r124 = body4.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(0, 18).addBox(-3.5F, -1.9527F, -4.9833F, 7.0F, 2.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 6.0159F, 1.0026F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r125 = body4.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(63, 104).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-4.4392F, -1.828F, -2.0416F, 0.0363F, -0.0697F, 1.0896F));

		PartDefinition cube_r126 = body4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(103, 84).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.5205F, -2.0961F, 0.0137F, -0.0773F, 1.3957F));

		PartDefinition cube_r127 = body4.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(135, 67).mirror().addBox(-3.009F, -4.7327F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2455F, -1.8165F, 0.003F, 0.026F, -1.4573F));

		PartDefinition cube_r128 = body4.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(130, 140).mirror().addBox(-4.6031F, -1.4925F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2455F, -1.8165F, 0.024F, 0.0104F, -0.41F));

		PartDefinition cube_r129 = body4.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(115, 51).mirror().addBox(-3.9F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2455F, -1.8165F, 0.0262F, 0.0005F, -0.0174F));

		PartDefinition cube_r130 = body4.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(115, 51).addBox(-1.1F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1F, 0.2455F, -1.8165F, 0.0262F, -0.0005F, 0.0174F));

		PartDefinition cube_r131 = body4.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(130, 140).addBox(3.6031F, -1.4925F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1F, 0.2455F, -1.8165F, 0.024F, -0.0104F, 0.41F));

		PartDefinition cube_r132 = body4.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(135, 67).addBox(1.009F, -4.7327F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1F, 0.2455F, -1.8165F, 0.003F, -0.026F, 1.4573F));

		PartDefinition cube_r133 = body4.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(63, 104).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(4.4392F, -1.828F, -2.0416F, 0.0363F, 0.0697F, -1.0896F));

		PartDefinition cube_r134 = body4.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(103, 84).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, -2.5205F, -2.0961F, 0.0137F, 0.0773F, -1.3957F));

		PartDefinition cube_r135 = body4.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(0, 112).addBox(-0.5F, -2.5716F, 4.9779F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F))
				.texOffs(114, 69).addBox(-0.5F, -0.3715F, 4.9779F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body5 = body4.addOrReplaceChild("body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3931F, -3.8505F, 0.0319F, 0.0F, 0.0F));

		PartDefinition cube_r136 = body5.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(82, 126).addBox(0.0F, -2.5716F, -2.0221F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0414F, -2.8723F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r137 = body5.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(126, 39).addBox(0.0F, -2.4715F, -1.0221F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.1155F, -0.8785F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r138 = body5.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(27, 11).addBox(-3.0F, -1.9456F, -4.0313F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 6.5421F, -0.1723F, 0.1527F, 0.0F, 0.0F));

		PartDefinition cube_r139 = body5.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(88, 70).mirror().addBox(0.0F, 0.0F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-4.4392F, -1.8673F, -2.5431F, 0.0363F, -0.0697F, 1.0896F));

		PartDefinition cube_r140 = body5.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(60, 74).mirror().addBox(0.0F, 0.0F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.5597F, -2.5976F, 0.0137F, -0.0773F, 1.3957F));

		PartDefinition cube_r141 = body5.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(125, 83).mirror().addBox(-4.0091F, -4.7327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.1524F, -0.966F, -0.001F, -0.0087F, -1.4573F));

		PartDefinition cube_r142 = body5.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(47, 82).mirror().addBox(-3.9F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.1524F, -0.966F, -0.0087F, -0.0002F, -0.0175F));

		PartDefinition cube_r143 = body5.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(140, 100).mirror().addBox(-4.6031F, -1.4925F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.1524F, -0.966F, -0.008F, -0.0035F, -0.4101F));

		PartDefinition cube_r144 = body5.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(118, 113).mirror().addBox(-5.0091F, -4.7327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.1524F, -3.966F, 0.0189F, 0.1647F, -1.4558F));

		PartDefinition cube_r145 = body5.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(140, 98).mirror().addBox(-4.6031F, -1.4925F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.1524F, -3.966F, 0.1523F, 0.0659F, -0.4051F));

		PartDefinition cube_r146 = body5.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(17, 77).mirror().addBox(-3.9F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.6F, 0.1524F, -3.966F, 0.1658F, 0.0029F, -0.0172F));

		PartDefinition cube_r147 = body5.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(140, 100).addBox(3.6031F, -1.4925F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.6F, 0.1524F, -0.966F, -0.008F, 0.0035F, 0.4101F));

		PartDefinition cube_r148 = body5.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(47, 82).addBox(-1.1F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.6F, 0.1524F, -0.966F, -0.0087F, 0.0002F, 0.0175F));

		PartDefinition cube_r149 = body5.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(125, 83).addBox(1.009F, -4.7327F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.6F, 0.1524F, -0.966F, -0.001F, 0.0087F, 1.4573F));

		PartDefinition cube_r150 = body5.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(17, 77).addBox(-1.1F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.6F, 0.1524F, -3.966F, 0.1658F, -0.0029F, 0.0172F));

		PartDefinition cube_r151 = body5.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(140, 98).addBox(3.6031F, -1.4925F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.6F, 0.1524F, -3.966F, 0.1523F, -0.0659F, 0.4051F));

		PartDefinition cube_r152 = body5.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(118, 113).addBox(1.009F, -4.7327F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.6F, 0.1524F, -3.966F, 0.0189F, -0.1647F, 1.4558F));

		PartDefinition cube_r153 = body5.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(88, 70).addBox(-1.0F, 0.0F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(4.4392F, -1.8673F, -2.5431F, 0.0363F, 0.0697F, -1.0896F));

		PartDefinition cube_r154 = body5.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(60, 74).addBox(-1.0F, 0.0F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, -2.5597F, -2.5976F, 0.0137F, 0.0773F, -1.3957F));

		PartDefinition cube_r155 = body5.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(0, 91).addBox(-0.5F, -2.5715F, 4.9779F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F))
				.texOffs(102, 48).addBox(-0.5F, -0.3715F, 4.9779F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -9.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition body2 = body5.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3276F, -4.9916F, -0.0117F, 0.0F, 0.0F));

		PartDefinition cube_r156 = body2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(0, 130).addBox(0.0F, -2.5716F, -1.0221F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0414F, -1.8723F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r157 = body2.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(15, 52).addBox(-3.0F, -1.574F, -2.9486F, 6.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 6.5001F, 0.8158F, 0.2793F, 0.0F, 0.0F));

		PartDefinition cube_r158 = body2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(52, 104).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-4.4392F, -1.828F, -2.0416F, 0.0363F, -0.0697F, 1.0896F));

		PartDefinition cube_r159 = body2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(102, 21).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.5205F, -2.0961F, 0.0137F, -0.0773F, 1.3957F));

		PartDefinition cube_r160 = body2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(115, 49).mirror().addBox(-6.0091F, -4.7327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2248F, -1.9745F, 0.0457F, 0.3814F, -1.4485F));

		PartDefinition cube_r161 = body2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(96, 140).mirror().addBox(-4.6031F, -1.4925F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2248F, -1.9745F, 0.3548F, 0.1499F, -0.3832F));

		PartDefinition cube_r162 = body2.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(115, 47).mirror().addBox(-3.9F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-1.1F, 0.2248F, -1.9745F, 0.3839F, 0.0065F, -0.0162F));

		PartDefinition cube_r163 = body2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(115, 47).addBox(-1.1F, 0.0F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1F, 0.2248F, -1.9745F, 0.3839F, -0.0065F, 0.0162F));

		PartDefinition cube_r164 = body2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(96, 140).addBox(3.6031F, -1.4925F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1F, 0.2248F, -1.9745F, 0.3548F, -0.1499F, 0.3832F));

		PartDefinition cube_r165 = body2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(115, 49).addBox(1.009F, -4.7327F, -0.5F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(1.1F, 0.2248F, -1.9745F, 0.0457F, -0.3814F, 1.4485F));

		PartDefinition cube_r166 = body2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(52, 104).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(4.4392F, -1.828F, -2.0416F, 0.0363F, 0.0697F, -1.0896F));

		PartDefinition cube_r167 = body2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(102, 21).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, -2.5205F, -2.0961F, 0.0137F, 0.0773F, -1.3957F));

		PartDefinition cube_r168 = body2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(96, 108).addBox(-0.5F, -2.5716F, 4.9779F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F))
				.texOffs(111, 55).addBox(-0.5F, -0.3715F, 4.9779F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3084F, -3.912F, 0.1105F, 0.0F, 0.0F));

		PartDefinition cube_r169 = chest.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(131, 22).addBox(0.0F, -2.7465F, -2.0221F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1199F, 0.1308F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r170 = chest.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(114, 81).mirror().addBox(-2.0F, -0.5F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.3502F, 6.3198F, -7.283F, -0.1956F, 0.5353F, -0.0999F));

		PartDefinition cube_r171 = chest.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(86, 114).mirror().addBox(-1.3F, -0.825F, -4.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.031F, 7.6554F, -1.4036F, -0.1709F, 0.1833F, -0.0306F));

		PartDefinition cube_r172 = chest.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(117, 40).mirror().addBox(-1.25F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.7116F, -0.8679F, -0.0496F, 0.1493F, -0.0137F));

		PartDefinition cube_r173 = chest.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(41, 118).mirror().addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-7.103F, -0.5461F, 0.1782F, -0.1581F, -0.041F, 1.088F));

		PartDefinition cube_r174 = chest.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(106, 115).mirror().addBox(0.0F, 0.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-4.4387F, -1.8709F, -1.3697F, 0.0165F, -0.041F, 1.088F));

		PartDefinition cube_r175 = chest.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(77, 114).mirror().addBox(0.0F, 0.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.5012F, -2.5752F, -1.3832F, 0.0034F, -0.0441F, 1.3937F));

		PartDefinition cube_r176 = chest.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(108, 18).mirror().addBox(-7.0091F, -4.7327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.0927F, -0.8873F, 0.0527F, 0.4333F, -1.4457F));

		PartDefinition cube_r177 = chest.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(140, 50).mirror().addBox(-4.6031F, -1.4925F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.0927F, -0.8873F, 0.4041F, 0.1693F, -0.3754F));

		PartDefinition cube_r178 = chest.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(118, 111).mirror().addBox(-3.9F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(-0.6F, 0.0927F, -0.8873F, 0.4363F, 0.0074F, -0.0158F));

		PartDefinition cube_r179 = chest.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(108, 18).addBox(1.0091F, -4.7327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.6F, 0.0927F, -0.8873F, 0.0527F, -0.4333F, 1.4457F));

		PartDefinition cube_r180 = chest.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(140, 50).addBox(3.6031F, -1.4925F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.6F, 0.0927F, -0.8873F, 0.4041F, -0.1693F, 0.3754F));

		PartDefinition cube_r181 = chest.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(118, 111).addBox(-0.1F, 0.0F, -0.5F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.6F, 0.0927F, -0.8873F, 0.4363F, -0.0074F, 0.0158F));

		PartDefinition cube_r182 = chest.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(41, 118).addBox(-1.0F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(7.103F, -0.5461F, 0.1782F, -0.1581F, 0.041F, -1.088F));

		PartDefinition cube_r183 = chest.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(106, 115).addBox(-1.0F, 0.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(4.4387F, -1.8709F, -1.3697F, 0.0165F, 0.041F, -1.088F));

		PartDefinition cube_r184 = chest.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(77, 114).addBox(-1.0F, 0.0F, -1.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5012F, -2.5752F, -1.3832F, 0.0034F, 0.0441F, -1.3937F));

		PartDefinition cube_r185 = chest.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(0, 118).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -2.0769F, -1.359F, 0.044F, 0.0043F, 0.0026F));

		PartDefinition cube_r186 = chest.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(86, 114).addBox(-0.7F, -0.825F, -4.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.031F, 7.6554F, -1.4036F, -0.1709F, -0.1833F, 0.0306F));

		PartDefinition cube_r187 = chest.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(32, 118).addBox(-0.5F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F))
				.texOffs(113, 26).addBox(-1.5F, -1.0F, -5.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.031F, 7.6554F, -2.4036F, -0.168F, 0.0231F, -0.0048F));

		PartDefinition cube_r188 = chest.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(114, 81).addBox(0.0F, -0.5F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.3502F, 6.3198F, -7.283F, -0.1956F, -0.5353F, 0.0999F));

		PartDefinition cube_r189 = chest.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(117, 101).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 6.7116F, -0.8679F, -0.0371F, 0.0231F, -0.0048F));

		PartDefinition cube_r190 = chest.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(117, 40).addBox(0.25F, 0.0F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 6.7116F, -0.8679F, -0.0496F, -0.1493F, 0.0137F));

		PartDefinition cube_r191 = chest.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(117, 35).addBox(-0.5F, -0.3716F, 5.9779F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.5906F, -8.8507F, 0.0785F, 0.0F, 0.0F));

		PartDefinition Rightupperarm = chest.addOrReplaceChild("Rightupperarm", CubeListBuilder.create().texOffs(136, 32).addBox(-0.599F, -0.2323F, -0.5195F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(6.3598F, 5.7651F, -3.7876F, -1.2035F, 0.1143F, -1.2339F));

		PartDefinition Rightupperarm_r1 = Rightupperarm.addOrReplaceChild("Rightupperarm_r1", CubeListBuilder.create().texOffs(116, 133).addBox(-0.5F, -1.0F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.099F, 0.7676F, -0.0195F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r2 = Rightupperarm.addOrReplaceChild("Rightupperarm_r2", CubeListBuilder.create().texOffs(32, 123).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.099F, 1.7804F, -0.4686F, 1.2043F, 0.0F, 0.0F));

		PartDefinition Rightupperarm_r3 = Rightupperarm.addOrReplaceChild("Rightupperarm_r3", CubeListBuilder.create().texOffs(5, 127).addBox(-0.5F, -0.8F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.099F, 3.7514F, 4.6661F, 0.6807F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm = Rightupperarm.addOrReplaceChild("Rightlowerarm", CubeListBuilder.create().texOffs(134, 81).addBox(-0.3997F, -0.501F, 0.4096F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.438F, 3.2367F, 4.9718F, -0.8432F, 0.3188F, -0.1862F));

		PartDefinition Rightlowerarm_r1 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r1", CubeListBuilder.create().texOffs(5, 135).addBox(-0.5F, -1.925F, -0.225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(0.1003F, 2.399F, -1.4904F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r2 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r2", CubeListBuilder.create().texOffs(92, 64).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.1003F, 4.699F, -1.4904F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r3 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r3", CubeListBuilder.create().texOffs(40, 132).addBox(-0.5F, -2.2F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.1003F, 1.9263F, 0.7461F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r4 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r4", CubeListBuilder.create().texOffs(82, 97).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1003F, 1.9263F, 0.7461F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Rightlowerarm_r5 = Rightlowerarm.addOrReplaceChild("Rightlowerarm_r5", CubeListBuilder.create().texOffs(117, 122).addBox(-0.5F, -1.75F, -0.625F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.1003F, 3.999F, -0.0904F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftFoot = Rightlowerarm.addOrReplaceChild("leftFoot", CubeListBuilder.create().texOffs(104, 30).addBox(0.0F, -0.4026F, -3.075F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3317F, 7.089F, -0.1178F, 0.0463F, 0.1303F, 1.4935F));

		PartDefinition leftFoot2 = leftFoot.addOrReplaceChild("leftFoot2", CubeListBuilder.create().texOffs(88, 88).addBox(0.0F, -1.0026F, -3.075F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.0F, 0.6F, 0.0F, -0.0038F, -0.0011F, -0.0785F));

		PartDefinition Leftupperarm = chest.addOrReplaceChild("Leftupperarm", CubeListBuilder.create().texOffs(136, 53).addBox(-0.401F, -0.2323F, -0.5195F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-6.3598F, 5.7651F, -3.7876F, -1.1009F, 0.0152F, 1.2889F));

		PartDefinition Leftupperarm_r1 = Leftupperarm.addOrReplaceChild("Leftupperarm_r1", CubeListBuilder.create().texOffs(121, 133).addBox(-0.5F, -1.0F, 0.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.099F, 0.7676F, -0.0195F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r2 = Leftupperarm.addOrReplaceChild("Leftupperarm_r2", CubeListBuilder.create().texOffs(37, 123).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.099F, 1.7804F, -0.4686F, 1.2043F, 0.0F, 0.0F));

		PartDefinition Leftupperarm_r3 = Leftupperarm.addOrReplaceChild("Leftupperarm_r3", CubeListBuilder.create().texOffs(33, 130).addBox(-0.5F, -0.8F, -0.6F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.099F, 3.7514F, 4.6661F, 0.6807F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm = Leftupperarm.addOrReplaceChild("Leftlowerarm", CubeListBuilder.create().texOffs(135, 85).addBox(-0.6003F, -0.501F, 0.4096F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.438F, 3.2367F, 4.9718F, -0.8173F, -0.2867F, 0.0466F));

		PartDefinition Leftlowerarm_r1 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r1", CubeListBuilder.create().texOffs(135, 5).addBox(-0.5F, -1.925F, -0.225F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.105F)), PartPose.offsetAndRotation(-0.1003F, 2.399F, -1.4904F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r2 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r2", CubeListBuilder.create().texOffs(125, 77).addBox(-0.5F, -1.5F, -0.7F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.1003F, 4.699F, -1.4904F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r3 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r3", CubeListBuilder.create().texOffs(56, 132).addBox(-0.5F, -2.2F, -1.1F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.1003F, 1.9263F, 0.7461F, -0.3054F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r4 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r4", CubeListBuilder.create().texOffs(135, 49).addBox(-0.5F, -0.7F, -0.7F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1003F, 1.9263F, 0.7461F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Leftlowerarm_r5 = Leftlowerarm.addOrReplaceChild("Leftlowerarm_r5", CubeListBuilder.create().texOffs(0, 123).addBox(-0.5F, -1.75F, -0.625F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1003F, 3.999F, -0.0904F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightFoot = Leftlowerarm.addOrReplaceChild("rightFoot", CubeListBuilder.create().texOffs(104, 36).addBox(-2.0F, -0.4026F, -3.075F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3317F, 7.089F, -0.1178F, 0.0541F, -0.1283F, -1.5374F));

		PartDefinition rightFoot2 = rightFoot.addOrReplaceChild("rightFoot2", CubeListBuilder.create().texOffs(89, 30).addBox(-3.0F, -1.0026F, -3.075F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-2.0F, 0.6F, 0.0F, -0.0038F, 0.0011F, 0.0785F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(5.2088F, 5.6985F, -4.4855F, -0.0057F, 0.1308F, -0.044F));

		PartDefinition Bodyfront_r1 = bone.addOrReplaceChild("Bodyfront_r1", CubeListBuilder.create().texOffs(66, 120).addBox(-0.5F, -1.1F, -1.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -4.9301F, 2.143F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r2 = bone.addOrReplaceChild("Bodyfront_r2", CubeListBuilder.create().texOffs(15, 139).addBox(-0.5F, -3.9F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(114, 86).addBox(-0.5F, -3.3F, -0.2F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -3.2994F, -0.2696F, -0.6981F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r3 = bone.addOrReplaceChild("Bodyfront_r3", CubeListBuilder.create().texOffs(115, 115).addBox(-0.449F, -0.6262F, -1.7212F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5042F, 0.8965F, 1.979F, 1.3934F, 0.0015F, 1.3411F));

		PartDefinition Bodyfront_r4 = bone.addOrReplaceChild("Bodyfront_r4", CubeListBuilder.create().texOffs(56, 91).addBox(-0.449F, -0.7981F, 0.1792F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-1.5042F, 0.8965F, 1.979F, 1.2538F, 0.0015F, 1.3411F));

		PartDefinition Bodyfront_r5 = bone.addOrReplaceChild("Bodyfront_r5", CubeListBuilder.create().texOffs(108, 101).addBox(-0.3487F, -4.5211F, -1.7212F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5042F, 0.8965F, 1.979F, 1.3907F, 0.1732F, 1.31F));

		PartDefinition Bodyfront_r6 = bone.addOrReplaceChild("Bodyfront_r6", CubeListBuilder.create().texOffs(49, 125).addBox(-0.5F, -1.1F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, -0.8339F, 1.5223F, 0.829F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r7 = bone.addOrReplaceChild("Bodyfront_r7", CubeListBuilder.create().texOffs(121, 86).addBox(-0.5F, -1.7F, -0.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.5798F, -0.1189F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.2088F, 5.6985F, -4.4855F, -0.0057F, -0.1308F, 0.044F));

		PartDefinition Bodyfront_r8 = bone4.addOrReplaceChild("Bodyfront_r8", CubeListBuilder.create().texOffs(66, 120).mirror().addBox(-0.5F, -1.1F, -1.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -4.9301F, 2.143F, -0.0436F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r9 = bone4.addOrReplaceChild("Bodyfront_r9", CubeListBuilder.create().texOffs(15, 139).mirror().addBox(-0.5F, -3.9F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(114, 86).mirror().addBox(-0.5F, -3.3F, -0.2F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, -3.2994F, -0.2696F, -0.6981F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r10 = bone4.addOrReplaceChild("Bodyfront_r10", CubeListBuilder.create().texOffs(115, 115).mirror().addBox(-0.551F, -0.6262F, -1.7212F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5042F, 0.8965F, 1.979F, 1.3934F, -0.0015F, -1.3411F));

		PartDefinition Bodyfront_r11 = bone4.addOrReplaceChild("Bodyfront_r11", CubeListBuilder.create().texOffs(56, 91).mirror().addBox(-0.551F, -0.7981F, 0.1792F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(1.5042F, 0.8965F, 1.979F, 1.2538F, -0.0015F, -1.3411F));

		PartDefinition Bodyfront_r12 = bone4.addOrReplaceChild("Bodyfront_r12", CubeListBuilder.create().texOffs(108, 101).mirror().addBox(-0.6513F, -4.5211F, -1.7212F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.5042F, 0.8965F, 1.979F, 1.3907F, -0.1732F, -1.31F));

		PartDefinition Bodyfront_r13 = bone4.addOrReplaceChild("Bodyfront_r13", CubeListBuilder.create().texOffs(49, 125).mirror().addBox(-0.5F, -1.1F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8339F, 1.5223F, 0.829F, 0.0F, 0.0F));

		PartDefinition Bodyfront_r14 = bone4.addOrReplaceChild("Bodyfront_r14", CubeListBuilder.create().texOffs(121, 86).mirror().addBox(-0.5F, -1.7F, -0.3F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.5798F, -0.1189F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2404F, -2.8682F, 0.0006F, 0.0435F, -0.0032F));

		PartDefinition cube_r192 = neck.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(131, 34).addBox(0.0F, -2.225F, -1.5F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7904F, -3.3807F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r193 = neck.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(131, 28).addBox(-0.5F, -2.175F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.6597F, -1.8864F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r194 = neck.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(140, 6).mirror().addBox(0.0F, -0.525F, -6.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(57, 30).mirror().addBox(0.0F, -1.525F, -5.725F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-6.1713F, -1.0357F, 0.1894F, -0.1877F, 0.0831F, 1.0452F));

		PartDefinition cube_r195 = neck.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(65, 0).mirror().addBox(0.0F, 0.0F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-4.4392F, -2.0311F, 0.2853F, -0.0481F, 0.0831F, 1.0452F));

		PartDefinition cube_r196 = neck.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(0.0F, 0.0F, -6.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.7225F, 0.3518F, -0.0167F, 0.0945F, 1.3955F));

		PartDefinition cube_r197 = neck.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(111, 67).mirror().addBox(-7.0091F, -4.7327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(1.4F, -0.2657F, -4.0269F, 0.0947F, 0.6927F, -1.4231F));

		PartDefinition cube_r198 = neck.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(125, 140).mirror().addBox(-4.6031F, -1.4925F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(1.4F, -0.2657F, -4.0269F, 0.6559F, 0.2592F, -0.3215F));

		PartDefinition cube_r199 = neck.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(132, 74).mirror().addBox(-3.9F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(1.4F, -0.2657F, -4.0269F, 0.6981F, 0.0112F, -0.0134F));

		PartDefinition cube_r200 = neck.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(15, 75).mirror().addBox(-7.0091F, -4.7327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.0657F, -1.0269F, 0.0627F, 0.5026F, -1.4413F));

		PartDefinition cube_r201 = neck.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(101, 126).mirror().addBox(-4.6031F, -1.4925F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.0657F, -1.0269F, 0.4703F, 0.1945F, -0.3634F));

		PartDefinition cube_r202 = neck.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(125, 96).mirror().addBox(-3.9F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.4F, -0.0657F, -1.0269F, 0.5061F, 0.0085F, -0.0153F));

		PartDefinition cube_r203 = neck.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(132, 74).addBox(1.9F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.4F, -0.2657F, -4.0269F, 0.6981F, -0.0112F, 0.0134F));

		PartDefinition cube_r204 = neck.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(125, 140).addBox(3.6031F, -1.4925F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.4F, -0.2657F, -4.0269F, 0.6559F, -0.2592F, 0.3215F));

		PartDefinition cube_r205 = neck.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(111, 67).addBox(1.009F, -4.7327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-1.4F, -0.2657F, -4.0269F, 0.0947F, -0.6927F, 1.4231F));

		PartDefinition cube_r206 = neck.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(125, 96).addBox(0.9F, 0.0F, -0.5F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.4F, -0.0657F, -1.0269F, 0.5061F, -0.0085F, 0.0153F));

		PartDefinition cube_r207 = neck.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(101, 126).addBox(3.6031F, -1.4925F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.4F, -0.0657F, -1.0269F, 0.4703F, -0.1945F, 0.3634F));

		PartDefinition cube_r208 = neck.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(15, 75).addBox(1.0091F, -4.7327F, -0.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.4F, -0.0657F, -1.0269F, 0.0627F, -0.5026F, 1.4413F));

		PartDefinition cube_r209 = neck.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(140, 6).addBox(-1.0F, -0.525F, -6.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(57, 30).addBox(-1.0F, -1.525F, -5.725F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(6.1713F, -1.0357F, 0.1894F, -0.1877F, -0.0831F, -1.0452F));

		PartDefinition cube_r210 = neck.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(65, 0).addBox(-1.0F, 0.0F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(4.4392F, -2.0311F, 0.2853F, -0.0481F, -0.0831F, -1.0452F));

		PartDefinition cube_r211 = neck.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(0, 49).addBox(-1.0F, 0.0F, -6.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.7225F, 0.3518F, -0.0167F, -0.0945F, -1.3955F));

		PartDefinition cube_r212 = neck.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(59, 48).addBox(-0.5F, 0.0F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.7225F, 0.3518F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r213 = neck.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(65, 8).addBox(-1.0F, -2.9F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -2.1392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5113F, -5.8443F, -0.2586F, 0.0375F, -0.0405F));

		PartDefinition cube_r214 = neck2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(131, 16).addBox(0.0F, -2.1F, -1.5F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7904F, -3.4808F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r215 = neck2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(12, 131).addBox(0.0F, -2.3F, -0.5F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6161F, -1.4884F, -0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r216 = neck2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(69, 97).mirror().addBox(-0.4F, -1.0F, -4.775F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-5.3075F, -1.6495F, -0.1401F, 0.0373F, 0.2953F, 2.6754F));

		PartDefinition cube_r217 = neck2.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(56, 97).mirror().addBox(0.0F, -1.0F, -4.775F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.4296F, -2.0963F, 0.0323F, 0.0362F, 0.1732F, 2.6708F));

		PartDefinition cube_r218 = neck2.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(26, 97).mirror().addBox(0.0F, 0.0F, -4.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4544F, -2.2555F, 0.1859F, -0.1548F, 0.0859F, 1.3956F));

		PartDefinition cube_r219 = neck2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(88, 79).mirror().addBox(0.0F, 0.0F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.9924F, -2.2592F, -0.0152F, 0.0859F, 1.3956F));

		PartDefinition Bodyfront_r15 = neck2.addOrReplaceChild("Bodyfront_r15", CubeListBuilder.create().texOffs(136, 116).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.439F, 0.7159F, -2.7676F, 0.0304F, 0.9362F, -1.3243F));

		PartDefinition Bodyfront_r16 = neck2.addOrReplaceChild("Bodyfront_r16", CubeListBuilder.create().texOffs(114, 99).mirror().addBox(-6.8334F, -0.893F, -0.5745F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1574F, -1.2463F, 0.2031F, 0.7657F, -1.1041F));

		PartDefinition Bodyfront_r17 = neck2.addOrReplaceChild("Bodyfront_r17", CubeListBuilder.create().texOffs(135, 10).mirror().addBox(-2.0386F, 0.0545F, -0.5745F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1574F, -1.2463F, 0.5664F, 0.5795F, -0.533F));

		PartDefinition Bodyfront_r18 = neck2.addOrReplaceChild("Bodyfront_r18", CubeListBuilder.create().texOffs(136, 114).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2141F, -4.2688F, 0.4584F, 0.849F, -0.7806F));

		PartDefinition Bodyfront_r19 = neck2.addOrReplaceChild("Bodyfront_r19", CubeListBuilder.create().texOffs(114, 99).addBox(1.8334F, -0.893F, -0.5745F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1574F, -1.2463F, 0.2031F, -0.7657F, 1.1041F));

		PartDefinition Bodyfront_r20 = neck2.addOrReplaceChild("Bodyfront_r20", CubeListBuilder.create().texOffs(135, 10).addBox(0.0386F, 0.0545F, -0.5745F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1574F, -1.2463F, 0.5664F, -0.5795F, 0.533F));

		PartDefinition Bodyfront_r21 = neck2.addOrReplaceChild("Bodyfront_r21", CubeListBuilder.create().texOffs(136, 116).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.439F, 0.7159F, -2.7676F, 0.0304F, -0.9362F, 1.3243F));

		PartDefinition Bodyfront_r22 = neck2.addOrReplaceChild("Bodyfront_r22", CubeListBuilder.create().texOffs(136, 114).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2141F, -4.2688F, 0.4584F, -0.849F, 0.7806F));

		PartDefinition cube_r220 = neck2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(69, 97).addBox(-0.6F, -1.0F, -4.775F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(5.3075F, -1.6495F, -0.1401F, 0.0373F, -0.2953F, -2.6754F));

		PartDefinition cube_r221 = neck2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(56, 97).addBox(-1.0F, -1.0F, -4.775F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.4296F, -2.0963F, 0.0323F, 0.0362F, -0.1732F, -2.6708F));

		PartDefinition cube_r222 = neck2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(26, 97).addBox(-1.0F, 0.0F, -4.875F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4544F, -2.2555F, 0.1859F, -0.1548F, -0.0859F, -1.3956F));

		PartDefinition cube_r223 = neck2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(88, 79).addBox(-1.0F, 0.0F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -2.9924F, -2.2592F, -0.0152F, -0.0859F, -1.3956F));

		PartDefinition cube_r224 = neck2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(95, 14).addBox(-1.0F, -5.2F, -2.975F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(26, 104).addBox(-1.0F, -2.9F, -3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -2.2392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3445F, -4.8761F, -0.1086F, -0.0027F, -0.0376F));

		PartDefinition cube_r225 = neck3.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(44, 112).mirror().addBox(0.0F, -0.95F, -4.025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6078F, -1.8358F, 0.1465F, -0.2523F, 0.0383F, 1.0933F));

		PartDefinition cube_r226 = neck3.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(39, 105).mirror().addBox(0.0F, -0.95F, -1.8F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4696F, -2.6834F, -1.7128F, -0.1461F, 0.0859F, 1.3956F));

		PartDefinition cube_r227 = neck3.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(0, 105).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.0294F, -1.6826F, -0.0152F, 0.0859F, 1.3956F));

		PartDefinition Bodyfront_r23 = neck3.addOrReplaceChild("Bodyfront_r23", CubeListBuilder.create().texOffs(68, 64).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1246F, -2.3969F, 0.4194F, 0.7699F, -0.8343F));

		PartDefinition Bodyfront_r24 = neck3.addOrReplaceChild("Bodyfront_r24", CubeListBuilder.create().texOffs(68, 64).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1246F, -2.3969F, 0.4194F, -0.7699F, 0.8343F));

		PartDefinition cube_r228 = neck3.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(134, 57).addBox(0.0F, -1.9F, -0.5F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7904F, -2.4808F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r229 = neck3.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(44, 112).addBox(-1.0F, -0.95F, -4.025F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6078F, -1.8358F, 0.1465F, -0.2523F, -0.0383F, -1.0933F));

		PartDefinition cube_r230 = neck3.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(39, 105).addBox(-1.0F, -0.95F, -1.8F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4696F, -2.6834F, -1.7128F, -0.1461F, -0.0859F, -1.3956F));

		PartDefinition cube_r231 = neck3.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(0, 105).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -3.0294F, -1.6826F, -0.0152F, -0.0859F, -1.3956F));

		PartDefinition cube_r232 = neck3.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(33, 112).addBox(-1.0F, -5.2F, -2.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(114, 75).addBox(-1.0F, -2.9F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -1.2392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4457F, -3.9311F, -0.0497F, 0.0415F, -0.0246F));

		PartDefinition cube_r233 = neck4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(83, 56).mirror().addBox(-0.4F, -1.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.843F, -2.5791F, -2.5622F, 0.0438F, 0.1714F, 2.715F));

		PartDefinition cube_r234 = neck4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(0.0F, -1.425F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2575F, -2.5114F, -2.6275F, -0.1548F, 0.0859F, 1.3956F));

		PartDefinition cube_r235 = neck4.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(30, 62).mirror().addBox(0.0F, 0.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.9958F, -2.5851F, -0.0152F, 0.0859F, 1.3956F));

		PartDefinition Bodyfront_r25 = neck4.addOrReplaceChild("Bodyfront_r25", CubeListBuilder.create().texOffs(134, 108).mirror().addBox(-2.1929F, -0.4425F, -0.4288F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0188F, -0.1742F, -4.2934F, 0.3896F, 0.8304F, -0.9238F));

		PartDefinition Bodyfront_r26 = neck4.addOrReplaceChild("Bodyfront_r26", CubeListBuilder.create().texOffs(66, 112).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2158F, -1.246F, 0.4089F, 0.8706F, -0.8981F));

		PartDefinition Bodyfront_r27 = neck4.addOrReplaceChild("Bodyfront_r27", CubeListBuilder.create().texOffs(134, 108).addBox(0.1929F, -0.4425F, -0.4288F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0188F, -0.1742F, -4.2934F, 0.3896F, -0.8304F, 0.9238F));

		PartDefinition Bodyfront_r28 = neck4.addOrReplaceChild("Bodyfront_r28", CubeListBuilder.create().texOffs(66, 112).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2158F, -1.246F, 0.4089F, -0.8706F, 0.8981F));

		PartDefinition cube_r236 = neck4.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(134, 94).addBox(-0.5F, -4.5F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(71, 135).addBox(-0.5F, -4.4F, -3.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(73, 82).addBox(-1.0F, -5.175F, -3.8F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(32, 82).addBox(-1.0F, -2.9F, -4.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -2.2392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r237 = neck4.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(83, 56).addBox(-0.6F, -1.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.843F, -2.5791F, -2.5622F, 0.0438F, -0.1714F, -2.715F));

		PartDefinition cube_r238 = neck4.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(0, 83).addBox(-1.0F, -1.425F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2575F, -2.5114F, -2.6275F, -0.1548F, -0.0859F, -1.3956F));

		PartDefinition cube_r239 = neck4.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(30, 62).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -2.9958F, -2.5851F, -0.0152F, -0.0859F, -1.3956F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4254F, -5.9182F, -0.1476F, 0.1581F, -0.039F));

		PartDefinition cube_r240 = neck5.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(39, 98).mirror().addBox(0.0F, -1.0F, 0.05F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4526F, -2.8195F, -4.5367F, -0.1062F, 0.0852F, 1.3518F));

		PartDefinition cube_r241 = neck5.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(89, 48).mirror().addBox(0.0F, 0.0F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -3.0328F, -2.0085F, -0.0189F, 0.0852F, 1.3518F));

		PartDefinition Bodyfront_r29 = neck5.addOrReplaceChild("Bodyfront_r29", CubeListBuilder.create().texOffs(50, 30).mirror().addBox(-1.8387F, 0.1501F, -0.5496F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.703F, -0.0824F, -0.9904F, 0.3896F, 0.8304F, -0.9238F));

		PartDefinition Bodyfront_r30 = neck5.addOrReplaceChild("Bodyfront_r30", CubeListBuilder.create().texOffs(127, 64).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.383F, -4.1533F, 0.3896F, 0.8304F, -0.9238F));

		PartDefinition Bodyfront_r31 = neck5.addOrReplaceChild("Bodyfront_r31", CubeListBuilder.create().texOffs(50, 30).addBox(-0.1613F, 0.1501F, -0.5496F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.703F, -0.0824F, -0.9904F, 0.3896F, -0.8304F, 0.9238F));

		PartDefinition Bodyfront_r32 = neck5.addOrReplaceChild("Bodyfront_r32", CubeListBuilder.create().texOffs(127, 64).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.383F, -4.1533F, 0.3896F, -0.8304F, 0.9238F));

		PartDefinition cube_r242 = neck5.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(92, 134).addBox(-0.5F, -4.1F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(134, 62).addBox(-0.5F, -4.0F, -4.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 98).addBox(-1.0F, -5.175F, -3.725F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(95, 7).addBox(-1.0F, -2.9F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -1.2392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r243 = neck5.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(39, 98).addBox(-1.0F, -1.0F, 0.05F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4526F, -2.8195F, -4.5367F, -0.1062F, -0.0852F, -1.3518F));

		PartDefinition cube_r244 = neck5.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(89, 48).addBox(-1.0F, 0.0F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -3.0328F, -2.0085F, -0.0189F, -0.0852F, -1.3518F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.4254F, -4.9182F, -0.1638F, 0.018F, 0.0394F));

		PartDefinition Bodyfront_r33 = neck6.addOrReplaceChild("Bodyfront_r33", CubeListBuilder.create().texOffs(127, 98).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1627F, -2.038F, 0.456F, 0.9499F, -0.8385F));

		PartDefinition cube_r245 = neck6.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(11, 114).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4659F, -2.8525F, -3.2038F, -0.2757F, 0.0843F, 1.308F));

		PartDefinition cube_r246 = neck6.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(113, 20).mirror().addBox(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.936F, -1.1888F, -0.0226F, 0.0843F, 1.308F));

		PartDefinition Bodyfront_r34 = neck6.addOrReplaceChild("Bodyfront_r34", CubeListBuilder.create().texOffs(127, 98).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1627F, -2.038F, 0.456F, -0.9499F, 0.8385F));

		PartDefinition cube_r247 = neck6.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(87, 134).addBox(-0.5F, -4.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(55, 112).addBox(-1.0F, -5.15F, -2.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(111, 61).addBox(-1.0F, -2.9F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 2.2293F, -1.2392F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r248 = neck6.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(11, 114).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4659F, -2.8525F, -3.2038F, -0.2757F, -0.0843F, -1.308F));

		PartDefinition cube_r249 = neck6.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(113, 20).addBox(-1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.5F, -2.936F, -1.1888F, -0.0226F, -0.0843F, -1.308F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5585F, -3.9597F, 0.2003F, 0.2555F, 0.3479F));

		PartDefinition cube_r250 = head.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(45, 139).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -0.1676F, -15.4246F, 3.0194F, 0.0F, 0.0F));

		PartDefinition cube_r251 = head.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(30, 139).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(0.0F, -1.0157F, -14.8947F, -2.1293F, 0.0F, 0.0F));

		PartDefinition cube_r252 = head.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(25, 139).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, -1.3247F, -13.9436F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r253 = head.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(20, 139).addBox(-0.645F, -1.0017F, -2.6443F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F))
				.texOffs(87, 126).addBox(-0.645F, -1.0017F, -1.9444F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.145F, -0.2331F, -11.3858F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r254 = head.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(75, 70).addBox(-1.4F, 0.1F, -1.1F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -0.3156F, 0.4636F, -1.2566F, 0.0F, 0.0F));

		PartDefinition cube_r255 = head.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(32, 79).addBox(-2.5F, -0.025F, -1.025F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.801F, -1.6275F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r256 = head.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(38, 50).addBox(-2.5F, -0.5F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.9887F, -2.323F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r257 = head.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(117, 30).addBox(-0.5F, -0.15F, -1.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.087F, -0.3194F, -13.1267F, 0.2542F, 0.0119F, 0.0106F));

		PartDefinition cube_r258 = head.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(68, 56).addBox(-0.5F, 0.0F, -6.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0268F, -0.3428F, -8.1022F, -0.0949F, 0.0119F, 0.0106F));

		PartDefinition cube_r259 = head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(89, 36).addBox(-1.5F, -1.0F, -4.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.3657F, -4.3498F, -0.1822F, 0.0119F, 0.0106F));

		PartDefinition cube_r260 = head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(89, 42).addBox(-2.5F, -0.025F, -2.025F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -1.3341F, 0.3172F, -0.2356F, 0.0F, 0.0F));

		PartDefinition cube_r261 = head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(57, 118).addBox(-1.0F, -0.1044F, -3.9937F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(0.5F, -1.9916F, -7.6778F, 0.2269F, 0.0F, 0.0F));

		PartDefinition cube_r262 = head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(95, 21).addBox(-1.5F, -0.0087F, -0.9991F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(0.5F, -1.9916F, -7.6778F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r263 = head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(104, 42).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(0.0F, -1.9666F, -4.6529F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r264 = head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(114, 95).addBox(-1.5F, 0.025F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(0.0F, -1.9996F, -4.6616F, -0.0262F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.4548F, 1.0675F, 0.315F));

		PartDefinition cube_r265 = leftFace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(126, 136).addBox(-0.9096F, -3.0257F, 0.7696F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, -2.4071F, 0.0395F, -0.2977F));

		PartDefinition cube_r266 = leftFace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(139, 60).addBox(-1.8208F, -0.0664F, -15.0238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, 0.05F, 0.0732F, -0.3338F));

		PartDefinition cube_r267 = leftFace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(139, 103).addBox(-1.6958F, 0.2721F, -13.1997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F))
				.texOffs(91, 139).addBox(-1.6958F, 0.2721F, -13.5997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, -0.0373F, 0.0732F, -0.3338F));

		PartDefinition cube_r268 = leftFace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(71, 127).addBox(-1.8208F, -2.2717F, -13.9972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, 0.207F, 0.0732F, -0.3338F));

		PartDefinition cube_r269 = leftFace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(66, 114).addBox(-0.5603F, -0.0137F, -12.681F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, 0.0211F, 0.1783F, -0.3033F));

		PartDefinition cube_r270 = leftFace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(139, 57).addBox(-1.8208F, 2.0109F, -12.2905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, -0.142F, 0.0732F, -0.3338F));

		PartDefinition cube_r271 = leftFace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(125, 73).addBox(-0.5603F, 4.5661F, -10.8379F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, -0.3716F, 0.1783F, -0.3033F));

		PartDefinition cube_r272 = leftFace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(50, 139).addBox(-0.5603F, 8.6701F, 2.9469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, -1.7678F, 0.1783F, -0.3033F));

		PartDefinition cube_r273 = leftFace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(139, 72).addBox(-1.8208F, -10.4581F, 9.772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, 2.4323F, 0.0732F, -0.3338F));

		PartDefinition cube_r274 = leftFace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(140, 3).addBox(-1.8208F, 4.1876F, 12.3634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, -2.76F, 0.0732F, -0.3338F));

		PartDefinition cube_r275 = leftFace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(131, 136).addBox(-1.8208F, 11.3974F, 0.5234F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, -1.6256F, 0.0732F, -0.3338F));

		PartDefinition cube_r276 = leftFace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(19, 26).addBox(-0.5603F, 7.4983F, -1.8241F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, -1.4188F, 0.1783F, -0.3033F));

		PartDefinition cube_r277 = leftFace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(100, 121).addBox(-0.5603F, 7.4707F, -0.8453F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, -1.4624F, 0.1783F, -0.3033F));

		PartDefinition cube_r278 = leftFace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(45, 62).addBox(-0.6949F, -5.4441F, -1.9284F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(127, 107).addBox(-0.6949F, -4.4441F, -1.8034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(127, 103).addBox(-0.6949F, -3.4441F, -1.6284F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9748F, 0.0275F, -10.2735F, -1.7584F, 0.2476F, -0.0888F));

		PartDefinition cube_r279 = leftFace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(130, 77).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.0427F, -0.1126F, -15.1239F, -1.4598F, 0.0593F, 0.0148F));

		PartDefinition cube_r280 = leftFace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(49, 130).addBox(-0.737F, 4.0833F, -1.2816F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(139, 82).addBox(-0.737F, 2.3841F, -1.413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9748F, 0.0275F, -10.2735F, -1.4685F, 0.0732F, -0.1156F));

		PartDefinition cube_r281 = leftFace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(94, 130).addBox(-0.737F, 3.3258F, -1.7149F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9748F, 0.0275F, -10.2735F, -1.4161F, 0.0732F, -0.1156F));

		PartDefinition cube_r282 = leftFace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(139, 79).addBox(-0.5883F, 1.5184F, -0.6188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(128, 8).addBox(-0.6133F, 0.5184F, -1.0188F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9748F, 0.0275F, -10.2735F, -1.8725F, 0.1783F, -0.0851F));

		PartDefinition cube_r283 = leftFace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(128, 4).addBox(-0.5633F, -0.5337F, -0.8986F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9748F, 0.0275F, -10.2735F, -1.6718F, 0.1783F, -0.0851F));

		PartDefinition cube_r284 = leftFace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(70, 131).addBox(-0.5633F, -1.5636F, -0.9856F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9748F, 0.0275F, -10.2735F, -1.5846F, 0.1783F, -0.0851F));

		PartDefinition cube_r285 = leftFace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(128, 0).addBox(-0.6949F, -2.4163F, -1.8348F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9748F, 0.0275F, -10.2735F, -1.8108F, 0.2476F, -0.0888F));

		PartDefinition cube_r286 = leftFace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(122, 115).addBox(-0.0252F, 5.3647F, 2.0476F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, -1.8457F, 0.2476F, -0.3069F));

		PartDefinition cube_r287 = leftFace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(55, 137).addBox(-0.4825F, -0.644F, -0.6758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0768F, -2.4963F, -6.6494F, -3.078F, 0.2963F, -0.1055F));

		PartDefinition cube_r288 = leftFace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(37, 137).addBox(-0.4816F, -0.427F, -0.6469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0768F, -2.4963F, -6.6494F, 2.926F, 0.2963F, -0.1055F));

		PartDefinition cube_r289 = leftFace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(139, 95).addBox(-0.325F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(139, 92).addBox(-0.5F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.1802F, -2.5076F, -6.9382F, -1.5683F, 0.2963F, -0.1055F));

		PartDefinition cube_r290 = leftFace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(137, 12).addBox(-0.4911F, -0.3181F, -0.3346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0768F, -2.4963F, -6.6494F, -2.31F, 0.2963F, -0.1055F));

		PartDefinition cube_r291 = leftFace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(86, 119).addBox(-0.0252F, 3.7357F, 0.1018F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, -1.6712F, 0.2476F, -0.3069F));

		PartDefinition cube_r292 = leftFace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(42, 128).addBox(-0.025F, 1.8969F, -5.3473F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, -0.4908F, 0.2438F, 0.0539F));

		PartDefinition cube_r293 = leftFace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(86, 139).addBox(-0.025F, 4.8039F, 3.2836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, -2.2187F, 0.2438F, 0.0539F));

		PartDefinition cube_r294 = leftFace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(119, 0).addBox(-0.6123F, 1.6139F, 8.0098F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, -2.8595F, 0.1741F, 0.0531F));

		PartDefinition cube_r295 = leftFace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(128, 45).addBox(-0.025F, 0.7905F, 6.2369F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, -2.9604F, 0.2438F, 0.0539F));

		PartDefinition cube_r296 = leftFace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(139, 63).addBox(-0.025F, 5.6377F, -0.6392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, -1.6078F, 0.2438F, 0.0539F));

		PartDefinition cube_r297 = leftFace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(50, 118).addBox(-0.9096F, -0.0796F, 0.017F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, -1.6479F, 0.0395F, -0.2977F));

		PartDefinition cube_r298 = leftFace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(57, 123).addBox(-0.0252F, 3.5383F, 1.8097F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, -1.8021F, 0.2476F, -0.3069F));

		PartDefinition cube_r299 = leftFace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(119, 5).addBox(-0.1544F, -0.4186F, -7.1967F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, -0.009F, 0.2269F, -0.002F));

		PartDefinition cube_r300 = leftFace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(128, 49).addBox(-0.6806F, -0.3516F, -4.2747F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, -0.0263F, 0.1047F, -0.0028F));

		PartDefinition cube_r301 = leftFace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(125, 69).addBox(-0.9096F, 2.5542F, 2.3636F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, -1.9446F, 0.0395F, -0.2977F));

		PartDefinition cube_r302 = leftFace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(127, 60).addBox(-0.9096F, 1.9963F, 2.0727F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(12, 127).addBox(-0.9096F, 1.3963F, 2.0727F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, -1.8399F, 0.0395F, -0.2977F));

		PartDefinition cube_r303 = leftFace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(122, 120).addBox(-0.9096F, 0.4029F, 1.5726F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, -1.5781F, 0.0395F, -0.2977F));

		PartDefinition cube_r304 = leftFace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(22, 111).addBox(0.1F, 0.0F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4816F, -1.4103F, -8.4172F, -0.0959F, 0.1423F, -0.0019F));

		PartDefinition cube_r305 = leftFace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(107, 109).addBox(1.2F, -1.0F, -3.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4548F, 0.2981F, -4.6648F, -0.1853F, 0.1836F, -0.0214F));

		PartDefinition cube_r306 = leftFace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(136, 36).addBox(-0.9096F, -1.7108F, 2.6115F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, -1.6653F, 0.0395F, -0.2977F));

		PartDefinition cube_r307 = leftFace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(118, 106).addBox(-0.9096F, 0.0758F, 0.4635F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9653F, -2.5782F, -0.6923F, -1.4035F, 0.0395F, -0.2977F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.4548F, 1.0675F, 0.315F));

		PartDefinition cube_r308 = rightFace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(126, 136).mirror().addBox(-0.0904F, -3.0257F, 0.7696F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, -2.4071F, -0.0395F, 0.2977F));

		PartDefinition cube_r309 = rightFace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(139, 60).mirror().addBox(0.8208F, -0.0664F, -15.0238F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, 0.05F, -0.0732F, 0.3338F));

		PartDefinition cube_r310 = rightFace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(139, 103).mirror().addBox(0.6958F, 0.2721F, -13.1997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.103F)).mirror(false)
				.texOffs(91, 139).mirror().addBox(0.6958F, 0.2721F, -13.5997F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, -0.0373F, -0.0732F, 0.3338F));

		PartDefinition cube_r311 = rightFace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(71, 127).mirror().addBox(0.8208F, -2.2717F, -13.9972F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, 0.207F, -0.0732F, 0.3338F));

		PartDefinition cube_r312 = rightFace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(66, 114).mirror().addBox(-0.4397F, -0.0137F, -12.681F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, 0.0211F, -0.1783F, 0.3033F));

		PartDefinition cube_r313 = rightFace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(139, 57).mirror().addBox(0.8208F, 2.0109F, -12.2905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, -0.142F, -0.0732F, 0.3338F));

		PartDefinition cube_r314 = rightFace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(125, 73).mirror().addBox(-0.4397F, 4.5661F, -10.8379F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, -0.3716F, -0.1783F, 0.3033F));

		PartDefinition cube_r315 = rightFace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(50, 139).mirror().addBox(-0.4397F, 8.6701F, 2.9469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, -1.7678F, -0.1783F, 0.3033F));

		PartDefinition cube_r316 = rightFace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(139, 72).mirror().addBox(0.8208F, -10.4581F, 9.772F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, 2.4323F, -0.0732F, 0.3338F));

		PartDefinition cube_r317 = rightFace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(140, 3).mirror().addBox(0.8208F, 4.1876F, 12.3634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, -2.76F, -0.0732F, 0.3338F));

		PartDefinition cube_r318 = rightFace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(131, 136).mirror().addBox(0.8208F, 11.3974F, 0.5234F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, -1.6256F, -0.0732F, 0.3338F));

		PartDefinition cube_r319 = rightFace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(19, 26).mirror().addBox(-0.4397F, 7.4983F, -1.8241F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, -1.4188F, -0.1783F, 0.3033F));

		PartDefinition cube_r320 = rightFace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(100, 121).mirror().addBox(-0.4397F, 7.4707F, -0.8453F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, -1.4624F, -0.1783F, 0.3033F));

		PartDefinition cube_r321 = rightFace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(45, 62).mirror().addBox(-0.3051F, -5.4441F, -1.9284F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(127, 107).mirror().addBox(-0.3051F, -4.4441F, -1.8034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(127, 103).mirror().addBox(-0.3051F, -3.4441F, -1.6284F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9748F, 0.0275F, -10.2735F, -1.7584F, -0.2476F, 0.0888F));

		PartDefinition cube_r322 = rightFace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(130, 77).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.0427F, -0.1126F, -15.1239F, -1.4598F, -0.0593F, -0.0148F));

		PartDefinition cube_r323 = rightFace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(49, 130).mirror().addBox(-0.263F, 4.0833F, -1.2816F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(139, 82).mirror().addBox(-0.263F, 2.3841F, -1.413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9748F, 0.0275F, -10.2735F, -1.4685F, -0.0732F, 0.1156F));

		PartDefinition cube_r324 = rightFace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(94, 130).mirror().addBox(-0.263F, 3.3258F, -1.7149F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9748F, 0.0275F, -10.2735F, -1.4161F, -0.0732F, 0.1156F));

		PartDefinition cube_r325 = rightFace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(139, 79).mirror().addBox(-0.4117F, 1.5184F, -0.6188F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(128, 8).mirror().addBox(-0.3867F, 0.5184F, -1.0188F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9748F, 0.0275F, -10.2735F, -1.8725F, -0.1783F, 0.0851F));

		PartDefinition cube_r326 = rightFace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(128, 4).mirror().addBox(-0.4367F, -0.5337F, -0.8986F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9748F, 0.0275F, -10.2735F, -1.6718F, -0.1783F, 0.0851F));

		PartDefinition cube_r327 = rightFace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(70, 131).mirror().addBox(-0.4367F, -1.5636F, -0.9856F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9748F, 0.0275F, -10.2735F, -1.5846F, -0.1783F, 0.0851F));

		PartDefinition cube_r328 = rightFace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(128, 0).mirror().addBox(-0.3051F, -2.4163F, -1.8348F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9748F, 0.0275F, -10.2735F, -1.8108F, -0.2476F, 0.0888F));

		PartDefinition cube_r329 = rightFace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(122, 115).mirror().addBox(-0.9748F, 5.3647F, 2.0476F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, -1.8457F, -0.2476F, 0.3069F));

		PartDefinition cube_r330 = rightFace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(55, 137).mirror().addBox(-0.5175F, -0.644F, -0.6758F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0768F, -2.4963F, -6.6494F, -3.078F, -0.2963F, 0.1055F));

		PartDefinition cube_r331 = rightFace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(37, 137).mirror().addBox(-0.5183F, -0.427F, -0.6469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0768F, -2.4963F, -6.6494F, 2.926F, -0.2963F, 0.1055F));

		PartDefinition cube_r332 = rightFace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(139, 95).mirror().addBox(-0.675F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(139, 92).mirror().addBox(-0.5F, -0.725F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.1802F, -2.5076F, -6.9382F, -1.5683F, -0.2963F, 0.1055F));

		PartDefinition cube_r333 = rightFace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(137, 12).mirror().addBox(-0.5089F, -0.3181F, -0.3346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0768F, -2.4963F, -6.6494F, -2.31F, -0.2963F, 0.1055F));

		PartDefinition cube_r334 = rightFace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(86, 119).mirror().addBox(-0.9748F, 3.7357F, 0.1018F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, -1.6712F, -0.2476F, 0.3069F));

		PartDefinition cube_r335 = rightFace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(42, 128).mirror().addBox(-0.975F, 1.8969F, -5.3473F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, -0.4908F, -0.2438F, -0.0539F));

		PartDefinition cube_r336 = rightFace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(86, 139).mirror().addBox(-0.975F, 4.8039F, 3.2836F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, -2.2187F, -0.2438F, -0.0539F));

		PartDefinition cube_r337 = rightFace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(119, 0).mirror().addBox(-0.3877F, 1.6139F, 8.0098F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, -2.8595F, -0.1741F, -0.0531F));

		PartDefinition cube_r338 = rightFace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(128, 45).mirror().addBox(-0.975F, 0.7905F, 6.2369F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, -2.9604F, -0.2438F, -0.0539F));

		PartDefinition cube_r339 = rightFace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(139, 63).mirror().addBox(-0.975F, 5.6377F, -0.6392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, -1.6078F, -0.2438F, -0.0539F));

		PartDefinition cube_r340 = rightFace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(50, 118).mirror().addBox(-0.0904F, -0.0796F, 0.017F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, -1.6479F, -0.0395F, 0.2977F));

		PartDefinition cube_r341 = rightFace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(57, 123).mirror().addBox(-0.9748F, 3.5383F, 1.8097F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, -1.8021F, -0.2476F, 0.3069F));

		PartDefinition cube_r342 = rightFace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(119, 5).mirror().addBox(-0.8456F, -0.4186F, -7.1967F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, -0.009F, -0.2269F, 0.002F));

		PartDefinition cube_r343 = rightFace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(128, 49).mirror().addBox(-0.3194F, -0.3516F, -4.2747F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.017F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, -0.0263F, -0.1047F, 0.0028F));

		PartDefinition cube_r344 = rightFace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(125, 69).mirror().addBox(-0.0904F, 2.5542F, 2.3636F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, -1.9446F, -0.0395F, 0.2977F));

		PartDefinition cube_r345 = rightFace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(127, 60).mirror().addBox(-0.0904F, 1.9963F, 2.0727F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(12, 127).mirror().addBox(-0.0904F, 1.3963F, 2.0727F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, -1.8399F, -0.0395F, 0.2977F));

		PartDefinition cube_r346 = rightFace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(122, 120).mirror().addBox(-0.0904F, 0.4029F, 1.5726F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, -1.5781F, -0.0395F, 0.2977F));

		PartDefinition cube_r347 = rightFace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(22, 111).mirror().addBox(-1.1F, 0.0F, -3.8F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4816F, -1.4103F, -8.4172F, -0.0959F, -0.1423F, 0.0019F));

		PartDefinition cube_r348 = rightFace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(107, 109).mirror().addBox(-2.2F, -1.0F, -3.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4548F, 0.2981F, -4.6648F, -0.1853F, -0.1836F, 0.0214F));

		PartDefinition cube_r349 = rightFace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(136, 36).mirror().addBox(-0.0904F, -1.7108F, 2.6115F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, -1.6653F, -0.0395F, 0.2977F));

		PartDefinition cube_r350 = rightFace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(118, 106).mirror().addBox(-0.0904F, 0.0758F, 0.4635F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9653F, -2.5782F, -0.6923F, -1.4035F, -0.0395F, 0.2977F));

		PartDefinition lower_jaw = head.addOrReplaceChild("lower_jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.5901F, 1.2077F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r351 = lower_jaw.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(112, 138).mirror().addBox(-0.115F, -0.8695F, -0.8408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.9824F, 2.8866F, -15.0501F, 0.1676F, -0.4143F, -0.0378F));

		PartDefinition cube_r352 = lower_jaw.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(139, 133).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.1825F, 2.2848F, -15.5905F, 0.4463F, 0.5447F, 0.2824F));

		PartDefinition cube_r353 = lower_jaw.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(139, 130).mirror().addBox(-0.09F, -1.3494F, -0.5353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.9824F, 2.8866F, -15.0501F, 0.4032F, -0.4143F, -0.0378F));

		PartDefinition cube_r354 = lower_jaw.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(136, 136).mirror().addBox(0.0296F, -1.3541F, -1.1125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.2824F, 2.4866F, -13.6501F, 0.3079F, -0.205F, -0.0353F));

		PartDefinition cube_r355 = lower_jaw.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(136, 110).mirror().addBox(-0.8449F, -1.1859F, -2.1077F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6824F, 1.7866F, -11.7501F, 0.1745F, -0.1353F, -0.0349F));

		PartDefinition cube_r356 = lower_jaw.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(107, 138).mirror().addBox(-0.8449F, -0.8987F, -1.1267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6824F, 1.7866F, -11.7501F, 0.0524F, -0.1353F, -0.0349F));

		PartDefinition cube_r357 = lower_jaw.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(102, 138).mirror().addBox(-0.2035F, -1.4839F, -2.3574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(60, 138).mirror().addBox(-0.2035F, -1.4839F, -3.3574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(138, 40).mirror().addBox(-0.2035F, -1.4839F, -1.3574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.9824F, 1.7866F, -8.6501F, 0.1745F, -0.2051F, 0.0F));

		PartDefinition cube_r358 = lower_jaw.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(97, 137).mirror().addBox(0.0093F, -2.1365F, -4.0586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(137, 89).mirror().addBox(0.0093F, -2.0865F, -3.0586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(81, 137).mirror().addBox(0.0093F, -2.0365F, -2.0586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(128, 85).mirror().addBox(0.0093F, -1.5365F, -2.0586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-3.0824F, 1.7866F, -5.0501F, 0.1745F, -0.24F, 0.0F));

		PartDefinition cube_r359 = lower_jaw.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(26, 130).mirror().addBox(0.0093F, -1.1337F, -4.0104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false)
				.texOffs(63, 129).mirror().addBox(0.0093F, -1.6087F, -3.9605F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0824F, 1.7866F, -5.0501F, 0.2182F, -0.24F, 0.0F));

		PartDefinition cube_r360 = lower_jaw.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(19, 130).mirror().addBox(-0.1204F, -0.6913F, -1.6167F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(129, 119).mirror().addBox(-0.1204F, -0.1913F, -1.9167F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.2824F, 2.4866F, -13.6501F, 0.1596F, -0.205F, -0.0353F));

		PartDefinition cube_r361 = lower_jaw.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(140, 0).mirror().addBox(-0.115F, -0.2511F, -1.1843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false)
				.texOffs(0, 140).mirror().addBox(-0.115F, -0.2511F, -0.7843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.9824F, 2.8866F, -15.0501F, -0.5305F, -0.4143F, -0.0378F));

		PartDefinition cube_r362 = lower_jaw.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(137, 76).mirror().addBox(-0.995F, 0.1272F, -1.0328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(129, 115).mirror().addBox(-0.995F, 0.1272F, -2.1328F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-0.6824F, 1.7866F, -11.7501F, 0.192F, -0.1353F, -0.0349F));

		PartDefinition cube_r363 = lower_jaw.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(130, 12).mirror().addBox(-0.3535F, -0.6338F, -3.6133F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)).mirror(false), PartPose.offsetAndRotation(-1.9824F, 1.7866F, -8.6501F, 0.2007F, -0.2051F, 0.0F));

		PartDefinition cube_r364 = lower_jaw.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(129, 127).mirror().addBox(-0.3535F, -0.5796F, -1.9268F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(129, 111).mirror().addBox(-0.3535F, -0.0796F, -1.9268F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-1.9824F, 1.7866F, -8.6501F, 0.0698F, -0.2051F, 0.0F));

		PartDefinition cube_r365 = lower_jaw.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(129, 123).mirror().addBox(-0.995F, -0.1228F, -1.8328F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.6433F, 1.5479F, -12.0986F, 0.2225F, -0.1353F, -0.0349F));

		PartDefinition cube_r366 = lower_jaw.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(122, 129).mirror().addBox(-0.1204F, -0.7038F, -1.8693F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.2824F, 2.4866F, -13.6501F, 0.2468F, -0.205F, -0.0353F));

		PartDefinition cube_r367 = lower_jaw.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(115, 129).mirror().addBox(-0.3535F, -0.6749F, -1.8885F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.6456F, 2.5037F, -10.2695F, 0.0873F, -0.2051F, 0.0F));

		PartDefinition cube_r368 = lower_jaw.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(87, 130).mirror().addBox(-0.3535F, -1.0647F, -3.6661F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.9824F, 1.7866F, -8.6501F, 0.2094F, -0.2051F, 0.0F));

		PartDefinition cube_r369 = lower_jaw.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(108, 129).mirror().addBox(-0.3535F, -0.9665F, -2.0076F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-1.9824F, 1.7866F, -8.6501F, 0.1571F, -0.2051F, 0.0F));

		PartDefinition cube_r370 = lower_jaw.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(129, 53).mirror().addBox(0.0093F, -0.0078F, -3.8601F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.0824F, 1.7866F, -5.0501F, -0.0567F, -0.24F, 0.0F));

		PartDefinition cube_r371 = lower_jaw.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(5, 131).mirror().addBox(0.0093F, -0.5962F, -2.0281F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-3.0824F, 1.7866F, -5.0501F, 0.2007F, -0.24F, 0.0F));

		PartDefinition cube_r372 = lower_jaw.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(101, 128).mirror().addBox(0.0035F, -0.1711F, -1.9483F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0824F, 1.7866F, -5.0501F, 0.0408F, -0.2396F, -0.0076F));

		PartDefinition cube_r373 = lower_jaw.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(137, 69).mirror().addBox(-0.5F, -0.5508F, -5.5634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9395F, 1.5607F, 0.5562F, 0.1094F, -0.0648F, -0.0091F));

		PartDefinition cube_r374 = lower_jaw.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(56, 128).mirror().addBox(-0.5F, -0.7512F, -4.6223F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9395F, 1.5607F, 0.5562F, 0.153F, -0.0648F, -0.0091F));

		PartDefinition cube_r375 = lower_jaw.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(124, 22).mirror().addBox(-0.5F, 0.025F, -0.025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.5441F, 0.2867F, -5.4757F, 0.2793F, -0.0654F, 0.0F));

		PartDefinition cube_r376 = lower_jaw.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(136, 126).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.67F, -0.2289F, -3.5553F, 0.2618F, -0.0654F, 0.0F));

		PartDefinition cube_r377 = lower_jaw.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(136, 122).mirror().addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-2.7348F, -0.3595F, -2.566F, 0.1309F, -0.0654F, 0.0F));

		PartDefinition cube_r378 = lower_jaw.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(131, 40).mirror().addBox(-0.5F, -1.0F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-2.9201F, 1.5057F, 0.2603F, 2.09F, -0.0654F, 0.0F));

		PartDefinition cube_r379 = lower_jaw.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(10, 140).mirror().addBox(-0.5F, -0.6704F, 0.0955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.9395F, 1.5607F, 0.5562F, 2.0118F, -0.0648F, -0.0091F));

		PartDefinition cube_r380 = lower_jaw.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(94, 126).mirror().addBox(-0.5F, -0.9372F, -2.703F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.9395F, 1.5607F, 0.5562F, 0.2228F, -0.0648F, -0.0091F));

		PartDefinition cube_r381 = lower_jaw.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(140, 43).mirror().addBox(-0.5F, -0.9146F, 0.3263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-2.9395F, 1.5607F, 0.5562F, 1.0519F, -0.0648F, -0.0091F));

		PartDefinition cube_r382 = lower_jaw.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(124, 17).mirror().addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.7348F, -0.3595F, -2.566F, -0.1745F, -0.0654F, 0.0F));

		PartDefinition cube_r383 = lower_jaw.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(10, 137).mirror().addBox(-0.2563F, 0.2F, -2.112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-3.169F, -0.41F, 0.3315F, 0.0F, -0.0654F, 0.0F));

		PartDefinition cube_r384 = lower_jaw.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(129, 53).addBox(-1.0093F, -0.0078F, -3.8601F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.0824F, 1.7866F, -5.0501F, -0.0567F, 0.24F, 0.0F));

		PartDefinition cube_r385 = lower_jaw.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(101, 128).addBox(-1.0035F, -0.1711F, -1.9483F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0824F, 1.7866F, -5.0501F, 0.0408F, 0.2396F, 0.0076F));

		PartDefinition cube_r386 = lower_jaw.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(137, 69).addBox(-0.5F, -0.5508F, -5.5634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.9395F, 1.5607F, 0.5562F, 0.1094F, 0.0648F, 0.0091F));

		PartDefinition cube_r387 = lower_jaw.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(56, 128).addBox(-0.5F, -0.7512F, -4.6223F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9395F, 1.5607F, 0.5562F, 0.153F, 0.0648F, 0.0091F));

		PartDefinition cube_r388 = lower_jaw.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(94, 126).addBox(-0.5F, -0.9372F, -2.703F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.9395F, 1.5607F, 0.5562F, 0.2228F, 0.0648F, 0.0091F));

		PartDefinition cube_r389 = lower_jaw.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(131, 40).addBox(-0.5F, -1.0F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.9201F, 1.5057F, 0.2603F, 2.09F, 0.0654F, 0.0F));

		PartDefinition cube_r390 = lower_jaw.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(10, 140).addBox(-0.5F, -0.6704F, 0.0955F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9395F, 1.5607F, 0.5562F, 2.0118F, 0.0648F, 0.0091F));

		PartDefinition cube_r391 = lower_jaw.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(140, 43).addBox(-0.5F, -0.9146F, 0.3263F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.9395F, 1.5607F, 0.5562F, 1.0519F, 0.0648F, 0.0091F));

		PartDefinition cube_r392 = lower_jaw.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(5, 131).addBox(-1.0093F, -0.5962F, -2.0281F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(3.0824F, 1.7866F, -5.0501F, 0.2007F, 0.24F, 0.0F));

		PartDefinition cube_r393 = lower_jaw.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(129, 127).addBox(-0.6465F, -0.5796F, -1.9268F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(129, 111).addBox(-0.6465F, -0.0796F, -1.9268F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(1.9824F, 1.7866F, -8.6501F, 0.0698F, 0.2051F, 0.0F));

		PartDefinition cube_r394 = lower_jaw.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(130, 12).addBox(-0.6465F, -0.6338F, -3.6133F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(1.9824F, 1.7866F, -8.6501F, 0.2007F, 0.2051F, 0.0F));

		PartDefinition cube_r395 = lower_jaw.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(115, 129).addBox(-0.6465F, -0.6749F, -1.8885F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.6456F, 2.5037F, -10.2695F, 0.0873F, 0.2051F, 0.0F));

		PartDefinition cube_r396 = lower_jaw.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(140, 0).addBox(-0.885F, -0.2511F, -1.1843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(0, 140).addBox(-0.885F, -0.2511F, -0.7843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.9824F, 2.8866F, -15.0501F, -0.5305F, 0.4143F, 0.0378F));

		PartDefinition cube_r397 = lower_jaw.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(112, 138).addBox(-0.885F, -0.8695F, -0.8408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.9824F, 2.8866F, -15.0501F, 0.1676F, 0.4143F, 0.0378F));

		PartDefinition cube_r398 = lower_jaw.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(19, 130).addBox(-0.8796F, -0.6913F, -1.6167F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F))
				.texOffs(129, 119).addBox(-0.8796F, -0.1913F, -1.9167F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.2824F, 2.4866F, -13.6501F, 0.1596F, 0.205F, 0.0353F));

		PartDefinition cube_r399 = lower_jaw.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(122, 129).addBox(-0.8796F, -0.7038F, -1.8693F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.2824F, 2.4866F, -13.6501F, 0.2468F, 0.205F, 0.0353F));

		PartDefinition cube_r400 = lower_jaw.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(129, 123).addBox(-0.005F, -0.1228F, -1.8328F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.6433F, 1.5479F, -12.0986F, 0.2225F, 0.1353F, 0.0349F));

		PartDefinition cube_r401 = lower_jaw.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(137, 76).addBox(-0.005F, 0.1272F, -1.0328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(129, 115).addBox(-0.005F, 0.1272F, -2.1328F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.6824F, 1.7866F, -11.7501F, 0.192F, 0.1353F, 0.0349F));

		PartDefinition cube_r402 = lower_jaw.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(87, 130).addBox(-0.6465F, -1.0647F, -3.6661F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.9824F, 1.7866F, -8.6501F, 0.2094F, 0.2051F, 0.0F));

		PartDefinition cube_r403 = lower_jaw.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(108, 129).addBox(-0.6465F, -0.9665F, -2.0076F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(1.9824F, 1.7866F, -8.6501F, 0.1571F, 0.2051F, 0.0F));

		PartDefinition cube_r404 = lower_jaw.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(26, 130).addBox(-1.0093F, -1.1337F, -4.0104F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F))
				.texOffs(63, 129).addBox(-1.0093F, -1.6087F, -3.9605F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0824F, 1.7866F, -5.0501F, 0.2182F, 0.24F, 0.0F));

		PartDefinition cube_r405 = lower_jaw.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(102, 138).addBox(-0.7965F, -1.4839F, -2.3574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(60, 138).addBox(-0.7965F, -1.4839F, -3.3574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(138, 40).addBox(-0.7965F, -1.4839F, -1.3574F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.9824F, 1.7866F, -8.6501F, 0.1745F, 0.2051F, 0.0F));

		PartDefinition cube_r406 = lower_jaw.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(139, 133).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1825F, 2.2848F, -15.5905F, 0.4463F, -0.5447F, -0.2824F));

		PartDefinition cube_r407 = lower_jaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(139, 130).addBox(-0.91F, -1.3494F, -0.5353F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.9824F, 2.8866F, -15.0501F, 0.4032F, 0.4143F, 0.0378F));

		PartDefinition cube_r408 = lower_jaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(136, 136).addBox(-1.0296F, -1.3541F, -1.1125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.2824F, 2.4866F, -13.6501F, 0.3079F, 0.205F, 0.0353F));

		PartDefinition cube_r409 = lower_jaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(136, 110).addBox(-0.1551F, -1.1859F, -2.1077F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6824F, 1.7866F, -11.7501F, 0.1745F, 0.1353F, 0.0349F));

		PartDefinition cube_r410 = lower_jaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(107, 138).addBox(-0.1551F, -0.8987F, -1.1267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6824F, 1.7866F, -11.7501F, 0.0524F, 0.1353F, 0.0349F));

		PartDefinition cube_r411 = lower_jaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(97, 137).addBox(-1.0093F, -2.1365F, -4.0586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(137, 89).addBox(-1.0093F, -2.0865F, -3.0586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(81, 137).addBox(-1.0093F, -2.0365F, -2.0586F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(128, 85).addBox(-1.0093F, -1.5365F, -2.0586F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(3.0824F, 1.7866F, -5.0501F, 0.1745F, 0.24F, 0.0F));

		PartDefinition cube_r412 = lower_jaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(124, 22).addBox(-0.5F, 0.025F, -0.025F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(2.5441F, 0.2867F, -5.4757F, 0.2793F, 0.0654F, 0.0F));

		PartDefinition cube_r413 = lower_jaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(136, 126).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.67F, -0.2289F, -3.5553F, 0.2618F, 0.0654F, 0.0F));

		PartDefinition cube_r414 = lower_jaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(136, 122).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(2.7348F, -0.3595F, -2.566F, 0.1309F, 0.0654F, 0.0F));

		PartDefinition cube_r415 = lower_jaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(124, 17).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.7348F, -0.3595F, -2.566F, -0.1745F, 0.0654F, 0.0F));

		PartDefinition cube_r416 = lower_jaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(10, 137).addBox(-0.7437F, 0.2F, -2.112F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(3.169F, -0.41F, 0.3315F, 0.0F, 0.0654F, 0.0F));

		return LayerDefinition.create(meshdefinition, 147, 147);
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