package fossils.fossils.client.blockentity.model.ophthalmothule;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class OphthalmothuleFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Hips;
	private final ModelPart bone2;
	private final ModelPart bone7;
	private final ModelPart BackFlipperR2;
	private final ModelPart BackFlipperMiddleR2;
	private final ModelPart BackFlipperEndR2;
	private final ModelPart BackFlipperR3;
	private final ModelPart BackFlipperMiddleR3;
	private final ModelPart BackFlipperEndR3;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Bodymiddle;
	private final ModelPart body;
	private final ModelPart Bodyfront;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart bone;
	private final ModelPart bone8;
	private final ModelPart FrontFlipperR3;
	private final ModelPart FrontFlipperMiddleR3;
	private final ModelPart FrontFlipperEndR3;
	private final ModelPart FrontFlipperR2;
	private final ModelPart FrontFlipperMiddleR2;
	private final ModelPart FrontFlipperEndR2;
	private final ModelPart neck;
	private final ModelPart Neck1;
	private final ModelPart Neck2;
	private final ModelPart Neck3;
	private final ModelPart Neck4;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Neck7;
	private final ModelPart Head;
	private final ModelPart bone3;
	private final ModelPart bone6;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone9;
	private final ModelPart bone10;
	private final ModelPart bone11;
	private final ModelPart bone12;
	private final ModelPart Lowerjaw;

	public OphthalmothuleFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Hips = this.fossil.getChild("Hips");
		this.bone2 = this.Hips.getChild("bone2");
		this.bone7 = this.Hips.getChild("bone7");
		this.BackFlipperR2 = this.Hips.getChild("BackFlipperR2");
		this.BackFlipperMiddleR2 = this.BackFlipperR2.getChild("BackFlipperMiddleR2");
		this.BackFlipperEndR2 = this.BackFlipperMiddleR2.getChild("BackFlipperEndR2");
		this.BackFlipperR3 = this.Hips.getChild("BackFlipperR3");
		this.BackFlipperMiddleR3 = this.BackFlipperR3.getChild("BackFlipperMiddleR3");
		this.BackFlipperEndR3 = this.BackFlipperMiddleR3.getChild("BackFlipperEndR3");
		this.Tail1 = this.Hips.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.Tail3 = this.Tail2.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Bodymiddle = this.Hips.getChild("Bodymiddle");
		this.body = this.Bodymiddle.getChild("body");
		this.Bodyfront = this.body.getChild("Bodyfront");
		this.body2 = this.Bodyfront.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.bone = this.chest.getChild("bone");
		this.bone8 = this.chest.getChild("bone8");
		this.FrontFlipperR3 = this.chest.getChild("FrontFlipperR3");
		this.FrontFlipperMiddleR3 = this.FrontFlipperR3.getChild("FrontFlipperMiddleR3");
		this.FrontFlipperEndR3 = this.FrontFlipperMiddleR3.getChild("FrontFlipperEndR3");
		this.FrontFlipperR2 = this.chest.getChild("FrontFlipperR2");
		this.FrontFlipperMiddleR2 = this.FrontFlipperR2.getChild("FrontFlipperMiddleR2");
		this.FrontFlipperEndR2 = this.FrontFlipperMiddleR2.getChild("FrontFlipperEndR2");
		this.neck = this.chest.getChild("neck");
		this.Neck1 = this.neck.getChild("Neck1");
		this.Neck2 = this.Neck1.getChild("Neck2");
		this.Neck3 = this.Neck2.getChild("Neck3");
		this.Neck4 = this.Neck3.getChild("Neck4");
		this.Neck5 = this.Neck4.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Neck7 = this.Neck6.getChild("Neck7");
		this.Head = this.Neck7.getChild("Head");
		this.bone3 = this.Head.getChild("bone3");
		this.bone6 = this.bone3.getChild("bone6");
		this.bone4 = this.bone3.getChild("bone4");
		this.bone5 = this.bone3.getChild("bone5");
		this.bone9 = this.Head.getChild("bone9");
		this.bone10 = this.bone9.getChild("bone10");
		this.bone11 = this.bone9.getChild("bone11");
		this.bone12 = this.bone9.getChild("bone12");
		this.Lowerjaw = this.Head.getChild("Lowerjaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Hips = fossil.addOrReplaceChild("Hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.1397F, 9.6112F, 0.0872F, -0.0038F, 0.2616F));

		PartDefinition cube_r1 = Hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(40, 87).addBox(0.0F, -1.7161F, 0.0492F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7247F, 1.8709F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(67, 68).mirror().addBox(-1.1977F, 0.0776F, -0.5031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.5157F, 2.2427F, 0.1855F, 0.353F, -0.2369F));

		PartDefinition cube_r3 = Hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(35, 87).mirror().addBox(-2.1183F, -0.4358F, -0.4942F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.5157F, 2.2427F, 0.0133F, 0.3895F, -0.7041F));

		PartDefinition cube_r4 = Hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(87, 22).mirror().addBox(-1.126F, -0.1858F, -0.9338F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, -0.6157F, 0.6427F, 0.1359F, 0.3922F, -0.272F));

		PartDefinition cube_r5 = Hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(60, 68).mirror().addBox(-2.9452F, -0.6449F, -0.9258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, -0.6157F, 0.6427F, -0.0506F, 0.4034F, -0.7459F));

		PartDefinition cube_r6 = Hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(67, 68).addBox(-0.8023F, 0.0776F, -0.5031F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.5157F, 2.2427F, 0.1855F, -0.353F, 0.2369F));

		PartDefinition cube_r7 = Hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(35, 87).addBox(1.1183F, -0.4358F, -0.4942F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.5157F, 2.2427F, 0.0133F, -0.3895F, 0.7041F));

		PartDefinition cube_r8 = Hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(87, 22).addBox(0.126F, -0.1858F, -0.9338F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1478F, -0.6157F, 0.6427F, 0.1359F, -0.3922F, 0.272F));

		PartDefinition cube_r9 = Hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(60, 68).addBox(0.9452F, -0.6449F, -0.9258F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1478F, -0.6157F, 0.6427F, -0.0506F, -0.4034F, 0.7459F));

		PartDefinition cube_r10 = Hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(27, 87).addBox(0.0F, -1.6458F, -0.0603F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(37, 32).addBox(0.0F, -0.4F, 2.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, -0.8F, -3.1F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bone2 = Hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5514F, 2.4932F, -0.3217F, 0.1745F, 0.0F, 0.0F));

		PartDefinition basin_r1 = bone2.addOrReplaceChild("basin_r1", CubeListBuilder.create().texOffs(0, 64).addBox(-0.4336F, -0.5096F, -0.2271F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6098F, -1.2374F, 1.7288F, -1.8486F, -0.2539F, -0.2156F));

		PartDefinition basin_r2 = bone2.addOrReplaceChild("basin_r2", CubeListBuilder.create().texOffs(80, 80).addBox(-0.4336F, 0.8212F, -0.3409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6098F, -1.2374F, 1.7288F, -1.1505F, -0.2539F, -0.2156F));

		PartDefinition basin_r3 = bone2.addOrReplaceChild("basin_r3", CubeListBuilder.create().texOffs(7, 68).addBox(-0.4336F, -0.9863F, -0.6217F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6098F, -1.2374F, 1.7288F, -0.7578F, -0.2539F, -0.2156F));

		PartDefinition basin_r4 = bone2.addOrReplaceChild("basin_r4", CubeListBuilder.create().texOffs(35, 81).addBox(-0.4336F, -1.7772F, -0.0626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.6098F, -1.2374F, 1.7288F, -0.1033F, -0.2539F, -0.2156F));

		PartDefinition basin_r5 = bone2.addOrReplaceChild("basin_r5", CubeListBuilder.create().texOffs(25, 81).addBox(-0.4336F, -1.7313F, 0.5698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.6098F, -1.2374F, 1.7288F, 0.2458F, -0.2539F, -0.2156F));

		PartDefinition basin_r6 = bone2.addOrReplaceChild("basin_r6", CubeListBuilder.create().texOffs(20, 81).addBox(-0.4336F, -0.7657F, 1.3948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6098F, -1.2374F, 1.7288F, 0.7258F, -0.2539F, -0.2156F));

		PartDefinition basin_r7 = bone2.addOrReplaceChild("basin_r7", CubeListBuilder.create().texOffs(38, 7).addBox(-0.4336F, -0.4934F, -1.9175F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6098F, -1.2374F, 1.7288F, 0.9003F, -0.2539F, -0.2156F));

		PartDefinition basin_r8 = bone2.addOrReplaceChild("basin_r8", CubeListBuilder.create().texOffs(32, 63).addBox(-1.0712F, -0.9309F, 2.0975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.2678F, 1.7062F, 0.2153F, 0.4202F, 0.9616F, 0.0022F));

		PartDefinition basin_r9 = bone2.addOrReplaceChild("basin_r9", CubeListBuilder.create().texOffs(39, 63).addBox(-0.9698F, -0.9309F, 2.22F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-2.2678F, 1.7062F, 0.2153F, 0.3148F, 0.7167F, -0.1383F));

		PartDefinition basin_r10 = bone2.addOrReplaceChild("basin_r10", CubeListBuilder.create().texOffs(59, 31).addBox(0.942F, -0.9309F, -0.0203F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F))
				.texOffs(51, 0).addBox(3.0869F, -0.9309F, -2.4495F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.2678F, 1.7062F, 0.2153F, 0.2643F, -0.4656F, -0.47F));

		PartDefinition basin_r11 = bone2.addOrReplaceChild("basin_r11", CubeListBuilder.create().texOffs(18, 63).addBox(-0.6204F, -0.9309F, -2.2709F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.2678F, 1.7062F, 0.2153F, 0.3409F, -0.9318F, -0.6265F));

		PartDefinition basin_r12 = bone2.addOrReplaceChild("basin_r12", CubeListBuilder.create().texOffs(44, 52).addBox(-0.1586F, -0.9309F, -0.7873F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F))
				.texOffs(61, 23).addBox(-0.1836F, -0.9309F, 1.6377F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.2678F, 1.7062F, 0.2153F, 0.2356F, 0.0F, -0.3491F));

		PartDefinition basin_r13 = bone2.addOrReplaceChild("basin_r13", CubeListBuilder.create().texOffs(81, 15).addBox(2.3756F, -0.9309F, 0.4626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-2.2678F, 1.7062F, 0.2153F, 0.2501F, 0.339F, -0.2643F));

		PartDefinition basin_r14 = bone2.addOrReplaceChild("basin_r14", CubeListBuilder.create().texOffs(0, 55).addBox(2.3464F, -0.9309F, -2.3709F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2678F, 1.7062F, 0.2153F, 0.2939F, -0.6335F, -0.5263F));

		PartDefinition basin_r15 = bone2.addOrReplaceChild("basin_r15", CubeListBuilder.create().texOffs(9, 60).addBox(2.1615F, -0.942F, -3.986F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-2.2678F, 1.7062F, 0.2153F, 0.1826F, -0.4299F, -0.4259F));

		PartDefinition basin_r16 = bone2.addOrReplaceChild("basin_r16", CubeListBuilder.create().texOffs(53, 66).addBox(3.4414F, -0.942F, -2.834F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2678F, 1.7062F, 0.2153F, 0.1658F, 0.0F, -0.3491F));

		PartDefinition basin_r17 = bone2.addOrReplaceChild("basin_r17", CubeListBuilder.create().texOffs(15, 81).addBox(2.3146F, -0.942F, -1.9382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.2678F, 1.7062F, 0.2153F, 0.1698F, 0.2151F, -0.3125F));

		PartDefinition basin_r18 = bone2.addOrReplaceChild("basin_r18", CubeListBuilder.create().texOffs(20, 59).addBox(1.5099F, -0.942F, -0.6884F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(-2.2678F, 1.7062F, 0.2153F, 0.3477F, 1.0651F, -0.042F));

		PartDefinition basin_r19 = bone2.addOrReplaceChild("basin_r19", CubeListBuilder.create().texOffs(13, 27).addBox(0.4349F, -0.942F, -4.547F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-2.2678F, 1.7062F, 0.2153F, 0.1909F, -0.5157F, -0.4441F));

		PartDefinition basin_r20 = bone2.addOrReplaceChild("basin_r20", CubeListBuilder.create().texOffs(33, 44).addBox(-2.8344F, -0.942F, -6.082F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.2678F, 1.7062F, 0.2153F, 0.455F, -1.1858F, -0.7748F));

		PartDefinition basin_r21 = bone2.addOrReplaceChild("basin_r21", CubeListBuilder.create().texOffs(44, 38).addBox(-0.1396F, -0.942F, -3.7362F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-2.2678F, 1.7062F, 0.2153F, 0.1659F, 0.0258F, -0.3447F));

		PartDefinition basin_r22 = bone2.addOrReplaceChild("basin_r22", CubeListBuilder.create().texOffs(0, 60).addBox(2.5912F, -0.942F, -2.4496F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-2.2678F, 1.7062F, 0.2153F, 0.2626F, 0.8818F, -0.1445F));

		PartDefinition basin_r23 = bone2.addOrReplaceChild("basin_r23", CubeListBuilder.create().texOffs(47, 19).addBox(1.7173F, -0.942F, -4.9495F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(-2.2678F, 1.7062F, 0.2153F, 0.1678F, 0.1549F, -0.3229F));

		PartDefinition basin_r24 = bone2.addOrReplaceChild("basin_r24", CubeListBuilder.create().texOffs(0, 46).addBox(0.5605F, -0.942F, -6.1699F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-2.2678F, 1.7062F, 0.2153F, 0.1792F, -0.387F, -0.4173F));

		PartDefinition bone7 = Hips.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5514F, 2.4932F, -0.3217F, 0.1745F, 0.0F, 0.0F));

		PartDefinition basin_r25 = bone7.addOrReplaceChild("basin_r25", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-0.5664F, -0.5096F, -0.2271F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6098F, -1.2374F, 1.7288F, -1.8486F, 0.2539F, 0.2156F));

		PartDefinition basin_r26 = bone7.addOrReplaceChild("basin_r26", CubeListBuilder.create().texOffs(80, 80).mirror().addBox(-0.5664F, 0.8212F, -0.3409F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6098F, -1.2374F, 1.7288F, -1.1505F, 0.2539F, 0.2156F));

		PartDefinition basin_r27 = bone7.addOrReplaceChild("basin_r27", CubeListBuilder.create().texOffs(7, 68).mirror().addBox(-0.5664F, -0.9863F, -0.6217F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6098F, -1.2374F, 1.7288F, -0.7578F, 0.2539F, 0.2156F));

		PartDefinition basin_r28 = bone7.addOrReplaceChild("basin_r28", CubeListBuilder.create().texOffs(35, 81).mirror().addBox(-0.5664F, -1.7772F, -0.0626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-0.6098F, -1.2374F, 1.7288F, -0.1033F, 0.2539F, 0.2156F));

		PartDefinition basin_r29 = bone7.addOrReplaceChild("basin_r29", CubeListBuilder.create().texOffs(25, 81).mirror().addBox(-0.5664F, -1.7313F, 0.5698F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)).mirror(false), PartPose.offsetAndRotation(-0.6098F, -1.2374F, 1.7288F, 0.2458F, 0.2539F, 0.2156F));

		PartDefinition basin_r30 = bone7.addOrReplaceChild("basin_r30", CubeListBuilder.create().texOffs(20, 81).mirror().addBox(-0.5664F, -0.7657F, 1.3948F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6098F, -1.2374F, 1.7288F, 0.7258F, 0.2539F, 0.2156F));

		PartDefinition basin_r31 = bone7.addOrReplaceChild("basin_r31", CubeListBuilder.create().texOffs(38, 7).mirror().addBox(-0.5664F, -0.4934F, -1.9175F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6098F, -1.2374F, 1.7288F, 0.9003F, 0.2539F, 0.2156F));

		PartDefinition basin_r32 = bone7.addOrReplaceChild("basin_r32", CubeListBuilder.create().texOffs(32, 63).mirror().addBox(0.0712F, -0.9309F, 2.0975F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.2678F, 1.7062F, 0.2153F, 0.4202F, -0.9616F, -0.0022F));

		PartDefinition basin_r33 = bone7.addOrReplaceChild("basin_r33", CubeListBuilder.create().texOffs(39, 63).mirror().addBox(-0.0302F, -0.9309F, 2.22F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(2.2678F, 1.7062F, 0.2153F, 0.3148F, -0.7167F, 0.1383F));

		PartDefinition basin_r34 = bone7.addOrReplaceChild("basin_r34", CubeListBuilder.create().texOffs(59, 31).mirror().addBox(-2.942F, -0.9309F, -0.0203F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.008F)).mirror(false)
				.texOffs(51, 0).mirror().addBox(-4.0869F, -0.9309F, -2.4495F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.2678F, 1.7062F, 0.2153F, 0.2643F, 0.4656F, 0.47F));

		PartDefinition basin_r35 = bone7.addOrReplaceChild("basin_r35", CubeListBuilder.create().texOffs(18, 63).mirror().addBox(-0.3796F, -0.9309F, -2.2709F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.2678F, 1.7062F, 0.2153F, 0.3409F, 0.9318F, 0.6265F));

		PartDefinition basin_r36 = bone7.addOrReplaceChild("basin_r36", CubeListBuilder.create().texOffs(44, 52).mirror().addBox(-0.8414F, -0.9309F, -0.7873F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(61, 23).mirror().addBox(-2.8164F, -0.9309F, 1.6377F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.2678F, 1.7062F, 0.2153F, 0.2356F, 0.0F, 0.3491F));

		PartDefinition basin_r37 = bone7.addOrReplaceChild("basin_r37", CubeListBuilder.create().texOffs(81, 15).mirror().addBox(-3.3756F, -0.9309F, 0.4626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(2.2678F, 1.7062F, 0.2153F, 0.2501F, -0.339F, 0.2643F));

		PartDefinition basin_r38 = bone7.addOrReplaceChild("basin_r38", CubeListBuilder.create().texOffs(0, 55).mirror().addBox(-3.3464F, -0.9309F, -2.3709F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2678F, 1.7062F, 0.2153F, 0.2939F, 0.6335F, 0.5263F));

		PartDefinition basin_r39 = bone7.addOrReplaceChild("basin_r39", CubeListBuilder.create().texOffs(9, 60).mirror().addBox(-4.1615F, -0.942F, -3.986F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(2.2678F, 1.7062F, 0.2153F, 0.1826F, 0.4299F, 0.4259F));

		PartDefinition basin_r40 = bone7.addOrReplaceChild("basin_r40", CubeListBuilder.create().texOffs(53, 66).mirror().addBox(-5.4414F, -0.942F, -2.834F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.2678F, 1.7062F, 0.2153F, 0.1658F, 0.0F, 0.3491F));

		PartDefinition basin_r41 = bone7.addOrReplaceChild("basin_r41", CubeListBuilder.create().texOffs(15, 81).mirror().addBox(-3.3146F, -0.942F, -1.9382F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.2678F, 1.7062F, 0.2153F, 0.1698F, -0.2151F, 0.3125F));

		PartDefinition basin_r42 = bone7.addOrReplaceChild("basin_r42", CubeListBuilder.create().texOffs(20, 59).mirror().addBox(-3.5099F, -0.942F, -0.6884F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(2.2678F, 1.7062F, 0.2153F, 0.3477F, -1.0651F, 0.042F));

		PartDefinition basin_r43 = bone7.addOrReplaceChild("basin_r43", CubeListBuilder.create().texOffs(13, 27).mirror().addBox(-3.4349F, -0.942F, -4.547F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(2.2678F, 1.7062F, 0.2153F, 0.1909F, 0.5157F, 0.4441F));

		PartDefinition basin_r44 = bone7.addOrReplaceChild("basin_r44", CubeListBuilder.create().texOffs(33, 44).mirror().addBox(0.8344F, -0.942F, -6.082F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.2678F, 1.7062F, 0.2153F, 0.455F, 1.1858F, 0.7748F));

		PartDefinition basin_r45 = bone7.addOrReplaceChild("basin_r45", CubeListBuilder.create().texOffs(44, 38).mirror().addBox(-1.8604F, -0.942F, -3.7362F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(2.2678F, 1.7062F, 0.2153F, 0.1659F, -0.0258F, 0.3447F));

		PartDefinition basin_r46 = bone7.addOrReplaceChild("basin_r46", CubeListBuilder.create().texOffs(0, 60).mirror().addBox(-4.5912F, -0.942F, -2.4496F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(2.2678F, 1.7062F, 0.2153F, 0.2626F, -0.8818F, 0.1445F));

		PartDefinition basin_r47 = bone7.addOrReplaceChild("basin_r47", CubeListBuilder.create().texOffs(47, 19).mirror().addBox(-3.7173F, -0.942F, -4.9495F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(2.2678F, 1.7062F, 0.2153F, 0.1678F, -0.1549F, 0.3229F));

		PartDefinition basin_r48 = bone7.addOrReplaceChild("basin_r48", CubeListBuilder.create().texOffs(0, 46).mirror().addBox(-2.5605F, -0.942F, -6.1699F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(2.2678F, 1.7062F, 0.2153F, 0.1792F, 0.387F, 0.4173F));

		PartDefinition BackFlipperR2 = Hips.addOrReplaceChild("BackFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.6654F, 2.5629F, 0.1577F, 0.1705F, -0.1846F, 0.9734F));

		PartDefinition cube_r12 = BackFlipperR2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(60, 12).addBox(-0.85F, 0.5F, -0.975F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5029F, -0.9811F, 0.5426F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r13 = BackFlipperR2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(14, 67).addBox(-0.7F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.7116F, 0.0189F, -0.0688F, 0.0F, 0.1222F, 0.0F));

		PartDefinition cube_r14 = BackFlipperR2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(10, 72).addBox(-1.6F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(5, 72).addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(4.1238F, 0.0189F, 0.7653F, 0.0F, 1.2566F, 0.0F));

		PartDefinition cube_r15 = BackFlipperR2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(48, 35).addBox(0.3F, -0.5F, -0.35F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(3.9304F, 0.0189F, 1.0702F, 0.0F, 2.9234F, 0.0F));

		PartDefinition cube_r16 = BackFlipperR2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(52, 71).addBox(-0.0968F, -0.5F, -1.1981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(3.2029F, 0.0189F, 1.9426F, 0.0F, 0.6545F, 0.0F));

		PartDefinition BackFlipperMiddleR2 = BackFlipperR2.addOrReplaceChild("BackFlipperMiddleR2", CubeListBuilder.create(), PartPose.offsetAndRotation(7.5819F, 0.0189F, 2.9846F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r17 = BackFlipperMiddleR2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(80, 86).addBox(-0.9F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.5976F, 0.0F, 0.5655F, 0.0F, 1.8326F, 0.0F));

		PartDefinition cube_r18 = BackFlipperMiddleR2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(75, 86).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.9635F, 0.0F, -0.3258F, 0.0F, 0.7418F, 0.0F));

		PartDefinition cube_r19 = BackFlipperMiddleR2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(59, 70).addBox(-0.5F, -0.5F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(33, 70).addBox(-0.5F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.8675F, 0.0F, 0.2352F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r20 = BackFlipperMiddleR2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(64, 70).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.9804F, 0.0F, -0.4049F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r21 = BackFlipperMiddleR2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(70, 26).addBox(-0.575F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-3.2178F, 0.0F, 0.0279F, 0.0F, 1.2217F, 0.0F));

		PartDefinition cube_r22 = BackFlipperMiddleR2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(11, 49).addBox(-0.1064F, 0.1756F, -0.4249F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5175F, -0.3213F, -0.6123F, 0.0101F, 0.113F, 0.0002F));

		PartDefinition BackFlipperEndR2 = BackFlipperMiddleR2.addOrReplaceChild("BackFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5845F, -0.163F, -0.8667F, 0.0F, -0.0262F, 0.0F));

		PartDefinition cube_r23 = BackFlipperEndR2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(21, 15).addBox(1.9497F, 0.1866F, -0.6227F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1036F, -0.1583F, 0.0406F, 0.0098F, -0.0964F, -0.0032F));

		PartDefinition BackFlipperR3 = Hips.addOrReplaceChild("BackFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.6654F, 2.5629F, 0.1577F, 0.1784F, 0.177F, -0.9298F));

		PartDefinition cube_r24 = BackFlipperR3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(29, 60).addBox(-2.15F, 0.5F, -0.975F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5029F, -0.9811F, 0.5426F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r25 = BackFlipperR3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(21, 67).addBox(-1.3F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-2.7116F, 0.0189F, -0.0688F, 0.0F, -0.1222F, 0.0F));

		PartDefinition cube_r26 = BackFlipperR3.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(73, 48).addBox(0.6F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.015F))
				.texOffs(73, 41).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(-4.1238F, 0.0189F, 0.7653F, 0.0F, -1.2566F, 0.0F));

		PartDefinition cube_r27 = BackFlipperR3.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(50, 28).addBox(-4.3F, -0.5F, -0.35F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-3.9304F, 0.0189F, 1.0702F, 0.0F, -2.9234F, 0.0F));

		PartDefinition cube_r28 = BackFlipperR3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(30, 73).addBox(-0.9032F, -0.5F, -1.1981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(-3.2029F, 0.0189F, 1.9426F, 0.0F, -0.6545F, 0.0F));

		PartDefinition BackFlipperMiddleR3 = BackFlipperR3.addOrReplaceChild("BackFlipperMiddleR3", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.5819F, 0.0189F, 2.9846F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r29 = BackFlipperMiddleR3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(10, 87).addBox(-0.1F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.5976F, 0.0F, 0.5655F, 0.0F, -1.8326F, 0.0F));

		PartDefinition cube_r30 = BackFlipperMiddleR3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(5, 87).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(3.9635F, 0.0F, -0.3258F, 0.0F, -0.7418F, 0.0F));

		PartDefinition cube_r31 = BackFlipperMiddleR3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(71, 35).addBox(-0.5F, -0.5F, 0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(0, 71).addBox(-0.5F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.8675F, 0.0F, 0.2352F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r32 = BackFlipperMiddleR3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(71, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.9804F, 0.0F, -0.4049F, 0.0F, -0.5672F, 0.0F));

		PartDefinition cube_r33 = BackFlipperMiddleR3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(69, 70).addBox(-0.425F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(3.2178F, 0.0F, 0.0279F, 0.0F, -1.2217F, 0.0F));

		PartDefinition cube_r34 = BackFlipperMiddleR3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(50, 24).addBox(-1.8936F, 0.1756F, -0.4249F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5175F, -0.3213F, -0.6123F, 0.0101F, -0.113F, -0.0002F));

		PartDefinition BackFlipperEndR3 = BackFlipperMiddleR3.addOrReplaceChild("BackFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5845F, -0.163F, -0.8667F, 0.0F, 0.0262F, 0.0F));

		PartDefinition cube_r35 = BackFlipperEndR3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 23).addBox(-7.9497F, 0.1866F, -0.6227F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1036F, -0.1583F, 0.0406F, 0.0098F, 0.0964F, 0.0032F));

		PartDefinition Tail1 = Hips.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, -0.2606F, -0.0485F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.625F, 3.0F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r36 = Tail1.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(79, 89).addBox(0.0F, -0.4246F, 0.0233F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6668F, 0.9669F, 0.5585F, 0.0F, 0.0F));

		PartDefinition cube_r37 = Tail1.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(14, 64).addBox(0.0F, 0.0997F, -0.0162F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6668F, 2.8669F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r38 = Tail1.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(29, 54).addBox(0.0F, -1.2488F, -0.0261F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.107F, 2.9749F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r39 = Tail1.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(89, 65).addBox(0.0F, -1.3739F, -0.0262F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2117F, 0.9777F, -0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r40 = Tail1.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(49, 6).mirror().addBox(-1.7F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.2394F, 0.9515F, 0.0F, 0.0698F, 0.0F));

		PartDefinition cube_r41 = Tail1.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(49, 6).addBox(-0.3F, 0.0F, 0.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.2394F, 0.9515F, 0.0F, -0.0698F, 0.0F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(11, 53).addBox(-0.5F, -0.9509F, 0.0452F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.7003F, 3.9057F, -0.1483F, 0.0F, 0.0F));

		PartDefinition cube_r42 = Tail2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(10, 90).addBox(0.0F, -0.2237F, 0.0394F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0785F, 1.0893F, 0.5149F, 0.0F, 0.0F));

		PartDefinition cube_r43 = Tail2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(82, 89).addBox(0.0F, -0.9904F, 0.0531F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8605F, 0.9921F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r44 = Tail2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(69, 4).mirror().addBox(-1.7F, 0.4096F, 0.0531F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8605F, 0.9921F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r45 = Tail2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(69, 4).addBox(-0.3F, 0.4096F, 0.0531F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8605F, 0.9921F, 0.0F, -0.0873F, 0.0F));

		PartDefinition Tail3 = Tail2.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(22, 38).addBox(-0.5F, -0.6014F, 0.0445F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3569F, 2.9894F, -0.0604F, 0.0F, 0.0F));

		PartDefinition cube_r46 = Tail3.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(90, 30).addBox(0.0F, -0.6154F, -0.0469F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4128F, 2.1021F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r47 = Tail3.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(90, 27).addBox(0.0F, -0.9154F, -0.0469F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2828F, 0.0964F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r48 = Tail3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(90, 24).addBox(0.0F, 1.5F, 11.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1434F, -9.5028F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r49 = Tail3.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(90, 18).addBox(0.0F, -0.5009F, 0.0273F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4434F, -0.0028F, 0.4102F, 0.0F, 0.0F));

		PartDefinition cube_r50 = Tail3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(40, 59).mirror().addBox(-0.7F, 0.0F, -1.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1014F, 1.0445F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r51 = Tail3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(40, 59).addBox(-0.3F, 0.0F, -1.0F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1014F, 1.0445F, 0.0F, -0.1745F, 0.0F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(33, 53).addBox(-0.5F, -0.6014F, 0.0445F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0032F, 3.8991F, -0.1657F, 0.0F, 0.0F));

		PartDefinition cube_r52 = Tail4.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(90, 69).addBox(0.0F, 2.475F, 15.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.1434F, -15.4028F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r53 = Tail4.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(68, 90).addBox(0.0F, -0.5154F, 0.0531F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3802F, 0.0033F, -0.0611F, 0.0F, 0.0F));

		PartDefinition Bodymiddle = Hips.addOrReplaceChild("Bodymiddle", CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, -0.6F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4539F, -0.9251F, -0.1287F, 0.0132F, -0.0039F));

		PartDefinition cube_r54 = Bodymiddle.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(18, 87).addBox(0.0F, -1.725F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6F, -1.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r55 = Bodymiddle.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(33, 89).addBox(0.5F, -1.875F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5F, -3.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r56 = Bodymiddle.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(67, 62).mirror().addBox(-4.0176F, -1.5829F, -1.183F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4478F, -0.0618F, -0.4322F, 0.0906F, 0.4686F, -0.6791F));

		PartDefinition cube_r57 = Bodymiddle.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(70, 29).mirror().addBox(-2.4924F, -0.5832F, -1.2005F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.4478F, -0.0618F, -0.4322F, 0.2914F, 0.3917F, -0.2055F));

		PartDefinition cube_r58 = Bodymiddle.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(66, 49).mirror().addBox(-4.7387F, -2.3443F, -0.4587F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.2132F, -2.5322F, -0.2999F, 0.1583F, -1.0677F));

		PartDefinition cube_r59 = Bodymiddle.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(26, 70).mirror().addBox(-3.5117F, -0.8148F, -0.4587F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.2132F, -2.5322F, -0.1946F, 0.2781F, -0.5911F));

		PartDefinition cube_r60 = Bodymiddle.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(66, 43).mirror().addBox(-1.7147F, -0.0997F, -0.4712F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.2132F, -2.5322F, -0.0541F, 0.341F, -0.1373F));

		PartDefinition cube_r61 = Bodymiddle.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(53, 64).mirror().addBox(-2.8436F, 0.0176F, -0.4289F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1382F, -4.5322F, -0.1933F, 0.3456F, -0.1896F));

		PartDefinition cube_r62 = Bodymiddle.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(70, 24).mirror().addBox(-4.5841F, -1.1855F, -0.4079F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1382F, -4.5322F, -0.3188F, 0.2257F, -0.6275F));

		PartDefinition cube_r63 = Bodymiddle.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(69, 66).mirror().addBox(-5.5187F, -3.1683F, -0.4079F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1382F, -4.5322F, -0.3843F, 0.0575F, -1.0822F));

		PartDefinition cube_r64 = Bodymiddle.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(67, 62).addBox(2.0176F, -1.5829F, -1.183F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4478F, -0.0618F, -0.4322F, 0.0906F, -0.4686F, 0.6791F));

		PartDefinition cube_r65 = Bodymiddle.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(70, 29).addBox(1.4924F, -0.5832F, -1.2005F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4478F, -0.0618F, -0.4322F, 0.2914F, -0.3917F, 0.2055F));

		PartDefinition cube_r66 = Bodymiddle.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(73, 89).addBox(0.5F, -1.85F, -0.1F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5F, -4.9F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r67 = Bodymiddle.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(66, 49).addBox(2.7387F, -2.3443F, -0.4587F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.2132F, -2.5322F, -0.2999F, -0.1583F, 1.0677F));

		PartDefinition cube_r68 = Bodymiddle.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(26, 70).addBox(1.5117F, -0.8148F, -0.4587F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.2132F, -2.5322F, -0.1946F, -0.2781F, 0.5911F));

		PartDefinition cube_r69 = Bodymiddle.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(66, 43).addBox(-0.2853F, -0.0997F, -0.4712F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.2132F, -2.5322F, -0.0541F, -0.341F, 0.1373F));

		PartDefinition cube_r70 = Bodymiddle.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(53, 64).addBox(-0.1564F, 0.0176F, -0.4289F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1382F, -4.5322F, -0.1933F, -0.3456F, 0.1896F));

		PartDefinition cube_r71 = Bodymiddle.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(70, 24).addBox(2.5841F, -1.1855F, -0.4079F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1382F, -4.5322F, -0.3188F, -0.2257F, 0.6275F));

		PartDefinition cube_r72 = Bodymiddle.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(69, 66).addBox(3.5187F, -3.1683F, -0.4079F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1382F, -4.5322F, -0.3843F, -0.0575F, 1.0822F));

		PartDefinition body = Bodymiddle.addOrReplaceChild("body", CubeListBuilder.create().texOffs(25, 8).addBox(-0.5F, -0.1F, -5.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -4.9F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(21, 87).addBox(0.5F, -1.85F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -2.1F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(87, 69).addBox(0.5F, -1.825F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -4.1F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r75 = body.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(69, 6).mirror().addBox(-6.0539F, -3.993F, -0.349F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.6132F, -1.7322F, -0.3428F, 0.0569F, -1.1586F));

		PartDefinition cube_r76 = body.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(19, 70).mirror().addBox(-5.4396F, -1.6699F, -0.349F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.6132F, -1.7322F, -0.281F, 0.2068F, -0.6982F));

		PartDefinition cube_r77 = body.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(53, 57).mirror().addBox(-3.8241F, -0.0598F, -0.3771F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.6132F, -1.7322F, -0.1665F, 0.3128F, -0.2597F));

		PartDefinition cube_r78 = body.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(59, 35).mirror().addBox(-3.8243F, -0.0388F, -0.3982F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.4882F, -3.7322F, -0.097F, 0.3354F, -0.2421F));

		PartDefinition cube_r79 = body.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(52, 69).mirror().addBox(-5.4488F, -1.651F, -0.3701F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.4882F, -3.7322F, -0.2299F, 0.2555F, -0.691F));

		PartDefinition cube_r80 = body.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(61, 29).mirror().addBox(-7.0708F, -3.9804F, -0.3701F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.4882F, -3.7322F, -0.3201F, 0.1227F, -1.1611F));

		PartDefinition cube_r81 = body.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(69, 6).addBox(4.0539F, -3.993F, -0.349F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.6132F, -1.7322F, -0.3428F, -0.0569F, 1.1586F));

		PartDefinition cube_r82 = body.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(19, 70).addBox(3.4396F, -1.6699F, -0.349F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.6132F, -1.7322F, -0.281F, -0.2068F, 0.6982F));

		PartDefinition cube_r83 = body.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(53, 57).addBox(-0.1759F, -0.0598F, -0.3771F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.6132F, -1.7322F, -0.1665F, -0.3128F, 0.2597F));

		PartDefinition cube_r84 = body.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(59, 35).addBox(-0.1757F, -0.0388F, -0.3982F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.4882F, -3.7322F, -0.097F, -0.3354F, 0.2421F));

		PartDefinition cube_r85 = body.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(52, 69).addBox(3.4488F, -1.651F, -0.3701F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.4882F, -3.7322F, -0.2299F, -0.2555F, 0.691F));

		PartDefinition cube_r86 = body.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(61, 29).addBox(4.0708F, -3.9804F, -0.3701F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.4882F, -3.7322F, -0.3201F, -0.1227F, 1.1611F));

		PartDefinition cube_r87 = body.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -0.1016F, -0.4302F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.5271F, -3.9408F, 0.1833F, 0.0F, 0.0F));

		PartDefinition Bodyfront = body.addOrReplaceChild("Bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4F, -5.05F, 0.0218F, 0.0F, 0.0F));

		PartDefinition cube_r88 = Bodyfront.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(36, 89).addBox(0.5F, -1.7F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.4741F, -1.024F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r89 = Bodyfront.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(24, 87).addBox(0.5F, -1.575F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.5043F, -3.0263F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r90 = Bodyfront.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(49, 59).mirror().addBox(-8.0724F, -3.9792F, -0.3719F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.1382F, -0.6822F, -0.3035F, 0.1729F, -1.1411F));

		PartDefinition cube_r91 = Bodyfront.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(69, 51).mirror().addBox(-5.4497F, -1.6492F, -0.3719F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.1382F, -0.6822F, -0.191F, 0.2927F, -0.6628F));

		PartDefinition cube_r92 = Bodyfront.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(29, 58).mirror().addBox(-3.8243F, -0.0368F, -0.4F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.1382F, -0.6822F, -0.044F, 0.3525F, -0.2066F));

		PartDefinition cube_r93 = Bodyfront.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(42, 57).mirror().addBox(-8.0724F, -3.9792F, -0.3719F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.1882F, -2.5822F, -0.2736F, 0.2363F, -1.135F));

		PartDefinition cube_r94 = Bodyfront.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(69, 20).mirror().addBox(-5.4497F, -1.6492F, -0.3719F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.1882F, -2.5822F, -0.1327F, 0.3352F, -0.6448F));

		PartDefinition cube_r95 = Bodyfront.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(55, 49).mirror().addBox(-3.8243F, -0.0368F, -0.4F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3522F, 0.1882F, -2.5822F, 0.0292F, 0.3659F, -0.1809F));

		PartDefinition cube_r96 = Bodyfront.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(49, 59).addBox(4.0724F, -3.9792F, -0.3719F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.1382F, -0.6822F, -0.3035F, -0.1729F, 1.1411F));

		PartDefinition cube_r97 = Bodyfront.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(69, 51).addBox(3.4497F, -1.6492F, -0.3719F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.1382F, -0.6822F, -0.191F, -0.2927F, 0.6628F));

		PartDefinition cube_r98 = Bodyfront.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(29, 58).addBox(-0.1757F, -0.0368F, -0.4F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.1382F, -0.6822F, -0.044F, -0.3525F, 0.2066F));

		PartDefinition cube_r99 = Bodyfront.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(42, 57).addBox(4.0724F, -3.9792F, -0.3719F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.1882F, -2.5822F, -0.2736F, -0.2363F, 1.135F));

		PartDefinition cube_r100 = Bodyfront.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(69, 20).addBox(3.4497F, -1.6492F, -0.3719F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.1882F, -2.5822F, -0.1327F, -0.3352F, 0.6448F));

		PartDefinition cube_r101 = Bodyfront.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(55, 49).addBox(-0.1757F, -0.0368F, -0.4F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3522F, 0.1882F, -2.5822F, 0.0292F, -0.3659F, 0.1809F));

		PartDefinition cube_r102 = Bodyfront.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(0, 8).addBox(-4.0F, -0.08F, -4.1068F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 6.1499F, 0.9752F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r103 = Bodyfront.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(51, 10).addBox(0.0F, -0.6F, 3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.3F, -6.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition body2 = Bodyfront.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3522F, 0.0821F, -2.9325F, -0.0131F, 0.0F, 0.0F));

		PartDefinition cube_r104 = body2.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(60, 2).mirror().addBox(-8.0871F, -3.9673F, -0.3933F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9045F, 0.05F, -1.6F, -0.2571F, 0.2671F, -1.1495F));

		PartDefinition cube_r105 = body2.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(51, 17).mirror().addBox(-3.8236F, -0.018F, -0.4214F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9045F, 0.05F, -1.6F, 0.0661F, 0.3706F, -0.1863F));

		PartDefinition cube_r106 = body2.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(69, 64).mirror().addBox(-5.4572F, -1.6318F, -0.3933F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9045F, 0.05F, -1.6F, -0.1022F, 0.3547F, -0.6532F));

		PartDefinition cube_r107 = body2.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(60, 2).addBox(4.0871F, -3.9673F, -0.3933F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.05F, -1.6F, -0.2571F, -0.2671F, 1.1495F));

		PartDefinition cube_r108 = body2.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(53, 52).addBox(0.0F, -0.6F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.8522F, 0.2118F, -3.0178F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r109 = body2.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(89, 55).addBox(0.5F, -1.675F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.8522F, -0.4227F, -2.0394F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r110 = body2.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(51, 17).addBox(-0.1764F, -0.018F, -0.4214F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.05F, -1.6F, 0.0661F, -0.3706F, 0.1863F));

		PartDefinition cube_r111 = body2.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(69, 64).addBox(3.4572F, -1.6318F, -0.3933F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, 0.05F, -1.6F, -0.1022F, -0.3547F, 0.6532F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8522F, 0.1057F, -2.9682F, 0.1265F, 0.0F, 0.0F));

		PartDefinition cube_r112 = body3.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(68, 31).mirror().addBox(-5.4567F, -1.6329F, -0.3903F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, 0.0943F, -0.7318F, -0.1519F, 0.3027F, -0.6622F));

		PartDefinition cube_r113 = body3.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(-8.0861F, -3.968F, -0.3903F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, 0.0943F, -0.7318F, -0.2746F, 0.199F, -1.1466F));

		PartDefinition cube_r114 = body3.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(9, 58).mirror().addBox(-8.0933F, -3.9619F, -0.4019F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, 0.0943F, -2.7318F, -0.2629F, 0.2319F, -1.1457F));

		PartDefinition cube_r115 = body3.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(51, 15).mirror().addBox(-3.823F, -0.0098F, -0.43F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, 0.0943F, -2.7318F, 0.0319F, 0.3549F, -0.1931F));

		PartDefinition cube_r116 = body3.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(12, 70).mirror().addBox(-5.4602F, -1.6242F, -0.4019F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, 0.0943F, -2.7318F, -0.1251F, 0.3264F, -0.6556F));

		PartDefinition cube_r117 = body3.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(55, 43).mirror().addBox(-3.8236F, -0.0192F, -0.4184F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1478F, 0.0943F, -0.7318F, -0.0036F, 0.345F, -0.2037F));

		PartDefinition cube_r118 = body3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(68, 31).addBox(3.4567F, -1.6329F, -0.3903F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, 0.0943F, -0.7318F, -0.1519F, -0.3027F, 0.6622F));

		PartDefinition cube_r119 = body3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(60, 0).addBox(4.0861F, -3.968F, -0.3903F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, 0.0943F, -0.7318F, -0.2746F, -0.199F, 1.1466F));

		PartDefinition cube_r120 = body3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(9, 58).addBox(4.0933F, -3.9619F, -0.4019F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, 0.0943F, -2.7318F, -0.2629F, -0.2319F, 1.1457F));

		PartDefinition cube_r121 = body3.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(51, 15).addBox(-0.177F, -0.0098F, -0.43F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, 0.0943F, -2.7318F, 0.0319F, -0.3549F, 0.1931F));

		PartDefinition cube_r122 = body3.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(12, 70).addBox(3.4602F, -1.6242F, -0.4019F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, 0.0943F, -2.7318F, -0.1251F, -0.3264F, 0.6556F));

		PartDefinition cube_r123 = body3.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(30, 88).addBox(0.5F, -1.6F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4647F, -1.0203F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r124 = body3.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(87, 18).addBox(0.5F, -1.45F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3949F, -3.0191F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r125 = body3.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(55, 43).addBox(-0.1764F, -0.0192F, -0.4184F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8522F, 0.0943F, -0.7318F, -0.0036F, -0.345F, 0.2037F));

		PartDefinition cube_r126 = body3.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(22, 44).addBox(0.0F, -0.6F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.1F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1256F, -3.901F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r127 = chest.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(53, 88).addBox(0.5F, -1.4F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4251F, -1.0179F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r128 = chest.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(64, 41).mirror().addBox(-7.1017F, -3.9543F, -0.4169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9978F, 0.0943F, -2.9818F, -0.2328F, 0.2953F, -1.1564F));

		PartDefinition cube_r129 = chest.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(62, 55).mirror().addBox(-3.822F, 0.0015F, -0.4451F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9978F, 0.0943F, -2.9818F, 0.1052F, 0.3673F, -0.1858F));

		PartDefinition cube_r130 = chest.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(69, 53).mirror().addBox(-5.4641F, -1.6135F, -0.4169F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.9978F, 0.0943F, -2.9818F, -0.0659F, 0.3683F, -0.654F));

		PartDefinition cube_r131 = chest.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(68, 33).mirror().addBox(-5.4641F, -1.6135F, -0.4169F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3478F, 0.0943F, -0.7318F, -0.1387F, 0.3143F, -0.6784F));

		PartDefinition cube_r132 = chest.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(58, 21).mirror().addBox(-8.1017F, -3.9543F, -0.4169F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3478F, 0.0943F, -0.7318F, -0.2687F, 0.2152F, -1.1655F));

		PartDefinition cube_r133 = chest.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(58, 19).mirror().addBox(-3.822F, 0.0015F, -0.4451F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3478F, 0.0943F, -0.7318F, 0.0139F, 0.3498F, -0.2179F));

		PartDefinition cube_r134 = chest.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(64, 41).addBox(4.1017F, -3.9543F, -0.4169F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0022F, 0.0943F, -2.9818F, -0.2328F, -0.2953F, 1.1564F));

		PartDefinition cube_r135 = chest.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(62, 55).addBox(0.822F, 0.0015F, -0.4451F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0022F, 0.0943F, -2.9818F, 0.1052F, -0.3673F, 0.1858F));

		PartDefinition cube_r136 = chest.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(69, 53).addBox(3.4641F, -1.6135F, -0.4169F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0022F, 0.0943F, -2.9818F, -0.0659F, -0.3683F, 0.654F));

		PartDefinition cube_r137 = chest.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(68, 33).addBox(3.4641F, -1.6135F, -0.4169F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6522F, 0.0943F, -0.7318F, -0.1387F, -0.3143F, 0.6784F));

		PartDefinition cube_r138 = chest.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(58, 21).addBox(4.1017F, -3.9543F, -0.4169F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6522F, 0.0943F, -0.7318F, -0.2687F, -0.2152F, 1.1655F));

		PartDefinition cube_r139 = chest.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(58, 19).addBox(-0.178F, 0.0015F, -0.4451F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6522F, 0.0943F, -0.7318F, 0.0139F, -0.3498F, 0.2179F));

		PartDefinition cube_r140 = chest.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(50, 88).addBox(0.5F, -1.3F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3553F, -3.0167F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r141 = chest.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(33, 38).addBox(0.0F, -0.6F, -8.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(7.5986F, 5.9115F, -1.4825F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r142 = bone.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(62, 64).addBox(0.6716F, -0.7101F, -4.0443F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(-6.8745F, 0.455F, 1.9439F, -0.3309F, 0.1303F, -0.3504F));

		PartDefinition cube_r143 = bone.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(55, 38).addBox(-0.2241F, -0.7101F, -4.637F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F))
				.texOffs(13, 32).addBox(-0.2241F, -0.7101F, -2.437F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F))
				.texOffs(60, 8).addBox(-0.1991F, -0.7101F, 0.063F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-6.8745F, 0.455F, 1.9439F, -0.329F, -0.0762F, -0.2798F));

		PartDefinition cube_r144 = bone.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(48, 31).addBox(1.7779F, -0.6556F, 2.6272F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-6.8745F, 0.155F, 0.9439F, -0.346F, -0.4484F, -0.1493F));

		PartDefinition cube_r145 = bone.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(60, 4).addBox(-0.1991F, -0.6468F, 1.9469F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-6.8745F, 0.455F, 1.9439F, -0.3115F, -0.0762F, -0.2798F));

		PartDefinition cube_r146 = bone.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(62, 51).addBox(0.4936F, -0.6468F, 4.9329F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-6.8745F, 0.155F, 0.9439F, -0.3342F, 0.3715F, -0.4298F));

		PartDefinition cube_r147 = bone.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(62, 15).addBox(1.7238F, -0.6468F, 4.3944F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.8745F, 0.155F, 0.9439F, -0.3111F, 0.0567F, -0.3226F));

		PartDefinition cube_r148 = bone.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(55, 45).addBox(-0.2298F, -0.7101F, 1.5648F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.8745F, 0.455F, 1.9439F, -0.328F, 0.0147F, -0.3108F));

		PartDefinition cube_r149 = bone.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(44, 48).addBox(-1.0037F, -0.7101F, 0.6677F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-6.8745F, 0.455F, 1.9439F, -0.5343F, 0.8858F, -0.7355F));

		PartDefinition cube_r150 = bone.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(44, 43).addBox(-0.825F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.6631F, -0.6505F, 1.4549F, -0.3722F, 0.5555F, -0.469F));

		PartDefinition cube_r151 = bone.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(81, 35).addBox(-0.2592F, -1.6837F, -1.8749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-2.4394F, -2.0671F, -0.3675F, -1.8303F, 0.1276F, 0.3069F));

		PartDefinition cube_r152 = bone.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(69, 8).addBox(-0.2592F, -1.7035F, -0.2242F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4394F, -2.0671F, -0.3675F, -0.8849F, 0.0312F, 0.3302F));

		PartDefinition cube_r153 = bone.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(47, 68).addBox(-0.2592F, -1.8384F, -0.6444F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-2.4394F, -2.0671F, -0.3675F, -0.9576F, 0.1276F, 0.3069F));

		PartDefinition cube_r154 = bone.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(42, 68).addBox(-0.5F, -1.4485F, 0.0116F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8311F, -1.8231F, -0.3867F, 0.3356F, 0.4019F, 1.3942F));

		PartDefinition cube_r155 = bone.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(60, 59).addBox(-0.5F, -1.1817F, -1.3514F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-3.8311F, -1.8231F, -0.3867F, 0.7719F, 0.4019F, 1.3942F));

		PartDefinition cube_r156 = bone.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(26, 27).addBox(1.1195F, -0.2892F, -4.3124F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-6.8745F, 0.455F, 1.9439F, -0.4272F, -0.353F, -0.2454F));

		PartDefinition cube_r157 = bone.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(0, 51).addBox(-3.7614F, 0.2204F, -5.1048F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-6.8745F, 0.455F, 1.9439F, -0.9875F, -0.8881F, 0.4418F));

		PartDefinition cube_r158 = bone.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(86, 62).addBox(-4.3646F, 0.2204F, -2.8572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(7, 64).addBox(-4.8303F, 0.2204F, -4.4595F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-6.8745F, 0.455F, 1.9439F, -1.1955F, -0.9692F, 0.7008F));

		PartDefinition cube_r159 = bone.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(86, 44).addBox(-3.5125F, 0.2204F, -4.1098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-6.8745F, 0.455F, 1.9439F, -0.8042F, -0.7509F, 0.1921F));

		PartDefinition bone8 = chest.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.5986F, 5.9115F, -1.4825F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r160 = bone8.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(62, 64).mirror().addBox(-1.6716F, -0.7101F, -4.0443F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(6.8745F, 0.455F, 1.9439F, -0.3309F, -0.1303F, 0.3504F));

		PartDefinition cube_r161 = bone8.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(55, 38).mirror().addBox(-0.7759F, -0.7101F, -4.637F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(13, 32).mirror().addBox(-2.7759F, -0.7101F, -2.437F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(60, 8).mirror().addBox(-1.8009F, -0.7101F, 0.063F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(6.8745F, 0.455F, 1.9439F, -0.329F, 0.0762F, 0.2798F));

		PartDefinition cube_r162 = bone8.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(48, 31).mirror().addBox(-4.7779F, -0.6556F, 2.6272F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(6.8745F, 0.155F, 0.9439F, -0.346F, 0.4484F, 0.1493F));

		PartDefinition cube_r163 = bone8.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(60, 4).mirror().addBox(-1.8009F, -0.6468F, 1.9469F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(6.8745F, 0.455F, 1.9439F, -0.3115F, 0.0762F, 0.2798F));

		PartDefinition cube_r164 = bone8.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(62, 51).mirror().addBox(-1.4936F, -0.6468F, 4.9329F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(6.8745F, 0.155F, 0.9439F, -0.3342F, -0.3715F, 0.4298F));

		PartDefinition cube_r165 = bone8.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(62, 15).mirror().addBox(-2.7239F, -0.6468F, 4.3944F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.8745F, 0.155F, 0.9439F, -0.3111F, -0.0567F, 0.3226F));

		PartDefinition cube_r166 = bone8.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(55, 45).mirror().addBox(-1.7702F, -0.7101F, 1.5648F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.8745F, 0.455F, 1.9439F, -0.328F, -0.0147F, 0.3108F));

		PartDefinition cube_r167 = bone8.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(44, 48).mirror().addBox(-1.9963F, -0.7101F, 0.6677F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(6.8745F, 0.455F, 1.9439F, -0.5343F, -0.8858F, 0.7355F));

		PartDefinition cube_r168 = bone8.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(44, 43).mirror().addBox(-1.175F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.6631F, -0.6505F, 1.4549F, -0.3722F, -0.5555F, 0.469F));

		PartDefinition cube_r169 = bone8.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(81, 35).mirror().addBox(-0.7408F, -1.6837F, -1.8749F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(2.4394F, -2.0671F, -0.3675F, -1.8303F, -0.1276F, -0.3069F));

		PartDefinition cube_r170 = bone8.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(69, 8).mirror().addBox(-0.7408F, -1.7035F, -0.2242F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.4394F, -2.0671F, -0.3675F, -0.8849F, -0.0312F, -0.3302F));

		PartDefinition cube_r171 = bone8.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(47, 68).mirror().addBox(-0.7408F, -1.8384F, -0.6444F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(2.4394F, -2.0671F, -0.3675F, -0.9576F, -0.1276F, -0.3069F));

		PartDefinition cube_r172 = bone8.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(42, 68).mirror().addBox(-0.5F, -1.4485F, 0.0116F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.8311F, -1.8231F, -0.3867F, 0.3356F, -0.4019F, -1.3942F));

		PartDefinition cube_r173 = bone8.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(60, 59).mirror().addBox(-0.5F, -1.1817F, -1.3514F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(3.8311F, -1.8231F, -0.3867F, 0.7719F, -0.4019F, -1.3942F));

		PartDefinition cube_r174 = bone8.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(26, 27).mirror().addBox(-4.1195F, -0.2892F, -4.3124F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(6.8745F, 0.455F, 1.9439F, -0.4272F, 0.353F, 0.2454F));

		PartDefinition cube_r175 = bone8.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(0, 51).mirror().addBox(0.7614F, 0.2204F, -5.1048F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(6.8745F, 0.455F, 1.9439F, -0.9875F, 0.8881F, -0.4418F));

		PartDefinition cube_r176 = bone8.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(86, 62).mirror().addBox(3.3646F, 0.2204F, -2.8572F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(7, 64).mirror().addBox(3.8303F, 0.2204F, -4.4595F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(6.8745F, 0.455F, 1.9439F, -1.1955F, 0.9692F, -0.7008F));

		PartDefinition cube_r177 = bone8.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(86, 44).mirror().addBox(2.5125F, 0.2204F, -4.1098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(6.8745F, 0.455F, 1.9439F, -0.8042F, 0.7509F, -0.1921F));

		PartDefinition FrontFlipperR3 = chest.addOrReplaceChild("FrontFlipperR3", CubeListBuilder.create(), PartPose.offsetAndRotation(5.7055F, 4.6688F, -0.8924F, 0.2581F, 0.2524F, -0.5048F));

		PartDefinition cube_r178 = FrontFlipperR3.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(60, 79).addBox(-1.0F, -0.5F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(4.6963F, -0.0709F, -0.8745F, 0.0F, 0.4014F, 0.0F));

		PartDefinition cube_r179 = FrontFlipperR3.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(28, 67).addBox(-0.425F, -0.5F, -0.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(4.0881F, -0.0709F, -0.2042F, 0.0F, 2.8798F, 0.0F));

		PartDefinition cube_r180 = FrontFlipperR3.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(67, 59).addBox(-1.975F, -0.5F, -1.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(4.26F, -0.0709F, -1.7517F, 0.0F, 0.829F, 0.0F));

		PartDefinition cube_r181 = FrontFlipperR3.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(36, 19).addBox(-0.55F, -0.5F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.9575F, -0.0709F, -0.0061F, 0.0F, -1.213F, 0.0F));

		PartDefinition cube_r182 = FrontFlipperR3.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(61, 26).addBox(-1.575F, -0.5F, -0.575F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8072F, -0.0709F, -0.4763F, 0.0F, 0.4625F, 0.0F));

		PartDefinition FrontFlipperMiddleR3 = FrontFlipperR3.addOrReplaceChild("FrontFlipperMiddleR3", CubeListBuilder.create(), PartPose.offsetAndRotation(7.2675F, -0.0709F, -2.5663F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r183 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(71, 38).addBox(-0.3096F, -0.5F, -0.9408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-2.6694F, 0.0F, -0.4501F, 0.0F, 0.3142F, 0.0F));

		PartDefinition cube_r184 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(45, 86).addBox(-0.7F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-2.4653F, 0.0F, 0.2829F, 0.0F, -0.1571F, 0.0F));

		PartDefinition cube_r185 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(0, 80).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.023F, 0.0F, -0.1775F, 0.0F, 1.5446F, 0.0F));

		PartDefinition cube_r186 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(70, 79).addBox(1.075F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(79, 67).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.4202F, 0.0F, 0.8226F, 0.0F, 1.2392F, 0.0F));

		PartDefinition cube_r187 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(79, 60).addBox(0.225F, -0.5F, -2.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.858F, 0.0F, 2.7899F, 0.0F, 0.8901F, 0.0F));

		PartDefinition cube_r188 = FrontFlipperMiddleR3.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(33, 49).addBox(-2.3178F, 1.0483F, -0.2058F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6351F, -0.9941F, 0.1311F, -0.0004F, -0.3487F, 0.0081F));

		PartDefinition FrontFlipperEndR3 = FrontFlipperMiddleR3.addOrReplaceChild("FrontFlipperEndR3", CubeListBuilder.create(), PartPose.offsetAndRotation(7.3469F, 0.0F, -0.8308F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r189 = FrontFlipperEndR3.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(0, 15).addBox(0.0F, 0.0F, 0.0F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.8122F, 0.0668F, 1.5582F, -0.0077F, -0.3493F, -0.0007F));

		PartDefinition FrontFlipperR2 = chest.addOrReplaceChild("FrontFlipperR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7055F, 4.6688F, -0.8924F, 0.2547F, -0.2633F, 0.5478F));

		PartDefinition cube_r190 = FrontFlipperR2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(80, 26).addBox(0.0F, -0.5F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.013F)), PartPose.offsetAndRotation(-4.6963F, -0.0709F, -0.8745F, 0.0F, -0.4014F, 0.0F));

		PartDefinition cube_r191 = FrontFlipperR2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(35, 67).addBox(-1.575F, -0.5F, -0.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-4.0881F, -0.0709F, -0.2042F, 0.0F, -2.8798F, 0.0F));

		PartDefinition cube_r192 = FrontFlipperR2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(0, 68).addBox(-0.025F, -0.5F, -1.025F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-4.26F, -0.0709F, -1.7517F, 0.0F, -0.829F, 0.0F));

		PartDefinition cube_r193 = FrontFlipperR2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(11, 37).addBox(-0.45F, -0.5F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.9575F, -0.0709F, -0.0061F, 0.0F, 1.213F, 0.0F));

		PartDefinition cube_r194 = FrontFlipperR2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(49, 61).addBox(-1.425F, -0.5F, -0.575F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-1.8072F, -0.0709F, -0.4763F, 0.0F, -0.4625F, 0.0F));

		PartDefinition FrontFlipperMiddleR2 = FrontFlipperR2.addOrReplaceChild("FrontFlipperMiddleR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.2675F, -0.0709F, -2.5663F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r195 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(71, 45).addBox(-0.6904F, -0.5F, -0.9408F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.6694F, 0.0F, -0.4501F, 0.0F, -0.3142F, 0.0F));

		PartDefinition cube_r196 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(86, 50).addBox(-0.3F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.4653F, 0.0F, 0.2829F, 0.0F, 0.1571F, 0.0F));

		PartDefinition cube_r197 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(75, 80).addBox(-0.5F, -0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.023F, 0.0F, -0.1775F, 0.0F, -1.5446F, 0.0F));

		PartDefinition cube_r198 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(45, 80).addBox(-2.075F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(80, 32).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.4202F, 0.0F, 0.8226F, 0.0F, -1.2392F, 0.0F));

		PartDefinition cube_r199 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(80, 29).addBox(-1.225F, -0.5F, -2.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.858F, 0.0F, 2.7899F, 0.0F, -0.8901F, 0.0F));

		PartDefinition cube_r200 = FrontFlipperMiddleR2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(22, 50).addBox(0.3178F, 1.0483F, -0.2058F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6351F, -0.9941F, 0.1311F, -0.0004F, 0.3487F, -0.0081F));

		PartDefinition FrontFlipperEndR2 = FrontFlipperMiddleR2.addOrReplaceChild("FrontFlipperEndR2", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.3469F, 0.0F, -0.8308F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r201 = FrontFlipperEndR2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(0, 19).addBox(-7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.8122F, 0.0668F, 1.5582F, -0.0077F, 0.3493F, 0.0007F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(76, 89).addBox(0.5F, -1.8538F, -1.04F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4296F, -3.9864F, -0.1091F, 0.0F, 0.0F));

		PartDefinition cube_r202 = neck.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(15, 87).addBox(0.5F, -1.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4101F, -3.0251F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r203 = neck.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(5, 90).mirror().addBox(-2.7354F, -1.3017F, -0.8404F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3978F, 0.2397F, -2.4454F, 0.077F, 0.3787F, -0.7586F));

		PartDefinition cube_r204 = neck.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(89, 59).mirror().addBox(-2.1203F, -0.447F, -0.8553F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.3978F, 0.2397F, -2.4454F, 0.2364F, 0.3169F, -0.2986F));

		PartDefinition cube_r205 = neck.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(64, 57).mirror().addBox(-2.454F, 0.0567F, -0.2941F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3478F, -0.2353F, -0.7454F, 0.2724F, 0.4264F, -0.3569F));

		PartDefinition cube_r206 = neck.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(70, 22).mirror().addBox(-4.2465F, -0.9852F, -0.2759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3478F, -0.2353F, -0.7454F, 0.0552F, 0.4914F, -0.8392F));

		PartDefinition cube_r207 = neck.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(5, 90).addBox(1.7354F, -1.3017F, -0.8404F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3978F, 0.2397F, -2.4454F, 0.077F, -0.3787F, 0.7586F));

		PartDefinition cube_r208 = neck.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(89, 59).addBox(1.1203F, -0.447F, -0.8553F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3978F, 0.2397F, -2.4454F, 0.2364F, -0.3169F, 0.2986F));

		PartDefinition cube_r209 = neck.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(64, 57).addBox(-0.546F, 0.0567F, -0.2941F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6522F, -0.2353F, -0.7454F, 0.2724F, -0.4264F, 0.3569F));

		PartDefinition cube_r210 = neck.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(70, 22).addBox(2.2465F, -0.9852F, -0.2759F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6522F, -0.2353F, -0.7454F, 0.0552F, -0.4914F, 0.8392F));

		PartDefinition cube_r211 = neck.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(39, 25).addBox(0.0F, 0.1F, 4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -8.0F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Neck1 = neck.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.0874F, -4.0727F, -0.0829F, 0.0F, 0.0F));

		PartDefinition cube_r212 = Neck1.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(59, 88).addBox(0.5F, -1.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.2664F, -0.9102F, 0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r213 = Neck1.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(56, 88).addBox(0.5F, -1.1F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.0226F, -2.8953F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r214 = Neck1.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(69, 14).mirror().addBox(-1.4975F, 0.1674F, -0.4397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.4777F, -2.464F, 0.2515F, 0.265F, -0.6634F));

		PartDefinition cube_r215 = Neck1.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(69, 12).mirror().addBox(-1.6975F, -0.0326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.2777F, -0.2639F, 0.4263F, 0.3913F, -0.6739F));

		PartDefinition cube_r216 = Neck1.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(69, 14).addBox(-0.5025F, 0.1674F, -0.4397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.4777F, -2.464F, 0.2515F, -0.265F, 0.6634F));

		PartDefinition cube_r217 = Neck1.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(69, 12).addBox(-0.3025F, -0.0326F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.2777F, -0.2639F, 0.4263F, -0.3913F, 0.6739F));

		PartDefinition cube_r218 = Neck1.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(0, 40).addBox(0.0F, 0.1F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -3.9F, 0.1222F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck1.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7F, -4.2F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r219 = Neck2.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(65, 88).addBox(0.0F, -1.05F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5919F, -0.6087F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r220 = Neck2.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(62, 88).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.557F, -2.6084F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r221 = Neck2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(69, 18).mirror().addBox(-1.1475F, 0.0924F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1027F, -2.0639F, 0.0964F, 0.0449F, -0.688F));

		PartDefinition cube_r222 = Neck2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(69, 16).mirror().addBox(-1.2975F, 0.1674F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, -0.0223F, -0.0639F, 0.1778F, 0.0962F, -0.6842F));

		PartDefinition cube_r223 = Neck2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(69, 18).addBox(-0.8525F, 0.0924F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1027F, -2.0639F, 0.0964F, -0.0449F, 0.688F));

		PartDefinition cube_r224 = Neck2.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(69, 16).addBox(-0.7025F, 0.1674F, -0.5397F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, -0.0223F, -0.0639F, 0.1778F, -0.0962F, 0.6842F));

		PartDefinition cube_r225 = Neck2.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(40, 0).addBox(0.0F, -0.4F, 8.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.0F, -11.6F, 0.0175F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck2.addOrReplaceChild("Neck3", CubeListBuilder.create().texOffs(40, 13).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(90, 79).addBox(0.0F, -1.375F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(90, 82).addBox(0.0F, -1.425F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0435F, -3.5253F, 0.0174F, 0.0F, 0.0F));

		PartDefinition cube_r226 = Neck3.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(88, 47).mirror().addBox(-0.8725F, -0.0326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1212F, -2.4387F, 0.0758F, -0.0067F, -0.863F));

		PartDefinition cube_r227 = Neck3.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(88, 41).mirror().addBox(-0.9975F, -0.0076F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1212F, -0.4387F, 0.1106F, 0.0576F, -0.8181F));

		PartDefinition cube_r228 = Neck3.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(88, 47).addBox(-0.1275F, -0.0326F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1212F, -2.4387F, 0.0758F, 0.0067F, 0.863F));

		PartDefinition cube_r229 = Neck3.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(88, 41).addBox(-0.0025F, -0.0076F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1212F, -0.4387F, 0.1106F, -0.0576F, 0.8181F));

		PartDefinition Neck4 = Neck3.addOrReplaceChild("Neck4", CubeListBuilder.create().texOffs(26, 32).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(90, 85).addBox(0.0F, -1.25F, -1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.1746F, 0.0F, 0.0F));

		PartDefinition cube_r230 = Neck4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(85, 90).addBox(0.0F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.475F, -3.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r231 = Neck4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(68, 88).mirror().addBox(-0.7975F, 0.0674F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1212F, -2.4387F, 0.0374F, -0.0513F, -0.7776F));

		PartDefinition cube_r232 = Neck4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(88, 53).mirror().addBox(-0.9725F, 0.0674F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1212F, -0.4387F, 0.0964F, 0.0234F, -0.8217F));

		PartDefinition cube_r233 = Neck4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(68, 88).addBox(-0.2025F, 0.0674F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1212F, -2.4387F, 0.0374F, 0.0513F, 0.7776F));

		PartDefinition cube_r234 = Neck4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(88, 53).addBox(-0.0275F, 0.0674F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1212F, -0.4387F, 0.0964F, -0.0234F, 0.8217F));

		PartDefinition Neck5 = Neck4.addOrReplaceChild("Neck5", CubeListBuilder.create().texOffs(11, 43).addBox(-0.5F, -0.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.0001F, 0.0F, 0.0F));

		PartDefinition cube_r235 = Neck5.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(0, 91).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r236 = Neck5.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(88, 90).addBox(0.0F, -0.4F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.475F, -3.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r237 = Neck5.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(86, 39).mirror().addBox(-0.7475F, 0.0674F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1212F, -2.4387F, 0.029F, -0.0542F, -0.6904F));

		PartDefinition cube_r238 = Neck5.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(88, 73).mirror().addBox(-0.7975F, 0.0674F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1212F, -0.4387F, 0.0963F, -0.0246F, -0.6947F));

		PartDefinition cube_r239 = Neck5.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(86, 39).addBox(-0.2525F, 0.0674F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1212F, -2.4387F, 0.029F, 0.0542F, 0.6904F));

		PartDefinition cube_r240 = Neck5.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(88, 73).addBox(-0.2025F, 0.0674F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1212F, -0.4387F, 0.0963F, 0.0246F, 0.6947F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create().texOffs(21, 19).addBox(-0.5F, -0.5F, -5.95F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.1052F, -0.0868F, 0.0091F));

		PartDefinition cube_r241 = Neck6.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(91, 8).addBox(0.0F, -0.4F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r242 = Neck6.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(91, 3).addBox(0.0F, -0.4F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.475F, -5.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r243 = Neck6.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(91, 0).addBox(0.0F, -0.425F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.475F, -3.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r244 = Neck6.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(0, 89).mirror().addBox(-0.3F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6636F, 0.5257F, -4.5252F, 0.029F, -0.0106F, -0.6891F));

		PartDefinition cube_r245 = Neck6.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(85, 88).mirror().addBox(-0.8225F, 0.1174F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1212F, -2.4387F, 0.0291F, -0.0978F, -0.6917F));

		PartDefinition cube_r246 = Neck6.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(88, 75).mirror().addBox(-0.7475F, 0.1674F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1212F, -0.4387F, 0.0963F, -0.0246F, -0.6947F));

		PartDefinition cube_r247 = Neck6.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(0, 89).addBox(-0.7F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6636F, 0.5257F, -4.5252F, 0.029F, 0.0106F, 0.6891F));

		PartDefinition cube_r248 = Neck6.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(85, 88).addBox(-0.1775F, 0.1174F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1212F, -2.4387F, 0.0291F, 0.0978F, 0.6917F));

		PartDefinition cube_r249 = Neck6.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(88, 75).addBox(-0.2525F, 0.1674F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1212F, -0.4387F, 0.0963F, 0.0246F, 0.6947F));

		PartDefinition Neck7 = Neck6.addOrReplaceChild("Neck7", CubeListBuilder.create().texOffs(27, 0).addBox(-0.5F, -0.5F, -4.95F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0003F, -6.0F, -0.1573F, -0.0431F, 0.0068F));

		PartDefinition cube_r250 = Neck7.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(91, 14).addBox(0.0F, -0.3F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -1.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r251 = Neck7.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(13, 91).addBox(0.0F, -0.4F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.475F, -5.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r252 = Neck7.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(91, 11).addBox(0.0F, -0.425F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.475F, -3.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r253 = Neck7.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(89, 6).mirror().addBox(-0.2F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6636F, 0.5257F, -4.5252F, 0.029F, -0.0106F, -0.6891F));

		PartDefinition cube_r254 = Neck7.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(43, 89).mirror().addBox(-0.6225F, 0.1174F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1212F, -2.4387F, 0.0291F, -0.0978F, -0.6917F));

		PartDefinition cube_r255 = Neck7.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(88, 77).mirror().addBox(-0.7475F, 0.1674F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.4522F, 0.1212F, -0.4387F, 0.0963F, -0.0246F, -0.6947F));

		PartDefinition cube_r256 = Neck7.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(89, 6).addBox(-0.8F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6636F, 0.5257F, -4.5252F, 0.029F, 0.0106F, 0.6891F));

		PartDefinition cube_r257 = Neck7.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(43, 89).addBox(-0.3775F, 0.1174F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1212F, -2.4387F, 0.0291F, 0.0978F, 0.6917F));

		PartDefinition cube_r258 = Neck7.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(88, 77).addBox(-0.2525F, 0.1674F, -0.5397F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4522F, 0.1212F, -0.4387F, 0.0963F, 0.0246F, 0.6947F));

		PartDefinition Head = Neck7.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1928F, -4.9954F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r259 = Head.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(45, 83).addBox(-0.5F, -1.1F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.9339F, -0.1537F, 2.5525F, 0.0F, 0.0F));

		PartDefinition cube_r260 = Head.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(81, 50).addBox(-0.5F, -0.8F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(0.0F, -0.9289F, -0.1425F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r261 = Head.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(84, 56).addBox(-0.5F, -0.825F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.2146F, -0.5275F, -0.6807F, 0.0F, 0.0F));

		PartDefinition cube_r262 = Head.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(22, 56).addBox(-0.5F, -0.575F, 0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.194F))
				.texOffs(22, 56).addBox(-0.5F, -0.575F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.0F, -0.4421F, -1.0286F, -0.192F, 0.0F, 0.0F));

		PartDefinition cube_r263 = Head.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(22, 56).addBox(-0.5F, -0.375F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2495F)), PartPose.offsetAndRotation(0.0F, -0.5598F, -1.839F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r264 = Head.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(20, 54).addBox(-0.5F, -0.525F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.256F)), PartPose.offsetAndRotation(0.0F, -0.2384F, -1.0958F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r265 = Head.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(64, 37).addBox(-0.5F, -0.15F, -1.775F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(0.0F, -0.4224F, 0.3235F, -0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r266 = Head.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(81, 63).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -1.0333F, -1.2806F, -0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r267 = Head.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(81, 44).addBox(-0.5F, -0.375F, -0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -0.6847F, -1.9284F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r268 = Head.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(82, 18).addBox(-0.5F, -0.395F, -0.4062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.0F, -0.8526F, -3.3677F, -0.9687F, 0.0F, 0.0F));

		PartDefinition cube_r269 = Head.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(40, 81).addBox(-0.5F, -0.345F, -0.3562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, -0.9021F, -3.0718F, -1.405F, 0.0F, 0.0F));

		PartDefinition cube_r270 = Head.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(81, 38).addBox(-0.5F, -0.3524F, -0.6557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, -0.9107F, -2.7686F, 0.0087F, 0.0F, 0.0F));

		PartDefinition cube_r271 = Head.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(65, 79).addBox(-0.5F, -0.3142F, -0.6919F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.8607F, -2.3936F, -0.1004F, 0.0F, 0.0F));

		PartDefinition cube_r272 = Head.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(25, 63).addBox(-0.5F, -0.6009F, -0.0621F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2496F)), PartPose.offsetAndRotation(0.0F, -0.5357F, -2.6186F, -0.048F, 0.0F, 0.0F));

		PartDefinition bone3 = Head.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7144F, -0.5179F, -1.5993F, 0.0F, 0.0873F, 0.0F));

		PartDefinition cube_r273 = bone3.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(25, 72).addBox(-0.4988F, -0.6508F, -0.6726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.3112F, -0.4675F, 0.6881F, 2.0318F, 1.2301F, 0.6939F));

		PartDefinition cube_r274 = bone3.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(15, 72).addBox(-0.4988F, -0.5758F, -0.3476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-1.2867F, -0.0842F, 0.7817F, 1.7526F, 1.2301F, 0.6939F));

		PartDefinition cube_r275 = bone3.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(79, 57).addBox(-0.675F, -1.0F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(45, 77).addBox(-0.675F, -0.7F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(-1.3483F, -0.3442F, -0.198F, 2.0016F, -0.4831F, -0.2073F));

		PartDefinition cube_r276 = bone3.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(77, 23).addBox(-0.65F, -0.575F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.3483F, -0.3442F, -0.198F, 1.9573F, -0.1943F, -0.0754F));

		PartDefinition cube_r277 = bone3.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(77, 20).addBox(-0.675F, -0.625F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(-1.314F, -0.4543F, 0.0789F, 1.9499F, 0.0406F, 0.0192F));

		PartDefinition cube_r278 = bone3.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(0, 77).addBox(-0.5F, -0.625F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.4513F, -0.4765F, 0.3841F, 1.6101F, 0.1277F, 0.0249F));

		PartDefinition cube_r279 = bone3.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(73, 76).addBox(-0.5079F, -0.358F, -0.6886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(-1.4423F, -0.5137F, 0.3962F, 1.4499F, 0.344F, -0.0171F));

		PartDefinition cube_r280 = bone3.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(75, 83).addBox(-0.5F, -0.4587F, -0.4049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F))
				.texOffs(83, 73).addBox(-0.5F, -0.8587F, -0.4049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.7394F, -0.0514F, 1.4318F, 2.5875F, -0.0523F, -0.0037F));

		PartDefinition cube_r281 = bone3.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(83, 47).addBox(-0.5F, -0.4587F, -0.5951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.7394F, -0.0514F, 1.4318F, 1.7671F, -0.0523F, -0.0037F));

		PartDefinition cube_r282 = bone3.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(67, 73).addBox(-0.4988F, -0.1912F, -0.3787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(73, 55).addBox(-0.4988F, -0.4912F, -0.3787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.2867F, -0.0842F, 0.7817F, 1.037F, 1.2301F, 0.6939F));

		PartDefinition cube_r283 = bone3.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(75, 32).addBox(-0.6599F, -0.6494F, -0.7302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(74, 8).addBox(-0.6599F, -0.6494F, -0.5552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3498F)), PartPose.offsetAndRotation(-0.9108F, 0.445F, 1.2304F, -0.0015F, -0.2166F, -0.2238F));

		PartDefinition cube_r284 = bone3.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(5, 78).addBox(-0.5F, -0.475F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-1.1069F, 0.2338F, 1.1425F, 0.0945F, -0.2166F, -0.2238F));

		PartDefinition cube_r285 = bone3.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(77, 71).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.1069F, 0.2338F, 1.1425F, -0.1237F, -0.2166F, -0.2238F));

		PartDefinition cube_r286 = bone3.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(0, 74).addBox(-0.6599F, -0.719F, -0.626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-0.9108F, 0.445F, 1.2304F, 0.5658F, -0.2166F, -0.2238F));

		PartDefinition cube_r287 = bone3.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(43, 72).addBox(-0.675F, -0.525F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.37F))
				.texOffs(38, 72).addBox(-0.75F, -0.525F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9695F, -0.0552F, 0.3197F, -0.0247F, 0.22F, -0.189F));

		PartDefinition cube_r288 = bone3.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(30, 79).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.9947F, 0.2965F, 0.7267F, 0.5206F, -0.2688F, -0.2522F));

		PartDefinition cube_r289 = bone3.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(72, 73).addBox(-0.6764F, -0.6306F, -0.9159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3498F)), PartPose.offsetAndRotation(-0.9108F, 0.445F, 1.2304F, 0.2588F, -0.2688F, -0.2522F));

		PartDefinition cube_r290 = bone3.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(20, 78).addBox(-0.6F, -0.4F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.3761F, -0.327F, -1.9059F, 0.4612F, 1.2219F, 0.6604F));

		PartDefinition cube_r291 = bone3.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(75, 29).addBox(-0.475F, -0.475F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.4152F, -0.1941F, -1.8605F, -1.0575F, 0.8095F, -1.0153F));

		PartDefinition cube_r292 = bone3.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(15, 78).addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.3938F, -0.3711F, -1.5964F, -0.1445F, 0.8558F, 0.076F));

		PartDefinition cube_r293 = bone3.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(10, 78).addBox(-0.6F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F)), PartPose.offsetAndRotation(-1.2167F, -0.2957F, -1.8201F, 0.2462F, 0.838F, 0.5925F));

		PartDefinition cube_r294 = bone3.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(75, 26).addBox(-0.4588F, -0.4721F, -0.4242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.3486F, -0.1797F, -1.8235F, -0.6523F, 0.6157F, -0.6569F));

		PartDefinition cube_r295 = bone3.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(25, 75).addBox(-0.3281F, -0.6019F, -1.1469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(5, 75).addBox(-0.3281F, -0.6019F, -0.8469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3498F)), PartPose.offsetAndRotation(-1.1084F, 0.1977F, -1.0222F, -0.3801F, 0.2187F, -0.4196F));

		PartDefinition cube_r296 = bone3.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(76, 17).addBox(-0.65F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.9226F, -0.1605F, -1.0416F, -0.1842F, 0.3618F, 0.322F));

		PartDefinition cube_r297 = bone3.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(30, 76).addBox(-0.65F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.0545F, -0.2669F, -1.4581F, -0.1367F, 0.4453F, 0.2487F));

		PartDefinition cube_r298 = bone3.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(76, 0).addBox(-0.65F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.9634F, -0.2031F, -1.1795F, -0.1142F, 0.3631F, 0.2982F));

		PartDefinition cube_r299 = bone3.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(74, 68).addBox(-0.3417F, -0.6019F, -0.5689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.1084F, 0.1977F, -1.0222F, -0.3752F, 0.1538F, -0.3934F));

		PartDefinition cube_r300 = bone3.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(76, 35).addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.3578F, -0.2121F, -1.4782F, -0.0643F, -0.0626F, 0.3517F));

		PartDefinition cube_r301 = bone3.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(76, 11).addBox(-0.35F, -0.35F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F))
				.texOffs(76, 3).addBox(-0.35F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.4377F, -0.3383F, -0.7866F, -0.0865F, 0.0458F, 0.3503F));

		PartDefinition cube_r302 = bone3.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(76, 14).addBox(-0.675F, -0.35F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.358F)), PartPose.offsetAndRotation(-1.1308F, -0.2189F, -0.7233F, -0.0896F, -0.2671F, 0.378F));

		PartDefinition cube_r303 = bone3.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(55, 79).addBox(-0.575F, -0.525F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.43F)), PartPose.offsetAndRotation(-1.3188F, -0.1852F, -0.7636F, -0.0506F, 0.2735F, 0.3618F));

		PartDefinition cube_r304 = bone3.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(76, 38).addBox(-0.65F, -0.35F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(40, 75).addBox(-0.65F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-1.1308F, -0.2189F, -0.7233F, -0.0897F, 0.2719F, 0.3302F));

		PartDefinition cube_r305 = bone3.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(53, 76).addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.441F))
				.texOffs(76, 51).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.44F)), PartPose.offsetAndRotation(-0.9274F, -0.0031F, -0.2132F, -0.1662F, 0.4307F, 0.3748F));

		PartDefinition cube_r306 = bone3.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(63, 76).addBox(-0.425F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.44F))
				.texOffs(58, 76).addBox(-0.425F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.441F)), PartPose.offsetAndRotation(-0.9747F, -0.0128F, -0.1371F, -0.2017F, 0.7225F, 0.3103F));

		PartDefinition cube_r307 = bone3.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(68, 76).addBox(-0.55F, -0.425F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.441F))
				.texOffs(76, 64).addBox(-0.55F, -0.425F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.44F))
				.texOffs(76, 44).addBox(-0.55F, -0.425F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.441F)), PartPose.offsetAndRotation(-0.7654F, -0.0259F, -0.2969F, -0.2014F, 0.1746F, 0.4319F));

		PartDefinition cube_r308 = bone3.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(62, 73).addBox(-0.6F, -0.375F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.39F)), PartPose.offsetAndRotation(-0.7902F, -0.0547F, -0.4932F, -0.0792F, 0.1746F, 0.4319F));

		PartDefinition cube_r309 = bone3.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(57, 73).addBox(-0.3F, -0.389F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.39F)), PartPose.offsetAndRotation(-1.0972F, -0.1932F, -0.5794F, -0.0812F, 0.2789F, 0.4233F));

		PartDefinition cube_r310 = bone3.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(20, 72).addBox(-0.475F, -0.35F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.0972F, -0.1932F, -0.5794F, -0.1121F, 0.8003F, 0.365F));

		PartDefinition cube_r311 = bone3.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(35, 75).addBox(-0.65F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.8653F, -0.1059F, -0.8055F, -0.0775F, 0.2755F, 0.3753F));

		PartDefinition cube_r312 = bone3.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(74, 61).addBox(-0.0869F, -0.3587F, -2.533F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3498F)), PartPose.offsetAndRotation(-0.9108F, 0.445F, 1.2304F, -0.2412F, 0.155F, -0.3571F));

		PartDefinition cube_r313 = bone3.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(74, 58).addBox(-0.2187F, -0.3587F, -2.2678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.9108F, 0.445F, 1.2304F, -0.2392F, 0.0872F, -0.3404F));

		PartDefinition cube_r314 = bone3.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(50, 79).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(-0.9275F, 0.3531F, 0.5684F, 0.1327F, -0.3195F, -0.2387F));

		PartDefinition cube_r315 = bone3.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(10, 75).addBox(-0.7028F, -0.3587F, -1.1336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.9108F, 0.445F, 1.2304F, -0.2512F, -0.3195F, -0.2387F));

		PartDefinition cube_r316 = bone3.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(79, 6).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.3285F, -0.1141F, -1.8993F, -0.9258F, 0.5854F, -1.0162F));

		PartDefinition cube_r317 = bone3.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(78, 77).addBox(-0.575F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.0106F, -0.0279F, -1.6062F, -0.5537F, 0.1344F, -0.6235F));

		PartDefinition cube_r318 = bone3.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(78, 74).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-1.0323F, 0.071F, -1.3983F, -0.4089F, 0.1555F, -0.509F));

		PartDefinition cube_r319 = bone3.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(78, 54).addBox(-0.4874F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.937F, 0.1544F, -1.1263F, -0.4063F, 0.1624F, -0.4927F));

		PartDefinition cube_r320 = bone3.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(78, 47).addBox(-0.6F, -0.525F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.7281F, 0.2299F, -0.7733F, -0.3056F, 0.1568F, -0.4156F));

		PartDefinition cube_r321 = bone3.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(78, 41).addBox(-0.5738F, -0.4414F, -0.897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.6908F, 0.2505F, -0.1764F, -0.2086F, 0.0885F, -0.4144F));

		PartDefinition cube_r322 = bone3.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(40, 78).addBox(-0.5894F, -0.4414F, -0.5979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.6908F, 0.2505F, -0.1764F, -0.208F, 0.0373F, -0.4035F));

		PartDefinition cube_r323 = bone3.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(35, 78).addBox(-0.6F, -0.475F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.6886F, 0.3221F, 0.1175F, -0.113F, -0.1207F, -0.3841F));

		PartDefinition cube_r324 = bone3.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(25, 78).addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-0.8151F, 0.3959F, 0.2864F, -0.1156F, -0.2421F, -0.37F));

		PartDefinition cube_r325 = bone3.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(20, 75).addBox(-0.6211F, -0.3587F, -1.4346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3498F)), PartPose.offsetAndRotation(-0.9108F, 0.445F, 1.2304F, -0.2442F, -0.218F, -0.2653F));

		PartDefinition cube_r326 = bone3.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(15, 75).addBox(-0.4724F, -0.3587F, -1.7201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.9108F, 0.445F, 1.2304F, -0.2391F, -0.0824F, -0.2991F));

		PartDefinition cube_r327 = bone3.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(48, 74).addBox(-0.3316F, -0.3587F, -1.994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3498F)), PartPose.offsetAndRotation(-0.9108F, 0.445F, 1.2304F, -0.2383F, 0.0194F, -0.3238F));

		PartDefinition cube_r328 = bone3.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(83, 53).addBox(-0.95F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(65, 82).addBox(-0.65F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-1.4122F, -0.22F, 1.6667F, -1.1503F, 0.2056F, -1.3353F));

		PartDefinition cube_r329 = bone3.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(0, 83).addBox(-0.95F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F))
				.texOffs(60, 82).addBox(-0.65F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.1687F, -0.0555F, 1.7271F, -1.3671F, 0.0853F, -0.959F));

		PartDefinition cube_r330 = bone3.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(82, 70).addBox(-0.95F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(55, 82).addBox(-0.65F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-0.982F, 0.17F, 1.7923F, -1.3518F, 0.0263F, -0.6856F));

		PartDefinition cube_r331 = bone3.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(70, 82).addBox(-0.8F, -0.35F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F))
				.texOffs(82, 21).addBox(-0.5F, -0.35F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.123F, 0.2207F, 1.7849F, -1.3558F, -0.0496F, -0.3448F));

		PartDefinition cube_r332 = bone3.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(81, 12).addBox(-0.35F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.475F, 0.5324F, 1.6834F, -0.1957F, -0.0977F, -0.4636F));

		PartDefinition cube_r333 = bone3.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(5, 81).addBox(-0.639F, -0.3617F, -0.3282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)), PartPose.offsetAndRotation(-0.895F, 0.3955F, 1.537F, -0.2147F, -0.0405F, -0.1896F));

		PartDefinition cube_r334 = bone3.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(81, 9).addBox(-0.5846F, 0.0211F, -0.4215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3499F)), PartPose.offsetAndRotation(-0.895F, 0.3955F, 1.537F, -0.0788F, -0.0094F, -0.0082F));

		PartDefinition cube_r335 = bone3.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(50, 82).addBox(-0.5846F, 0.2186F, -0.3145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F))
				.texOffs(30, 82).addBox(-0.5846F, -0.0814F, -0.3145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.895F, 0.3955F, 1.537F, -0.2533F, -0.0094F, -0.0082F));

		PartDefinition cube_r336 = bone3.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(83, 41).addBox(-0.425F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.1766F, 0.8495F, 1.609F, -0.1897F, -0.1691F, -0.6914F));

		PartDefinition cube_r337 = bone3.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(81, 3).addBox(-0.6455F, -0.2911F, -0.5352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-0.895F, 0.3955F, 1.537F, 0.2199F, -0.0101F, -0.1825F));

		PartDefinition cube_r338 = bone3.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(10, 81).addBox(-0.6455F, -0.3179F, -0.5483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3497F)), PartPose.offsetAndRotation(-0.895F, 0.3955F, 1.537F, 0.5253F, -0.0101F, -0.1825F));

		PartDefinition cube_r339 = bone3.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(81, 0).addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.0531F, 0.3696F, 1.4286F, 0.5322F, 0.0404F, -0.4393F));

		PartDefinition bone6 = bone3.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-0.8118F, -0.8743F, 2.3477F));

		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-0.6778F, -0.5341F, 1.8852F));

		PartDefinition bone5 = bone3.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-0.62F, -0.3936F, -4.0547F));

		PartDefinition bone9 = Head.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7144F, -0.5179F, -1.5993F, 0.0F, -0.0873F, 0.0F));

		PartDefinition cube_r340 = bone9.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(25, 72).mirror().addBox(-0.5012F, -0.6508F, -0.6726F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.3112F, -0.4675F, 0.6881F, 2.0318F, -1.2301F, -0.6939F));

		PartDefinition cube_r341 = bone9.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(15, 72).mirror().addBox(-0.5012F, -0.5758F, -0.3476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(1.2867F, -0.0842F, 0.7817F, 1.7526F, -1.2301F, -0.6939F));

		PartDefinition cube_r342 = bone9.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(79, 57).mirror().addBox(-0.325F, -1.0F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(45, 77).mirror().addBox(-0.325F, -0.7F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)).mirror(false), PartPose.offsetAndRotation(1.3483F, -0.3442F, -0.198F, 2.0016F, 0.4831F, 0.2073F));

		PartDefinition cube_r343 = bone9.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(77, 23).mirror().addBox(-0.35F, -0.575F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.3483F, -0.3442F, -0.198F, 1.9573F, 0.1943F, 0.0754F));

		PartDefinition cube_r344 = bone9.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(77, 20).mirror().addBox(-0.325F, -0.625F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)).mirror(false), PartPose.offsetAndRotation(1.314F, -0.4543F, 0.0789F, 1.9499F, -0.0406F, -0.0192F));

		PartDefinition cube_r345 = bone9.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(0, 77).mirror().addBox(-0.5F, -0.625F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.4513F, -0.4765F, 0.3841F, 1.6101F, -0.1277F, -0.0249F));

		PartDefinition cube_r346 = bone9.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(73, 76).mirror().addBox(-0.4921F, -0.358F, -0.6886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)).mirror(false), PartPose.offsetAndRotation(1.4423F, -0.5137F, 0.3962F, 1.4499F, -0.344F, 0.0171F));

		PartDefinition cube_r347 = bone9.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(75, 83).mirror().addBox(-0.5F, -0.4587F, -0.4049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false)
				.texOffs(83, 73).mirror().addBox(-0.5F, -0.8587F, -0.4049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.7394F, -0.0514F, 1.4318F, 2.5875F, 0.0523F, 0.0037F));

		PartDefinition cube_r348 = bone9.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(83, 47).mirror().addBox(-0.5F, -0.4587F, -0.5951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.7394F, -0.0514F, 1.4318F, 1.7671F, 0.0523F, 0.0037F));

		PartDefinition cube_r349 = bone9.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(67, 73).mirror().addBox(-0.5012F, -0.1912F, -0.3787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(73, 55).mirror().addBox(-0.5012F, -0.4912F, -0.3787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.2867F, -0.0842F, 0.7817F, 1.037F, -1.2301F, -0.6939F));

		PartDefinition cube_r350 = bone9.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(75, 32).mirror().addBox(-0.3401F, -0.6494F, -0.7302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(74, 8).mirror().addBox(-0.3401F, -0.6494F, -0.5552F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3498F)).mirror(false), PartPose.offsetAndRotation(0.9108F, 0.445F, 1.2304F, -0.0015F, 0.2166F, 0.2238F));

		PartDefinition cube_r351 = bone9.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(5, 78).mirror().addBox(-0.5F, -0.475F, -0.275F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(1.1069F, 0.2338F, 1.1425F, 0.0945F, 0.2166F, 0.2238F));

		PartDefinition cube_r352 = bone9.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(77, 71).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.1069F, 0.2338F, 1.1425F, -0.1237F, 0.2166F, 0.2238F));

		PartDefinition cube_r353 = bone9.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(0, 74).mirror().addBox(-0.3401F, -0.719F, -0.626F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(0.9108F, 0.445F, 1.2304F, 0.5658F, 0.2166F, 0.2238F));

		PartDefinition cube_r354 = bone9.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(43, 72).mirror().addBox(-0.325F, -0.525F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.37F)).mirror(false)
				.texOffs(38, 72).mirror().addBox(-0.25F, -0.525F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.9695F, -0.0552F, 0.3197F, -0.0247F, -0.22F, 0.189F));

		PartDefinition cube_r355 = bone9.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(30, 79).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.9947F, 0.2965F, 0.7267F, 0.5206F, 0.2688F, 0.2522F));

		PartDefinition cube_r356 = bone9.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(72, 73).mirror().addBox(-0.3236F, -0.6306F, -0.9159F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3498F)).mirror(false), PartPose.offsetAndRotation(0.9108F, 0.445F, 1.2304F, 0.2588F, 0.2688F, 0.2522F));

		PartDefinition cube_r357 = bone9.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(20, 78).mirror().addBox(-0.4F, -0.4F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.3761F, -0.327F, -1.9059F, 0.4612F, -1.2219F, -0.6604F));

		PartDefinition cube_r358 = bone9.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(75, 29).mirror().addBox(-0.525F, -0.475F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.4152F, -0.1941F, -1.8605F, -1.0575F, -0.8095F, 1.0153F));

		PartDefinition cube_r359 = bone9.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(15, 78).mirror().addBox(-0.5F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.3938F, -0.3711F, -1.5964F, -0.1445F, -0.8558F, -0.076F));

		PartDefinition cube_r360 = bone9.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(10, 78).mirror().addBox(-0.4F, -0.4F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.403F)).mirror(false), PartPose.offsetAndRotation(1.2167F, -0.2957F, -1.8201F, 0.2462F, -0.838F, -0.5925F));

		PartDefinition cube_r361 = bone9.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(75, 26).mirror().addBox(-0.5412F, -0.4721F, -0.4242F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.3486F, -0.1797F, -1.8235F, -0.6523F, -0.6157F, 0.6569F));

		PartDefinition cube_r362 = bone9.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(25, 75).mirror().addBox(-0.6719F, -0.6019F, -1.1469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(5, 75).mirror().addBox(-0.6719F, -0.6019F, -0.8469F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3498F)).mirror(false), PartPose.offsetAndRotation(1.1084F, 0.1977F, -1.0222F, -0.3801F, -0.2187F, 0.4196F));

		PartDefinition cube_r363 = bone9.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(76, 17).mirror().addBox(-0.35F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.9226F, -0.1605F, -1.0416F, -0.1842F, -0.3618F, -0.322F));

		PartDefinition cube_r364 = bone9.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(30, 76).mirror().addBox(-0.35F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.0545F, -0.2669F, -1.4581F, -0.1367F, -0.4453F, -0.2487F));

		PartDefinition cube_r365 = bone9.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(76, 0).mirror().addBox(-0.35F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.9634F, -0.2031F, -1.1795F, -0.1142F, -0.3631F, -0.2982F));

		PartDefinition cube_r366 = bone9.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(74, 68).mirror().addBox(-0.6583F, -0.6019F, -0.5689F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.1084F, 0.1977F, -1.0222F, -0.3752F, -0.1538F, 0.3934F));

		PartDefinition cube_r367 = bone9.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(76, 35).mirror().addBox(-0.5F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.3578F, -0.2121F, -1.4782F, -0.0643F, 0.0626F, -0.3517F));

		PartDefinition cube_r368 = bone9.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(76, 11).mirror().addBox(-0.65F, -0.35F, -0.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false)
				.texOffs(76, 3).mirror().addBox(-0.65F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.4377F, -0.3383F, -0.7866F, -0.0865F, -0.0458F, -0.3503F));

		PartDefinition cube_r369 = bone9.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(76, 14).mirror().addBox(-0.325F, -0.35F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.358F)).mirror(false), PartPose.offsetAndRotation(1.1308F, -0.2189F, -0.7233F, -0.0896F, 0.2671F, -0.378F));

		PartDefinition cube_r370 = bone9.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(55, 79).mirror().addBox(-0.425F, -0.525F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.43F)).mirror(false), PartPose.offsetAndRotation(1.3188F, -0.1852F, -0.7636F, -0.0506F, -0.2735F, -0.3618F));

		PartDefinition cube_r371 = bone9.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(76, 38).mirror().addBox(-0.35F, -0.35F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(40, 75).mirror().addBox(-0.35F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(1.1308F, -0.2189F, -0.7233F, -0.0897F, -0.2719F, -0.3302F));

		PartDefinition cube_r372 = bone9.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(53, 76).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.441F)).mirror(false)
				.texOffs(76, 51).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.44F)).mirror(false), PartPose.offsetAndRotation(0.9274F, -0.0031F, -0.2132F, -0.1662F, -0.4307F, -0.3748F));

		PartDefinition cube_r373 = bone9.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(63, 76).mirror().addBox(-0.575F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.44F)).mirror(false)
				.texOffs(58, 76).mirror().addBox(-0.575F, -0.5F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.441F)).mirror(false), PartPose.offsetAndRotation(0.9747F, -0.0128F, -0.1371F, -0.2017F, -0.7225F, -0.3103F));

		PartDefinition cube_r374 = bone9.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(68, 76).mirror().addBox(-0.45F, -0.425F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.441F)).mirror(false)
				.texOffs(76, 64).mirror().addBox(-0.45F, -0.425F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.44F)).mirror(false)
				.texOffs(76, 44).mirror().addBox(-0.45F, -0.425F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.441F)).mirror(false), PartPose.offsetAndRotation(0.7654F, -0.0259F, -0.2969F, -0.2014F, -0.1746F, -0.4319F));

		PartDefinition cube_r375 = bone9.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(62, 73).mirror().addBox(-0.4F, -0.375F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.39F)).mirror(false), PartPose.offsetAndRotation(0.7902F, -0.0547F, -0.4932F, -0.0792F, -0.1746F, -0.4319F));

		PartDefinition cube_r376 = bone9.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(57, 73).mirror().addBox(-0.7F, -0.389F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.39F)).mirror(false), PartPose.offsetAndRotation(1.0972F, -0.1932F, -0.5794F, -0.0812F, -0.2789F, -0.4233F));

		PartDefinition cube_r377 = bone9.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(20, 72).mirror().addBox(-0.525F, -0.35F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.0972F, -0.1932F, -0.5794F, -0.1121F, -0.8003F, -0.365F));

		PartDefinition cube_r378 = bone9.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(35, 75).mirror().addBox(-0.35F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.8653F, -0.1059F, -0.8055F, -0.0775F, -0.2755F, -0.3753F));

		PartDefinition cube_r379 = bone9.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(74, 61).mirror().addBox(-0.9131F, -0.3587F, -2.533F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3498F)).mirror(false), PartPose.offsetAndRotation(0.9108F, 0.445F, 1.2304F, -0.2412F, -0.155F, 0.3571F));

		PartDefinition cube_r380 = bone9.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(74, 58).mirror().addBox(-0.7813F, -0.3587F, -2.2678F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.9108F, 0.445F, 1.2304F, -0.2392F, -0.0872F, 0.3404F));

		PartDefinition cube_r381 = bone9.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(50, 79).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(0.9275F, 0.3531F, 0.5684F, 0.1327F, 0.3195F, 0.2387F));

		PartDefinition cube_r382 = bone9.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(10, 75).mirror().addBox(-0.2972F, -0.3587F, -1.1336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.9108F, 0.445F, 1.2304F, -0.2512F, 0.3195F, 0.2387F));

		PartDefinition cube_r383 = bone9.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(79, 6).mirror().addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.3285F, -0.1141F, -1.8993F, -0.9258F, -0.5854F, 1.0162F));

		PartDefinition cube_r384 = bone9.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(78, 77).mirror().addBox(-0.425F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.0106F, -0.0279F, -1.6062F, -0.5537F, -0.1344F, 0.6235F));

		PartDefinition cube_r385 = bone9.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(78, 74).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(1.0323F, 0.071F, -1.3983F, -0.4089F, -0.1555F, 0.509F));

		PartDefinition cube_r386 = bone9.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(78, 54).mirror().addBox(-0.5126F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.937F, 0.1544F, -1.1263F, -0.4063F, -0.1624F, 0.4927F));

		PartDefinition cube_r387 = bone9.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(78, 47).mirror().addBox(-0.4F, -0.525F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.7281F, 0.2299F, -0.7733F, -0.3056F, -0.1568F, 0.4156F));

		PartDefinition cube_r388 = bone9.addOrReplaceChild("cube_r388", CubeListBuilder.create().texOffs(78, 41).mirror().addBox(-0.4262F, -0.4414F, -0.897F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.6908F, 0.2505F, -0.1764F, -0.2086F, -0.0885F, 0.4144F));

		PartDefinition cube_r389 = bone9.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(40, 78).mirror().addBox(-0.4106F, -0.4414F, -0.5979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.6908F, 0.2505F, -0.1764F, -0.208F, -0.0373F, 0.4035F));

		PartDefinition cube_r390 = bone9.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(35, 78).mirror().addBox(-0.4F, -0.475F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.6886F, 0.3221F, 0.1175F, -0.113F, 0.1207F, 0.3841F));

		PartDefinition cube_r391 = bone9.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(25, 78).mirror().addBox(-0.5F, -0.475F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(0.8151F, 0.3959F, 0.2864F, -0.1156F, 0.2421F, 0.37F));

		PartDefinition cube_r392 = bone9.addOrReplaceChild("cube_r392", CubeListBuilder.create().texOffs(20, 75).mirror().addBox(-0.3789F, -0.3587F, -1.4346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3498F)).mirror(false), PartPose.offsetAndRotation(0.9108F, 0.445F, 1.2304F, -0.2442F, 0.218F, 0.2653F));

		PartDefinition cube_r393 = bone9.addOrReplaceChild("cube_r393", CubeListBuilder.create().texOffs(15, 75).mirror().addBox(-0.5276F, -0.3587F, -1.7201F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.9108F, 0.445F, 1.2304F, -0.2391F, 0.0824F, 0.2991F));

		PartDefinition cube_r394 = bone9.addOrReplaceChild("cube_r394", CubeListBuilder.create().texOffs(48, 74).mirror().addBox(-0.6684F, -0.3587F, -1.994F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3498F)).mirror(false), PartPose.offsetAndRotation(0.9108F, 0.445F, 1.2304F, -0.2383F, -0.0194F, 0.3238F));

		PartDefinition cube_r395 = bone9.addOrReplaceChild("cube_r395", CubeListBuilder.create().texOffs(83, 53).mirror().addBox(-0.05F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(65, 82).mirror().addBox(-0.35F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(1.4122F, -0.22F, 1.6667F, -1.1503F, -0.2056F, 1.3353F));

		PartDefinition cube_r396 = bone9.addOrReplaceChild("cube_r396", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-0.05F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false)
				.texOffs(60, 82).mirror().addBox(-0.35F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.1687F, -0.0555F, 1.7271F, -1.3671F, -0.0853F, 0.959F));

		PartDefinition cube_r397 = bone9.addOrReplaceChild("cube_r397", CubeListBuilder.create().texOffs(82, 70).mirror().addBox(-0.05F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(55, 82).mirror().addBox(-0.35F, -0.35F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(0.982F, 0.17F, 1.7923F, -1.3518F, -0.0263F, 0.6856F));

		PartDefinition cube_r398 = bone9.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(70, 82).mirror().addBox(-0.2F, -0.35F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false)
				.texOffs(82, 21).mirror().addBox(-0.5F, -0.35F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.123F, 0.2207F, 1.7849F, -1.3558F, 0.0496F, 0.3448F));

		PartDefinition cube_r399 = bone9.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(81, 12).mirror().addBox(-0.65F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.475F, 0.5324F, 1.6834F, -0.1957F, 0.0977F, 0.4636F));

		PartDefinition cube_r400 = bone9.addOrReplaceChild("cube_r400", CubeListBuilder.create().texOffs(5, 81).mirror().addBox(-0.361F, -0.3617F, -0.3282F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false), PartPose.offsetAndRotation(0.895F, 0.3955F, 1.537F, -0.2147F, 0.0405F, 0.1896F));

		PartDefinition cube_r401 = bone9.addOrReplaceChild("cube_r401", CubeListBuilder.create().texOffs(81, 9).mirror().addBox(-0.4154F, 0.0211F, -0.4215F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3499F)).mirror(false), PartPose.offsetAndRotation(0.895F, 0.3955F, 1.537F, -0.0788F, 0.0094F, 0.0082F));

		PartDefinition cube_r402 = bone9.addOrReplaceChild("cube_r402", CubeListBuilder.create().texOffs(50, 82).mirror().addBox(-0.4154F, 0.2186F, -0.3145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.352F)).mirror(false)
				.texOffs(30, 82).mirror().addBox(-0.4154F, -0.0814F, -0.3145F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.895F, 0.3955F, 1.537F, -0.2533F, 0.0094F, 0.0082F));

		PartDefinition cube_r403 = bone9.addOrReplaceChild("cube_r403", CubeListBuilder.create().texOffs(83, 41).mirror().addBox(-0.575F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.1766F, 0.8495F, 1.609F, -0.1897F, 0.1691F, 0.6914F));

		PartDefinition cube_r404 = bone9.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(81, 3).mirror().addBox(-0.3545F, -0.2911F, -0.5352F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(0.895F, 0.3955F, 1.537F, 0.2199F, 0.0101F, 0.1825F));

		PartDefinition cube_r405 = bone9.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(10, 81).mirror().addBox(-0.3545F, -0.3179F, -0.5483F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3497F)).mirror(false), PartPose.offsetAndRotation(0.895F, 0.3955F, 1.537F, 0.5253F, 0.0101F, 0.1825F));

		PartDefinition cube_r406 = bone9.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(81, 0).mirror().addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.0531F, 0.3696F, 1.4286F, 0.5322F, -0.0404F, 0.4393F));

		PartDefinition bone10 = bone9.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(0.8118F, -0.8743F, 2.3477F));

		PartDefinition bone11 = bone9.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offset(0.6778F, -0.5341F, 1.8852F));

		PartDefinition bone12 = bone9.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offset(0.62F, -0.3936F, -4.0547F));

		PartDefinition Lowerjaw = Head.addOrReplaceChild("Lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7481F, -0.254F, 0.3665F, 0.0F, 0.0F));

		PartDefinition cube_r407 = Lowerjaw.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(85, 30).mirror().addBox(-0.5F, -0.65F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(-0.8506F, 0.2676F, 0.611F, 0.2707F, -0.0871F, -0.0046F));

		PartDefinition cube_r408 = Lowerjaw.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(30, 85).mirror().addBox(-0.5F, -0.65F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.8245F, 0.3119F, 0.3154F, 0.1486F, -0.0871F, -0.0046F));

		PartDefinition cube_r409 = Lowerjaw.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(40, 84).mirror().addBox(-0.525F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.1432F, 0.089F, -3.4664F, 1.3672F, -0.7496F, -1.4587F));

		PartDefinition cube_r410 = Lowerjaw.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(35, 84).mirror().addBox(-0.4F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.4191F, 0.2263F, -3.3631F, 0.3985F, -0.4449F, -0.5786F));

		PartDefinition cube_r411 = Lowerjaw.addOrReplaceChild("cube_r411", CubeListBuilder.create().texOffs(86, 15).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.4793F, 0.1002F, -3.0777F, 0.2743F, -0.3916F, -0.3677F));

		PartDefinition cube_r412 = Lowerjaw.addOrReplaceChild("cube_r412", CubeListBuilder.create().texOffs(86, 12).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.6042F, 0.0625F, -2.8139F, 0.2169F, -0.356F, -0.3017F));

		PartDefinition cube_r413 = Lowerjaw.addOrReplaceChild("cube_r413", CubeListBuilder.create().texOffs(86, 9).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.7092F, 0.0312F, -2.5456F, 0.1852F, -0.2758F, -0.2756F));

		PartDefinition cube_r414 = Lowerjaw.addOrReplaceChild("cube_r414", CubeListBuilder.create().texOffs(86, 3).mirror().addBox(-0.525F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.7943F, -0.0001F, -2.2666F, 0.1745F, -0.2224F, -0.2896F));

		PartDefinition cube_r415 = Lowerjaw.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(86, 0).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.8666F, -0.0314F, -1.9817F, 0.161F, -0.1918F, -0.27F));

		PartDefinition cube_r416 = Lowerjaw.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(0, 86).mirror().addBox(-0.525F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.9123F, -0.0627F, -1.7035F, 0.1228F, -0.0592F, -0.248F));

		PartDefinition cube_r417 = Lowerjaw.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(25, 84).mirror().addBox(-0.3265F, -0.7271F, -0.6405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-1.0626F, 0.1466F, -1.251F, 0.1094F, -0.0142F, -0.1955F));

		PartDefinition cube_r418 = Lowerjaw.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(20, 84).mirror().addBox(-0.6003F, -0.9664F, -2.068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-0.6875F, 0.1466F, 0.474F, 0.0958F, 0.0543F, -0.1958F));

		PartDefinition cube_r419 = Lowerjaw.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(80, 83).mirror().addBox(-0.651F, -0.7706F, -2.068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.351F)).mirror(false), PartPose.offsetAndRotation(-0.6875F, 0.1466F, 0.474F, 0.1044F, 0.035F, -0.0046F));

		PartDefinition cube_r420 = Lowerjaw.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(60, 85).mirror().addBox(-0.3367F, -0.5856F, -0.6317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.0626F, 0.1466F, -1.251F, 0.1221F, -0.0348F, -0.0046F));

		PartDefinition cube_r421 = Lowerjaw.addOrReplaceChild("cube_r421", CubeListBuilder.create().texOffs(70, 85).mirror().addBox(-0.3262F, -0.5467F, -0.614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.351F)).mirror(false), PartPose.offsetAndRotation(-1.0626F, 0.1466F, -1.551F, 0.1355F, -0.0871F, -0.0046F));

		PartDefinition cube_r422 = Lowerjaw.addOrReplaceChild("cube_r422", CubeListBuilder.create().texOffs(86, 36).mirror().addBox(-0.525F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(86, 36).addBox(-0.6682F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0966F, 0.351F, -3.3639F, 0.1506F, 0.0F, 0.0F));

		PartDefinition cube_r423 = Lowerjaw.addOrReplaceChild("cube_r423", CubeListBuilder.create().texOffs(86, 33).mirror().addBox(-0.45F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.2504F, 0.3442F, -3.3187F, 0.1506F, 0.1294F, 0.0196F));

		PartDefinition cube_r424 = Lowerjaw.addOrReplaceChild("cube_r424", CubeListBuilder.create().texOffs(15, 84).mirror().addBox(-0.3378F, -0.4136F, -0.6315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.351F)).mirror(false), PartPose.offsetAndRotation(-0.5375F, 0.2466F, -3.251F, 0.1494F, -0.5496F, 0.0294F));

		PartDefinition cube_r425 = Lowerjaw.addOrReplaceChild("cube_r425", CubeListBuilder.create().texOffs(10, 84).mirror().addBox(-0.3462F, -0.3642F, -0.6457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.6625F, 0.1466F, -2.976F, 0.1522F, -0.4623F, 0.028F));

		PartDefinition cube_r426 = Lowerjaw.addOrReplaceChild("cube_r426", CubeListBuilder.create().texOffs(84, 6).mirror().addBox(-0.3483F, -0.4122F, -0.6672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.351F)).mirror(false), PartPose.offsetAndRotation(-0.7875F, 0.1466F, -2.676F, 0.1501F, -0.4013F, -0.005F));

		PartDefinition cube_r427 = Lowerjaw.addOrReplaceChild("cube_r427", CubeListBuilder.create().texOffs(85, 85).mirror().addBox(-0.3381F, -0.4445F, -0.6599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.8875F, 0.1466F, -2.401F, 0.1147F, -0.314F, -0.0048F));

		PartDefinition cube_r428 = Lowerjaw.addOrReplaceChild("cube_r428", CubeListBuilder.create().texOffs(85, 82).mirror().addBox(-0.3368F, -0.4767F, -0.6431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.351F)).mirror(false), PartPose.offsetAndRotation(-0.9626F, 0.1466F, -2.126F, 0.1145F, -0.2617F, -0.0047F));

		PartDefinition cube_r429 = Lowerjaw.addOrReplaceChild("cube_r429", CubeListBuilder.create().texOffs(85, 79).mirror().addBox(-0.3499F, -0.5084F, -0.6205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.0126F, 0.1466F, -1.851F, 0.1143F, -0.2268F, -0.0047F));

		PartDefinition cube_r430 = Lowerjaw.addOrReplaceChild("cube_r430", CubeListBuilder.create().texOffs(5, 84).mirror().addBox(-0.3499F, -0.4842F, -0.6333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3498F)).mirror(false), PartPose.offsetAndRotation(-1.0126F, 0.1466F, -1.851F, 0.027F, -0.2268F, -0.0047F));

		PartDefinition cube_r431 = Lowerjaw.addOrReplaceChild("cube_r431", CubeListBuilder.create().texOffs(65, 85).mirror().addBox(-0.3262F, -0.487F, -0.6336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.0626F, 0.1466F, -1.551F, 0.0089F, -0.0871F, -0.0046F));

		PartDefinition cube_r432 = Lowerjaw.addOrReplaceChild("cube_r432", CubeListBuilder.create().texOffs(55, 85).mirror().addBox(-0.3367F, -0.4582F, -0.6399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3498F)).mirror(false), PartPose.offsetAndRotation(-1.0626F, 0.1466F, -1.251F, -0.096F, -0.0348F, -0.0046F));

		PartDefinition cube_r433 = Lowerjaw.addOrReplaceChild("cube_r433", CubeListBuilder.create().texOffs(50, 85).mirror().addBox(-0.651F, -0.4136F, -2.0899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.6875F, 0.1466F, 0.474F, -0.0265F, 0.035F, -0.0046F));

		PartDefinition cube_r434 = Lowerjaw.addOrReplaceChild("cube_r434", CubeListBuilder.create().texOffs(64, 45).mirror().addBox(-0.651F, -0.4893F, -1.8003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3497F)).mirror(false), PartPose.offsetAndRotation(-0.6875F, 0.1466F, 0.474F, 0.0258F, 0.035F, -0.0046F));

		PartDefinition cube_r435 = Lowerjaw.addOrReplaceChild("cube_r435", CubeListBuilder.create().texOffs(46, 64).mirror().addBox(-0.651F, -0.5101F, -1.6356F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.6875F, 0.1466F, 0.474F, -0.0742F, 0.0349F, 0.0F));

		PartDefinition cube_r436 = Lowerjaw.addOrReplaceChild("cube_r436", CubeListBuilder.create().texOffs(85, 27).mirror().addBox(-0.651F, -0.4618F, -0.9309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.6875F, 0.1466F, 0.474F, -0.2487F, 0.0349F, 0.0F));

		PartDefinition cube_r437 = Lowerjaw.addOrReplaceChild("cube_r437", CubeListBuilder.create().texOffs(84, 66).mirror().addBox(-0.651F, -0.4078F, -1.2095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.351F)).mirror(false), PartPose.offsetAndRotation(-0.6875F, 0.1466F, 0.474F, -0.3447F, 0.0349F, 0.0F));

		PartDefinition cube_r438 = Lowerjaw.addOrReplaceChild("cube_r438", CubeListBuilder.create().texOffs(83, 76).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.8851F, -0.0072F, -0.8561F, -1.213F, 0.0349F, 0.0F));

		PartDefinition cube_r439 = Lowerjaw.addOrReplaceChild("cube_r439", CubeListBuilder.create().texOffs(85, 24).mirror().addBox(-0.651F, 0.3501F, -1.2258F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.351F)).mirror(false), PartPose.offsetAndRotation(-0.6875F, 0.1466F, 0.474F, -1.1039F, 0.0349F, 0.0F));

		PartDefinition cube_r440 = Lowerjaw.addOrReplaceChild("cube_r440", CubeListBuilder.create().texOffs(84, 59).mirror().addBox(-0.651F, -0.2984F, -1.47F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.6875F, 0.1466F, 0.474F, -0.4756F, 0.0349F, 0.0F));

		PartDefinition cube_r441 = Lowerjaw.addOrReplaceChild("cube_r441", CubeListBuilder.create().texOffs(85, 30).addBox(-0.5F, -0.65F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(0.8506F, 0.2676F, 0.611F, 0.2707F, 0.0871F, 0.0046F));

		PartDefinition cube_r442 = Lowerjaw.addOrReplaceChild("cube_r442", CubeListBuilder.create().texOffs(30, 85).addBox(-0.5F, -0.65F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.8245F, 0.3119F, 0.3154F, 0.1486F, 0.0871F, 0.0046F));

		PartDefinition cube_r443 = Lowerjaw.addOrReplaceChild("cube_r443", CubeListBuilder.create().texOffs(40, 84).addBox(-0.475F, -0.5F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.1432F, 0.089F, -3.4664F, 1.3672F, 0.7496F, 1.4587F));

		PartDefinition cube_r444 = Lowerjaw.addOrReplaceChild("cube_r444", CubeListBuilder.create().texOffs(35, 84).addBox(-0.6F, -0.575F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.4191F, 0.2263F, -3.3631F, 0.3985F, 0.4449F, 0.5786F));

		PartDefinition cube_r445 = Lowerjaw.addOrReplaceChild("cube_r445", CubeListBuilder.create().texOffs(86, 15).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.4793F, 0.1002F, -3.0777F, 0.2743F, 0.3916F, 0.3677F));

		PartDefinition cube_r446 = Lowerjaw.addOrReplaceChild("cube_r446", CubeListBuilder.create().texOffs(86, 12).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.6042F, 0.0625F, -2.8139F, 0.2169F, 0.356F, 0.3017F));

		PartDefinition cube_r447 = Lowerjaw.addOrReplaceChild("cube_r447", CubeListBuilder.create().texOffs(86, 9).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.7092F, 0.0312F, -2.5456F, 0.1852F, 0.2758F, 0.2756F));

		PartDefinition cube_r448 = Lowerjaw.addOrReplaceChild("cube_r448", CubeListBuilder.create().texOffs(86, 3).addBox(-0.475F, -0.5F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.7943F, -0.0001F, -2.2666F, 0.1745F, 0.2224F, 0.2896F));

		PartDefinition cube_r449 = Lowerjaw.addOrReplaceChild("cube_r449", CubeListBuilder.create().texOffs(86, 0).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.8666F, -0.0314F, -1.9817F, 0.161F, 0.1918F, 0.27F));

		PartDefinition cube_r450 = Lowerjaw.addOrReplaceChild("cube_r450", CubeListBuilder.create().texOffs(0, 86).addBox(-0.475F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.9123F, -0.0627F, -1.7035F, 0.1228F, 0.0592F, 0.248F));

		PartDefinition cube_r451 = Lowerjaw.addOrReplaceChild("cube_r451", CubeListBuilder.create().texOffs(25, 84).addBox(-0.6735F, -0.7271F, -0.6405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(1.0626F, 0.1466F, -1.251F, 0.1094F, 0.0142F, 0.1955F));

		PartDefinition cube_r452 = Lowerjaw.addOrReplaceChild("cube_r452", CubeListBuilder.create().texOffs(20, 84).addBox(-0.3997F, -0.9664F, -2.068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(0.6875F, 0.1466F, 0.474F, 0.0958F, -0.0543F, 0.1958F));

		PartDefinition cube_r453 = Lowerjaw.addOrReplaceChild("cube_r453", CubeListBuilder.create().texOffs(80, 83).addBox(-0.349F, -0.7706F, -2.068F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.351F)), PartPose.offsetAndRotation(0.6875F, 0.1466F, 0.474F, 0.1044F, -0.035F, 0.0046F));

		PartDefinition cube_r454 = Lowerjaw.addOrReplaceChild("cube_r454", CubeListBuilder.create().texOffs(60, 85).addBox(-0.6633F, -0.5856F, -0.6317F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.0626F, 0.1466F, -1.251F, 0.1221F, 0.0348F, 0.0046F));

		PartDefinition cube_r455 = Lowerjaw.addOrReplaceChild("cube_r455", CubeListBuilder.create().texOffs(70, 85).addBox(-0.6738F, -0.5467F, -0.614F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.351F)), PartPose.offsetAndRotation(1.0626F, 0.1466F, -1.551F, 0.1355F, 0.0871F, 0.0046F));

		PartDefinition cube_r456 = Lowerjaw.addOrReplaceChild("cube_r456", CubeListBuilder.create().texOffs(86, 33).addBox(-0.55F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.2504F, 0.3442F, -3.3187F, 0.1506F, -0.1294F, -0.0196F));

		PartDefinition cube_r457 = Lowerjaw.addOrReplaceChild("cube_r457", CubeListBuilder.create().texOffs(15, 84).addBox(-0.6622F, -0.4136F, -0.6315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.351F)), PartPose.offsetAndRotation(0.5375F, 0.2466F, -3.251F, 0.1494F, 0.5496F, -0.0294F));

		PartDefinition cube_r458 = Lowerjaw.addOrReplaceChild("cube_r458", CubeListBuilder.create().texOffs(10, 84).addBox(-0.6538F, -0.3642F, -0.6457F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.6625F, 0.1466F, -2.976F, 0.1522F, 0.4623F, -0.028F));

		PartDefinition cube_r459 = Lowerjaw.addOrReplaceChild("cube_r459", CubeListBuilder.create().texOffs(84, 6).addBox(-0.6517F, -0.4122F, -0.6672F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.351F)), PartPose.offsetAndRotation(0.7875F, 0.1466F, -2.676F, 0.1501F, 0.4013F, 0.005F));

		PartDefinition cube_r460 = Lowerjaw.addOrReplaceChild("cube_r460", CubeListBuilder.create().texOffs(85, 85).addBox(-0.6619F, -0.4445F, -0.6599F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.8875F, 0.1466F, -2.401F, 0.1147F, 0.314F, 0.0048F));

		PartDefinition cube_r461 = Lowerjaw.addOrReplaceChild("cube_r461", CubeListBuilder.create().texOffs(85, 82).addBox(-0.6632F, -0.4767F, -0.6431F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.351F)), PartPose.offsetAndRotation(0.9626F, 0.1466F, -2.126F, 0.1145F, 0.2617F, 0.0047F));

		PartDefinition cube_r462 = Lowerjaw.addOrReplaceChild("cube_r462", CubeListBuilder.create().texOffs(85, 79).addBox(-0.6501F, -0.5084F, -0.6205F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.0126F, 0.1466F, -1.851F, 0.1143F, 0.2268F, 0.0047F));

		PartDefinition cube_r463 = Lowerjaw.addOrReplaceChild("cube_r463", CubeListBuilder.create().texOffs(5, 84).addBox(-0.6501F, -0.4842F, -0.6333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3498F)), PartPose.offsetAndRotation(1.0126F, 0.1466F, -1.851F, 0.027F, 0.2268F, 0.0047F));

		PartDefinition cube_r464 = Lowerjaw.addOrReplaceChild("cube_r464", CubeListBuilder.create().texOffs(65, 85).addBox(-0.6738F, -0.487F, -0.6336F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.0626F, 0.1466F, -1.551F, 0.0089F, 0.0871F, 0.0046F));

		PartDefinition cube_r465 = Lowerjaw.addOrReplaceChild("cube_r465", CubeListBuilder.create().texOffs(55, 85).addBox(-0.6633F, -0.4582F, -0.6399F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3498F)), PartPose.offsetAndRotation(1.0626F, 0.1466F, -1.251F, -0.096F, 0.0348F, 0.0046F));

		PartDefinition cube_r466 = Lowerjaw.addOrReplaceChild("cube_r466", CubeListBuilder.create().texOffs(50, 85).addBox(-0.349F, -0.4136F, -2.0899F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.6875F, 0.1466F, 0.474F, -0.0265F, -0.035F, 0.0046F));

		PartDefinition cube_r467 = Lowerjaw.addOrReplaceChild("cube_r467", CubeListBuilder.create().texOffs(64, 45).addBox(-0.349F, -0.4893F, -1.8003F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3497F)), PartPose.offsetAndRotation(0.6875F, 0.1466F, 0.474F, 0.0258F, -0.035F, 0.0046F));

		PartDefinition cube_r468 = Lowerjaw.addOrReplaceChild("cube_r468", CubeListBuilder.create().texOffs(46, 64).addBox(-0.349F, -0.5101F, -1.6356F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.6875F, 0.1466F, 0.474F, -0.0742F, -0.0349F, 0.0F));

		PartDefinition cube_r469 = Lowerjaw.addOrReplaceChild("cube_r469", CubeListBuilder.create().texOffs(85, 27).addBox(-0.349F, -0.4618F, -0.9309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.6875F, 0.1466F, 0.474F, -0.2487F, -0.0349F, 0.0F));

		PartDefinition cube_r470 = Lowerjaw.addOrReplaceChild("cube_r470", CubeListBuilder.create().texOffs(84, 66).addBox(-0.349F, -0.4078F, -1.2095F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.351F)), PartPose.offsetAndRotation(0.6875F, 0.1466F, 0.474F, -0.3447F, -0.0349F, 0.0F));

		PartDefinition cube_r471 = Lowerjaw.addOrReplaceChild("cube_r471", CubeListBuilder.create().texOffs(83, 76).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.8851F, -0.0072F, -0.8561F, -1.213F, -0.0349F, 0.0F));

		PartDefinition cube_r472 = Lowerjaw.addOrReplaceChild("cube_r472", CubeListBuilder.create().texOffs(85, 24).addBox(-0.349F, 0.3501F, -1.2258F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.351F)), PartPose.offsetAndRotation(0.6875F, 0.1466F, 0.474F, -1.1039F, -0.0349F, 0.0F));

		PartDefinition cube_r473 = Lowerjaw.addOrReplaceChild("cube_r473", CubeListBuilder.create().texOffs(84, 59).addBox(-0.349F, -0.2984F, -1.47F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.6875F, 0.1466F, 0.474F, -0.4756F, -0.0349F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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